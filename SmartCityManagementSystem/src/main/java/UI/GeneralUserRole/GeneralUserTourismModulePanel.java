/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GeneralUserRole;

/**
 *
 * @author harooniqbal
 */
public class GeneralUserTourismModulePanel extends javax.swing.JPanel {

    /**
     * Creates new form GeneralUserTourismModulePanel
     */
    public GeneralUserTourismModulePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonbeach = new javax.swing.JButton();
        jButtonmuseum = new javax.swing.JButton();
        jButtongarden = new javax.swing.JButton();
        jButtonaquarium = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabletouristplace = new javax.swing.JTable();
        jButtonshowlocation = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(0, 51, 51));

        jButtonbeach.setBackground(new java.awt.Color(255, 255, 255));
        jButtonbeach.setForeground(new java.awt.Color(0, 51, 51));
        jButtonbeach.setText("View Beaches");

        jButtonmuseum.setBackground(new java.awt.Color(255, 255, 255));
        jButtonmuseum.setForeground(new java.awt.Color(0, 51, 51));
        jButtonmuseum.setText("View Museums");

        jButtongarden.setBackground(new java.awt.Color(255, 255, 255));
        jButtongarden.setForeground(new java.awt.Color(0, 51, 51));
        jButtongarden.setText("View Gardens");

        jButtonaquarium.setBackground(new java.awt.Color(255, 255, 255));
        jButtonaquarium.setForeground(new java.awt.Color(0, 51, 51));
        jButtonaquarium.setText("View Aquariums");

        jTabletouristplace.setBackground(new java.awt.Color(255, 255, 255));
        jTabletouristplace.setForeground(new java.awt.Color(0, 51, 51));
        jTabletouristplace.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Location", "Cost", "Number of Visits"
            }
        ));
        jScrollPane1.setViewportView(jTabletouristplace);

        jButtonshowlocation.setBackground(new java.awt.Color(255, 255, 255));
        jButtonshowlocation.setForeground(new java.awt.Color(0, 51, 51));
        jButtonshowlocation.setText("Show Location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButtonbeach)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonmuseum)
                        .addGap(61, 61, 61)
                        .addComponent(jButtongarden)
                        .addGap(64, 64, 64)
                        .addComponent(jButtonaquarium))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jButtonshowlocation)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonaquarium)
                    .addComponent(jButtongarden)
                    .addComponent(jButtonmuseum)
                    .addComponent(jButtonbeach))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonshowlocation)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonaquarium;
    private javax.swing.JButton jButtonbeach;
    private javax.swing.JButton jButtongarden;
    private javax.swing.JButton jButtonmuseum;
    private javax.swing.JButton jButtonshowlocation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabletouristplace;
    // End of variables declaration//GEN-END:variables
}