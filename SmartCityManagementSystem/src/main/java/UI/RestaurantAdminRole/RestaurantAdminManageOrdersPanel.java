/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RestaurantAdminRole;

import Project.SmartCity.Establishment.Item;
import Project.SmartCity.Establishment.MenuItem;
import Project.SmartCity.Establishment.Order;
import Project.SmartCity.Establishment.Restaurant;
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
public class RestaurantAdminManageOrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantAdminManageOrdersPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private SmartCity business;
    Restaurant restaurant;
    public RestaurantAdminManageOrdersPanel(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        for(Restaurant s:business.getRestaurantDirectory().getRestaurantList()){
            if(s.getUsername().equals(userAccount.getUsername())){
                restaurant = s;
                break;
        }
        }
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        orderListtbl = new javax.swing.JScrollPane();
        orderlisttbl = new javax.swing.JTable();
        ordertbl = new javax.swing.JScrollPane();
        ordercontentstbl = new javax.swing.JTable();
        viewOrderbtn = new javax.swing.JButton();
        processbtn = new javax.swing.JButton();
        assignbtn = new javax.swing.JButton();
        processbtn1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(212, 217, 235));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(210, 210, 240));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        orderlisttbl.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        orderlisttbl.setForeground(new java.awt.Color(0, 51, 51));
        orderlisttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order ID", "Status", "Order Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderListtbl.setViewportView(orderlisttbl);

        ordercontentstbl.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ordercontentstbl.setForeground(new java.awt.Color(0, 51, 51));
        ordercontentstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        ordertbl.setViewportView(ordercontentstbl);

        viewOrderbtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        viewOrderbtn.setForeground(new java.awt.Color(0, 51, 51));
        viewOrderbtn.setText(">>");
        viewOrderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderbtnActionPerformed(evt);
            }
        });

        processbtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        processbtn.setForeground(new java.awt.Color(0, 51, 51));
        processbtn.setText("Accept Order");
        processbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processbtnActionPerformed(evt);
            }
        });

        assignbtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        assignbtn.setForeground(new java.awt.Color(0, 51, 51));
        assignbtn.setText("Process Order");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });

        processbtn1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        processbtn1.setForeground(new java.awt.Color(0, 51, 51));
        processbtn1.setText("Reject Order");
        processbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processbtn1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 56, 82));
        jLabel6.setText("LIST OF ORDERS FOR RESTAURANT");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Select Order:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("View Order:");

        jLabel11.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/restordericon.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/harooniqbal/Desktop/AEDProjectImages/restorderbg.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(146, 146, 146)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(orderListtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(viewOrderbtn))
                                        .addComponent(jLabel7))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(ordertbl, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(711, 711, 711)
                                    .addComponent(processbtn)
                                    .addGap(38, 38, 38)
                                    .addComponent(processbtn1)
                                    .addGap(59, 59, 59)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(427, 427, 427)
                                .addComponent(assignbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(266, 266, 266)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(208, 208, 208)
                                        .addComponent(jLabel6)))))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ordertbl, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(viewOrderbtn))
                    .addComponent(orderListtbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processbtn1)
                    .addComponent(processbtn))
                .addGap(37, 37, 37)
                .addComponent(assignbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1142, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewOrderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderbtnActionPerformed

       int selectedRowIndex = orderlisttbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed.");
            return;
        }

        DefaultTableModel records = (DefaultTableModel) orderlisttbl.getModel();

        Integer id = (Integer) records.getValueAt(selectedRowIndex, 0);
        Order order = restaurant.getOrderDirectory().getOrder(id);
        //        Order order = (Order) records.getValueAt(selectedRowIndex, 0);
        //        itemList.add(item);
        populateTable2(order);
    }//GEN-LAST:event_viewOrderbtnActionPerformed

    private void processbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processbtnActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = orderlisttbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be Accepted.");
            return;
        }

        DefaultTableModel records = (DefaultTableModel) orderlisttbl.getModel();
        Integer id = (Integer) records.getValueAt(selectedRowIndex, 0);
        Order order = restaurant.getOrderDirectory().getOrder(id);
        //        Order order = (Order) records.getValueAt(selectedRowIndex, 0);
        //        itemList.add(item);
        order.setStatus("Accepted");
        restaurant.setRevenue(Integer.toString(Integer.parseInt(restaurant.getRevenue())+Integer.parseInt(order.getCost())));
        JOptionPane.showMessageDialog(this, "Order Accepted.");
        populateTable();
    }//GEN-LAST:event_processbtnActionPerformed

    private void assignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtnActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = orderlisttbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be Processed.");
            return;
        }

        DefaultTableModel records = (DefaultTableModel) orderlisttbl.getModel();
        Integer id = (Integer) records.getValueAt(selectedRowIndex, 0);
        Order order = restaurant.getOrderDirectory().getOrder(id);
        //        Order order = (Order) records.getValueAt(selectedRowIndex, 0);
        //        itemList.add(item);
        order.setStatus("Completed");
        JOptionPane.showMessageDialog(this, "Order Completed.");
        populateTable();
    }//GEN-LAST:event_assignbtnActionPerformed

    private void processbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processbtn1ActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = orderlisttbl.getSelectedRow();

        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to be Rejected.");
            return;
        }

        DefaultTableModel records = (DefaultTableModel) orderlisttbl.getModel();
        Integer id = (Integer) records.getValueAt(selectedRowIndex, 0);
        Order order = restaurant.getOrderDirectory().getOrder(id);
        //        Order order = (Order) records.getValueAt(selectedRowIndex, 0);
        //        itemList.add(item);
        order.setStatus("Rejected");
        restaurant.setRevenue(Integer.toString(Integer.parseInt(restaurant.getRevenue())-Integer.parseInt(order.getCost())));
        JOptionPane.showMessageDialog(this, "Order Rejected.");
        populateTable();
    }//GEN-LAST:event_processbtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane orderListtbl;
    private javax.swing.JTable ordercontentstbl;
    private javax.swing.JTable orderlisttbl;
    private javax.swing.JScrollPane ordertbl;
    private javax.swing.JButton processbtn;
    private javax.swing.JButton processbtn1;
    private javax.swing.JButton viewOrderbtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel records = (DefaultTableModel) orderlisttbl.getModel();
        records.setRowCount(0); //Clear empty records
        
        for(Order o : restaurant.getOrderDirectory().getOrderList()){
//            if(o.getStatus().equals("Active")){
                Object[] row = new Object[3];
                row[0] = o.getId();
                //row[0] = vs.getDate();
                row[1] = o.getStatus();
                row[2] = o.getComments();
                
                records.addRow(row);
//            }
        }
    }

    private void populateTable2(Order order) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableModel records = (DefaultTableModel) ordercontentstbl.getModel();
        records.setRowCount(0); //Clear empty records
        
        for(MenuItem i : order.getItemList()){
//            if(o.getStatus().equals("Active")){
                Object[] row = new Object[2];
                row[0] = i.getName();
                //row[0] = vs.getDate();
                row[1] = 1;
                //row[2] = o.getComments();
                
                records.addRow(row);
//            }
        }
    }
    
}
