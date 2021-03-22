/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import TestData.TestData;
import helper.Helper;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Department.Department;
import info5100.university.example.Department.DepartmentDirectory;
import info5100.university.example.Info5001UniversityExample;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author lbalaji
 */
public class Add_StuProf extends javax.swing.JFrame {

    /**
     * Creates new form Add_StuProf
     */
    Info5001UniversityExample uni = new Info5001UniversityExample();
        TestData testData = TestData.getInstance();
        DepartmentDirectory department = testData.getDd();
        HashMap<String, Department> map = new HashMap();
        HashMap<String, CourseOffer> coursemap = new HashMap();
       String depName;
       String depNameProf;
    public Add_StuProf() {
        initComponents();
        testData.test2();
        Addstupanel.setVisible(false);
        AddProfPanel.setVisible(false);
    }
            public List<CourseOffer> getCourseOfferedByDepartment(Department d){
        return new Helper().getCourseOfferList(d, "Fall2020");
    }
    
    public void addStudent(Department d, String sname, String sid, String sem, CourseOffer co){
        
        new Helper().addStudent(d, sname, sid, sem, co);
    }
    
    public void addProf(Department d, String profName, String pid, String sem, CourseOffer co){
        
        new Helper().addProfessor(d, profName, pid, sem, co);
    }
    public void getDepartmentList(){
         
        ArrayList<Department> departmentlist = department.getDd();
        for(Department d : departmentlist)
        {
            System.out.println(d.getName());

           
           getCourseOfferedByDepartment(d); 
    }
    }       
    

    public List getStudentsByDepartmentName(Department dpt){
            Helper helper = new Helper();
            List<StudentProfile> p = helper.getStudent(dpt);
            System.out.println("PP "+ p.get(0).getPerson());
            return p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectPanle = new javax.swing.JPanel();
        AddStuBtn = new javax.swing.JButton();
        AddProBtn = new javax.swing.JButton();
        Addstupanel = new javax.swing.JPanel();
        AddstudeptLbl = new javax.swing.JLabel();
        AddstucouLbl = new javax.swing.JLabel();
        AddstuNameLbl = new javax.swing.JLabel();
        AddStuIdLbl = new javax.swing.JLabel();
        AddStuDeptcb = new javax.swing.JComboBox<>();
        Addstucoucom = new javax.swing.JComboBox<>();
        AddstunameTxt = new javax.swing.JTextField();
        AddstuIdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddStudent = new javax.swing.JButton();
        AddProfPanel = new javax.swing.JPanel();
        AddstudeptLbl1 = new javax.swing.JLabel();
        AddstucouLbl1 = new javax.swing.JLabel();
        AddstuNameLbl1 = new javax.swing.JLabel();
        AddStuIdLbl1 = new javax.swing.JLabel();
        AddProfDeptcb1 = new javax.swing.JComboBox<>();
        AddProfcoucom = new javax.swing.JComboBox<>();
        AddProfnameTxt = new javax.swing.JTextField();
        AddProfIdTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddProf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddStuBtn.setText("Add Student");
        AddStuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStuBtnActionPerformed(evt);
            }
        });

        AddProBtn.setText("Add Professor");
        AddProBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SelectPanleLayout = new javax.swing.GroupLayout(SelectPanle);
        SelectPanle.setLayout(SelectPanleLayout);
        SelectPanleLayout.setHorizontalGroup(
            SelectPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectPanleLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(AddStuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(AddProBtn)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        SelectPanleLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddProBtn, AddStuBtn});

        SelectPanleLayout.setVerticalGroup(
            SelectPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectPanleLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(SelectPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProBtn))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        SelectPanleLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddProBtn, AddStuBtn});

        AddstudeptLbl.setText("Department:");

        AddstucouLbl.setText("Course:");

        AddstuNameLbl.setText("Name:");

        AddStuIdLbl.setText("Id:");

        AddStuDeptcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        AddStuDeptcb.setSelectedItem(Addstucoucom);
        AddStuDeptcb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStuDeptcbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddStuDeptcbMousePressed(evt);
            }
        });
        AddStuDeptcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStuDeptcbActionPerformed(evt);
            }
        });

        Addstucoucom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        Addstucoucom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddstucoucomActionPerformed(evt);
            }
        });

        AddstunameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddstunameTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Student");

        AddStudent.setText("Add");
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddstupanelLayout = new javax.swing.GroupLayout(Addstupanel);
        Addstupanel.setLayout(AddstupanelLayout);
        AddstupanelLayout.setHorizontalGroup(
            AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddstupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddstuNameLbl)
                    .addComponent(AddStuIdLbl)
                    .addComponent(AddstudeptLbl)
                    .addComponent(AddstucouLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Addstucoucom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddStuDeptcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AddstuIdTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddstunameTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(83, 83, 83))
            .addGroup(AddstupanelLayout.createSequentialGroup()
                .addGroup(AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddstupanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(AddStudent))
                    .addGroup(AddstupanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddstupanelLayout.setVerticalGroup(
            AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddstupanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddstuNameLbl)
                    .addGroup(AddstupanelLayout.createSequentialGroup()
                        .addComponent(AddstunameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddStuIdLbl)
                            .addComponent(AddstuIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddstudeptLbl)
                    .addComponent(AddStuDeptcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(AddstupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddstucouLbl)
                    .addComponent(Addstucoucom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddStudent)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        AddstudeptLbl1.setText("Department:");

        AddstucouLbl1.setText("Course:");

        AddstuNameLbl1.setText("Name:");

        AddStuIdLbl1.setText("Id:");

        AddProfDeptcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department" }));
        AddProfDeptcb1.setSelectedItem(Addstucoucom);
        AddProfDeptcb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddProfDeptcb1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddProfDeptcb1MousePressed(evt);
            }
        });
        AddProfDeptcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProfDeptcb1ActionPerformed(evt);
            }
        });

        AddProfcoucom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        AddProfcoucom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProfcoucomActionPerformed(evt);
            }
        });

        AddProfnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProfnameTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Professor");

        AddProf.setText("Add");
        AddProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddProfPanelLayout = new javax.swing.GroupLayout(AddProfPanel);
        AddProfPanel.setLayout(AddProfPanelLayout);
        AddProfPanelLayout.setHorizontalGroup(
            AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProfPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddstuNameLbl1)
                    .addComponent(AddStuIdLbl1)
                    .addComponent(AddstudeptLbl1)
                    .addComponent(AddstucouLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AddProfcoucom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddProfDeptcb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AddProfIdTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddProfnameTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(83, 83, 83))
            .addGroup(AddProfPanelLayout.createSequentialGroup()
                .addGroup(AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddProfPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(AddProf))
                    .addGroup(AddProfPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddProfPanelLayout.setVerticalGroup(
            AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddProfPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddstuNameLbl1)
                    .addGroup(AddProfPanelLayout.createSequentialGroup()
                        .addComponent(AddProfnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddStuIdLbl1)
                            .addComponent(AddProfIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddstudeptLbl1)
                    .addComponent(AddProfDeptcb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(AddProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddstucouLbl1)
                    .addComponent(AddProfcoucom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddProf)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SelectPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Addstupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddProfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SelectPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Addstupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddProfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStuDeptcbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStuDeptcbMouseClicked
        // TODO add your handling code here:

            

    }//GEN-LAST:event_AddStuDeptcbMouseClicked

    private void AddStuDeptcbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStuDeptcbMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStuDeptcbMousePressed

    private void AddStuDeptcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStuDeptcbActionPerformed
        // TODO add your handling code here:
        //getDepartmentList();
             depName = AddStuDeptcb.getSelectedItem().toString();
            System.out.println(depName);
            AddstucoucomActionPerformed(evt);
//                    List<CourseOffer> depname = getCourseOfferedByDepartment(map.get(depName));
//        for(CourseOffer co : depname){
//                        coursemap.put(co.getCourseNumber(), co);
//              }
//            for (String couname : coursemap.keySet())  
//                   Addstucoucom.addItem(couname);
        

    }//GEN-LAST:event_AddStuDeptcbActionPerformed

    private void AddstunameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddstunameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddstunameTxtActionPerformed

    private void AddStuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStuBtnActionPerformed
        // TODO add your handling code here:
        SelectPanle.setVisible(false);
        Addstupanel.setVisible(true);
        AddProfPanel.setVisible(false);
              ArrayList<Department> departmentlist = department.getDd();
              for(Department d : departmentlist){
            map.put(d.getName(), d);
              }
            for (String name : map.keySet())  
                   AddStuDeptcb.addItem(name);
            
            

    }//GEN-LAST:event_AddStuBtnActionPerformed

    private void AddstucoucomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddstucoucomActionPerformed
        // TODO add your handling code here:
         //String courseName = 
        List<CourseOffer> depname = getCourseOfferedByDepartment(map.get(depName));
        for(CourseOffer co : depname){
                        coursemap.put(co.getCourseNumber(), co);
              }
            for (String couname : coursemap.keySet())  
                   Addstucoucom.addItem(couname);
    }//GEN-LAST:event_AddstucoucomActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        // TODO add your handling code here:
        String stuname=AddstunameTxt.getText();
        String stid = AddstuIdTxt.getText();
        String coursename = Addstucoucom.getSelectedItem().toString();
        addStudent(map.get(depName), stuname, stid, "Fall2020 ", coursemap.get(coursename));
        System.out.println();
        
    }//GEN-LAST:event_AddStudentActionPerformed

    private void AddProfDeptcb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProfDeptcb1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddProfDeptcb1MouseClicked

    private void AddProfDeptcb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProfDeptcb1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddProfDeptcb1MousePressed

    private void AddProfDeptcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProfDeptcb1ActionPerformed
        // TODO add your handling code here:
            depNameProf = AddProfDeptcb1.getSelectedItem().toString();
            System.out.println(depNameProf);
            AddProfcoucomActionPerformed(evt);
    }//GEN-LAST:event_AddProfDeptcb1ActionPerformed

    private void AddProfcoucomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProfcoucomActionPerformed
        // TODO add your handling code here:
                List<CourseOffer> depname = getCourseOfferedByDepartment(map.get(depNameProf));
        for(CourseOffer co : depname){
                        coursemap.put(co.getCourseNumber(), co);
              }
            for (String couname : coursemap.keySet())  
                   AddProfcoucom.addItem(couname);
    }//GEN-LAST:event_AddProfcoucomActionPerformed

    private void AddProfnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProfnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddProfnameTxtActionPerformed

    private void AddProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProfActionPerformed
        // TODO add your handling code here:
        String profname=AddProfnameTxt.getText();
        String profid = AddProfIdTxt.getText();
        String coursename = AddProfcoucom.getSelectedItem().toString();
        addStudent(map.get(depNameProf), profname, profid, "Fall2020 ", coursemap.get(coursename));
        System.out.println();
    }//GEN-LAST:event_AddProfActionPerformed

    private void AddProBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProBtnActionPerformed
        // TODO add your handling code here:
        SelectPanle.setVisible(false);
        Addstupanel.setVisible(false);
        AddProfPanel.setVisible(true);
              ArrayList<Department> departmentlist = department.getDd();
              for(Department d : departmentlist){
            map.put(d.getName(), d);
              }
            for (String name : map.keySet())  
                   AddProfDeptcb1.addItem(name);
    }//GEN-LAST:event_AddProBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_StuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_StuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_StuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_StuProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_StuProf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProBtn;
    private javax.swing.JButton AddProf;
    private javax.swing.JComboBox<String> AddProfDeptcb1;
    private javax.swing.JTextField AddProfIdTxt;
    private javax.swing.JPanel AddProfPanel;
    private javax.swing.JComboBox<String> AddProfcoucom;
    private javax.swing.JTextField AddProfnameTxt;
    private javax.swing.JButton AddStuBtn;
    private javax.swing.JComboBox<String> AddStuDeptcb;
    private javax.swing.JLabel AddStuIdLbl;
    private javax.swing.JLabel AddStuIdLbl1;
    private javax.swing.JButton AddStudent;
    private javax.swing.JTextField AddstuIdTxt;
    private javax.swing.JLabel AddstuNameLbl;
    private javax.swing.JLabel AddstuNameLbl1;
    private javax.swing.JLabel AddstucouLbl;
    private javax.swing.JLabel AddstucouLbl1;
    private javax.swing.JComboBox<String> Addstucoucom;
    private javax.swing.JLabel AddstudeptLbl;
    private javax.swing.JLabel AddstudeptLbl1;
    private javax.swing.JTextField AddstunameTxt;
    private javax.swing.JPanel Addstupanel;
    private javax.swing.JPanel SelectPanle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
