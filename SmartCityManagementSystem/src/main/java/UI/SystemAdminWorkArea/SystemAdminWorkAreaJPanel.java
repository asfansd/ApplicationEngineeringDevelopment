/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import UI.RestaurantAdminRole.RestaurantAdminManageOrdersPanel;
import javax.swing.JPanel;

/**
 *
 * @author harooniqbal
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    
    private SmartCity system;
    

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, SmartCity business, UserAccount account) {
        initComponents();
        this.system = business;
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
        jButtontransport = new javax.swing.JButton();
        jButtonhealthcare = new javax.swing.JButton();
        jLabelpanel = new javax.swing.JLabel();
        jLabelpanel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(240);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(252, 236, 148));

        jButtontransport.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtontransport.setForeground(new java.awt.Color(0, 51, 51));
        jButtontransport.setText("Transportation Module");
        jButtontransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontransportActionPerformed(evt);
            }
        });

        jButtonhealthcare.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonhealthcare.setForeground(new java.awt.Color(0, 51, 51));
        jButtonhealthcare.setText("Healthcare Module");
        jButtonhealthcare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonhealthcareActionPerformed(evt);
            }
        });

        jLabelpanel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelpanel.setForeground(new java.awt.Color(0, 51, 51));
        jLabelpanel.setText("PANEL");

        jLabelpanel1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelpanel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabelpanel1.setText("SYSTEM ADMIN");

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/sysadminlogo.png")); // NOI18N

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("View Healthworker Ratio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelpanel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabelpanel))))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtontransport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonhealthcare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabelpanel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelpanel)
                .addGap(58, 58, 58)
                .addComponent(jButtontransport)
                .addGap(34, 34, 34)
                .addComponent(jButtonhealthcare)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(242, 228, 199));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/sysadminbg.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
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

    private void jButtontransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontransportActionPerformed
        // TODO add your handling code here:
        SystemAdminTransportModulePanel menu = new SystemAdminTransportModulePanel(userProcessContainer, userAccount,system);
            jSplitPane1.setRightComponent(menu);
    }//GEN-LAST:event_jButtontransportActionPerformed

    private void jButtonhealthcareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonhealthcareActionPerformed
        // TODO add your handling code here:
        SystemAdminHealthcareModulePanel menu = new SystemAdminHealthcareModulePanel(userProcessContainer, userAccount,system);
            jSplitPane1.setRightComponent(menu);
    }//GEN-LAST:event_jButtonhealthcareActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        HealthCareReport hcr = new HealthCareReport(system);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonhealthcare;
    private javax.swing.JButton jButtontransport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelpanel;
    private javax.swing.JLabel jLabelpanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
