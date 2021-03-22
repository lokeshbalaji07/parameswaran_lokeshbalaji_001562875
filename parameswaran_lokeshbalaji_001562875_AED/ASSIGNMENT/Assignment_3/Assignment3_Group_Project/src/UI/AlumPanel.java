/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import info5100.university.example.Info5001UniversityExample;
import info5100.university.example.Persona.Faculty.Alumni.Alumni;
import info5100.university.example.Persona.Faculty.Alumni.CompanyEmployers.Employers;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author monishmm
 */
public class AlumPanel extends javax.swing.JPanel {

    /**
     * Creates new form AlumPanel
     */
    String id;
    public AlumPanel() {
        initComponents();
          AlumDetail.setVisible(false);
        String id= null;
        
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
        StudentLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLowerPanel = new javax.swing.JPanel();
        PasswordField = new javax.swing.JPasswordField();
        UsernameLowerPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        AlumDetail = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AlumIdlbl = new javax.swing.JLabel();
        AlumEmplbl = new javax.swing.JLabel();
        AlumPromlbl = new javax.swing.JLabel();
        AlumSallbl = new javax.swing.JLabel();
        AlumIdtxt = new javax.swing.JTextField();
        AlumEmptxt = new javax.swing.JTextField();
        Alumpromtxt = new javax.swing.JTextField();
        AlumSalTxt = new javax.swing.JTextField();
        AlumupdBtn = new javax.swing.JButton();
        Alumbackbtn = new javax.swing.JButton();
        AlumgradLbl = new javax.swing.JLabel();
        AlumgradyearTxt = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));

        StudentLoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALUMNI LOG IN");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout StudentLoginPanelLayout = new javax.swing.GroupLayout(StudentLoginPanel);
        StudentLoginPanel.setLayout(StudentLoginPanelLayout);
        StudentLoginPanelLayout.setHorizontalGroup(
            StudentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StudentLoginPanelLayout.setVerticalGroup(
            StudentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(153, 153, 153));
        PasswordLabel.setText("PASSWORD:");

        UsernameTextField.setBackground(new java.awt.Color(44, 63, 87));
        UsernameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameTextField.setForeground(new java.awt.Color(153, 153, 153));
        UsernameTextField.setBorder(null);
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(153, 153, 153));
        UsernameLabel.setText("USERNAME: ");

        PasswordLowerPanel.setBackground(new java.awt.Color(97, 212, 185));
        PasswordLowerPanel.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout PasswordLowerPanelLayout = new javax.swing.GroupLayout(PasswordLowerPanel);
        PasswordLowerPanel.setLayout(PasswordLowerPanelLayout);
        PasswordLowerPanelLayout.setHorizontalGroup(
            PasswordLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PasswordLowerPanelLayout.setVerticalGroup(
            PasswordLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        PasswordField.setBackground(new java.awt.Color(44, 63, 87));
        PasswordField.setBorder(null);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        UsernameLowerPanel.setBackground(new java.awt.Color(97, 212, 185));
        UsernameLowerPanel.setForeground(new java.awt.Color(255, 153, 153));
        UsernameLowerPanel.setToolTipText("");
        UsernameLowerPanel.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout UsernameLowerPanelLayout = new javax.swing.GroupLayout(UsernameLowerPanel);
        UsernameLowerPanel.setLayout(UsernameLowerPanelLayout);
        UsernameLowerPanelLayout.setHorizontalGroup(
            UsernameLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        UsernameLowerPanelLayout.setVerticalGroup(
            UsernameLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        LoginButton.setBackground(new java.awt.Color(204, 204, 204));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PasswordLowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                    .addComponent(PasswordField)
                    .addComponent(UsernameLowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                    .addComponent(UsernameTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 823, Short.MAX_VALUE)))
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(674, 674, 674))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(StudentLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(UsernameLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PasswordLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(625, Short.MAX_VALUE))
        );

        AlumDetail.setBackground(new java.awt.Color(36, 47, 65));
        AlumDetail.setPreferredSize(new java.awt.Dimension(1420, 1000));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ALUMNI DETAILS");
        jLabel2.setOpaque(true);

        AlumIdlbl.setForeground(new java.awt.Color(153, 153, 153));
        AlumIdlbl.setText("Student ID:");

        AlumEmplbl.setForeground(new java.awt.Color(153, 153, 153));
        AlumEmplbl.setText("Employer:");

        AlumPromlbl.setForeground(new java.awt.Color(153, 153, 153));
        AlumPromlbl.setText("Promotions:");

        AlumSallbl.setForeground(new java.awt.Color(153, 153, 153));
        AlumSallbl.setText("Salary:");

        AlumIdtxt.setEditable(false);
        AlumIdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumIdtxtActionPerformed(evt);
            }
        });

        AlumEmptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumEmptxtActionPerformed(evt);
            }
        });

        AlumupdBtn.setBackground(new java.awt.Color(204, 204, 204));
        AlumupdBtn.setText("Update");
        AlumupdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumupdBtnActionPerformed(evt);
            }
        });

        Alumbackbtn.setBackground(new java.awt.Color(204, 204, 204));
        Alumbackbtn.setText("Back");
        Alumbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumbackbtnActionPerformed(evt);
            }
        });

        AlumgradLbl.setForeground(new java.awt.Color(153, 153, 153));
        AlumgradLbl.setText("Graduation Year:");

        javax.swing.GroupLayout AlumDetailLayout = new javax.swing.GroupLayout(AlumDetail);
        AlumDetail.setLayout(AlumDetailLayout);
        AlumDetailLayout.setHorizontalGroup(
            AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumDetailLayout.createSequentialGroup()
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AlumIdlbl)
                            .addComponent(AlumgradLbl)
                            .addComponent(AlumEmplbl)
                            .addComponent(AlumPromlbl)
                            .addComponent(AlumSallbl))
                        .addGap(56, 56, 56)
                        .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AlumIdtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(AlumEmptxt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(Alumpromtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(AlumSalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(AlumgradyearTxt)))
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(AlumupdBtn)
                        .addGap(48, 48, 48)
                        .addComponent(Alumbackbtn))
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)))
                .addContainerGap(1126, Short.MAX_VALUE))
        );
        AlumDetailLayout.setVerticalGroup(
            AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumDetailLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(65, 65, 65)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AlumIdlbl))
                    .addComponent(AlumIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AlumgradLbl))
                    .addComponent(AlumgradyearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlumEmplbl)
                    .addComponent(AlumEmptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AlumPromlbl))
                    .addComponent(Alumpromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AlumSallbl))
                    .addComponent(AlumSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlumupdBtn)
                    .addComponent(Alumbackbtn))
                .addContainerGap(652, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1420, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(AlumDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(AlumDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
//        jPanel1.setVisible(false);
//        AlumDetail.setVisible(false);
              //  new Info5001UniversityExample().test1();
        
        //System.out.println("Map "+ m.size());
//        Alumni al1 = m.get("0112303");
        //al = m.get("0112303");
        
        //System.out.println(al.getGradutationYear());
        id = UsernameTextField.getText();
        Alumni al = new Alumni();
        HashMap<String, Alumni> m = al.getAlumniDir();
        System.out.println("Map "+ m.size());
        System.out.println("IDD "+ id);
                
        Alumni al1 = m.get(id);
        
        if(al1!=null)
        {
            AlumIdtxt.setText(al1.getStudentProfile().getPerson().getPersonId());
            AlumgradyearTxt.setText(String.valueOf(al1.getGradutationYear()));
            AlumSalTxt.setText(String.valueOf(al1.getSalaryRange()));
            AlumEmptxt.setText(al1.getEmp().getEmployerName());
            Alumpromtxt.setText(String.valueOf(al1.getPromotions()));
            jPanel1.setVisible(false);
            AlumDetail.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this ,"Enter Correct Details");
            jPanel1.setVisible(true);
            AlumDetail.setVisible(false);
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void AlumIdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumIdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlumIdtxtActionPerformed

    private void AlumEmptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumEmptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlumEmptxtActionPerformed

    private void AlumupdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumupdBtnActionPerformed
        // TODO add your handling code here:
        Alumni al = new Alumni();
        HashMap<String, Alumni> m = al.getAlumniDir();
        System.out.println("Map "+ m.size());
        Alumni al1 = m.get(id);
        al1.setGradutationYear(Integer.parseInt(AlumgradyearTxt.getText()));
        al1.setSalaryRange(Integer.parseInt(AlumSalTxt.getText()));
        Employers emp = al1.getEmp();
        emp.setEmployerName(AlumEmptxt.getText());
        al1.setPromotions(Integer.parseInt(Alumpromtxt.getText()));

    }//GEN-LAST:event_AlumupdBtnActionPerformed

    private void AlumbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumbackbtnActionPerformed
        // TODO add your handling code here:
        AlumDetail.setVisible(false);
        jPanel1.setVisible(true);

    }//GEN-LAST:event_AlumbackbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlumDetail;
    private javax.swing.JLabel AlumEmplbl;
    private javax.swing.JTextField AlumEmptxt;
    private javax.swing.JLabel AlumIdlbl;
    private javax.swing.JTextField AlumIdtxt;
    private javax.swing.JLabel AlumPromlbl;
    private javax.swing.JTextField AlumSalTxt;
    private javax.swing.JLabel AlumSallbl;
    private javax.swing.JButton Alumbackbtn;
    private javax.swing.JLabel AlumgradLbl;
    private javax.swing.JTextField AlumgradyearTxt;
    private javax.swing.JTextField Alumpromtxt;
    private javax.swing.JButton AlumupdBtn;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordLowerPanel;
    private javax.swing.JPanel StudentLoginPanel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel UsernameLowerPanel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
