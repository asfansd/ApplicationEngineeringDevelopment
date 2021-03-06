/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerRole;

import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import UI.CommuterRole.CommuterViewHistoryPanel;
import javax.swing.JPanel;

/**
 *
 * @author harooniqbal
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SmartCity business;
    
    public CustomerAreaJPanel() {
        //initComponents();
    }

    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
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
        jButtonplaceorder = new javax.swing.JButton();
        jButtonviewhistory = new javax.swing.JButton();
        jLabelpanel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(180);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(242, 183, 240));

        jButtonplaceorder.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonplaceorder.setText("Place Order");
        jButtonplaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonplaceorderActionPerformed(evt);
            }
        });

        jButtonviewhistory.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonviewhistory.setText("View History");
        jButtonviewhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonviewhistoryActionPerformed(evt);
            }
        });

        jLabelpanel1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelpanel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabelpanel1.setText("CUSTOMER PANEL");

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/customericon.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelpanel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonviewhistory)
                                    .addComponent(jButtonplaceorder))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabelpanel1)
                .addGap(56, 56, 56)
                .addComponent(jButtonplaceorder)
                .addGap(52, 52, 52)
                .addComponent(jButtonviewhistory)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(251, 211, 245));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/customerbg.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
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

    private void jButtonplaceorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonplaceorderActionPerformed
        // TODO add your handling code here:
        CustomerPlaceOrderPanel bov = new CustomerPlaceOrderPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonplaceorderActionPerformed

    private void jButtonviewhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonviewhistoryActionPerformed
        // TODO add your handling code here:
        CustomerViewOrderHistoryPanel bov = new CustomerViewOrderHistoryPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonviewhistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonplaceorder;
    private javax.swing.JButton jButtonviewhistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelpanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
