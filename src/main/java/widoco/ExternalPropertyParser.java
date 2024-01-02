package widoco;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Imports;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ExternalPropertyParser {
    private enum PropertyType {
        OBJECT_PROPERTY,
        DATA_PROPERTY,
        NAMED_INDIVIDUAL,
        EXTERNAL_PROPERTY
    }

    private static boolean externalProps = false;

    private static final Logger logger = LoggerFactory.getLogger(ExternalPropertyParser.class);

    /**
     * Parse html content with external property tags, i.e., the sup tag
     * with class type-ep and attempt to find the type of property type
     * within the ontology.
     * The main purpose of this utility is to add metadata from the ontology
     * to the named individual assertions since the xslt transform cannot
     * look for external properties outisde of the xml rdf serialization of the
     * ontology.
     * @param htmlContent Html content where the external properties are located.
     *                     Typically this is the named individuals section
     * @param ontology  The ontology that will be used to look for the IRIS of
     *                   the external properties.
     * @return
     */
    public static String parse(String htmlContent, OWLOntology ontology) {
        Document document = Jsoup.parseBodyFragment(htmlContent, "UTF-8");
        // Find all <a> tags with <sup> tags having class "type-ep"
        Elements links = document.select("a + sup.type-ep");
        // Modify the <sup> tag based on the property type
        for (Element link : links) {
            String href = link.previousElementSibling().attr("href");
            PropertyType type = getPropertyType(ontology, href);
            String class_name;
            String text;
            String title;
            if (type == PropertyType.OBJECT_PROPERTY) {
                class_name = "type-op";
                text="op";
                title = "object property";
            } else if(type == PropertyType.DATA_PROPERTY) {
                class_name = "type-dp";
                text="dp";
                title = "data property";
            } else if (type == PropertyType.NAMED_INDIVIDUAL) {
                class_name = "type-ni";
                text="ni";
                title = "named individual";
            } else {
                class_name = "type-ep";
                text ="ep";
                title ="external property";
                if (!externalProps) {
                    externalProps = true;
                }
            }
            link.text(text);
            link.attr("class",class_name);
            link.attr("title",title);
        }
        return document.body().html();
    }

    public static boolean hasExternalProps(){
        return externalProps;
    }

    private static PropertyType getPropertyType(OWLOntology ontology, String propertyIRI) {
        IRI propertyIRIObject = IRI.create(propertyIRI);

        // Check if it is an object property
        Set<OWLObjectProperty> objectProperties = ontology.getObjectPropertiesInSignature(Imports.INCLUDED);
        for (OWLObjectProperty objectProperty : objectProperties) {
            if (objectProperty.getIRI().equals(propertyIRIObject)) {
                return PropertyType.OBJECT_PROPERTY;
            }
        }
        // Check if it is a data property
        Set<OWLDataProperty> dataProperties = ontology.getDataPropertiesInSignature(Imports.INCLUDED);
        for (OWLDataProperty dataProperty : dataProperties) {
            if (dataProperty.getIRI().equals(propertyIRIObject)) {
                return PropertyType.DATA_PROPERTY;
            }
        }

        Set<OWLNamedIndividual> individuals = ontology.getIndividualsInSignature(Imports.INCLUDED);
        for (OWLNamedIndividual individual : individuals) {
            if (individual.getIRI().equals(propertyIRIObject)) {
                return PropertyType.NAMED_INDIVIDUAL;
            }
        }
        // If not an object or data property, consider it as an external property
        return PropertyType.EXTERNAL_PROPERTY;
    }

}
