/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BusinessOwnerRole;

import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author harooniqbal
 */
public class BusinessOwnerRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BusinessOwnerRoleWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SmartCity business;

    public BusinessOwnerRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
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
        jButtonviewbusiness = new javax.swing.JButton();
        jButtonaddbusiness = new javax.swing.JButton();
        jButtonremovebusiness = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setDividerLocation(180);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(242, 183, 240));

        jButtonviewbusiness.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonviewbusiness.setForeground(new java.awt.Color(0, 51, 51));
        jButtonviewbusiness.setText("View Businesses");
        jButtonviewbusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonviewbusinessActionPerformed(evt);
            }
        });

        jButtonaddbusiness.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonaddbusiness.setForeground(new java.awt.Color(0, 51, 51));
        jButtonaddbusiness.setText("Add Businesses");
        jButtonaddbusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddbusinessActionPerformed(evt);
            }
        });

        jButtonremovebusiness.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonremovebusiness.setForeground(new java.awt.Color(0, 51, 51));
        jButtonremovebusiness.setText("Remove Businesses");
        jButtonremovebusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonremovebusinessActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setText("BUSINESS");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("OWNER");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 56, 82));
        jLabel8.setText("PANEL ");

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/busiowneradmin.png")); // NOI18N
        jLabel11.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonremovebusiness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonaddbusiness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonviewbusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jButtonviewbusiness)
                .addGap(49, 49, 49)
                .addComponent(jButtonaddbusiness)
                .addGap(46, 46, 46)
                .addComponent(jButtonremovebusiness)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(251, 211, 245));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 818, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonviewbusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonviewbusinessActionPerformed
        // TODO add your handling code here:
        BusinessOwnerViewBusinessesPanel bov = new BusinessOwnerViewBusinessesPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonviewbusinessActionPerformed

    private void jButtonaddbusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddbusinessActionPerformed
        // TODO add your handling code here:
        BusinessOwnerAddBusinessPanel bov = new BusinessOwnerAddBusinessPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonaddbusinessActionPerformed

    private void jButtonremovebusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonremovebusinessActionPerformed
        // TODO add your handling code here:
        BusinessOwnerRemoveBusinessPanel bov = new BusinessOwnerRemoveBusinessPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonremovebusinessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonaddbusiness;
    private javax.swing.JButton jButtonremovebusiness;
    private javax.swing.JButton jButtonviewbusiness;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
