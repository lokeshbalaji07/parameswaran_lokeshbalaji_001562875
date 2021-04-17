/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.menu.Menu;
import Business.menu.MenuDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private String quant;
    private UserAccount userAccount;
    private EcoSystem system;
    Menu menu;
    ArrayList<Menu> ml;
    DefaultTableModel defaulttablemodelcust;
    private String selectedRestaurantName;
    private Restaurant resObj;
    Double totalp;
    Order order;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    
    
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system){
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ml = new ArrayList<>();
        this.totalp= 0.0;
//         JPanel2.setVisible(false);
        populateComboBox();
        tableListener();
        
      // populate
    }

    
    public void tableListener(){
        defaulttablemodelcust = (DefaultTableModel) ordermenuitemtable.getModel();
        defaulttablemodelcust.setRowCount(0);
       
        defaulttablemodelcust.addTableModelListener(new TableModelListener()
            {
                public void tableChanged(TableModelEvent evt)
                {
                    
                    int coloum = evt.getColumn();
                    int row = evt.getFirstRow();
                    System.out.println(row+"as");
                    System.out.println(coloum+"as1");
                    menu = (Menu)defaulttablemodelcust.getValueAt(row, 0);
                    quant = String.valueOf(defaulttablemodelcust.getValueAt(row,2));
                    System.out.println("Quantity"+ ordermenuitemtable.getValueAt(row, 2));
//                    map1.put(course, rating);
                   
                }
            });
    }
    
    public void populateMenuItems(String resName){
      
        
        System.out.println("RSSS "+ resName);
        
        System.out.println("Menu "+ system.getRestaurantDirectory().getRestaurantList().size());
        resObj = system.getRestaurantDirectory().findRestaurant(resName);
         
        if(resObj!=null && resObj.getMd()!=null){
            for(Menu m : resObj.getMd().getMenu()) {
                Object row[] = new Object[3];
                row[0] = m;
                row[1] = m.getItemPrice();
                row[2] = m.getQuantity();

                defaulttablemodelcust.addRow(row);
            }
        }
    }
    
    public void populateCartTable(){
        DefaultTableModel dtm = (DefaultTableModel) orderhistorytable.getModel();
        dtm.setRowCount(0);
        
         System.out.println("Menu "+ system.getRestaurantDirectory().getRestaurantList().size());
        for(Order order : system.getOrderDirectory().getOrderhist()){
            Object row[] = new Object[5];
                row[0] = order.getOrderID();
                row[1] = order;
                row[2] = order.getRestaurant().getName();
                row[3] = order.getComments();
                row[4] = order.getAmount();
                

                dtm.addRow(row);
        }
        
    }
     public void populateOrderDetails(Order o){
        DefaultTableModel getorder = (DefaultTableModel) tracktable.getModel();
        getorder.setRowCount(0);
        
        for(Menu m : o.getMenuDirectory().getMenu()){
            Object row[] = new Object[3];
                row[0] = m;
                row[1] = m.getItemPrice();
                row [2] =m.getQuantity();
                getorder.addRow(row);
        }
        
    }
    
//    public void populateComboBox(){
//         for(Restaurant res: system.getRestaurantDirectory().getRestaurantList()){
//            selecthotelcombobox.addItem(res.getName());
//         
//        }
//    }
    public void populateRequestTable() {
    }
       
    public void populateComboBox(){
         for(Restaurant res: system.getRestaurantDirectory().getRestaurantList()){
            selecthotelcombobox.addItem(res.getName());
         
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        selecthotelcombobox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordermenuitemtable = new javax.swing.JTable();
        addcartbt = new javax.swing.JButton();
        confirmorderbt = new javax.swing.JButton();
        lbtotalprice = new javax.swing.JLabel();
        tptxt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        c = new javax.swing.JTextArea();
        trackorderbt = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderhistorytable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tracktable = new javax.swing.JTable();
        viewbt = new javax.swing.JButton();
        orderrecievedbt = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 137, 38));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        selecthotelcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Hotel" }));
        selecthotelcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecthotelcomboboxActionPerformed(evt);
            }
        });

        ordermenuitemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ordermenuitemtable);

        addcartbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addcartbt.setText("Add cart");
        addcartbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcartbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartbtActionPerformed(evt);
            }
        });

        confirmorderbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        confirmorderbt.setText("Confirm Order");
        confirmorderbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmorderbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmorderbtActionPerformed(evt);
            }
        });

        lbtotalprice.setText("    Total Price:");

        c.setColumns(20);
        c.setRows(5);
        c.setText("Enter Comments:");
        jScrollPane4.setViewportView(c);

        trackorderbt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        trackorderbt.setText("Track Order");
        trackorderbt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trackorderbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackorderbtActionPerformed(evt);
            }
        });

        orderhistorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Oder ID", "Order Status", "Restaurant Name", "Comments", "Total Price"
            }
        ));
        jScrollPane3.setViewportView(orderhistorytable);

        tracktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(tracktable);

        viewbt.setText("View Order");
        viewbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtActionPerformed(evt);
            }
        });

        orderrecievedbt.setText("Order Recieved");
        orderrecievedbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderrecievedbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(selecthotelcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addcartbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbtotalprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(confirmorderbt))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(trackorderbt)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 156, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(viewbt)
                .addGap(41, 41, 41)
                .addComponent(orderrecievedbt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecthotelcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbtotalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addcartbt)
                    .addComponent(confirmorderbt)
                    .addComponent(trackorderbt))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewbt)
                            .addComponent(orderrecievedbt))
                        .addGap(319, 319, 319))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selecthotelcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecthotelcomboboxActionPerformed
       selectedRestaurantName = String.valueOf(selecthotelcombobox.getSelectedItem());
        populateMenuItems(selectedRestaurantName);
               
    }//GEN-LAST:event_selecthotelcomboboxActionPerformed

    private void confirmorderbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmorderbtActionPerformed
        
        OrderDirectory orderdiretory;
        ArrayList<Order> oh ;
        if(system.getOrderDirectory()==null){
             orderdiretory = new OrderDirectory();
        }else
             orderdiretory = system.getOrderDirectory();
        
        
        if(orderdiretory.getOrderhist()==null){
            oh = new ArrayList();
        }else
            oh = orderdiretory.getOrderhist();
            
        
        
        MenuDirectory md = new MenuDirectory();
        md.setMenu(ml);
        System.out.println("Menu List "+ ml.size());
        System.out.println("Menu List "+ ml.get(0).getItemName());
        Order order = new Order();
        order.setMenuDirectory(md);
        order.setRestaurant(resObj);
        order.setUserAccount(userAccount);
        order.setAmount(totalp);
        order.setComments(c.getText());
        
        oh.add(order);
        orderdiretory.setOrderhist(oh);
        
        
        system.setOrderDirectory(orderdiretory);
        
        populateCartTable();
         JOptionPane.showMessageDialog(null,"Order Placed Successfully"
                , "INFO", JOptionPane.INFORMATION_MESSAGE);
       
       
    }//GEN-LAST:event_confirmorderbtActionPerformed

    private void addcartbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartbtActionPerformed
         // private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        
        Menu menucus = new Menu();
        MenuDirectory md = new MenuDirectory();
        
        menucus.setItemName(menu.getItemName());
        menucus.setItemPrice(menu.getItemPrice());
        menucus.setQuantity(Integer.parseInt(quant));
       
        ml.add(menucus);
        
        totalp =totalp + menu.getItemPrice()* Integer.parseInt(quant);
        this.tptxt.setText(String.valueOf(totalp));
        JOptionPane.showMessageDialog(null,"Item added to cart. Please add more items or Place Order to Proceed"
                , "INFO", JOptionPane.INFORMATION_MESSAGE);
        
      
    
    }//GEN-LAST:event_addcartbtActionPerformed

    private void viewbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtActionPerformed
        
        int selectedRow = orderhistorytable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (Order)orderhistorytable.getValueAt(selectedRow,1);
        populateOrderDetails(order);
        
    }//GEN-LAST:event_viewbtActionPerformed

    private void trackorderbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackorderbtActionPerformed
         //JPanel2.setVisible(true);
       populateCartTable();
    }//GEN-LAST:event_trackorderbtActionPerformed

    private void orderrecievedbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderrecievedbtActionPerformed
         int selectedRow = orderhistorytable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        order = (Order)orderhistorytable.getValueAt(selectedRow,1);
        System.out.println("Order "+ order.getOrderStatus());
        order.setOrderStatus("Received");
        populateCartTable();
    }//GEN-LAST:event_orderrecievedbtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcartbt;
    private javax.swing.JTextArea c;
    private javax.swing.JButton confirmorderbt;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbtotalprice;
    private javax.swing.JTable orderhistorytable;
    private javax.swing.JTable ordermenuitemtable;
    private javax.swing.JButton orderrecievedbt;
    private javax.swing.JComboBox<String> selecthotelcombobox;
    private javax.swing.JTextField tptxt;
    private javax.swing.JButton trackorderbt;
    private javax.swing.JTable tracktable;
    private javax.swing.JButton viewbt;
    // End of variables declaration//GEN-END:variables
}
