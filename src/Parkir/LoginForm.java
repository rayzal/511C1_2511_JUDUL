/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkir;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Miechel
 */
public class LoginForm extends javax.swing.JFrame {
//    Connection Con;
//    private ResultSet RsUser;
//    Statement stm;
//    private Connection connection;
//    private Statement statement;
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
//        open_db();
    }
    
    public void ProsesLogin(String username,String password){
        Connection con = koneksi.getConnection();
        try{
            Statement stt = con.createStatement();
            ResultSet rss = stt.executeQuery("select * from user where username='"+username+"'");
            if(rss.next()){
                if(password.equals(rss.getString("password")))
                      this.dispose();
                  
                      new MenuAwal().setVisible(true);
                    JOptionPane.showMessageDialog(null,"Anda Berhasil Login");                    
            }else{
                    JOptionPane.showMessageDialog(null,"Password Anda salah");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
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

        panel1 = new usu.widget.Panel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("FORM LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/image/FormLogin.jpg"))); // NOI18N

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnLogin.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnUlang.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnExit.jpg"))); // NOI18N
        jLabel3.setToolTipText("Keluar Program");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
//        try{
//            char[] input=txtPassword.getPassword();
//            String password;
//            password = new String(txtPassword.getPassword());
//            statement = connection.createStatement();
//            
//            RsUser=statement.executeQuery("select * from user where username='"+txtUsername.getText()+"' and passowrd='"+password+"')");
//            int baris=0;
//            while(RsUser.next()){
//                baris=RsUser.getRow();
//            }
//            if(baris==1)
//            {
//                JOptionPane.showMessageDialog(null,"Berhasil Login");
//                System.exit(0);
//                new MenuAwal().setVisible(true);
//            }else{
//                JOptionPane.showMessageDialog(null,"Username atau password salah");
//            }
//        }catch(SQLException e){
//            JOptionPane.showMessageDialog(null,e);
//        }
    ProsesLogin(txtUsername.getText(),txtPassword.getText());
    }//GEN-LAST:event_jLabel1MousePressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private usu.widget.Panel panel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
//private void open_db(){
//    try{
//    Class.forName("com.mysql.jdbc.Driver");
//    Con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/parkirmall", "root","");
//        System.out.println("Koneksi Berhasil");
//    }catch(SQLException e){
//        System.out.println("Error : "+e);
//    }   catch (ClassNotFoundException ex) {
//            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}

//private void open_db(){
//try{
//Class. forName("com.mysql.jdbc.Driver");
//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkirmall", "root","");
//statement = connection.createStatement();
//} catch (SQLException | ClassNotFoundException ex){
//Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//}
//}
}
