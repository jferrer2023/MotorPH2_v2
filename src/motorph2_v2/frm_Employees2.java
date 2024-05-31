
package motorph2_v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;




public class frm_Employees2 extends javax.swing.JFrame {
           private boolean isEditMode = false;
            private String originalEmpNo = "";
    
   public frm_Employees2(String empNo, String lastname, String firstname, String birthdate, String address, String phone, String sss, String philhealth, String tin, String pagibig) {
        initComponents();

        txt_EmpNo.setText(empNo);
        txt_Lastname.setText(lastname);
        txt_Firstname.setText(firstname);
        txt_Birthdate.setText(birthdate);
        txt_Address.setText(address);
        txt_Phone.setText(phone);
        txt_SSS.setText(sss);
        txt_Philhealth.setText(philhealth);
        txt_TIN.setText(tin);
        txt_Pagibig.setText(pagibig);
        
        originalEmpNo = empNo;
        isEditMode = true;
    }

    
    
    public frm_Employees2() {
        initComponents();
    }

    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Logout = new javax.swing.JLabel();
        btn_Attendance = new javax.swing.JLabel();
        btn_Payroll = new javax.swing.JLabel();
        btn_Salary = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_Home = new javax.swing.JLabel();
        btn_Employees = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_EmpNo = new javax.swing.JTextField();
        txt_Lastname = new javax.swing.JTextField();
        txt_Firstname = new javax.swing.JTextField();
        txt_Birthdate = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_Phone = new javax.swing.JTextField();
        txt_SSS = new javax.swing.JTextField();
        txt_Philhealth = new javax.swing.JTextField();
        txt_TIN = new javax.swing.JTextField();
        txt_Pagibig = new javax.swing.JTextField();
        btn_EditEmp = new javax.swing.JButton();
        btn_DelEmp = new javax.swing.JButton();
        btn_SaveEmp = new javax.swing.JButton();
        btn_AddEmp = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Details");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(813, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg9.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg7.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(42, 500));

        btn_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frm_MainMenu_Logout.png"))); // NOI18N
        btn_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseClicked(evt);
            }
        });

        btn_Attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frm_MainMenu_Attendance2.png"))); // NOI18N
        btn_Attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AttendanceMouseClicked(evt);
            }
        });

        btn_Payroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frm_MainMenu_Payroll2.png"))); // NOI18N
        btn_Payroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PayrollMouseClicked(evt);
            }
        });

        btn_Salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frm_MainMenu_Salary2.png"))); // NOI18N
        btn_Salary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SalaryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Attendance))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Payroll)
                            .addComponent(btn_Salary)
                            .addComponent(btn_Logout))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_Salary)
                .addGap(18, 18, 18)
                .addComponent(btn_Attendance)
                .addGap(18, 18, 18)
                .addComponent(btn_Payroll)
                .addGap(18, 18, 18)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frm_MainMenu_Home.png"))); // NOI18N
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Home, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        btn_Employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frm_MainMenu_Employees2.png"))); // NOI18N
        btn_Employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EmployeesMouseClicked(evt);
            }
        });

        jLabel1.setText("Employee No:");

        jLabel4.setText("Lastname:");

        jLabel5.setText("Firstname:");

        jLabel6.setText("Birthdate:");

        jLabel7.setText("Address:");

        jLabel8.setText("Phone No:");

        jLabel9.setText("SSS No:");

        jLabel10.setText("Philhealth No:");

        jLabel11.setText("TIN No:");

        jLabel12.setText("Pagibig No:");

        txt_EmpNo.setEditable(false);

        txt_Lastname.setEditable(false);

        txt_Firstname.setEditable(false);

        txt_Birthdate.setEditable(false);

        txt_Address.setEditable(false);

        txt_Phone.setEditable(false);

        txt_SSS.setEditable(false);

        txt_Philhealth.setEditable(false);

        txt_TIN.setEditable(false);

        txt_Pagibig.setEditable(false);

        btn_EditEmp.setBackground(new java.awt.Color(0, 0, 153));
        btn_EditEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_EditEmp.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditEmp.setText("EDIT");
        btn_EditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditEmpActionPerformed(evt);
            }
        });

        btn_DelEmp.setBackground(new java.awt.Color(0, 0, 153));
        btn_DelEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_DelEmp.setForeground(new java.awt.Color(255, 255, 255));
        btn_DelEmp.setText("DELETE");
        btn_DelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DelEmpActionPerformed(evt);
            }
        });

        btn_SaveEmp.setBackground(new java.awt.Color(0, 0, 153));
        btn_SaveEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_SaveEmp.setForeground(new java.awt.Color(255, 255, 255));
        btn_SaveEmp.setText("SAVE");
        btn_SaveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveEmpActionPerformed(evt);
            }
        });

        btn_AddEmp.setBackground(new java.awt.Color(0, 0, 153));
        btn_AddEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_AddEmp.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddEmp.setText("ADD");
        btn_AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddEmpActionPerformed(evt);
            }
        });

        btn_Back.setText("BACK");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Employees))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_EmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TIN, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_SSS, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Philhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_DelEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btn_EditEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btn_SaveEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(btn_AddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txt_Pagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 93, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Employees))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_EmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_SSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_Philhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_TIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Pagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btn_AddEmp)
                                .addGap(18, 18, 18)
                                .addComponent(btn_EditEmp)
                                .addGap(18, 18, 18)
                                .addComponent(btn_SaveEmp)
                                .addGap(18, 18, 18)
                                .addComponent(btn_DelEmp)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Back)))
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseClicked

        new frm_Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_LogoutMouseClicked

    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked

        new frm_MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_HomeMouseClicked

    private void btn_EmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EmployeesMouseClicked
        
        new frm_Employees2().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_EmployeesMouseClicked

    private void btn_AttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AttendanceMouseClicked
        new frm_Attendance().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_AttendanceMouseClicked

    private void btn_PayrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PayrollMouseClicked
        
        new frm_Payroll().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_PayrollMouseClicked
      
    private void btn_EditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditEmpActionPerformed
        // Enable text fields
    txt_EmpNo.setEditable(true);
    txt_Lastname.setEditable(true);
    txt_Firstname.setEditable(true);
    txt_Birthdate.setEditable(true);
    txt_Address.setEditable(true);
    txt_Phone.setEditable(true);
    txt_SSS.setEditable(true);
    txt_Philhealth.setEditable(true);
    txt_TIN.setEditable(true);
    txt_Pagibig.setEditable(true);

    // Set edit mode to true (for editing an existing record)
    isEditMode = true;
    }//GEN-LAST:event_btn_EditEmpActionPerformed

    private void btn_DelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DelEmpActionPerformed
          int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            String empNo = txt_EmpNo.getText();

            List<String> lines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\IT-Spare\\Documents\\NetBeansProjects\\MotorPH2_v2\\src\\motorph2_v2\\MotorPH Employee Details.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading employee data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean found = false;
            for (int i = 0; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(",");
                if (parts.length >= 10 && parts[0].equals(empNo)) {
                    lines.remove(i);
                    found = true;
                    break;
                }
            }

            if (found) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\IT-Spare\\Documents\\NetBeansProjects\\MotorPH2_v2\\src\\motorph2_v2\\MotorPH Employee Details.csv"))) {
                    for (String line : lines) {
                        bw.write(line);
                        bw.newLine();
                    }
                    JOptionPane.showMessageDialog(this, "Employee data deleted successfully.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error deleting employee data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Employee not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            clearTextFields();
            setFieldsEditable(false);
        }
    }

    private void clearTextFields() {
        txt_EmpNo.setText("");
        txt_Lastname.setText("");
        txt_Firstname.setText("");
        txt_Birthdate.setText("");
        txt_Address.setText("");
        txt_Phone.setText("");
        txt_SSS.setText("");
        txt_Philhealth.setText("");
        txt_TIN.setText("");
        txt_Pagibig.setText("");
    }

    private void setFieldsEditable(boolean editable) {
        txt_EmpNo.setEditable(editable);
        txt_Lastname.setEditable(editable);
        txt_Firstname.setEditable(editable);
        txt_Birthdate.setEditable(editable);
        txt_Address.setEditable(editable);
        txt_Phone.setEditable(editable);
        txt_SSS.setEditable(editable);
        txt_Philhealth.setEditable(editable);
        txt_TIN.setEditable(editable);
        txt_Pagibig.setEditable(editable);
    
    }//GEN-LAST:event_btn_DelEmpActionPerformed

    private void btn_SaveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveEmpActionPerformed
        String empNo = txt_EmpNo.getText();
        String lastname = txt_Lastname.getText();
        String firstname = txt_Firstname.getText();
        String birthdate = txt_Birthdate.getText();
        String address = txt_Address.getText();
        String phone = txt_Phone.getText();
        String sss = txt_SSS.getText();
        String philhealth = txt_Philhealth.getText();
        String tin = txt_TIN.getText();
        String pagibig = txt_Pagibig.getText();

     if (isEditMode) {
            // Read the existing data from the CSV file
            List<String> lines = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\IT-Spare\\Documents\\NetBeansProjects\\MotorPH2_v2\\src\\motorph2_v2\\MotorPH Employee Details.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error reading employee data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Update the relevant record
            boolean found = false;
            for (int i = 0; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(",");
                if (parts.length >= 10 && parts[0].equals(originalEmpNo)) {
                    lines.set(i, empNo + "," + lastname + "," + firstname + "," + birthdate + "," + address + "," + phone + "," + sss + "," + philhealth + "," + tin + "," + pagibig);
                    found = true;
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(this, "Error: Employee record not found.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Write the updated data back to the CSV file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\IT-Spare\\Documents\\NetBeansProjects\\MotorPH2_v2\\src\\motorph2_v2\\MotorPH Employee Details.csv"))) {
                for (String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(this, "Employee data updated successfully.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error updating employee data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            // Append new record to the CSV file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\IT-Spare\\Documents\\NetBeansProjects\\MotorPH2_v2\\src\\motorph2_v2\\MotorPH Employee Details.csv", true))) {
                bw.write(empNo + "," + lastname + "," + firstname + "," + birthdate + "," + address + "," + phone + "," + sss + "," + philhealth + "," + tin + "," + pagibig);
                bw.newLine();
                JOptionPane.showMessageDialog(this, "Employee data saved successfully.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving employee data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Disable the text fields after saving
        txt_EmpNo.setEditable(false);
        txt_Lastname.setEditable(false);
        txt_Firstname.setEditable(false);
        txt_Birthdate.setEditable(false);
        txt_Address.setEditable(false);
        txt_Phone.setEditable(false);
        txt_SSS.setEditable(false);
        txt_Philhealth.setEditable(false);
        txt_TIN.setEditable(false);
        txt_Pagibig.setEditable(false);
        
    }//GEN-LAST:event_btn_SaveEmpActionPerformed

    private void btn_SalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SalaryMouseClicked
        this.dispose();
        new frm_Salary().setVisible(true);
    }//GEN-LAST:event_btn_SalaryMouseClicked
    
    
    private void btn_AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddEmpActionPerformed
        // Clear text fields
    txt_EmpNo.setText("");
    txt_Lastname.setText("");
    txt_Firstname.setText("");
    txt_Birthdate.setText("");
    txt_Address.setText("");
    txt_Phone.setText("");
    txt_SSS.setText("");
    txt_Philhealth.setText("");
    txt_TIN.setText("");
    txt_Pagibig.setText("");

    // Enable text fields
    txt_EmpNo.setEditable(true);
    txt_Lastname.setEditable(true);
    txt_Firstname.setEditable(true);
    txt_Birthdate.setEditable(true);
    txt_Address.setEditable(true);
    txt_Phone.setEditable(true);
    txt_SSS.setEditable(true);
    txt_Philhealth.setEditable(true);
    txt_TIN.setEditable(true);
    txt_Pagibig.setEditable(true);

    // Set edit mode to false (for adding a new record)
    isEditMode = false;

    }//GEN-LAST:event_btn_AddEmpActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        new frm_Employees().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Employees2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Employees2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Employees2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Employees2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Employees2().setVisible(true);
            }
        });
    }

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddEmp;
    private javax.swing.JLabel btn_Attendance;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_DelEmp;
    private javax.swing.JButton btn_EditEmp;
    private javax.swing.JLabel btn_Employees;
    private javax.swing.JLabel btn_Home;
    private javax.swing.JLabel btn_Logout;
    private javax.swing.JLabel btn_Payroll;
    private javax.swing.JLabel btn_Salary;
    private javax.swing.JButton btn_SaveEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_Birthdate;
    private javax.swing.JTextField txt_EmpNo;
    private javax.swing.JTextField txt_Firstname;
    private javax.swing.JTextField txt_Lastname;
    private javax.swing.JTextField txt_Pagibig;
    private javax.swing.JTextField txt_Philhealth;
    private javax.swing.JTextField txt_Phone;
    private javax.swing.JTextField txt_SSS;
    private javax.swing.JTextField txt_TIN;
    // End of variables declaration//GEN-END:variables

    private void setEditableTextFields(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
