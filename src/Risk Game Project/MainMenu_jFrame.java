/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yerel Kullanıcı
 */

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import sun.audio.*;


public class MainMenu_jFrame extends javax.swing.JFrame {

public static NewGame_jFrame newGame;
public static NumOfPlayers_jFrame numberOfPlayersFrame = new NumOfPlayers_jFrame();
    
Connection conn = null;
ResultSet rs= null;
PreparedStatement pst = null;
    /**
     * Creates new form MainMenu_jFrame
     */
    public MainMenu_jFrame() {
        initComponents();
        
        conn = javaConnect.ConnecrDb();
        
        currentDate();
        
        setBounds(260, 100, 1322, 800);
        
        setResizable(false);
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
        
        date_txt.setText(day + " / " + month + 1 + " / " + year);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        button_play = new javax.swing.JButton();
        button_options = new javax.swing.JButton();
        button_rules = new javax.swing.JButton();
        button_quit = new javax.swing.JButton();
        leaderboard_button = new javax.swing.JButton();
        credits_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        risk_game_logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        date_txt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        button_play.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        button_play.setForeground(java.awt.Color.red);
        button_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helmet.png"))); // NOI18N
        button_play.setText("PLAY");
        button_play.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_play.setContentAreaFilled(false);
        button_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_playMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_playMouseExited(evt);
            }
        });
        button_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_playActionPerformed(evt);
            }
        });

        button_options.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        button_options.setForeground(new java.awt.Color(204, 102, 0));
        button_options.setText("SETTINGS");
        button_options.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_options.setContentAreaFilled(false);
        button_options.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_optionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_optionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_optionsMouseExited(evt);
            }
        });
        button_options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_optionsActionPerformed(evt);
            }
        });

        button_rules.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        button_rules.setForeground(new java.awt.Color(204, 102, 0));
        button_rules.setText("RULES");
        button_rules.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_rules.setContentAreaFilled(false);
        button_rules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_rulesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_rulesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_rulesMouseExited(evt);
            }
        });
        button_rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rulesActionPerformed(evt);
            }
        });

        button_quit.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        button_quit.setForeground(java.awt.Color.red);
        button_quit.setText("QUIT");
        button_quit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_quit.setContentAreaFilled(false);
        button_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_quitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_quitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_quitMouseExited(evt);
            }
        });
        button_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_quitActionPerformed(evt);
            }
        });

        leaderboard_button.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        leaderboard_button.setForeground(new java.awt.Color(204, 102, 0));
        leaderboard_button.setText("LEADERBOARD");
        leaderboard_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaderboard_button.setContentAreaFilled(false);
        leaderboard_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaderboard_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leaderboard_buttonMouseExited(evt);
            }
        });
        leaderboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboard_buttonActionPerformed(evt);
            }
        });

        credits_button.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        credits_button.setForeground(new java.awt.Color(204, 102, 0));
        credits_button.setText("CREDITS");
        credits_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        credits_button.setContentAreaFilled(false);
        credits_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                credits_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                credits_buttonMouseExited(evt);
            }
        });
        credits_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credits_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MAIN MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(credits_button, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaderboard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_rules, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_options, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(button_play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(button_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_options, button_play, button_rules, credits_button, leaderboard_button});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button_play, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_options, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_rules, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(leaderboard_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(credits_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_options, button_play, button_quit, button_rules, credits_button, leaderboard_button});

        getContentPane().add(jPanel1);
        jPanel1.setBounds(510, 200, 300, 450);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(490, 740, 310, 50);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilkent Logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(10, 670, 100, 70);

        risk_game_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdasd.png"))); // NOI18N
        getContentPane().add(risk_game_logo);
        risk_game_logo.setBounds(590, 50, 150, 70);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainMenu_background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1322, 800);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        date_txt.setText("Date");
        jMenuBar1.add(date_txt);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_playActionPerformed
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        numberOfPlayersFrame.setVisible(true);

        close();
    }//GEN-LAST:event_button_playActionPerformed

    private void button_optionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_optionsMouseClicked
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        Options_jFrame s = new Options_jFrame();
        s.setVisible(true);

        close();
    }//GEN-LAST:event_button_optionsMouseClicked

    private void button_quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_quitMouseClicked
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        Login_jFrame s = new Login_jFrame();
        s.setVisible(true);

        close();
    }//GEN-LAST:event_button_quitMouseClicked

    private void button_rulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_rulesMouseClicked
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        Rules_jFrame s = new Rules_jFrame();
        s.setVisible(true);

        close();
    }//GEN-LAST:event_button_rulesMouseClicked

    private void button_playMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_playMouseEntered
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_play.setFont(new java.awt.Font("Stencil", 1, 28));
    }//GEN-LAST:event_button_playMouseEntered

    private void button_playMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_playMouseExited
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_play.setFont(new java.awt.Font("Stencil", 1, 24));
    }//GEN-LAST:event_button_playMouseExited

    private void button_optionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_optionsMouseEntered
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_options.setFont(new java.awt.Font("Stencil", 1, 28));
    }//GEN-LAST:event_button_optionsMouseEntered

    private void button_optionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_optionsMouseExited
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_options.setFont(new java.awt.Font("Stencil", 1, 24));
    }//GEN-LAST:event_button_optionsMouseExited

    private void button_rulesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_rulesMouseEntered
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_rules.setFont(new java.awt.Font("Stencil", 1, 28));
    }//GEN-LAST:event_button_rulesMouseEntered

    private void button_rulesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_rulesMouseExited
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_rules.setFont(new java.awt.Font("Stencil", 1, 24));
    }//GEN-LAST:event_button_rulesMouseExited

    private void leaderboard_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboard_buttonMouseEntered
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        leaderboard_button.setFont(new java.awt.Font("Stencil", 1, 28));
    }//GEN-LAST:event_leaderboard_buttonMouseEntered

    private void leaderboard_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderboard_buttonMouseExited
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        leaderboard_button.setFont(new java.awt.Font("Stencil", 1, 24));
    }//GEN-LAST:event_leaderboard_buttonMouseExited

    private void credits_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_credits_buttonMouseEntered
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        credits_button.setFont(new java.awt.Font("Stencil", 1, 28));
    }//GEN-LAST:event_credits_buttonMouseEntered

    private void credits_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_credits_buttonMouseExited
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        credits_button.setFont(new java.awt.Font("Stencil", 1, 24));
    }//GEN-LAST:event_credits_buttonMouseExited

    private void button_quitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_quitMouseEntered
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_quit.setFont(new java.awt.Font("Stencil", 1, 28));
    }//GEN-LAST:event_button_quitMouseEntered

    private void button_quitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_quitMouseExited
        InputStream in;
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Mainbutton.wav"));
            AudioStream audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        button_quit.setFont(new java.awt.Font("Stencil", 1, 24));
    }//GEN-LAST:event_button_quitMouseExited

    private void button_optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_optionsActionPerformed
        
    }//GEN-LAST:event_button_optionsActionPerformed

    private void button_rulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_rulesActionPerformed
        
    }//GEN-LAST:event_button_rulesActionPerformed

    private void leaderboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboard_buttonActionPerformed
        
    }//GEN-LAST:event_leaderboard_buttonActionPerformed

    private void credits_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credits_buttonActionPerformed

    }//GEN-LAST:event_credits_buttonActionPerformed

    private void button_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_quitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_quitActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton button_options;
    private javax.swing.JButton button_play;
    private javax.swing.JButton button_quit;
    private javax.swing.JButton button_rules;
    private javax.swing.JButton credits_button;
    private javax.swing.JMenu date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leaderboard_button;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel risk_game_logo;
    // End of variables declaration//GEN-END:variables
}
