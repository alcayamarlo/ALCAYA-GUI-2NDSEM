/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import Successfull.noAccount;
import alcaya.pkg2b.gui.loginPage;
import config.Session;
import config.dbConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author alcay
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

      public boolean duplicateCheck() {
    dbConnect dbc = new dbConnect();
    try {
        String query = "SELECT * FROM user WHERE username = '" + un1.getText() + "' OR email = '" + em.getText() + "'";
        ResultSet resultSet = dbc.getData(query);

        if (resultSet.next()) {
            String email = resultSet.getString("email");
            if (email.equals(em.getText())) {
                JOptionPane.showMessageDialog(null, "Email is Already used");
                em.setText("");
            }
            String username = resultSet.getString("username");
            if (username.equals(un1.getText())) { //Error: You were comparing username with email's text field. changed to un1's text field
                JOptionPane.showMessageDialog(null, "Username is Already used"); //Error: Changed the message to reflect username duplication
                un1.setText("");
            }
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        System.out.println("" + ex);
        return false;
    }
}
  
  public boolean updateCheck() {
    dbConnect dbc = new dbConnect();
    try {
        String query = "SELECT * FROM user WHERE (username = '" + un1.getText() + "' OR email = '" + em.getText() + "')AND p_id!= '"+p_id.getText()+"'";
        ResultSet resultSet = dbc.getData(query);

        if (resultSet.next()) {
            String email = resultSet.getString("email");
            if (email.equals(em.getText())) {
                JOptionPane.showMessageDialog(null, "Email is Already used");
                em.setText("");
            }
            String username = resultSet.getString("username");
            if (username.equals(un1.getText())) { //Error: You were comparing username with email's text field. changed to un1's text field
                JOptionPane.showMessageDialog(null, "Username is Already used"); //Error: Changed the message to reflect username duplication
                un1.setText("");
            }
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        System.out.println("" + ex);
        return false;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pass = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        un1 = new app.bolivia.swing.JCTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cn = new app.bolivia.swing.JCTextField();
        em = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ct = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fn = new app.bolivia.swing.JCTextField();
        clear = new rojerusan.RSMaterialButtonCircle();
        add = new rojerusan.RSMaterialButtonCircle();
        update = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        jLabel17 = new javax.swing.JLabel();
        p_id = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fn1 = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        utype1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardImage/icons8_Rewind_48px.png"))); // NOI18N
        jLabel2.setText("Back ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Secure_50px.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, 60));

        pass.setBackground(new java.awt.Color(102, 102, 255));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        pass.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        pass.setPlaceholder("Enter your Password");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 350, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Password :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/person.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        un1.setBackground(new java.awt.Color(102, 102, 255));
        un1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        un1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        un1.setPlaceholder("Enter your Username ");
        jPanel1.add(un1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 350, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Username :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Google_Mobile_50px.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, 60));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contact Number :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, 30));

        cn.setBackground(new java.awt.Color(102, 102, 255));
        cn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        cn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        cn.setPlaceholder("Enter your Contact No.");
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 350, -1));

        em.setBackground(new java.awt.Color(102, 102, 255));
        em.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        em.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        em.setPlaceholder("Enter your Email");
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 350, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seacrhh.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 60));

        ct.setBackground(new java.awt.Color(102, 102, 255));
        ct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ct.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        ct.setPlaceholder("Enter your City and Address");
        jPanel1.add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 350, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("City and Address :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Full Name :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 30));

        fn.setBackground(new java.awt.Color(102, 102, 255));
        fn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        fn.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        fn.setPlaceholder("Enter your Full Name");
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 350, -1));

        clear.setBackground(new java.awt.Color(255, 51, 51));
        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, 140, 70));

        add.setBackground(new java.awt.Color(255, 51, 51));
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 140, 70));

        update.setBackground(new java.awt.Color(255, 51, 51));
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 730, 140, 70));

        rSMaterialButtonCircle4.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle4.setText("DELETE");
        jPanel1.add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 140, 70));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Enter User ID :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 30));

        p_id.setBackground(new java.awt.Color(102, 102, 255));
        p_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        p_id.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        p_id.setPlaceholder("User ID");
        jPanel1.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 350, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 60));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Full Name :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 30));

        fn1.setBackground(new java.awt.Color(102, 102, 255));
        fn1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        fn1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        fn1.setPlaceholder("Enter your Full Name");
        jPanel1.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 350, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 60));

        status.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, 150, 40));

        utype1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        utype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Type : ", "Admin", "Patient", "Doctor" }));
        utype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utype1ActionPerformed(evt);
            }
        });
        jPanel1.add(utype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, 150, 40));

        jLabel23.setFont(new java.awt.Font("Arial Black", 0, 25)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Manage Users");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 210, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Just a few quick things to get started");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ManageUsers user = new ManageUsers();
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        p_id.setText("");
        fn.setText("");
        ct.setText("");
        em.setText("");
        cn.setText("");
        un1.setText("");
        pass.setText("");
        utype1.setSelectedItem("");
        status.setSelectedItem("");

    }//GEN-LAST:event_clearMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
     
        
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
  if (fn.getText().isEmpty() || ct.getText().isEmpty() || em.getText().isEmpty() || cn.getText().isEmpty() || un1.getText().isEmpty() || pass.getText().isEmpty() || utype1.getSelectedItem().toString().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All Fields Are Required");
} else {
    if (fn.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Full Name is required");
        fn.setText("");
        return;
    }
    if (ct.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "City & Address is required");
        ct.setText("");
        return;
    }
    if (em.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Email is required");
        em.setText("");
        return;
    }

    String input = cn.getText();
    if (!input.matches("[0-9]{11}")) {
        JOptionPane.showMessageDialog(null, "Please enter a valid contact number (11 digits only)");
        cn.setText("");
        return;
    }

    String email = em.getText();
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);

    if (!matcher.matches()) {
        JOptionPane.showMessageDialog(null, "Please enter a valid email ");
        em.setText("");
        return;
    }

    if (un1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username is required");
        un1.setText("");
        return;
    }

    String password = pass.getText(); // Get password directly from JCTextField

    if (password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Password is required");
        return;
    }
    if (password.length() < 8) {
        JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
        return;
    }

    String selectedUserType = (String) utype1.getSelectedItem();
    if (!("Admin".equals(selectedUserType) || "Patient".equals(selectedUserType) || "Doctor".equals(selectedUserType))) {
        JOptionPane.showMessageDialog(null, "Please select a User Type ");
        return;
    }
            
else {
                    dbConnect dbc = new dbConnect();
                    String checkUsernameQuery = "SELECT COUNT(*) FROM user WHERE username = '" + un1.getText() + "'";
                    int usernameCount = dbc.executeQueryForCount(checkUsernameQuery);
                    if (usernameCount > 0) {
                        JOptionPane.showMessageDialog(null, "Username is already taken");
                        return;
                    }

                    String checkEmailQuery = "SELECT COUNT(*) FROM user WHERE email = '" + em.getText() + "'";
                    int emailCount = dbc.executeQueryForCount(checkEmailQuery);
                    if (emailCount > 0) {
                        JOptionPane.showMessageDialog(null, "Email is already registered");
                        return;
                    }
String insertQuery = "INSERT INTO user(fn, cityAddress, email , contactNo, username,password,usertype, status) " +
                     "VALUES('" + fn.getText() + "', '" + ct.getText() + "', '" + em.getText() + 
                     "', '" + cn.getText() + "', '" + un1.getText() + "', '" + pass.getText() + 
                     "', '" + utype1.getSelectedItem() + "', 'Pending')";

                    if (dbc.insertData(insertQuery) == 0) {
                        JOptionPane.showMessageDialog(null, "Added Successfully");
                    }

                    new ManageUsers().setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
            }
    }//GEN-LAST:event_addActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
       
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
   if (fn.getText().isEmpty() || ct.getText().isEmpty() || em.getText().isEmpty() || cn.getText().isEmpty() || un1.getText().isEmpty() || pass.getText().isEmpty() || utype1.getSelectedItem().toString().isEmpty()) {
  JOptionPane.showMessageDialog(null,"All Fields are Required!");
  
   }else if (pass.getText().length()<8){
       JOptionPane.showMessageDialog(null,"Password character should be 8 above!");
       pass.setText("");
   }else if(updateCheck()){
       System.out.println("Duplicate exist");
       
       
   }else{
        dbConnect dbc = new dbConnect();
        dbc.updateData("UPDATE user SET fn = '"+fn.getText()+"', cityAddress = '"+ct.getText()
                +"', email = '"+em.getText()+"', contactNo = '"+cn.getText()+"', username = '"+un1.getText()
                +"', password = '"+pass.getText()+"', usertype = '"+utype1.getSelectedItem()
                +"',status = '"+status.getSelectedItem()+"' WHERE p_id = '"+p_id.getText()+"'");
              new ManageUsers().setVisible(true);
                    this.setVisible(false);
                    this.dispose();
   }
    }//GEN-LAST:event_updateActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void utype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utype1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
       int pid = sess.getPid();
       if(sess.getPid() == 0){
       new noAccount().setVisible(true);
       this.setVisible(false);
       this.dispose();
       }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojerusan.RSMaterialButtonCircle add;
    public rojerusan.RSMaterialButtonCircle clear;
    public app.bolivia.swing.JCTextField cn;
    public app.bolivia.swing.JCTextField ct;
    public app.bolivia.swing.JCTextField em;
    public app.bolivia.swing.JCTextField fn;
    private app.bolivia.swing.JCTextField fn1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public app.bolivia.swing.JCTextField p_id;
    public app.bolivia.swing.JCTextField pass;
    public rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    public javax.swing.JComboBox<String> status;
    public app.bolivia.swing.JCTextField un1;
    public rojerusan.RSMaterialButtonCircle update;
    public javax.swing.JComboBox<String> utype1;
    // End of variables declaration//GEN-END:variables
}
