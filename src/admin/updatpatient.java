/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import Project.ConnectionProvider;
import java.awt.Color;
import java.sql.*;
/**
 *
 * @author alcay
 */
public class updatpatient extends javax.swing.JFrame {

    /**
     * Creates new form updatpatient
     */
    public updatpatient() {
        initComponents();
    }
    
    
        Color hover = new Color (204,255,255);
        Color defaultcolor = new Color (0,204,255);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        fn1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ct1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        dt1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        em1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cn1 = new javax.swing.JTextField();
        login1 = new javax.swing.JButton();
        utype = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pass1 = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        un1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        login3 = new javax.swing.JButton();
        login4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Patient Full Name :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, 20));

        fn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fn1.setForeground(new java.awt.Color(204, 204, 204));
        fn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn1.setText("Enter your Full Name");
        fn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fn1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fn1FocusLost(evt);
            }
        });
        jPanel1.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 360, 50));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("City & Address :");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, 20));

        ct1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ct1.setForeground(new java.awt.Color(204, 204, 204));
        ct1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ct1.setText("Enter your City Address");
        ct1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ct1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ct1FocusLost(evt);
            }
        });
        ct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct1ActionPerformed(evt);
            }
        });
        jPanel1.add(ct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 360, 50));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Date of Birth :");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 150, 20));

        dt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dt1.setForeground(new java.awt.Color(204, 204, 204));
        dt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dt1.setText("Enter your Date of Birth");
        dt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dt1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dt1FocusLost(evt);
            }
        });
        jPanel1.add(dt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 360, 50));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Email :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 60, 20));

        em1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        em1.setForeground(new java.awt.Color(204, 204, 204));
        em1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em1.setText("Enter your Email");
        em1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                em1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                em1FocusLost(evt);
            }
        });
        jPanel1.add(em1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 360, 50));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Contact No. :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 110, 20));

        cn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cn1.setForeground(new java.awt.Color(204, 204, 204));
        cn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cn1.setText("Enter your Contact No.");
        cn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cn1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cn1FocusLost(evt);
            }
        });
        jPanel1.add(cn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 360, 50));

        login1.setBackground(new java.awt.Color(0, 204, 255));
        login1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        login1.setText("Reset");
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login1MouseExited(evt);
            }
        });
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        jPanel1.add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 140, 60));

        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Usertype :", "Admin", "User", "Doctor ", "Nurse", "Cashier", "Pharmacist" }));
        jPanel1.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 380, 60));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("User Type :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 110, 20));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eyeee.png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        icon1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                icon1KeyPressed(evt);
            }
        });
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, -1, 30));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eyehide.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, -1, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 68, 400, 10));

        pass1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        jPanel1.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 380, 50));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Enter Password :");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 150, 20));

        un1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        un1.setForeground(new java.awt.Color(204, 204, 204));
        un1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        un1.setText("Enter your Username");
        un1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                un1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                un1FocusLost(evt);
            }
        });
        un1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                un1ActionPerformed(evt);
            }
        });
        un1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                un1KeyReleased(evt);
            }
        });
        jPanel1.add(un1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 380, 50));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Enter Username :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 150, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("CONTACT US");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 110, 20));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("ABOUT US");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 90, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("HOME ");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 60, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("HOSPITAL BILLS");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 260, 60));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setText("UPDATE PATIENT");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 430, 60));

        login3.setBackground(new java.awt.Color(0, 204, 255));
        login3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        login3.setText("Save");
        login3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login3MouseExited(evt);
            }
        });
        login3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login3ActionPerformed(evt);
            }
        });
        jPanel1.add(login3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 140, 60));

        login4.setBackground(new java.awt.Color(0, 204, 255));
        login4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        login4.setText("Close");
        login4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login4MouseExited(evt);
            }
        });
        login4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login4ActionPerformed(evt);
            }
        });
        jPanel1.add(login4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 140, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weweew-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        jLabel1.setText("Contact Number :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 30));

        jButton1.setText("Search");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 130, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fn1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fn1FocusGained
        if(fn1.getText().equals("Enter your Full Name"))
        {
            fn1.setText("");
            fn1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_fn1FocusGained

    private void fn1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fn1FocusLost
        if(fn1.getText().equals(""))
        {
            fn1.setText("Enter your Full Name");
            fn1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_fn1FocusLost

    private void ct1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ct1FocusGained
        if(ct1.getText().equals("Enter your City Address"))
        {
            ct1.setText("");
            ct1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_ct1FocusGained

    private void ct1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ct1FocusLost
        if(ct1.getText().equals(""))
        {
            ct1.setText("Enter your City Address");
            ct1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_ct1FocusLost

    private void ct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ct1ActionPerformed

    private void dt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dt1FocusGained
        if(dt1.getText().equals("Enter your Date of Birth"))
        {
            dt1.setText("");
            dt1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_dt1FocusGained

    private void dt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dt1FocusLost
        if(dt1.getText().equals(""))
        {
            dt1.setText("Enter your Date of Birth");
            dt1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_dt1FocusLost

    private void em1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_em1FocusGained
        if(em1.getText().equals("Enter your Email"))
        {
            em1.setText("");
            em1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_em1FocusGained

    private void em1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_em1FocusLost
        if(em1.getText().equals(""))
        {
            em1.setText("Enter your Email");
            em1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_em1FocusLost

    private void cn1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cn1FocusGained
        if(cn1.getText().equals("Enter your Contact No."))
        {
            cn1.setText("");
            cn1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_cn1FocusGained

    private void cn1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cn1FocusLost
        if(cn1.getText().equals(""))
        {
            cn1.setText("Enter your Username");
            cn1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_cn1FocusLost

    private void login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseEntered
        login1.setBackground(hover);
    }//GEN-LAST:event_login1MouseEntered

    private void login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseExited
        login1.setBackground(defaultcolor);
    }//GEN-LAST:event_login1MouseExited

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        setVisible(false);
        new addpatient().setVisible(true);
    }//GEN-LAST:event_login1ActionPerformed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        pass1.setEchoChar((char)0);
    }//GEN-LAST:event_icon1MousePressed

    private void icon1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_icon1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_icon1KeyPressed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        pass1.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void un1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_un1FocusGained
        if(un1.getText().equals("Enter your Username"))
        {
            un1.setText("");
            un1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_un1FocusGained

    private void un1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_un1FocusLost
        if(un1.getText().equals(""))
        {
            un1.setText("Enter your Username");
            un1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_un1FocusLost

    private void un1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_un1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_un1ActionPerformed

    private void un1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_un1KeyReleased

    }//GEN-LAST:event_un1KeyReleased

    private void login3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login3MouseEntered
        login3.setBackground(hover);
    }//GEN-LAST:event_login3MouseEntered

    private void login3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login3MouseExited
        login3.setBackground(defaultcolor);
    }//GEN-LAST:event_login3MouseExited

    private void login3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login3ActionPerformed
       
    }//GEN-LAST:event_login3ActionPerformed

    private void login4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login4MouseEntered
        login4.setBackground(hover);
    }//GEN-LAST:event_login4MouseEntered

    private void login4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login4MouseExited
        login4.setBackground(defaultcolor);
    }//GEN-LAST:event_login4MouseExited

    private void login4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login4ActionPerformed
       setVisible(false);
       new updatpatient().setVisible(true);
       
    }//GEN-LAST:event_login4ActionPerformed

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
            java.util.logging.Logger.getLogger(updatpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cn1;
    private javax.swing.JTextField ct1;
    private javax.swing.JTextField dt1;
    private javax.swing.JTextField em1;
    private javax.swing.JTextField fn1;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login1;
    private javax.swing.JButton login3;
    private javax.swing.JButton login4;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JTextField un1;
    private javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
