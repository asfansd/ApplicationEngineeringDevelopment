/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryManRole;

import Project.SmartCity.Establishment.Item;
import Project.SmartCity.Establishment.Shop;
import Project.SmartCity.Establishment.ShopOrder;
import Project.SmartCity.SmartCity;
import Project.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harooniqbal
 */
public class DeliveryManProcessShopOrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManProcessShopOrdersPanel
     */
    private JPanel userProcessContainer;

    private UserAccount userAccount;
    
    private SmartCity business;
    //Shop shop;
    public DeliveryManProcessShopOrdersPanel(JPanel userProcessContainer, SmartCity business, UserAccount account) {
        initComponents();
        this.business = business;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        /*for(Shop s:business.getShopDirectory().getShopList()){
            if(s.getUsername().equals(userAccount.getUsername())){
                shop = s;
                break;
        }
        }*/
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        orderlisttbl = new javax.swing.JTable();
        deliverbtn = new javax.swing.JButton();
        assigntomebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderhistorytbl = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        shopstbl = new javax.swing.JTable();
        processDeliverybtn1 = new javax.swing.JButton();

        orderlisttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Order ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderlisttbl);

        deliverbtn.setText("Mark As Completed");
        deliverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverbtnActionPerformed(evt);
            }
        });

        assigntomebtn.setText("Assign to Me");
        assigntomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigntomebtnActionPerformed(evt);
            }
        });

        orderhistorytbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Order ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderhistorytbl);

        shopstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Shops"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(shopstbl);

        processDeliverybtn1.setText("Go to");
        processDeliverybtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processDeliverybtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(assigntomebtn)
                .addGap(156, 156, 156)
                .addComponent(deliverbtn)
                .addGap(339, 339, 339))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(processDeliverybtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(424, 424, 424))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(processDeliverybtn1)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(deliverbtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assigntomebtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deliverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverbtnActionPerformed
        // TODO add your handling code here:
       /* int selectedRowIndex = orderlisttbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be marked.");
            return;
        }
        DefaultTableModel records = (DefaultTableModel) orderlisttbl.getModel();
        Integer id = (Integer) records.getValueAt(selectedRowIndex, 0);
        Order order = business.getOrderDirectory().getOrder(id);

        //        Order order = (Order) records.getValueAt(selectedRowIndex, 0);

        OrderDirectory orderDirectory;

        if(userAccount.getUsername().equals("delivery")){
            orderDirectory = business.getDeliveryManDirectory().getDeliverManList().get(0).getOrderDirectory();

        }
        else if(userAccount.getUsername().equals("delivery2")){
            orderDirectory = business.getDeliveryManDirectory().getDeliverManList().get(1).getOrderDirectory();
        }
        else{
            orderDirectory = business.getDeliveryManDirectory().getDeliverManList().get(2).getOrderDirectory();
        }

        Order o = orderDirectory.getOrder(id);
        if(o == null){
            JOptionPane.showMessageDialog(this, "Order not found.");
            return;
        }

        o.setStatus("Completed");
        order.setStatus("Completed");

        //        business.getDeliveryManDirectory().getDeliverManList().get(0).setOrderDirectory(orderDirectory);

        records.setRowCount(0); //Clear empty records

        for(Order or : orderDirectory.getOrderList()){
            //            if(o.getStatus().equals("Completed")){
                Object[] row = new Object[2];
                row[0] = or.getId();
                //row[0] = vs.getDate();
                row[1] = or.getStatus();

                records.addRow(row);
                //            }
        }
        populateTable();
        populateTable3();*/
    }//GEN-LAST:event_deliverbtnActionPerformed

    private void assigntomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assigntomebtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_assigntomebtnActionPerformed

    private void processDeliverybtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processDeliverybtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = shopstbl.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed.");
            return;
        }
        
        DefaultTableModel records = (DefaultTableModel) shopstbl.getModel();
        
        Integer id = (Integer) records.getValueAt(selectedRowIndex, 0);
        Shop shop = business.getShopDirectory().getShop(id);
//        Order order = (Order) records.getValueAt(selectedRowIndex, 0);
//        itemList.add(item);
        populateTable2(shop);
    }//GEN-LAST:event_processDeliverybtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assigntomebtn;
    private javax.swing.JButton deliverbtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable orderhistorytbl;
    private javax.swing.JTable orderlisttbl;
    private javax.swing.JButton processDeliverybtn1;
    private javax.swing.JTable shopstbl;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel records = (DefaultTableModel) shopstbl.getModel();
        records.setRowCount(0); //Clear empty records
        
        for(Shop i : business.getShopDirectory().getShopList()){
            Object[] row = new Object[1];
            row[0] = i.getName();
            //row[0] = vs.getDate();
           // row[1] = i.getType();
           // row[2] = i.getCost();
            
            records.addRow(row);
        }
    
    }

    private void populateTable2(Shop shop) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   DefaultTableModel records = (DefaultTableModel) orderlisttbl.getModel();
        records.setRowCount(0); //Clear empty records
        
        for(ShopOrder i : shop.getShoporderDirectory().getOrderList()){
            if(i.getStatus().equals("In Progress")){
                
            
            Object[] row = new Object[2];
            row[0] = i.getId();
            //row[0] = vs.getDate();
            row[1] = i.getStatus();
           // row[2] = i.getCost();
            
            records.addRow(row);
        }
        }
    }
}
