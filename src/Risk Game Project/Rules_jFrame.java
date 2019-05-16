
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Rules_jFrame extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs= null;
PreparedStatement pst = null;
    
GridBagLayout layout = new GridBagLayout();
Page1 p1;
Page2 p2;
Page3 p3;
Page4 p4;
Page5 p5;
Page6 p6;
Page7 p7;
Page8 p8;

    /**
     * Creates new form Rules_jFrame
     */
    public Rules_jFrame() {
        initComponents();
        
        conn = javaConnect.ConnecrDb();
        //currentDate();
        setBounds(260, 100, 1325, 830);
        setResizable(false);
        
        p1 = new Page1();
        p2 = new Page2();
        p3 = new Page3();
        p4 = new Page4();
        p5 = new Page5();
        p6 = new Page6();
        p7 = new Page7();
        p8 = new Page8();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p1,c);
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p2,c);
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p3,c);
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p4,c);
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p5,c);
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p6,c);
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p7,c);
        
        c.gridx = 0;
        c.gridy = 0;
        
        DynamicPanel.add(p8,c);
        
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        DynamicPanel = new javax.swing.JPanel();
        page1 = new javax.swing.JButton();
        page2 = new javax.swing.JButton();
        page3 = new javax.swing.JButton();
        page4 = new javax.swing.JButton();
        page5 = new javax.swing.JButton();
        page6 = new javax.swing.JButton();
        page7 = new javax.swing.JButton();
        page8 = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1129, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        page1.setText("Page 1");
        page1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page1MouseClicked(evt);
            }
        });

        page2.setText("Page 2");
        page2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page2MouseClicked(evt);
            }
        });

        page3.setText("Page 3");
        page3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page3MouseClicked(evt);
            }
        });

        page4.setText("Page 4");
        page4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page4MouseClicked(evt);
            }
        });

        page5.setText("Page 5");
        page5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page5MouseClicked(evt);
            }
        });

        page6.setText("Page 6");
        page6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page6MouseClicked(evt);
            }
        });

        page7.setText("Page 7");
        page7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page7MouseClicked(evt);
            }
        });

        page8.setText("Page 8");
        page8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                page8MouseClicked(evt);
            }
        });

        Back_button.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Back_button.setForeground(new java.awt.Color(204, 204, 204));
        Back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back_icon_axe.png"))); // NOI18N
        Back_button.setText("BACK");
        Back_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back_button.setContentAreaFilled(false);
        Back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Back_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Back_buttonMouseExited(evt);
            }
        });
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(page1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(page2)
                        .addGap(65, 65, 65)
                        .addComponent(page3)
                        .addGap(65, 65, 65)
                        .addComponent(page4)
                        .addGap(65, 65, 65)
                        .addComponent(page5)
                        .addGap(65, 65, 65)
                        .addComponent(page6)
                        .addGap(65, 65, 65)
                        .addComponent(page7)
                        .addGap(65, 65, 65)
                        .addComponent(page8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(DynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Back_button, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {page1, page2, page3, page4, page5, page6, page7});

        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(page6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(page5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 1322, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void page1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page1MouseClicked
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
    }//GEN-LAST:event_page1MouseClicked

    private void page2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page2MouseClicked
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
    }//GEN-LAST:event_page2MouseClicked

    private void page3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page3MouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
    }//GEN-LAST:event_page3MouseClicked

    private void page4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page4MouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
    }//GEN-LAST:event_page4MouseClicked

    private void page5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page5MouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(true);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(false);
    }//GEN-LAST:event_page5MouseClicked

    private void page6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page6MouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(true);
        p7.setVisible(false);
        p8.setVisible(false);
    }//GEN-LAST:event_page6MouseClicked

    private void page7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page7MouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(true);
        p8.setVisible(false);
    }//GEN-LAST:event_page7MouseClicked

    private void page8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_page8MouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        p8.setVisible(true);
    }//GEN-LAST:event_page8MouseClicked

    private void Back_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_buttonMouseEntered
        Back_button.setFont(new java.awt.Font("Stencil", 0, 18));
    }//GEN-LAST:event_Back_buttonMouseEntered

    private void Back_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_buttonMouseExited
        Back_button.setFont(new java.awt.Font("Stencil", 0, 14));
    }//GEN-LAST:event_Back_buttonMouseExited

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed

        MainMenu_jFrame mainMenu = new MainMenu_jFrame();
        mainMenu.setVisible(true);

        close();
    }//GEN-LAST:event_Back_buttonActionPerformed

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public void currentDate(){
        Calendar cal = new GregorianCalendar();
        
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        //date_txt.setText(day + " / " + month + 1 + " / " + year);
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
            java.util.logging.Logger.getLogger(Rules_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rules_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rules_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rules_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rules_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton page1;
    private javax.swing.JButton page2;
    private javax.swing.JButton page3;
    private javax.swing.JButton page4;
    private javax.swing.JButton page5;
    private javax.swing.JButton page6;
    private javax.swing.JButton page7;
    private javax.swing.JButton page8;
    // End of variables declaration//GEN-END:variables
}