/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorRole;

import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author harooniqbal
 */
public class DoctorRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRoleWorkAreaJPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    
    private SmartCity business;
    

    public DoctorRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    initComponents();
        this.business = business;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabeldoctorpanel = new javax.swing.JLabel();
        jButtoncreatepresc = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jSplitPane1.setBackground(new java.awt.Color(204, 238, 204));
        jSplitPane1.setDividerLocation(180);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(174, 221, 131));

        jLabeldoctorpanel.setBackground(new java.awt.Color(204, 238, 204));
        jLabeldoctorpanel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabeldoctorpanel.setForeground(new java.awt.Color(0, 51, 51));
        jLabeldoctorpanel.setText("DOCTOR PANEL");

        jButtoncreatepresc.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtoncreatepresc.setForeground(new java.awt.Color(0, 51, 51));
        jButtoncreatepresc.setText("Create Prescription");
        jButtoncreatepresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncreateprescActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/docicon.png")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtoncreatepresc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabeldoctorpanel))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(86, 86, 86)
                .addComponent(jLabeldoctorpanel)
                .addGap(44, 44, 44)
                .addComponent(jButtoncreatepresc)
                .addContainerGap(431, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(206, 236, 206));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/docbg.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncreateprescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncreateprescActionPerformed
        // TODO add your handling code here:
        DoctorCreatePrescriptionPanel dcp = new DoctorCreatePrescriptionPanel(userProcessContainer, userAccount, business);
        jSplitPane1.setRightComponent(dcp);
    }//GEN-LAST:event_jButtoncreateprescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncreatepresc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabeldoctorpanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
