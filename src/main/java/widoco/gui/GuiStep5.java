/*
 *  Copyright 2012-2013 Ontology Engineering Group, Universidad Politecnica de Madrid, Spain

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

/*
 * WidocoGui2.java
 *
 * Created on 16-jun-2014, 21:38:19
 */
package widoco.gui;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import oops.OOPSevaluation;

/**
 *
 * @author Daniel Garijo
 */
public class GuiStep5 extends javax.swing.JFrame {
    GuiController g;
    /** Creates new form WidocoGui2
     * @param g
     * @param isSkeleton 
     */
    public GuiStep5(GuiController g, boolean isSkeleton) {
        initComponents();
        this.g = g;
        Image l = g.getConfig().getLogo().getScaledInstance(widocoLogo.getWidth(), widocoLogo.getHeight(), Image.SCALE_SMOOTH);
        widocoLogo.setIcon(new ImageIcon(l));
        this.setIconImage(g.getConfig().getLogoMini());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
        if(isSkeleton){
            labelOops.setEnabled(false);
            labelViewDoc.setEnabled(false);
        }
        labelIsOntologyDocClicked.setVisible(false);
        labelStatusOOPS.setVisible(false);
        this.barStatus.setVisible(false);
        this.barStatus.setIndeterminate(false);
    }

    public void stopLoadingSign(){
        this.barStatus.setVisible(false);
        this.barStatus.setIndeterminate(false);
        this.labelStatusOOPS.setVisible(false);
    }
    
    public void updateMessage(String s){
        this.labelStatusOOPS.setText(s);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneSteps = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        labelTitle = new javax.swing.JLabel();
        labelSteps = new javax.swing.JLabel();
        labelTitle1 = new javax.swing.JLabel();
        labelViewDoc = new javax.swing.JLabel();
        labelOops = new javax.swing.JLabel();
        OOPSLogo = new javax.swing.JLabel();
        labelIsOntologyDocClicked = new javax.swing.JLabel();
        labelStatusOOPS = new javax.swing.JLabel();
        barStatus = new javax.swing.JProgressBar();
        widocoLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finish documentation");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        nextButton.setText("Finish");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setText("Restart");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        textPaneSteps.setEditable(false);
        textPaneSteps.setContentType("text/html"); // NOI18N
        textPaneSteps.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r \n1. Select template<br/>       \n2. Load Metadata<br/>\n3. Load Sections<br/>\n4. Configure LODE<br/>\n<b>5. Generate!</b>\n  </body>\r\n</html>\r\n");
        jScrollPane1.setViewportView(textPaneSteps);

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTitle.setText("You are done!");

        labelSteps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSteps.setText("Steps");

        labelTitle1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTitle1.setText("The documentation was generated successfully. Now you can: ");

        labelViewDoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelViewDoc.setForeground(new java.awt.Color(0, 0, 255));
        labelViewDoc.setText("View the ontology documentation in your Web browser");
        labelViewDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelViewDocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelViewDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelViewDocMouseExited(evt);
            }
        });

        labelOops.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOops.setForeground(new java.awt.Color(0, 0, 255));
        labelOops.setText("Validate ontology with OOPS!");
        labelOops.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelOopsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOopsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOopsMouseExited(evt);
            }
        });

        OOPSLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oops/logoMini.png"))); // NOI18N
        OOPSLogo.setToolTipText("Click to go to the OOPS! Web Page");
        OOPSLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OOPSLogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OOPSLogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OOPSLogoMouseExited(evt);
            }
        });

        labelIsOntologyDocClicked.setText("Opening... it might take a while!");

        labelStatusOOPS.setText("Loading... it might take a few seconds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSteps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(widocoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(labelTitle1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelViewDoc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(barStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelStatusOOPS))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelIsOntologyDocClicked)
                                            .addComponent(labelOops))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OOPSLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(labelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(labelViewDoc)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIsOntologyDocClicked)
                                .addGap(18, 18, 18)
                                .addComponent(labelOops)
                                .addGap(13, 13, 13)
                                .addComponent(barStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OOPSLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelStatusOOPS))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(widocoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSteps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        g.switchState("restart");
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        g.switchState("cancel");
    }//GEN-LAST:event_nextButtonActionPerformed

    private void labelOopsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOopsMouseClicked
//        String url = g.getConfig().getOntologyURI();
        this.barStatus.setVisible(true);
        this.barStatus.setIndeterminate(true);
        this.g.switchState("evaluate");
        this.labelStatusOOPS.setVisible(true);
//        if(url!=null &&!"".equals(url)) {
//            try {
//                this.labelIsOOPSClicked.setVisible(true);
//                g.openBrowser(new URI("http://www.oeg-upm.net/oops/response.jsp?uri="+url));
//            } catch (URISyntaxException ex) {
//                System.err.println("malformed URI!!!"+ ex.getMessage());
//            }
//        }else{
//            JOptionPane.showMessageDialog(this, "This option is currently supported when the ontology is online.");
            //we can do a request to oops web service, but we have to parse the results!
//            try{
//                OOPSevaluation eval = new OOPSevaluation("http://purl.org/net/p-plan#");
//                System.out.println(eval.printEvaluation());
//            }catch(Exception e){
//                System.err.println("Error while saving OOPS evaluation: "+e.getMessage());
//            }
//        }
    }//GEN-LAST:event_labelOopsMouseClicked

    private void labelViewDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelViewDocMouseClicked
        String url = g.getConfig().getDocumentationURI();
        if(url!=null &&!"".equals(url)) {
            //
            File f = new File(url+File.separator+"index.html");
            if(f.exists()){
                this.labelIsOntologyDocClicked.setVisible(true);
                g.openBrowser(f.toURI());
            }else{
                JOptionPane.showMessageDialog(this,"There were errors creating the documentation. I cannot open it.");
            }
        }
    }//GEN-LAST:event_labelViewDocMouseClicked

    private void labelOopsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOopsMouseEntered
        setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelOopsMouseEntered

    private void labelOopsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOopsMouseExited
        setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelOopsMouseExited

    private void labelViewDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelViewDocMouseEntered
        setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelViewDocMouseEntered

    private void labelViewDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelViewDocMouseExited
        setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelViewDocMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.g.switchState("cancel");
    }//GEN-LAST:event_formWindowClosing

    private void OOPSLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OOPSLogoMouseClicked
        try {
            g.openBrowser(new URI("http://www.oeg-upm.net/oops/"));
        } catch (URISyntaxException ex) {
        }
    }//GEN-LAST:event_OOPSLogoMouseClicked

    private void OOPSLogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OOPSLogoMouseEntered
        setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_OOPSLogoMouseEntered

    private void OOPSLogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OOPSLogoMouseExited
        setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_OOPSLogoMouseExited

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GuiStep5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GuiStep5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GuiStep5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GuiStep5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new GuiStep5().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OOPSLogo;
    private javax.swing.JButton backButton;
    private javax.swing.JProgressBar barStatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelIsOntologyDocClicked;
    private javax.swing.JLabel labelOops;
    private javax.swing.JLabel labelStatusOOPS;
    private javax.swing.JLabel labelSteps;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JLabel labelViewDoc;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextPane textPaneSteps;
    private javax.swing.JLabel widocoLogo;
    // End of variables declaration//GEN-END:variables
}