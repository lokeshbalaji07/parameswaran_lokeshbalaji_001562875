/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lokesh Balaji
 */
public class ManageCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerPanel
     */
    
     private JPanel userProcessContainer;
    private EcoSystem system;
    private Organization cusorganization;

    public ManageCustomerPanel(JPanel userProcessContainer, EcoSystem system, Organization cusorganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.cusorganization = cusorganization;
        populatetable();
    }
    
    public void populatetable(){
        
        DefaultTableModel tablemodel = (DefaultTableModel) managecustable.getModel();
        tablemodel.setRowCount(0);
       if(system.getDeliveryManDirectory().searchOrganization("Customer") ==null){
            return;
        }
     List<Organization> organizationcus =system.getCustomerDirectory().searchOrganization("Customer") ;
        for(Organization o : organizationcus )
        {
        for(UserAccount ua:o.getUserAccountDirectory().getUserAccountList()) {
            Object row[] = new Object[3];
            row[0] = ua.getEmployee().getName();
            row[1] = ua;
            tablemodel.addRow(row);
        }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        managecustable = new javax.swing.JTable();
        backbt = new javax.swing.JButton();
        delcusbt = new javax.swing.JButton();
        createcusbt = new javax.swing.JButton();
        updatecusbt = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customer");

        managecustable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Username", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(managecustable);

        backbt.setText("Back");
        backbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtActionPerformed(evt);
            }
        });

        delcusbt.setText("Delete Customer");
        delcusbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delcusbtActionPerformed(evt);
            }
        });

        createcusbt.setText("Create Customer");
        createcusbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createcusbtActionPerformed(evt);
            }
        });

        updatecusbt.setText("Update Customer");
        updatecusbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecusbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backbt)
                        .addGap(100, 100, 100)
                        .addComponent(delcusbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatecusbt)
                            .addComponent(createcusbt))))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbt)
                    .addComponent(delcusbt)
                    .addComponent(createcusbt))
                .addGap(18, 18, 18)
                .addComponent(updatecusbt)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createcusbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createcusbtActionPerformed
        NewCustomerPanel createcus = new NewCustomerPanel(userProcessContainer, system, cusorganization);
        userProcessContainer.add("NewCustomerPanel", createcus);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createcusbtActionPerformed

    private void backbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        Component[] component = this.userProcessContainer.getComponents();
        for(Component comp : component){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
               systemAdminWorkAreaJPanel.populateTree(); 
            }
        } 
    }//GEN-LAST:event_backbtActionPerformed

    private void delcusbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delcusbtActionPerformed
        int selectedRow = managecustable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            UserAccount ua = (UserAccount)managecustable.getValueAt(selectedRow, 1);
            List<Organization> customer = system.getCustomerDirectory().searchOrganization("Customer");
            for(Organization o : customer)
            {
                UserAccountDirectory customerDirectory = o.getUserAccountDirectory();
                List<UserAccount> l = new ArrayList(customerDirectory.getUserAccountList());
                for(UserAccount u : l)
                {
                    if(u.getEmployee().getName().equals(ua.getEmployee().getName()))
                    {
                        customerDirectory.deleteUserAccount(u);
                    }
                }
            }
         //   cusorganization.getUserAccountDirectory().deleteUserAccount(ua);
         //   cusorganization.getEmployeeDirectory().deleteEmployee(ua.getEmployee());
        JOptionPane.showMessageDialog(null, "User Account deleted successfully");
        populatetable();
    }
    }//GEN-LAST:event_delcusbtActionPerformed

    private void updatecusbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecusbtActionPerformed
//        ViewCustomerPanel viewcus = new ViewCustomerPanel(userProcessContainer, system, cusorganization);
//        userProcessContainer.add("NewCustomerPanel", viewcus);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
   int row = managecustable.getSelectedRow();
                if (row < 0) {
            JOptionPane.showMessageDialog(null, "Row not selected");
            return;
        }
        else{
        List<Organization> organizationcus =system.getCustomerDirectory().searchOrganization("Customer") ;
       UserAccount ua = (UserAccount)managecustable.getValueAt(row, 1);
            Employee emp =  ua.getEmployee();
            ViewCustomerPanel panel = new ViewCustomerPanel(userProcessContainer, system, cusorganization, ua, emp);
            userProcessContainer.add("ViewNewCustomerJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }



    }//GEN-LAST:event_updatecusbtActionPerformed

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbt;
    private javax.swing.JButton createcusbt;
    private javax.swing.JButton delcusbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managecustable;
    private javax.swing.JButton updatecusbt;
    // End of variables declaration//GEN-END:variables
}
