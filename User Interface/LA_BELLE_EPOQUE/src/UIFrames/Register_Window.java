/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIFrames;

import java.awt.Color;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class Register_Window extends javax.swing.JFrame {

    /**
     * Creates new form Logiin_Window
     */
    public Register_Window() {
        this.setUndecorated(true);
        initComponents();
       
        this.setLocationRelativeTo(null);

    }
    
    public boolean checkInteger(String pString) {
    try { 
        Integer.parseInt(pString); 
    } catch(NumberFormatException e) { 
         return false; 
    }
    return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit_Button = new javax.swing.JButton();
        DecorationPanel = new javax.swing.JPanel();
        LastName_TextField = new javax.swing.JTextField();
        Username_TextField = new javax.swing.JTextField();
        Password_TextField = new javax.swing.JTextField();
        NewUser_Label = new javax.swing.JLabel();
        RegisterButton_Panel = new javax.swing.JPanel();
        Register_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Email_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FirstName_TextField = new javax.swing.JTextField();
        birth_day_day = new javax.swing.JComboBox<>();
        gender_combobox = new javax.swing.JComboBox<>();
        birth_day_month = new javax.swing.JComboBox<>();
        birth_day_year = new javax.swing.JComboBox<>();
        NewUser_Label1 = new javax.swing.JLabel();
        Photo_Button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NewUser_Label2 = new javax.swing.JLabel();
        NewUser_Label3 = new javax.swing.JLabel();
        NewUser_Label4 = new javax.swing.JLabel();
        NewUser_Label5 = new javax.swing.JLabel();
        NewUser_Label6 = new javax.swing.JLabel();
        Identification_TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit Button.png"))); // NOI18N
        Exit_Button.setToolTipText("");
        Exit_Button.setBorder(null);
        Exit_Button.setContentAreaFilled(false);
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Exit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 50));

        DecorationPanel.setBackground(new java.awt.Color(255, 255, 255));
        DecorationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LastName_TextField.setBackground(new java.awt.Color(219, 219, 219));
        LastName_TextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LastName_TextField.setForeground(new java.awt.Color(153, 153, 153));
        LastName_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        LastName_TextField.setBorder(null);
        LastName_TextField.setCaretColor(new java.awt.Color(44, 168, 109));
        LastName_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LastName_TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LastName_TextFieldMouseExited(evt);
            }
        });
        LastName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName_TextFieldActionPerformed(evt);
            }
        });
        DecorationPanel.add(LastName_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, 20));

        Username_TextField.setBackground(new java.awt.Color(219, 219, 219));
        Username_TextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Username_TextField.setForeground(new java.awt.Color(153, 153, 153));
        Username_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Username_TextField.setBorder(null);
        Username_TextField.setCaretColor(new java.awt.Color(44, 168, 109));
        Username_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Username_TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Username_TextFieldMouseExited(evt);
            }
        });
        Username_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_TextFieldActionPerformed(evt);
            }
        });
        DecorationPanel.add(Username_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 360, 20));

        Password_TextField.setBackground(new java.awt.Color(219, 219, 219));
        Password_TextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Password_TextField.setForeground(new java.awt.Color(153, 153, 153));
        Password_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Password_TextField.setBorder(null);
        Password_TextField.setCaretColor(new java.awt.Color(44, 168, 109));
        Password_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Password_TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Password_TextFieldMouseExited(evt);
            }
        });
        Password_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_TextFieldActionPerformed(evt);
            }
        });
        DecorationPanel.add(Password_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 360, 20));

        NewUser_Label.setBackground(new java.awt.Color(153, 153, 153));
        NewUser_Label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NewUser_Label.setForeground(new java.awt.Color(153, 153, 153));
        NewUser_Label.setText("yyyy       -      mm        -     dd");
        DecorationPanel.add(NewUser_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 250, 20));

        RegisterButton_Panel.setBackground(new java.awt.Color(0, 102, 204));
        RegisterButton_Panel.setToolTipText("");
        RegisterButton_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Register_Button.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Register_Button.setForeground(new java.awt.Color(255, 255, 255));
        Register_Button.setText("Register Now!");
        Register_Button.setBorderPainted(false);
        Register_Button.setContentAreaFilled(false);
        Register_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Register_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Register_ButtonMouseExited(evt);
            }
        });
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });
        RegisterButton_Panel.add(Register_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 150));

        DecorationPanel.add(RegisterButton_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 160, 150));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Add a Photo");
        DecorationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 110, 30));

        Email_TextField.setBackground(new java.awt.Color(219, 219, 219));
        Email_TextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Email_TextField.setForeground(new java.awt.Color(153, 153, 153));
        Email_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Email_TextField.setBorder(null);
        Email_TextField.setCaretColor(new java.awt.Color(44, 168, 109));
        Email_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Email_TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Email_TextFieldMouseExited(evt);
            }
        });
        Email_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_TextFieldActionPerformed(evt);
            }
        });
        DecorationPanel.add(Email_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Gender:");
        DecorationPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, -1));

        FirstName_TextField.setBackground(new java.awt.Color(219, 219, 219));
        FirstName_TextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FirstName_TextField.setForeground(new java.awt.Color(153, 153, 153));
        FirstName_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FirstName_TextField.setBorder(null);
        FirstName_TextField.setCaretColor(new java.awt.Color(44, 168, 109));
        FirstName_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FirstName_TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FirstName_TextFieldMouseExited(evt);
            }
        });
        FirstName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_TextFieldActionPerformed(evt);
            }
        });
        DecorationPanel.add(FirstName_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 20));

        birth_day_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        birth_day_day.setEnabled(false);
        birth_day_day.setFocusable(false);
        birth_day_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birth_day_dayActionPerformed(evt);
            }
        });
        DecorationPanel.add(birth_day_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 80, -1));

        gender_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_comboboxActionPerformed(evt);
            }
        });
        DecorationPanel.add(gender_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 260, -1));

        birth_day_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        birth_day_month.setEnabled(false);
        birth_day_month.setFocusable(false);
        birth_day_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birth_day_monthActionPerformed(evt);
            }
        });
        DecorationPanel.add(birth_day_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 80, -1));

        birth_day_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        birth_day_year.setEnabled(false);
        birth_day_year.setFocusable(false);
        birth_day_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birth_day_yearActionPerformed(evt);
            }
        });
        DecorationPanel.add(birth_day_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));

        NewUser_Label1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NewUser_Label1.setForeground(new java.awt.Color(0, 0, 0));
        NewUser_Label1.setText("Password:");
        DecorationPanel.add(NewUser_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 20));

        Photo_Button.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Photo_Button.setForeground(new java.awt.Color(153, 153, 153));
        Photo_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Camera Icon.png"))); // NOI18N
        Photo_Button.setBorderPainted(false);
        Photo_Button.setContentAreaFilled(false);
        Photo_Button.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Photo_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Photo_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Photo_ButtonMouseExited(evt);
            }
        });
        Photo_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Photo_ButtonActionPerformed(evt);
            }
        });
        DecorationPanel.add(Photo_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 70, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Birth Day:");
        DecorationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 30));

        NewUser_Label2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NewUser_Label2.setForeground(new java.awt.Color(0, 0, 0));
        NewUser_Label2.setText("Identification:");
        DecorationPanel.add(NewUser_Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        NewUser_Label3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NewUser_Label3.setForeground(new java.awt.Color(0, 0, 0));
        NewUser_Label3.setText("First Name:");
        DecorationPanel.add(NewUser_Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 20));

        NewUser_Label4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NewUser_Label4.setForeground(new java.awt.Color(0, 0, 0));
        NewUser_Label4.setText("Last Name:");
        DecorationPanel.add(NewUser_Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 20));

        NewUser_Label5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NewUser_Label5.setForeground(new java.awt.Color(0, 0, 0));
        NewUser_Label5.setText("Username:");
        DecorationPanel.add(NewUser_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 20));

        NewUser_Label6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NewUser_Label6.setForeground(new java.awt.Color(0, 0, 0));
        NewUser_Label6.setText("Email:");
        DecorationPanel.add(NewUser_Label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 20));

        Identification_TextField.setBackground(new java.awt.Color(219, 219, 219));
        Identification_TextField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Identification_TextField.setForeground(new java.awt.Color(153, 153, 153));
        Identification_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Identification_TextField.setBorder(null);
        Identification_TextField.setCaretColor(new java.awt.Color(44, 168, 109));
        Identification_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Identification_TextFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Identification_TextFieldMouseExited(evt);
            }
        });
        Identification_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Identification_TextFieldActionPerformed(evt);
            }
        });
        DecorationPanel.add(Identification_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 20));

        getContentPane().add(DecorationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 620, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register Window.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_TextFieldActionPerformed

    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
int pIdentification = 0;
       String pFirstName = "";
       String pLastName  = "" ;
       String pPassword  = "";
       String pEmail  = "";
       String pUsername = "" ;
       int pGender = 1;
       
       
       String temp = Identification_TextField.getText();
       if(checkInteger(temp) == false){
           JOptionPane.showMessageDialog(null, "Identification Field only allows numbers!", "Error", JOptionPane.ERROR_MESSAGE);
       }else{
            pIdentification = Integer.parseInt(temp);
       }

        
       pFirstName = FirstName_TextField.getText();
       pLastName= LastName_TextField.getText();
       pPassword = Password_TextField.getText();
       pEmail = Email_TextField.getText();
       pUsername = Username_TextField.getText();
       
       
       if(pIdentification == 0 || pFirstName.equals("")  || pLastName.equals("") || pPassword.equals("") || pEmail.equals("") || pUsername.equals("")){
            
             JOptionPane.showMessageDialog(null, "Data Fields must be complete!", "Error", JOptionPane.ERROR_MESSAGE);
       }else{
            

            String genderName = gender_combobox.getItemAt(gender_combobox.getSelectedIndex());
            if(genderName.equals("Male")){
                pGender = 1;
            }else if(genderName.equals("Female")){
                pGender = 2;
            }else if(genderName.equals("Other")){
                pGender = 3;
            }
            long millis=System.currentTimeMillis();  
            java.sql.Date pBirthday=new java.sql.Date(millis);  
            
            
            
           try {
               Connection.DBConnection.insertPerson(pIdentification, pFirstName, pLastName, pBirthday, pEmail, pUsername, pPassword, pGender, 1, 2, 2, 1, 1, 1, 1, 1);
               JOptionPane.showMessageDialog(null, "User Created Successfully");
           } catch (SQLException ex) {
               Logger.getLogger(Register_Window.class.getName()).log(Level.SEVERE, null, ex);
           }
            


            User_Main_Menu result = new User_Main_Menu();
            result.setVisible(true);
            this.setVisible(false);
       } 
    }//GEN-LAST:event_Register_ButtonActionPerformed

    private void Username_TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_TextFieldMouseEntered
        Username_TextField.setBackground(new java.awt.Color(200,200,200));
        Username_TextField.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Username_TextFieldMouseEntered

    private void Username_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Username_TextFieldMouseExited
        Username_TextField.setBackground(new java.awt.Color(219,219,219));
        Username_TextField.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_Username_TextFieldMouseExited

    private void Password_TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Password_TextFieldMouseEntered
        Password_TextField.setBackground(new java.awt.Color(200,200,200));
        Password_TextField.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Password_TextFieldMouseEntered

    private void Password_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Password_TextFieldMouseExited
         Password_TextField.setBackground(new java.awt.Color(219,219,219));
         Password_TextField.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_Password_TextFieldMouseExited

    private void Password_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_TextFieldActionPerformed

    private void Register_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_ButtonMouseEntered
        RegisterButton_Panel.setBackground(new java.awt.Color(19,79,139));
    }//GEN-LAST:event_Register_ButtonMouseEntered

    private void Register_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_ButtonMouseExited
        RegisterButton_Panel.setBackground(new java.awt.Color(0,102,204));
    }//GEN-LAST:event_Register_ButtonMouseExited

    private void LastName_TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastName_TextFieldMouseEntered
        LastName_TextField.setBackground(new java.awt.Color(200,200,200));
        LastName_TextField.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_LastName_TextFieldMouseEntered

    private void LastName_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastName_TextFieldMouseExited
        LastName_TextField.setBackground(new java.awt.Color(219,219,219));
        LastName_TextField.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_LastName_TextFieldMouseExited

    private void LastName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName_TextFieldActionPerformed

    private void Email_TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Email_TextFieldMouseEntered
       Email_TextField.setBackground(new java.awt.Color(200,200,200));
       Email_TextField.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Email_TextFieldMouseEntered

    private void Email_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Email_TextFieldMouseExited
        Email_TextField.setBackground(new java.awt.Color(219,219,219));
        Email_TextField.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_Email_TextFieldMouseExited

    private void Email_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_TextFieldActionPerformed

    private void FirstName_TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstName_TextFieldMouseEntered
        FirstName_TextField.setBackground(new java.awt.Color(200,200,200));
        FirstName_TextField.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_FirstName_TextFieldMouseEntered

    private void FirstName_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstName_TextFieldMouseExited
        FirstName_TextField.setBackground(new java.awt.Color(219,219,219));
         FirstName_TextField.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_FirstName_TextFieldMouseExited

    private void FirstName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_TextFieldActionPerformed

    private void birth_day_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birth_day_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birth_day_dayActionPerformed

    private void gender_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender_comboboxActionPerformed

    private void birth_day_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birth_day_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birth_day_monthActionPerformed

    private void birth_day_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birth_day_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birth_day_yearActionPerformed

    private void Photo_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Photo_ButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Photo_ButtonMouseEntered

    private void Photo_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Photo_ButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Photo_ButtonMouseExited

    private void Photo_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Photo_ButtonActionPerformed
         
    }//GEN-LAST:event_Photo_ButtonActionPerformed

    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Identification_TextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Identification_TextFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Identification_TextFieldMouseEntered

    private void Identification_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Identification_TextFieldMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Identification_TextFieldMouseExited

    private void Identification_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Identification_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Identification_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DecorationPanel;
    private javax.swing.JTextField Email_TextField;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JTextField FirstName_TextField;
    private javax.swing.JTextField Identification_TextField;
    private javax.swing.JTextField LastName_TextField;
    private javax.swing.JLabel NewUser_Label;
    private javax.swing.JLabel NewUser_Label1;
    private javax.swing.JLabel NewUser_Label2;
    private javax.swing.JLabel NewUser_Label3;
    private javax.swing.JLabel NewUser_Label4;
    private javax.swing.JLabel NewUser_Label5;
    private javax.swing.JLabel NewUser_Label6;
    private javax.swing.JTextField Password_TextField;
    private javax.swing.JButton Photo_Button;
    private javax.swing.JPanel RegisterButton_Panel;
    private javax.swing.JButton Register_Button;
    private javax.swing.JTextField Username_TextField;
    private javax.swing.JComboBox<String> birth_day_day;
    private javax.swing.JComboBox<String> birth_day_month;
    private javax.swing.JComboBox<String> birth_day_year;
    private javax.swing.JComboBox<String> gender_combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
