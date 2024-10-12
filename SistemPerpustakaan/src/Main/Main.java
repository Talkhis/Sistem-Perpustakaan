/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Leon
 */
public class Main extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
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
        panelOverlay = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        inUsername = new javax.swing.JTextField();
        sepUsername = new javax.swing.JSeparator();
        labelPassword = new javax.swing.JLabel();
        sepPassword = new javax.swing.JSeparator();
        inPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(816, 674));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOverlay.setBackground(new Color(0,0,0,200));
        panelOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("sysbook");
        panelOverlay.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Management System");
        panelOverlay.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 30));

        jPanel1.add(panelOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/background.jpg"))); // NOI18N
        jLabel1.setText("background");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, -20, 910, 700));

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(57, 113, 177));
        labelUsername.setText("Username");
        jPanel2.add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        inUsername.setBackground(new java.awt.Color(32, 33, 35));
        inUsername.setForeground(new java.awt.Color(255, 255, 255));
        inUsername.setBorder(null);
        inUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        inUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inUsernameFocusGained(evt);
            }
        });
        jPanel2.add(inUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 350, 30));

        sepUsername.setForeground(new java.awt.Color(57, 113, 177));
        jPanel2.add(sepUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 350, -1));

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(51, 52, 54));
        labelPassword.setText("Password");
        jPanel2.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));
        jPanel2.add(sepPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 350, -1));

        inPassword.setBackground(new java.awt.Color(32, 33, 35));
        inPassword.setForeground(new java.awt.Color(255, 255, 255));
        inPassword.setBorder(null);
        inPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        inPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inPasswordFocusGained(evt);
            }
        });
        jPanel2.add(inPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 350, 30));

        btnLogin.setBackground(new java.awt.Color(126, 87, 194));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Sign In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 350, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inPasswordFocusGained
        labelUsername.setForeground(new Color(51,52,54));
        sepUsername.setForeground(new Color(51,52,54));
        
        labelPassword.setForeground(new Color(57,113,177));
        sepPassword.setForeground(new Color(57,113,177));
    }//GEN-LAST:event_inPasswordFocusGained

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = inUsername.getText();
        try { 
            String password = String.valueOf(inPassword.getPassword());
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            
            login(username, bytesToHex(hash));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       conn = MySQLConnection.ConnectDb();
    }//GEN-LAST:event_formWindowOpened

    private void inUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inUsernameFocusGained
        labelPassword.setForeground(new Color(51,52,54));
        sepPassword.setForeground(new Color(51,52,54));

        labelUsername.setForeground(new Color(57,113,177));
        sepUsername.setForeground(new Color(57,113,177));
    }//GEN-LAST:event_inUsernameFocusGained

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
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
    public void login(String username, String password){
        String login = "SELECT * FROM tbl_users WHERE usr_username = ? AND usr_password = ?;";
        try {
            pst = conn.prepareStatement(login);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login Success!");
                this.dispose();
                FormContainer cont = new FormContainer(username, getUserRole(username));
                cont.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Username/Password");
            }
        } catch (SQLException e) {
            System.out.println("Login gagal");
            e.printStackTrace();
        }
    }
    
    public String getUserRole(String username){
        String role = "";
        String sql = "SELECT usr_role FROM tbl_users WHERE usr_username = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            
            while(rs.next()){
                role = rs.getString("usr_role");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR : terjadi kesalahan sistem saat mengambil role user");
        }
        return role;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField inPassword;
    private javax.swing.JTextField inUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelOverlay;
    private javax.swing.JSeparator sepPassword;
    private javax.swing.JSeparator sepUsername;
    // End of variables declaration//GEN-END:variables
}
