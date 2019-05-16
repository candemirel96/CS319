/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yerel Kullanıcı
 */
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Login_jFrame extends javax.swing.JFrame {
    
Connection conn = null;
ResultSet rs= null;
PreparedStatement pst = null;
    /**
     * Creates new form Login_jFrame
     */
    public Login_jFrame() {
        initComponents();
        
        conn = javaConnect.ConnecrDb();
        
        setBounds(260, 100, 1322, 800);
        
        setResizable(false);
        
        NewGame_jFrame.startSoundOn();
        
        currentDate();
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public void currentDate(){
        Calendar cal = new GregorianCalendar();
        
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        menu_date.setText(day + " / " + (month+1) + " / " + year);
        dateCorner_label.setText(day + " / " + (month+1) + " / " + year);
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
        txt_password = new javax.swing.JPasswordField();
        txt_username = new javax.swing.JTextField();
        cmd_login = new javax.swing.JButton();
        cmd_signUp = new javax.swing.JButton();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        noAcc_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dateCorner_label = new javax.swing.JLabel();
        background_label = new javax.swing.JLabel();
        menu_bar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menu2 = new javax.swing.JMenu();
        menu_date = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 204, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        txt_password.setPreferredSize(new java.awt.Dimension(80, 20));
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_username.setToolTipText("");
        txt_username.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray)));
        txt_username.setPreferredSize(new java.awt.Dimension(80, 20));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        cmd_login.setBackground(java.awt.Color.red);
        cmd_login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cmd_login.setForeground(new java.awt.Color(102, 0, 102));
        cmd_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login-icon (1).png"))); // NOI18N
        cmd_login.setText("Login");
        cmd_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmd_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmd_loginMouseExited(evt);
            }
        });
        cmd_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_loginActionPerformed(evt);
            }
        });

        cmd_signUp.setBackground(java.awt.Color.cyan);
        cmd_signUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmd_signUp.setForeground(new java.awt.Color(0, 0, 255));
        cmd_signUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Circle-apply-icon.png"))); // NOI18N
        cmd_signUp.setText("Sign Up");
        cmd_signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmd_signUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmd_signUpMouseExited(evt);
            }
        });
        cmd_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_signUpActionPerformed(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        username_label.setForeground(new java.awt.Color(204, 255, 204));
        username_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_label.setText("Username");

        password_label.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        password_label.setForeground(new java.awt.Color(204, 255, 204));
        password_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password_label.setText("Password");

        noAcc_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        noAcc_label.setForeground(new java.awt.Color(204, 255, 204));
        noAcc_label.setText("     NO ACCOUNT YET?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(noAcc_label, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(cmd_login, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(cmd_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(cmd_login, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noAcc_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(930, 110, 280, 470);

        dateCorner_label.setBackground(new java.awt.Color(0, 102, 102));
        dateCorner_label.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        dateCorner_label.setForeground(new java.awt.Color(204, 255, 204));
        dateCorner_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateCorner_label.setText("11 / 11 / 1111");
        dateCorner_label.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(205, 204, 0))); // NOI18N
        dateCorner_label.setPreferredSize(new java.awt.Dimension(70, 33));
        getContentPane().add(dateCorner_label);
        dateCorner_label.setBounds(890, 20, 340, 60);

        background_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        background_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dde230590dd2b9f34f1eb75e07dd30d78cfcac35.jpg"))); // NOI18N
        getContentPane().add(background_label);
        background_label.setBounds(0, 0, 1322, 800);

        menu1.setText("File");
        menu_bar.add(menu1);

        menu2.setText("Edit");
        menu_bar.add(menu2);

        menu_date.setText("Date");
        menu_bar.add(menu_date);

        setJMenuBar(menu_bar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_loginActionPerformed
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        String sql = "select * from tbl_userInfo where USERNAME=? and PASSWORD=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,txt_username.getText());
            pst.setString(2,txt_password.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                rs.close();
                pst.close();             
                
                MainMenu_jFrame mainMenu = new MainMenu_jFrame();
                mainMenu.setVisible(true);
                
                close();
            }else{
                JOptionPane.showMessageDialog(null, "Username or Password is not correct!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmd_loginActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                String sql = "select * from tbl_userInfo where USERNAME=? and PASSWORD=?";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1,txt_username.getText());
                pst.setString(2,txt_password.getText());

                rs = pst.executeQuery();

                if(rs.next()){
                    rs.close();
                    pst.close();             
                    
                    MainMenu_jFrame mainMenu = new MainMenu_jFrame();
                    mainMenu.setVisible(true);

                    close();
                }else{
                    JOptionPane.showMessageDialog(null, "Username or Password is not correct!");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void cmd_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_signUpActionPerformed
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        SignUp_jFrame s = new SignUp_jFrame();
        s.setVisible(true);

        close();
    }//GEN-LAST:event_cmd_signUpActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void cmd_signUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_signUpMouseEntered
        cmd_signUp.setFont(new java.awt.Font("Tahoma", 1, 21));
    }//GEN-LAST:event_cmd_signUpMouseEntered

    private void cmd_signUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_signUpMouseExited
        cmd_signUp.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_cmd_signUpMouseExited

    private void cmd_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_loginMouseEntered
        cmd_login.setFont(new java.awt.Font("Tahoma", 1, 26));
    }//GEN-LAST:event_cmd_loginMouseEntered

    private void cmd_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_loginMouseExited
        cmd_login.setFont(new java.awt.Font("Tahoma", 1, 24));
    }//GEN-LAST:event_cmd_loginMouseExited

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
            java.util.logging.Logger.getLogger(Login_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_label;
    private javax.swing.JButton cmd_login;
    private javax.swing.JButton cmd_signUp;
    private javax.swing.JLabel dateCorner_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenu menu_date;
    private javax.swing.JLabel noAcc_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
