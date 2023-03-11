/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe;

import javax.swing.JOptionPane;

/**
 *
 * @author phanx
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        logintitle = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        loginButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(653, 433));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logintitle.setFont(new java.awt.Font("DIN Alternate", 0, 48)); // NOI18N
        logintitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logintitle.setText("Torn Horn Cafe");
        logintitle.setToolTipText("");
        getContentPane().add(logintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 653, -1));
        getContentPane().add(userfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 169, 316, 29));
        getContentPane().add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 239, 316, 29));

        user.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        user.setText("Username");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 165, -1, -1));

        pass.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        pass.setText("Password");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 239, -1, -1));

        loginButton.setBackground(new java.awt.Color(51, 255, 51));
        loginButton.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        loginButton1.setBackground(new java.awt.Color(204, 0, 51));
        loginButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setText("Cancel");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invisible.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, 29));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
//        String username = "admin";
//        String password = "admin";
//
//        if (userfield.getText().equals(username) && passfield.getText().equals(password)){
//            Dashboard mn = new Dashboard();
//            this.setVisible(false);
//            mn.setVisible(true);
//        }
        
        if(isEmpty()){
            String username = userfield.getText();
            String password = String.valueOf(passfield.getPassword());
            if(username.equals("admin") && password.equals("admin")){
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                dashboard.pack();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Invalid username or password","Warning",2);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        passfield.setEchoChar((char)0);
        jLabel1.setVisible(false);
        jLabel2.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        passfield.setEchoChar('*');
        jLabel1.setVisible(true);
        jLabel2.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked
    public boolean isEmpty(){
        if(userfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username is missing","Warniing",2);
            return false;
        }if(String.valueOf(passfield.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Password is missing","Warniing",2);
            return false;
        }
        return true;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JLabel logintitle;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel user;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}