/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TouristRole;

import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author harooniqbal
 */
public class TouristRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TouristRoleWorkAreaJPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    
    private SmartCity business;
    

    public TouristRoleWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
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
        jLabeltouristpanel = new javax.swing.JLabel();
        jButtonbooktourpackage = new javax.swing.JButton();
        jButtonviewhistory = new javax.swing.JButton();
        jButtonrating = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(124, 170, 189));

        jLabeltouristpanel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabeltouristpanel.setForeground(new java.awt.Color(0, 51, 51));
        jLabeltouristpanel.setText("TOURIST PANEL");

        jButtonbooktourpackage.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonbooktourpackage.setForeground(new java.awt.Color(0, 51, 51));
        jButtonbooktourpackage.setText("Book Tour Package");
        jButtonbooktourpackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbooktourpackageActionPerformed(evt);
            }
        });

        jButtonviewhistory.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonviewhistory.setForeground(new java.awt.Color(0, 51, 51));
        jButtonviewhistory.setText("View History");
        jButtonviewhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonviewhistoryActionPerformed(evt);
            }
        });

        jButtonrating.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButtonrating.setForeground(new java.awt.Color(0, 51, 51));
        jButtonrating.setText("Give Rating");
        jButtonrating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonratingActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/touristicon.png")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonviewhistory, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonrating, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonbooktourpackage)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabeltouristpanel))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabeltouristpanel)
                .addGap(65, 65, 65)
                .addComponent(jButtonbooktourpackage)
                .addGap(63, 63, 63)
                .addComponent(jButtonviewhistory)
                .addGap(65, 65, 65)
                .addComponent(jButtonrating)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(194, 216, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/touristworkpanel.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
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

    private void jButtonratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonratingActionPerformed
        // TODO add your handling code here:
        TouristGiveRatingPanel bov = new TouristGiveRatingPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonratingActionPerformed

    private void jButtonbooktourpackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbooktourpackageActionPerformed
        // TODO add your handling code here:
        TouristBookPackagePanel bov = new TouristBookPackagePanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonbooktourpackageActionPerformed

    private void jButtonviewhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonviewhistoryActionPerformed
        // TODO add your handling code here:
        TouristViewHistoryPanel bov = new TouristViewHistoryPanel(this.userProcessContainer, this.userAccount, this.business);
        jSplitPane1.setRightComponent(bov);
    }//GEN-LAST:event_jButtonviewhistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonbooktourpackage;
    private javax.swing.JButton jButtonrating;
    private javax.swing.JButton jButtonviewhistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabeltouristpanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
