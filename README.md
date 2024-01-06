# WIzard for DOCumenting Ontologies (WIDOCO)
[![DOI](https://zenodo.org/badge/11427075.svg)](https://zenodo.org/badge/latestdoi/11427075) [![](https://jitpack.io/v/dgarijo/Widoco.svg)](https://jitpack.io/#dgarijo/Widoco) [![Project Status: Active – The project has reached a stable, usable state and is being actively developed.](https://www.repostatus.org/badges/latest/active.svg)](https://www.repostatus.org/#active)

![Logo](src/main/resources/logo/logo2.png)

WIDOCO helps you to publish and create an enriched and customized documentation of your ontology automatically, by following a series of steps in a GUI.

**Author**: Daniel Garijo Verdejo (@dgarijo)

**Contributors**: María Poveda, Idafen Santana, Almudena Ruiz, Miguel Angel García, Oscar Corcho, Daniel Vila, Sergio Barrio, Martin Scharm, Maxime Lefrancois, Alfredo Serafini, @kartgk, Pat Mc Bennett, Christophe Camel, Jacobus Geluk, Martin Scharm, @rpietzsch, Jonathan Leitschuh, Jodi Schneider, Giacomo Lanza, Alejandra Gonzalez-Beltran, Mario Scrocca, Miguel Angel García, Flores Bakker, @JohnnyMoonlight,  René Fritze, @telecsur, Jan Vlug, Han Kruiger, Johannes Theissen-Lipp, Roberto Polli and Victor Chavez.

**Citing WIDOCO**: If you used WIDOCO in your work, please cite the ISWC 2017 paper: https://iswc2017.semanticweb.org/paper-138

```bib
@inproceedings{garijo2017widoco,
  title={WIDOCO: a wizard for documenting ontologies},
  author={Garijo, Daniel},
  booktitle={International Semantic Web Conference},
  pages={94--102},
  year={2017},
  organization={Springer, Cham},
  doi = {10.1007/978-3-319-68204-4_9},
  funding = {USNSF ICER-1541029, NIH 1R01GM117097-01},
  url={http://dgarijo.com/papers/widoco-iswc2017.pdf}
}
```
If you want to cite the latest version of the software, you can do so by using: https://zenodo.org/badge/latestdoi/11427075.

## Downloading the executable

To download WIDOCO, you need to download a JAR executable file. Check the latest release for more details: (https://github.com/dgarijo/WIDOCO/releases/latest).

## Importing WIDOCO as a dependency
Just add the dependency and repository to your `pom.xml` file as follows. See the [WIDOCO JitPack](https://jitpack.io/#dgarijo/Widoco) page to find alternative means to incorporate WIDOCO to your project.

```xml
<dependencies>
  <dependency>
      <groupId>com.github.dgarijo</groupId>
      <artifactId>Widoco</artifactId>
      <version>v1.4.21</version>
  </dependency>
</dependencies>

[ ... ]

<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```

## Description
WIDOCO helps you to publish and create an enriched and customized documentation of your ontology, by following a series of steps in a wizard. We extend the LODE framework by Silvio Peroni to describe the classes, properties and data properties of the ontology, the OOPS! webservice by María Poveda to print an evaluation and the Licensius service by Victor Rodriguez Doncel to determine the license URI and title being used. In addition, we use WebVowl to visualize the ontology and have extended Bubastis to show a complete changelog between different versions of your ontology.

Features of WIDOCO:
* Automatic documentation of the terms in your ontology (based on [LODE](http://www.essepuntato.it/lode/)). Now **you can use Markdown on your class descriptions** (see [example](https://dgarijo.github.io/Widoco/doc/gallery/index.html))
* Massive metadata extraction and support: WIDOCO will enhance your ontology documentation  based on your ontology annotations. Now you can add custom logos and images, edit the content of your sections, etc. by just editing metadata. See our [supported metadata](https://github.com/dgarijo/Widoco/blob/master/doc/metadataGuide/guide.md) and [recommendations](https://dgarijo.github.io/Widoco/doc/bestPractices/index-en.html) for more information.
* Automatic annotation in JSON-LD snippets of the html produced.
* Association of a provenance page which includes the history of your vocabulary (W3C PROV-O compliant).
* Guidelines on the main sections that your document should have and how to complete them.
* Integration with diagram creators ([WebVOWL](http://vowl.visualdataweb.org/webvowl/)).
* Automatic changelog of differences between the actual and the previous version of the ontology (based on [Bubastis](http://www.ebi.ac.uk/efo/bubastis/)).
* Separation of the sections of your html page so you can write them independently and replace only those needed.
* Content negotiation and serialization of your ontology according to [W3C best practices](https://www.w3.org/TR/swbp-vocab-pub/)
* Evaluation reports of your ontology (using the [OOPS! web service](https://oops.linkeddata.es/))
* Integration with license metadata services ([Licensius](http://licensius.com/)) to automatically describe the license used in your ontology.

## Examples
Examples of the features of WIDOCO can be seen on [the gallery](https://dgarijo.github.io/Widoco/doc/gallery/)

## GUI Tutorial
A tutorial explaining the main features of the GUI can be found [here](https://dgarijo.github.io/Widoco/doc/tutorial/)  

## Metadata usage
To see how WIDOCO recognizes metadata annotations in your ontology to create the documentation files, see [the WIDOCO metadata documentation](https://dgarijo.github.io/Widoco/doc/metadataGuide/guide.md). To learn which metadata properties we recommend adding to your ontology for producing a nice-looking documentation, have a look at our [best practices guide](https://dgarijo.github.io/Widoco/doc/bestPractices/index-en.html).

For example, in order to show your logo in your documentation you just need to use `foaf:logo` as an annotation, as follows:
```
@prefix owl: <http://www.w3.org/2002/07/owl#> .
@prefix foaf: <http://xmlns.com/foaf/0.1/> .
<https://w3id.org/roar> a owl:Ontology ;
    foaf:logo <https://www.leonvanwissen.nl/vocab/roar/docs/resources/roar-logo.png#> .
```

and it will show right next to the title. The [WIDOCO metadata documentation](doc/metadataGuide/guide.md) shows all supported metadata fields.

## How to use WIDOCO

### Building the JAR executable
We provide JAR files for each release (see the [releases](https://github.com/dgarijo/Widoco/releases) page). However, if you want to build WIDOCO from scratch, just cd into the project folder and run:

```bash
mvn install
```
The JAR will be generated in a "JAR" folder. The name will follow the pattern: `widoco-{VERSION_ID}-jar-with-dependencies.jar`, where {VERSION_ID} is the version number of the tool.

### JAR execution

Download the latest `.jar` [WIDOCO available release](https://github.com/dgarijo/WIDOCO/releases/latest) (it will be something like `widoco-VERSION-jar-with-dependencies.jar`). Then just double click the `.jar` file.

You may also execute WIDOCO through the command line. Usage:
```bash
java -jar widoco-VERSION-jar-with-dependencies.jar [OPTIONS]
```

### Docker execution

First build the image using the `Dockerfile` in project folder:

```bash
docker build -t dgarijo/widoco .
```

You can now execute WIDOCO through the command line. Usage:

```bash
docker run -ti --rm dgarijo/widoco [OPTIONS]
```

If you want to share data between the Docker Container and your Host, for instance to load a local ontology file (from PATH), you will need to mount the container
with host directories. For instance:

```bash
docker run -ti --rm \
  -v `pwd`/test:/usr/local/widoco/in:Z \
  -v `pwd`/target/generated-doc:/usr/local/widoco/out:Z \
  dgarijo/widoco -ontFile in/bne.ttl -outFolder out -rewriteAll
```

### Options

`-ontFile PATH`  [required (unless -ontURI is used)]: Load a local ontology file (from PATH) to document. This option is incompatible with -ontURI

`-ontURI  URI`   [required (unless -ontFile is used)]: Load an ontology to document from its URI. This option is incompatible with -ontFile

`-outFolder folderName`: Specifies the name of the folder where to save the documentation. By default is 'myDocumentation'

`-confFile PATH`: Load your own configuration file for the ontology metadata. Incompatible with -getOntologyMetadata. See [the configuration documentation](doc/configuration/configuration_doc.md) for more information about the accepted fields.

`-getOntologyMetadata`: Extract ontology metadata from the given ontology

`-oops`: Create an html page with the evaluation from the OOPS service (http://oops.linkeddata.es/)

`-rewriteAll`: Replace any existing files when documenting an ontology (e.g., from a previous execution)

`-crossRef`: ONLY generate the overview and cross reference sections. The index document will NOT be generated. The htaccess, provenance page, etc., will not be generated unless requested by other flags. This flag is intended to be used only after a first version of the documentation exists.

`-saveConfig PATH`: Save a configuration file on PATH with the properties of a given ontology

`-useCustomStyle`: Export the documentation using alternate css files (by Daniel Vila).

`-lang LANG1-LANG2`: Generate documentation in multiple languages (separated by "-"). Note that if the language is not supported, the system will load the labels in english. For example: en-pt-es

`-includeImportedOntologies`: Indicates whether the terms of the imported ontologies of the current ontology should be documented as well or not.

`-htaccess`: Create a bundle for publication ready to be deployed on your Apache server.

`-webVowl`: Create a visualization based on WebVowl (http://vowl.visualdataweb.org/webvowl/index.html#) in the documentation.

`-licensius`: Use the Licensius web services (http://licensius.com/apidoc/index.html) to retrieve license metadata. Only works if the -getOntologyMetadata  flag is enabled.

`-ignoreIndividuals`: Individuals will not be included in the documentation.

`-includeAnnotationProperties`: Include annotation properties defined in your ontology in the documentation (by default they are not included)

`-analytics CODE`: Add a code snippet for Google analytics to track your HTML documentation. You need to add your CODE next to the flag. For example: UA-1234

`-doNotDisplaySerializations`: The serializations of the ontology will not be displayed.

`-displayDirectImportsOnly`: Only those imported ontologies that are directly imported in the ontology being documented.

`-rewriteBase PATH`: Change the default rewrite base path. The default value is "/". This flag can only be used with the htaccess option.

`-excludeIntroduction`: Skip the introduction section in the documentation.

`-uniteSections`: Write all HTML sections into a single HTML document.

`-noPlaceHolderText`: Do not add any placeholder text (this will remove intro, abstract (if empty) and description sections).

`--help`: Shows a help message and exits.

`--version`: Shows the version of WIDOCO.


## How can I make WIDOCO automatically recognize my vocabulary annotations?
There are two alternative ways for making WIDOCO get your vocabulary metadata annotations and use them automatically to document the ontology.

* The recommended way: add them in your OWL file. For guidelines on which ones to include, follow our [best practices document](https://w3id.org/widoco/bestPractices), which indicates which ones we recommend.
* Alternatively, edit the project properties of /config/config.properties. This is a key-value pair file with metadata properties. Some people consider it easier than adding the property annotations to the OWL file, although I recommend doing the former option. Note that the character ";" is used for lists (for instance first author; second author; third author).

For more information, see the [Widoco metadata guide](doc/metadataGuide/guide.md)

## Browser issues (Why can't I see the generated documentation / visualization?)
WIDOCO separates the contents of different sections in HTML files, which are then loaded in the `index.html` file. WIDOCO was designed this way because it's easier to edit your introduction or description sections independently without being all aggregated together in a huge HTML document.  **When all the contents generated by WIDOCO are stored in a server, you will be able to see the documentation of your ontology using any browser**. However, if you open the `index.html` file **on your local browser**, you may see a document missing most of the sections in your documentation. This happens because browsers don't allow loading separate content when opening a file locally for security reasons. If you want to explore how your ontology would look locally, you have two options:

* a) Execute WIDOCO with the `-uniteSections` flag; or select the option `add al sections in a single document` in the "load sections" step in the WIDOCO GUI. This will make all the sections of WIDOCO to be in the `index.html`; and you will be able to see it in your browser. Note that the **LODE visualization will not be available** when exploring your ontology locally.
* b) Create a local server: Set up a local server (e.g., using XAMPP or Tomcat) and serve the files WIDOCO generates (in the `htdocs` folder for Apache servers).

If you place the files generated by WIDOCO in a server and access them via its URL (for example, a Github page), you should be able to see your documentation appropriately.

## Current improvements
For a complete list of the current improvements and next features, check the [project open issues](https://github.com/dgarijo/Widoco/issues) and [milestones](https://github.com/dgarijo/Widoco/milestones) in the repository.

## Requirements
You will need Java 1.8 or higher (SDK 1.8 or JRE 8) for WIDOCO to work
Otherwise, you will probably experience an "Unsupported major.minor version 52.0" exception when executing the JAR file.

## Contribution guidelines
Contributions to address any of the current issues are welcome. In order to push your contribution, just **push your pull request to the develop branch**. The master branch has only the code associated to the latest release.
