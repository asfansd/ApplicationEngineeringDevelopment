/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RestaurantAdminRole;

import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import UI.ShopAdminRole.ShopAdminManageOrdersPanel;
import javax.swing.JPanel;

/**
 *
 * @author harooniqbal
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    
    private SmartCity business;
    public AdminWorkAreaJPanel() {
        
    }

    public AdminWorkAreaJPanel(JPanel userProcessContainer, SmartCity business, UserAccount account) {
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
        jLabelrestadminpanel = new javax.swing.JLabel();
        jButtonmanageorder = new javax.swing.JButton();
        jLabelpanel = new javax.swing.JLabel();
        jButtonmanagemenu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(160);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(180, 180, 231));

        jLabelrestadminpanel.setBackground(new java.awt.Color(212, 217, 235));
        jLabelrestadminpanel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelrestadminpanel.setForeground(new java.awt.Color(0, 51, 51));
        jLabelrestadminpanel.setText("RESTAURANT ADMIN");

        jButtonmanageorder.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtonmanageorder.setForeground(new java.awt.Color(0, 51, 51));
        jButtonmanageorder.setText("Manage Orders");
        jButtonmanageorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmanageorderActionPerformed(evt);
            }
        });

        jLabelpanel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabelpanel.setForeground(new java.awt.Color(0, 51, 51));
        jLabelpanel.setText("PANEL");

        jButtonmanagemenu.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jButtonmanagemenu.setForeground(new java.awt.Color(0, 51, 51));
        jButtonmanagemenu.setText("Manage Menu");
        jButtonmanagemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmanagemenuActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/adminicon.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonmanageorder)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelrestadminpanel)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabelpanel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonmanagemenu))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jLabelrestadminpanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelpanel)
                .addGap(80, 80, 80)
                .addComponent(jButtonmanageorder)
                .addGap(34, 34, 34)
                .addComponent(jButtonmanagemenu)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(212, 217, 235));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/restaurantbg.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
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
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonmanageorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmanageorderActionPerformed
        // TODO add your handling code here:
        RestaurantAdminManageOrdersPanel menu = new RestaurantAdminManageOrdersPanel(userProcessContainer, userAccount,business);
            jSplitPane1.setRightComponent(menu);
    }//GEN-LAST:event_jButtonmanageorderActionPerformed

    private void jButtonmanagemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmanagemenuActionPerformed
        // TODO add your handling code here:
        RestaurantAdminManageMenuPanel menu = new RestaurantAdminManageMenuPanel(userProcessContainer, userAccount,business);
            jSplitPane1.setRightComponent(menu);
    }//GEN-LAST:event_jButtonmanagemenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonmanagemenu;
    private javax.swing.JButton jButtonmanageorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelpanel;
    private javax.swing.JLabel jLabelrestadminpanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}