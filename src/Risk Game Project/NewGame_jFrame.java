
import company.Game;
import company.Quest;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yerel Kullanıcı
 */
public class NewGame_jFrame extends javax.swing.JFrame {

    public static boolean[] booleanArr = new boolean[3]; // index 0 : recruit, index 1 : attack; index 2 : move
    public static int selectedLandID;
    public static int defenderLandID;
    public static InputStream in;
    public static InputStream in1;
    public static InputStream in2;
    public static InputStream in3;
    public static AudioStream audios;
    public static AudioStream audios1;
    public static AudioStream audios2;
    public static AudioStream audios3;
    
    public static Quests_jFrame s = new Quests_jFrame();

    /**
     * Creates new form NewGame_jFrame
     */
    public NewGame_jFrame() {
        initComponents();
        
        setResizable(false);
        
        soundOn();
        
        setBounds(260, 100, 1322, 830);
        
        setStatistics(); 
        setTurnCount();     
    }
    
    public static void soundOn()
    {
        
        try{
            in = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\track1.wav"));
            audios = new AudioStream(in);
            
            AudioPlayer.player.start(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void epidemicSoundOn()
    {
        
        try{
            in3 = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\Epidemic.wav"));
            audios3 = new AudioStream(in3);
            
            AudioPlayer.player.start(audios3);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void epidemicSoundOff()
    {
        try{            
            AudioPlayer.player.stop(audios3);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void startSoundOn()
    {
        try{
            in2 = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\startSound.wav"));
            audios2 = new AudioStream(in2);
            
            AudioPlayer.player.start(audios2);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void startSoundOff()
    {
        try{            
            AudioPlayer.player.stop(audios2);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void winterSoundOn()
    {
        try{
            in1 = new FileInputStream(new File("C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\src\\winterTrack.wav"));
            audios1 = new AudioStream(in1);
            
            AudioPlayer.player.start(audios1);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void winterSoundOnn()
    {
        try{
            AudioPlayer.player.start(audios1);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void winterSoundOff()
    {
        try{            
            AudioPlayer.player.stop(audios1);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void soundOnn()
    {
        try{
            AudioPlayer.player.start(audios);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void soundOff()
    {       
        try{            
            AudioPlayer.player.stop(audios);
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
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
        
        //date_txt.setText(day + " / " + month + 1 + " / " + year);
    }
    
    public void setTurnCount()
    {
        String str = "Turn " + Game.turn_count;
        turn_text.setText(str);
    }
    
    public static void setStatistics()
    {
        String turnCountStr = "Player " + (Game.turn_count % Game.player_count + 1) + "'s turn";
        whoseTurn_text.setText(turnCountStr);
        
        if(Game.player_count == 3)
        {
            String setStr2 = Game.players[0].getTroops() + "";
            String setStr = (Game.players[0].getPlayerId()+1) + "";
            Player1.setText(setStr);
            Troops1.setText(setStr2);
            
            
            setStr = (Game.players[1].getPlayerId()+1) + "";
            setStr2 = Game.players[1].getTroops() + "";
            Player2.setText(setStr);
            Troops2.setText(setStr2);
            
            setStr = (Game.players[2].getPlayerId()+1) + "";
            setStr2 = Game.players[2].getTroops() + "";
            Player3.setText(setStr);
            Troops3.setText(setStr2);           
            
            Player4.setVisible(false);
            Player5.setVisible(false);
            Player6.setVisible(false);
            
            Troops4.setVisible(false);
            Troops5.setVisible(false);
            Troops6.setVisible(false);
            
        }else if(Game.player_count == 4)
        {
            String setStr2 = Game.players[0].getTroops() + "";
            String setStr = (Game.players[0].getPlayerId()+1) + "";
            Player1.setText(setStr);
            Troops1.setText(setStr2);
            
            setStr2 = Game.players[1].getTroops() + "";
            setStr = (Game.players[1].getPlayerId()+1) + "";
            Player2.setText(setStr);
            Troops2.setText(setStr2);
            
            setStr2 = Game.players[2].getTroops() + "";
            setStr = (Game.players[2].getPlayerId()+1) + "";
            Player3.setText(setStr);
            Troops3.setText(setStr2);
            
            setStr2 = Game.players[3].getTroops() + "";
            setStr = (Game.players[3].getPlayerId()+1) + "";
            Player4.setText(setStr);
            Troops4.setText(setStr2);

            Player5.setVisible(false);
            Player6.setVisible(false);
            
            Troops5.setVisible(false);
            Troops6.setVisible(false);
            
        }else if(Game.player_count == 5)
        {
            String setStr2 = Game.players[0].getTroops() + "";
            String setStr = (Game.players[0].getPlayerId()+1) + "";
            Player1.setText(setStr);
            Troops1.setText(setStr2);
            
            setStr2 = Game.players[1].getTroops() + "";
            setStr = (Game.players[1].getPlayerId()+1) + "";
            Player2.setText(setStr);
            Troops2.setText(setStr2);
            
            setStr2 = Game.players[2].getTroops() + "";
            setStr = (Game.players[2].getPlayerId()+1) + "";
            Player3.setText(setStr);
            Troops3.setText(setStr2);
            
            setStr2 = Game.players[3].getTroops() + "";
            setStr = (Game.players[3].getPlayerId()+1) + "";
            Player4.setText(setStr);
            Troops4.setText(setStr2);
            
            setStr2 = Game.players[4].getTroops() + "";
            setStr = (Game.players[4].getPlayerId()+1) + "";
            Player5.setText(setStr);
            Troops5.setText(setStr2);
            
            Player6.setVisible(false);
            
            Troops6.setVisible(false);         
        }else if(Game.player_count == 6)
        {
            String setStr2 = Game.players[0].getTroops() + "";
            String setStr = (Game.players[0].getPlayerId()+1) + "";
            Player1.setText(setStr);
            Troops1.setText(setStr2);
            
            setStr2 = Game.players[1].getTroops() + "";
            setStr = (Game.players[1].getPlayerId()+1) + "";
            Player2.setText(setStr);
            Troops2.setText(setStr2);
            
            setStr2 = Game.players[2].getTroops() + "";
            setStr = (Game.players[2].getPlayerId()+1) + "";
            Player3.setText(setStr);
            Troops3.setText(setStr2);
            
            setStr2 = Game.players[3].getTroops() + "";
            setStr = (Game.players[3].getPlayerId()+1) + "";
            Player4.setText(setStr);
            Troops4.setText(setStr2);
            
            setStr2 = Game.players[4].getTroops() + "";
            setStr = (Game.players[4].getPlayerId()+1) + "";
            Player5.setText(setStr);
            Troops5.setText(setStr2);
            
            setStr2 = Game.players[5].getTroops() + "";
            setStr = (Game.players[5].getPlayerId()+1) + "";
            Player6.setText(setStr);
            Troops6.setText(setStr2);
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
        jLabel3 = new javax.swing.JLabel();
        playerID_text = new javax.swing.JLabel();
        Troops_text = new javax.swing.JLabel();
        Player1 = new javax.swing.JLabel();
        Troops1 = new javax.swing.JLabel();
        Player2 = new javax.swing.JLabel();
        Troops2 = new javax.swing.JLabel();
        Player3 = new javax.swing.JLabel();
        Troops3 = new javax.swing.JLabel();
        Player4 = new javax.swing.JLabel();
        Troops4 = new javax.swing.JLabel();
        Player5 = new javax.swing.JLabel();
        Troops5 = new javax.swing.JLabel();
        Player6 = new javax.swing.JLabel();
        Troops6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        endTurn_button = new javax.swing.JButton();
        endTurnText = new javax.swing.JLabel();
        WUStates_button = new javax.swing.JButton();
        Greenland_button = new javax.swing.JButton();
        Alberta_button = new javax.swing.JButton();
        NorthWest_button = new javax.swing.JButton();
        Alaska_button = new javax.swing.JButton();
        Ontario_button = new javax.swing.JButton();
        Quebec_button = new javax.swing.JButton();
        easternUStates_button = new javax.swing.JButton();
        CentralAmerica_button = new javax.swing.JButton();
        Venezuela_button = new javax.swing.JButton();
        Brazil_button = new javax.swing.JButton();
        Peru_button = new javax.swing.JButton();
        Argentina_button = new javax.swing.JButton();
        OBG_button = new javax.swing.JButton();
        Goldies_text = new javax.swing.JLabel();
        but_text = new javax.swing.JLabel();
        Oldies_text = new javax.swing.JLabel();
        Iceland_button = new javax.swing.JButton();
        Britain_button = new javax.swing.JButton();
        WEurope_button = new javax.swing.JButton();
        WesternEurope1_text = new javax.swing.JLabel();
        WesternEurope2_text = new javax.swing.JLabel();
        SEurope_button = new javax.swing.JButton();
        SouthernEurope2_text = new javax.swing.JLabel();
        SouthernEurope1_text = new javax.swing.JLabel();
        Ukraine1_button = new javax.swing.JButton();
        Ukraine2_button = new javax.swing.JButton();
        Ukraine_text = new javax.swing.JLabel();
        NEurope_button = new javax.swing.JButton();
        NorthernEurope2_text = new javax.swing.JLabel();
        NorthernEurope1_text = new javax.swing.JLabel();
        Scandinavia_button = new javax.swing.JButton();
        NAfrica1_button = new javax.swing.JButton();
        NAfrica_button = new javax.swing.JButton();
        NorthAfrica_text = new javax.swing.JLabel();
        Egypt_button = new javax.swing.JButton();
        Congo_button = new javax.swing.JButton();
        EAfrica1_button = new javax.swing.JButton();
        EAfrica2_button = new javax.swing.JButton();
        EastAfrica2_text = new javax.swing.JLabel();
        EastAfrica1_text = new javax.swing.JLabel();
        SAfrica_button = new javax.swing.JButton();
        Madagascar_button = new javax.swing.JButton();
        MiddleEast1_button = new javax.swing.JButton();
        MiddleEast2_button = new javax.swing.JButton();
        MiddleEast2_text = new javax.swing.JLabel();
        MiddleEast1_text = new javax.swing.JLabel();
        Afghanistan_button = new javax.swing.JButton();
        India_button = new javax.swing.JButton();
        Siam_button = new javax.swing.JButton();
        China_button = new javax.swing.JButton();
        Mongalia_button = new javax.swing.JButton();
        Ural_button = new javax.swing.JButton();
        Siberia_button = new javax.swing.JButton();
        Yakutsk_button = new javax.swing.JButton();
        Kamchatka_button = new javax.swing.JButton();
        Japan_button = new javax.swing.JButton();
        Indonesia_button = new javax.swing.JButton();
        Papua_button = new javax.swing.JButton();
        Irkutsk_button = new javax.swing.JButton();
        WAustralia1_button = new javax.swing.JButton();
        WAustralia2_button = new javax.swing.JButton();
        WesternAustralia2_text = new javax.swing.JLabel();
        WesternAustralia1_text = new javax.swing.JLabel();
        EAustralia2_button = new javax.swing.JButton();
        EAustralia1_button = new javax.swing.JButton();
        EasternAustralia2_text = new javax.swing.JLabel();
        EasternAustralia1_text = new javax.swing.JLabel();
        turn_text = new javax.swing.JLabel();
        whoseTurn_text = new javax.swing.JLabel();
        quests_button = new javax.swing.JButton();
        quests_text = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();
        map = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Statistics");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 10, 190, 40);

        playerID_text.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        playerID_text.setForeground(new java.awt.Color(204, 204, 204));
        playerID_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerID_text.setText("Player ID");
        playerID_text.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(playerID_text);
        playerID_text.setBounds(10, 60, 110, 40);

        Troops_text.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Troops_text.setForeground(new java.awt.Color(204, 204, 204));
        Troops_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Troops_text.setText("Troops");
        Troops_text.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Troops_text);
        Troops_text.setBounds(130, 60, 110, 40);

        Player1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Player1.setForeground(new java.awt.Color(204, 204, 204));
        Player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player1.setText("Player1");
        Player1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Player1);
        Player1.setBounds(10, 110, 110, 40);

        Troops1.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Troops1.setForeground(new java.awt.Color(204, 204, 204));
        Troops1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Troops1.setText("Troops1");
        Troops1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Troops1);
        Troops1.setBounds(130, 110, 110, 40);

        Player2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Player2.setForeground(new java.awt.Color(204, 204, 204));
        Player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player2.setText("Player2");
        Player2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Player2);
        Player2.setBounds(10, 150, 110, 40);

        Troops2.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Troops2.setForeground(new java.awt.Color(204, 204, 204));
        Troops2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Troops2.setText("Troops2");
        Troops2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Troops2);
        Troops2.setBounds(130, 150, 110, 40);

        Player3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Player3.setForeground(new java.awt.Color(204, 204, 204));
        Player3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player3.setText("Player3");
        Player3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Player3);
        Player3.setBounds(10, 190, 110, 40);

        Troops3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Troops3.setForeground(new java.awt.Color(204, 204, 204));
        Troops3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Troops3.setText("Troops3");
        Troops3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Troops3);
        Troops3.setBounds(130, 190, 110, 40);

        Player4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Player4.setForeground(new java.awt.Color(204, 204, 204));
        Player4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player4.setText("Player4");
        Player4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Player4);
        Player4.setBounds(10, 230, 110, 40);

        Troops4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Troops4.setForeground(new java.awt.Color(204, 204, 204));
        Troops4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Troops4.setText("Troops4");
        Troops4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Troops4);
        Troops4.setBounds(130, 230, 110, 40);

        Player5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Player5.setForeground(new java.awt.Color(204, 204, 204));
        Player5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player5.setText("Player5");
        Player5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Player5);
        Player5.setBounds(10, 270, 110, 40);

        Troops5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Troops5.setForeground(new java.awt.Color(204, 204, 204));
        Troops5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Troops5.setText("Troops5");
        Troops5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Troops5);
        Troops5.setBounds(130, 270, 110, 40);

        Player6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Player6.setForeground(new java.awt.Color(204, 204, 204));
        Player6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player6.setText("Player6");
        Player6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Player6);
        Player6.setBounds(10, 310, 110, 40);

        Troops6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Troops6.setForeground(new java.awt.Color(204, 204, 204));
        Troops6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Troops6.setText("Troops6");
        Troops6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Troops6);
        Troops6.setBounds(130, 310, 110, 40);

        jLabel4.setBackground(java.awt.Color.orange);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newGameStatistics_background.PNG"))); // NOI18N
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 250, 360);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 440, 250, 360);

        endTurn_button.setBackground(new java.awt.Color(204, 204, 204));
        endTurn_button.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        endTurn_button.setForeground(new java.awt.Color(51, 51, 51));
        endTurn_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        endTurn_button.setContentAreaFilled(false);
        endTurn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTurn_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(endTurn_button);
        endTurn_button.setBounds(10, 240, 110, 40);

        endTurnText.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        endTurnText.setForeground(new java.awt.Color(51, 51, 51));
        endTurnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endTurnText.setText("End Turn");
        endTurnText.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(endTurnText);
        endTurnText.setBounds(10, 240, 110, 40);

        WUStates_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WUStates_button.setText("W.U. States");
        WUStates_button.setContentAreaFilled(false);
        WUStates_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WUStates_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WUStates_buttonMouseExited(evt);
            }
        });
        WUStates_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WUStates_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(WUStates_button);
        WUStates_button.setBounds(160, 250, 110, 70);

        Greenland_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Greenland_button.setText("Greenland");
        Greenland_button.setContentAreaFilled(false);
        Greenland_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Greenland_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Greenland_buttonMouseExited(evt);
            }
        });
        Greenland_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Greenland_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Greenland_button);
        Greenland_button.setBounds(410, 53, 100, 100);

        Alberta_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Alberta_button.setText("Alberta");
        Alberta_button.setContentAreaFilled(false);
        Alberta_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Alberta_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Alberta_buttonMouseExited(evt);
            }
        });
        Alberta_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alberta_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Alberta_button);
        Alberta_button.setBounds(155, 180, 110, 60);

        NorthWest_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NorthWest_button.setText("NorthWest Territory");
        NorthWest_button.setContentAreaFilled(false);
        NorthWest_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NorthWest_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NorthWest_buttonMouseExited(evt);
            }
        });
        NorthWest_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NorthWest_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(NorthWest_button);
        NorthWest_button.setBounds(150, 120, 170, 50);

        Alaska_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Alaska_button.setText("Alaska");
        Alaska_button.setContentAreaFilled(false);
        Alaska_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Alaska_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Alaska_buttonMouseExited(evt);
            }
        });
        Alaska_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alaska_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Alaska_button);
        Alaska_button.setBounds(60, 120, 90, 50);

        Ontario_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ontario_button.setText("Ontario");
        Ontario_button.setContentAreaFilled(false);
        Ontario_button.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Ontario_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ontario_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ontario_buttonMouseExited(evt);
            }
        });
        Ontario_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ontario_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Ontario_button);
        Ontario_button.setBounds(260, 190, 80, 50);

        Quebec_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Quebec_button.setText("Quebec");
        Quebec_button.setContentAreaFilled(false);
        Quebec_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Quebec_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Quebec_buttonMouseExited(evt);
            }
        });
        Quebec_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quebec_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Quebec_button);
        Quebec_button.setBounds(349, 180, 90, 80);

        easternUStates_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        easternUStates_button.setText("E. U. States");
        easternUStates_button.setContentAreaFilled(false);
        easternUStates_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                easternUStates_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                easternUStates_buttonMouseExited(evt);
            }
        });
        easternUStates_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easternUStates_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(easternUStates_button);
        easternUStates_button.setBounds(270, 270, 120, 70);

        CentralAmerica_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CentralAmerica_button.setText("Central America");
        CentralAmerica_button.setContentAreaFilled(false);
        CentralAmerica_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CentralAmerica_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CentralAmerica_buttonMouseExited(evt);
            }
        });
        CentralAmerica_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CentralAmerica_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(CentralAmerica_button);
        CentralAmerica_button.setBounds(180, 350, 150, 70);

        Venezuela_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Venezuela_button.setText("Venezuela");
        Venezuela_button.setContentAreaFilled(false);
        Venezuela_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Venezuela_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Venezuela_buttonMouseExited(evt);
            }
        });
        Venezuela_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Venezuela_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Venezuela_button);
        Venezuela_button.setBounds(253, 423, 130, 50);

        Brazil_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Brazil_button.setText("Brazil");
        Brazil_button.setContentAreaFilled(false);
        Brazil_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Brazil_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Brazil_buttonMouseExited(evt);
            }
        });
        Brazil_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brazil_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Brazil_button);
        Brazil_button.setBounds(370, 460, 110, 100);

        Peru_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Peru_button.setText("Peru");
        Peru_button.setContentAreaFilled(false);
        Peru_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Peru_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Peru_buttonMouseExited(evt);
            }
        });
        Peru_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Peru_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Peru_button);
        Peru_button.setBounds(280, 510, 100, 60);

        Argentina_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Argentina_button.setText("Argentina");
        Argentina_button.setContentAreaFilled(false);
        Argentina_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Argentina_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Argentina_buttonMouseExited(evt);
            }
        });
        Argentina_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Argentina_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Argentina_button);
        Argentina_button.setBounds(280, 570, 130, 130);

        OBG_button.setContentAreaFilled(false);
        OBG_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OBG_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OBG_buttonMouseExited(evt);
            }
        });
        OBG_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBG_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(OBG_button);
        OBG_button.setBounds(393, 343, 110, 80);

        Goldies_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Goldies_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Goldies_text.setText("Goldies");
        getContentPane().add(Goldies_text);
        Goldies_text.setBounds(410, 390, 70, 20);

        but_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        but_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        but_text.setText("but");
        getContentPane().add(but_text);
        but_text.setBounds(410, 370, 70, 20);

        Oldies_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Oldies_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Oldies_text.setText("Oldies");
        getContentPane().add(Oldies_text);
        Oldies_text.setBounds(410, 350, 70, 20);

        Iceland_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Iceland_button.setText("Iceland");
        Iceland_button.setContentAreaFilled(false);
        Iceland_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Iceland_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Iceland_buttonMouseExited(evt);
            }
        });
        Iceland_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iceland_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Iceland_button);
        Iceland_button.setBounds(493, 153, 110, 60);

        Britain_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Britain_button.setText("Great Britain");
        Britain_button.setContentAreaFilled(false);
        Britain_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Britain_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Britain_buttonMouseExited(evt);
            }
        });
        Britain_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Britain_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Britain_button);
        Britain_button.setBounds(470, 220, 120, 80);

        WEurope_button.setContentAreaFilled(false);
        WEurope_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WEurope_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WEurope_buttonMouseExited(evt);
            }
        });
        WEurope_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WEurope_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(WEurope_button);
        WEurope_button.setBounds(520, 303, 80, 110);

        WesternEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WesternEurope1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WesternEurope1_text.setText("Western");
        getContentPane().add(WesternEurope1_text);
        WesternEurope1_text.setBounds(530, 330, 60, 20);

        WesternEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WesternEurope2_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WesternEurope2_text.setText("Europe");
        getContentPane().add(WesternEurope2_text);
        WesternEurope2_text.setBounds(530, 360, 60, 20);

        SEurope_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SEurope_button.setContentAreaFilled(false);
        SEurope_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SEurope_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SEurope_buttonMouseExited(evt);
            }
        });
        SEurope_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEurope_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(SEurope_button);
        SEurope_button.setBounds(613, 323, 90, 70);

        SouthernEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SouthernEurope2_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SouthernEurope2_text.setText("Europe");
        getContentPane().add(SouthernEurope2_text);
        SouthernEurope2_text.setBounds(620, 340, 80, 14);

        SouthernEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SouthernEurope1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SouthernEurope1_text.setText("Southern");
        getContentPane().add(SouthernEurope1_text);
        SouthernEurope1_text.setBounds(620, 320, 80, 14);

        Ukraine1_button.setContentAreaFilled(false);
        Ukraine1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ukraine1_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ukraine1_buttonMouseExited(evt);
            }
        });
        Ukraine1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ukraine1_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Ukraine1_button);
        Ukraine1_button.setBounds(713, 123, 140, 130);

        Ukraine2_button.setContentAreaFilled(false);
        Ukraine2_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ukraine2_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ukraine2_buttonMouseExited(evt);
            }
        });
        Ukraine2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ukraine2_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Ukraine2_button);
        Ukraine2_button.setBounds(710, 253, 90, 100);

        Ukraine_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ukraine_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ukraine_text.setText("Ukraine");
        getContentPane().add(Ukraine_text);
        Ukraine_text.setBounds(720, 214, 110, 40);

        NEurope_button.setContentAreaFilled(false);
        NEurope_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NEurope_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NEurope_buttonMouseExited(evt);
            }
        });
        NEurope_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEurope_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(NEurope_button);
        NEurope_button.setBounds(603, 243, 100, 70);

        NorthernEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NorthernEurope2_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NorthernEurope2_text.setText("Europe");
        getContentPane().add(NorthernEurope2_text);
        NorthernEurope2_text.setBounds(610, 280, 80, 30);

        NorthernEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NorthernEurope1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NorthernEurope1_text.setText("Northern");
        getContentPane().add(NorthernEurope1_text);
        NorthernEurope1_text.setBounds(620, 244, 80, 30);

        Scandinavia_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Scandinavia_button.setText("Scandinavia");
        Scandinavia_button.setContentAreaFilled(false);
        Scandinavia_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Scandinavia_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Scandinavia_buttonMouseExited(evt);
            }
        });
        Scandinavia_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Scandinavia_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Scandinavia_button);
        Scandinavia_button.setBounds(590, 123, 120, 100);

        NAfrica1_button.setContentAreaFilled(false);
        NAfrica1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NAfrica1_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NAfrica1_buttonMouseExited(evt);
            }
        });
        NAfrica1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAfrica1_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(NAfrica1_button);
        NAfrica1_button.setBounds(550, 413, 100, 140);

        NAfrica_button.setContentAreaFilled(false);
        NAfrica_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NAfrica_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NAfrica_buttonMouseExited(evt);
            }
        });
        NAfrica_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAfrica_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(NAfrica_button);
        NAfrica_button.setBounds(643, 483, 70, 50);

        NorthAfrica_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NorthAfrica_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NorthAfrica_text.setText("North Africa");
        getContentPane().add(NorthAfrica_text);
        NorthAfrica_text.setBounds(550, 480, 140, 30);

        Egypt_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Egypt_button.setText("Egypt");
        Egypt_button.setContentAreaFilled(false);
        Egypt_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Egypt_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Egypt_buttonMouseExited(evt);
            }
        });
        Egypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Egypt_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Egypt_button);
        Egypt_button.setBounds(653, 423, 100, 50);

        Congo_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Congo_button.setText("Congo");
        Congo_button.setContentAreaFilled(false);
        Congo_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Congo_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Congo_buttonMouseExited(evt);
            }
        });
        Congo_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Congo_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Congo_button);
        Congo_button.setBounds(653, 553, 90, 50);

        EAfrica1_button.setContentAreaFilled(false);
        EAfrica1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EAfrica1_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EAfrica1_buttonMouseExited(evt);
            }
        });
        EAfrica1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAfrica1_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(EAfrica1_button);
        EAfrica1_button.setBounds(710, 480, 120, 70);

        EAfrica2_button.setContentAreaFilled(false);
        EAfrica2_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EAfrica2_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EAfrica2_buttonMouseExited(evt);
            }
        });
        EAfrica2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAfrica2_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(EAfrica2_button);
        EAfrica2_button.setBounds(760, 553, 60, 70);

        EastAfrica2_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EastAfrica2_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EastAfrica2_text.setText("Africa");
        getContentPane().add(EastAfrica2_text);
        EastAfrica2_text.setBounds(760, 540, 70, 30);

        EastAfrica1_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EastAfrica1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EastAfrica1_text.setText("East");
        getContentPane().add(EastAfrica1_text);
        EastAfrica1_text.setBounds(720, 520, 70, 20);

        SAfrica_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SAfrica_button.setText("South Africa");
        SAfrica_button.setContentAreaFilled(false);
        SAfrica_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SAfrica_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SAfrica_buttonMouseExited(evt);
            }
        });
        SAfrica_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAfrica_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(SAfrica_button);
        SAfrica_button.setBounds(660, 630, 120, 110);

        Madagascar_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Madagascar_button.setText("Madagascar");
        Madagascar_button.setContentAreaFilled(false);
        Madagascar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Madagascar_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Madagascar_buttonMouseExited(evt);
            }
        });
        Madagascar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Madagascar_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Madagascar_button);
        Madagascar_button.setBounds(790, 633, 120, 90);

        MiddleEast1_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MiddleEast1_button.setContentAreaFilled(false);
        MiddleEast1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiddleEast1_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MiddleEast1_buttonMouseExited(evt);
            }
        });
        MiddleEast1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleEast1_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(MiddleEast1_button);
        MiddleEast1_button.setBounds(700, 360, 170, 40);

        MiddleEast2_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MiddleEast2_button.setContentAreaFilled(false);
        MiddleEast2_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MiddleEast2_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MiddleEast2_buttonMouseExited(evt);
            }
        });
        MiddleEast2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleEast2_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(MiddleEast2_button);
        MiddleEast2_button.setBounds(760, 400, 120, 110);

        MiddleEast2_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MiddleEast2_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiddleEast2_text.setText("East");
        getContentPane().add(MiddleEast2_text);
        MiddleEast2_text.setBounds(760, 410, 70, 20);

        MiddleEast1_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MiddleEast1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MiddleEast1_text.setText("Middle");
        getContentPane().add(MiddleEast1_text);
        MiddleEast1_text.setBounds(770, 380, 90, 20);

        Afghanistan_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Afghanistan_button.setText("Afghanistan");
        Afghanistan_button.setContentAreaFilled(false);
        Afghanistan_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Afghanistan_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Afghanistan_buttonMouseExited(evt);
            }
        });
        Afghanistan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Afghanistan_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Afghanistan_button);
        Afghanistan_button.setBounds(800, 263, 130, 90);

        India_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        India_button.setText("India");
        India_button.setContentAreaFilled(false);
        India_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                India_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                India_buttonMouseExited(evt);
            }
        });
        India_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                India_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(India_button);
        India_button.setBounds(880, 380, 120, 90);

        Siam_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Siam_button.setText("Siam");
        Siam_button.setContentAreaFilled(false);
        Siam_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Siam_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Siam_buttonMouseExited(evt);
            }
        });
        Siam_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siam_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Siam_button);
        Siam_button.setBounds(1010, 410, 80, 80);

        China_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        China_button.setText("China");
        China_button.setContentAreaFilled(false);
        China_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                China_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                China_buttonMouseExited(evt);
            }
        });
        China_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                China_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(China_button);
        China_button.setBounds(950, 330, 160, 60);

        Mongalia_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Mongalia_button.setText("Mongalia");
        Mongalia_button.setContentAreaFilled(false);
        Mongalia_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Mongalia_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Mongalia_buttonMouseExited(evt);
            }
        });
        Mongalia_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mongalia_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Mongalia_button);
        Mongalia_button.setBounds(990, 260, 130, 60);

        Ural_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ural_button.setText("Ural");
        Ural_button.setContentAreaFilled(false);
        Ural_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ural_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ural_buttonMouseExited(evt);
            }
        });
        Ural_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ural_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Ural_button);
        Ural_button.setBounds(850, 150, 70, 110);

        Siberia_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Siberia_button.setText("Siberia");
        Siberia_button.setContentAreaFilled(false);
        Siberia_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Siberia_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Siberia_buttonMouseExited(evt);
            }
        });
        Siberia_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siberia_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Siberia_button);
        Siberia_button.setBounds(910, 70, 90, 150);

        Yakutsk_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Yakutsk_button.setText("Yakutsk");
        Yakutsk_button.setContentAreaFilled(false);
        Yakutsk_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Yakutsk_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Yakutsk_buttonMouseExited(evt);
            }
        });
        Yakutsk_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yakutsk_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Yakutsk_button);
        Yakutsk_button.setBounds(1013, 80, 90, 80);

        Kamchatka_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Kamchatka_button.setText("Kamchatka");
        Kamchatka_button.setContentAreaFilled(false);
        Kamchatka_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Kamchatka_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Kamchatka_buttonMouseExited(evt);
            }
        });
        Kamchatka_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kamchatka_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Kamchatka_button);
        Kamchatka_button.setBounds(1100, 100, 110, 90);

        Japan_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Japan_button.setText("Japan");
        Japan_button.setContentAreaFilled(false);
        Japan_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Japan_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Japan_buttonMouseExited(evt);
            }
        });
        Japan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Japan_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Japan_button);
        Japan_button.setBounds(1133, 223, 130, 120);

        Indonesia_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Indonesia_button.setText("Indonesia");
        Indonesia_button.setContentAreaFilled(false);
        Indonesia_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Indonesia_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Indonesia_buttonMouseExited(evt);
            }
        });
        Indonesia_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Indonesia_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Indonesia_button);
        Indonesia_button.setBounds(980, 523, 140, 90);

        Papua_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Papua_button.setText("Papua");
        Papua_button.setContentAreaFilled(false);
        Papua_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Papua_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Papua_buttonMouseExited(evt);
            }
        });
        Papua_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Papua_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Papua_button);
        Papua_button.setBounds(1120, 503, 100, 80);

        Irkutsk_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Irkutsk_button.setText("Irkutsk");
        Irkutsk_button.setContentAreaFilled(false);
        Irkutsk_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Irkutsk_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Irkutsk_buttonMouseExited(evt);
            }
        });
        Irkutsk_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Irkutsk_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Irkutsk_button);
        Irkutsk_button.setBounds(993, 183, 90, 60);

        WAustralia1_button.setContentAreaFilled(false);
        WAustralia1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WAustralia1_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WAustralia1_buttonMouseExited(evt);
            }
        });
        WAustralia1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WAustralia1_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(WAustralia1_button);
        WAustralia1_button.setBounds(1070, 630, 80, 100);

        WAustralia2_button.setContentAreaFilled(false);
        WAustralia2_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WAustralia2_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WAustralia2_buttonMouseExited(evt);
            }
        });
        WAustralia2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WAustralia2_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(WAustralia2_button);
        WAustralia2_button.setBounds(1143, 660, 50, 80);

        WesternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WesternAustralia2_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WesternAustralia2_text.setText("Australia");
        getContentPane().add(WesternAustralia2_text);
        WesternAustralia2_text.setBounds(1080, 680, 110, 20);

        WesternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WesternAustralia1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WesternAustralia1_text.setText("Western");
        getContentPane().add(WesternAustralia1_text);
        WesternAustralia1_text.setBounds(1070, 650, 80, 20);

        EAustralia2_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EAustralia2_button.setContentAreaFilled(false);
        EAustralia2_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EAustralia2_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EAustralia2_buttonMouseExited(evt);
            }
        });
        EAustralia2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAustralia2_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(EAustralia2_button);
        EAustralia2_button.setBounds(1200, 660, 70, 70);

        EAustralia1_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EAustralia1_button.setContentAreaFilled(false);
        EAustralia1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EAustralia1_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EAustralia1_buttonMouseExited(evt);
            }
        });
        EAustralia1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EAustralia1_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(EAustralia1_button);
        EAustralia1_button.setBounds(1150, 600, 120, 60);

        EasternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EasternAustralia2_text.setText("Australia");
        getContentPane().add(EasternAustralia2_text);
        EasternAustralia2_text.setBounds(1200, 660, 100, 30);

        EasternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EasternAustralia1_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EasternAustralia1_text.setText("Eastern");
        getContentPane().add(EasternAustralia1_text);
        EasternAustralia1_text.setBounds(1150, 630, 100, 30);

        turn_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        turn_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turn_text.setText("TurnCounter");
        turn_text.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(turn_text);
        turn_text.setBounds(10, 10, 160, 50);

        whoseTurn_text.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        whoseTurn_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whoseTurn_text.setText("whoseTurn_text");
        whoseTurn_text.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(whoseTurn_text);
        whoseTurn_text.setBounds(180, 10, 240, 50);

        quests_button.setBackground(new java.awt.Color(204, 204, 204));
        quests_button.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        quests_button.setForeground(new java.awt.Color(204, 204, 204));
        quests_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quests_button.setContentAreaFilled(false);
        quests_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quests_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(quests_button);
        quests_button.setBounds(10, 300, 110, 40);

        quests_text.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        quests_text.setForeground(new java.awt.Color(51, 51, 51));
        quests_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quests_text.setText("win?");
        quests_text.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(quests_text);
        quests_text.setBounds(10, 300, 110, 40);

        Back_button.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Back_button.setForeground(new java.awt.Color(204, 204, 204));
        Back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        Back_button.setText("SAVE");
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
        getContentPane().add(Back_button);
        Back_button.setBounds(1190, 10, 120, 70);

        map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newMapp.jpg"))); // NOI18N
        getContentPane().add(map);
        map.setBounds(0, 0, 1320, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NorthWest_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NorthWest_buttonActionPerformed
        soundOff();
        
        selectedLandID = 1;      
         
        if(Game.world[1].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();         
            
            s.setVisible(true);
            
            close();          
        }else if(Game.world[1].getOwnerID() == Game.turn_count%Game.player_count)
        {         
            UserSelections_jFrame s = new UserSelections_jFrame();
            
            s.setVisible(true);
            
            close();  
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_NorthWest_buttonActionPerformed

    private void Alberta_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alberta_buttonActionPerformed
        soundOff();

        selectedLandID = 2; 
      
        if(Game.world[2].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[2].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Alberta_buttonActionPerformed

    private void Greenland_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Greenland_buttonMouseEntered
        Greenland_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Greenland_buttonMouseEntered

    private void Greenland_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Greenland_buttonActionPerformed
        soundOff();

        selectedLandID = 5; 
      
        if(Game.world[5].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[5].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Greenland_buttonActionPerformed

    private void Greenland_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Greenland_buttonMouseExited
        Greenland_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Greenland_buttonMouseExited

    private void WUStates_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WUStates_buttonActionPerformed
        soundOff();

        selectedLandID = 6; 
      
        if(Game.world[6].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[6].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_WUStates_buttonActionPerformed

    private void Alaska_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alaska_buttonActionPerformed
        soundOff();

        selectedLandID = 0; 
      
        if(Game.world[0].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[0].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Alaska_buttonActionPerformed

    private void Ontario_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ontario_buttonActionPerformed
        soundOff();

        selectedLandID = 3; 
      
        if(Game.world[3].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[3].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Ontario_buttonActionPerformed

    private void Quebec_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Quebec_buttonActionPerformed
           soundOff();
           
        selectedLandID = 4;      
         
        if(Game.world[4].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();         
            
            s.setVisible(true);
            
            close();          
        }else if(Game.world[4].getOwnerID() == Game.turn_count%Game.player_count)
        {         
            UserSelections_jFrame s = new UserSelections_jFrame();
            
            s.setVisible(true);
            
            close();  
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Quebec_buttonActionPerformed

    private void Quebec_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quebec_buttonMouseEntered
        Quebec_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Quebec_buttonMouseEntered

    private void Quebec_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quebec_buttonMouseExited
        Quebec_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Quebec_buttonMouseExited

    private void Ontario_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ontario_buttonMouseEntered
        Ontario_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Ontario_buttonMouseEntered

    private void Ontario_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ontario_buttonMouseExited
        Ontario_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Ontario_buttonMouseExited

    private void NorthWest_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthWest_buttonMouseEntered
        NorthWest_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_NorthWest_buttonMouseEntered

    private void NorthWest_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NorthWest_buttonMouseExited
        NorthWest_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_NorthWest_buttonMouseExited

    private void Alberta_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alberta_buttonMouseEntered
        Alberta_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Alberta_buttonMouseEntered

    private void Alberta_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alberta_buttonMouseExited
        Alberta_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Alberta_buttonMouseExited

    private void Alaska_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alaska_buttonMouseEntered
        Alaska_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Alaska_buttonMouseEntered

    private void Alaska_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Alaska_buttonMouseExited
        Alaska_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Alaska_buttonMouseExited

    private void WUStates_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WUStates_buttonMouseEntered
        WUStates_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_WUStates_buttonMouseEntered

    private void WUStates_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WUStates_buttonMouseExited
        WUStates_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_WUStates_buttonMouseExited

    private void endTurn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTurn_buttonActionPerformed
        
        Game.turn_count++;
        if(Game.turn_count > Game.player_count-1)
        Game.players[Game.turn_count%Game.player_count].setTroops(3);

        MainMenu_jFrame.newGame.setStatistics();
        MainMenu_jFrame.newGame.setTurnCount();
        
        setStatistics(); 
        setTurnCount();
        
        if((Game.turn_count % 4) == 0){
            soundOff();
            epidemicSoundOff();
            map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snoww.gif"))); 
            winterSoundOn();
            Game.players[Game.turn_count%Game.player_count].setTroops(-1);
        }else{
            winterSoundOff();
            soundOnn();
            
            int a = (int)(5.0*Math.random()) + 1;
            if(a == 3){
                soundOff();
                map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/epidemiccc.gif")));
                epidemicSoundOn();
                Game.players[Game.turn_count%Game.player_count].setTroops(-3);
            }else{
                map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newMapp.jpg")));
                epidemicSoundOff();
            }       
        }
        
        if(Game.players[Game.turn_count%Game.player_count].getArrayList().isEmpty()) {
            // win screen
        }

        
    }//GEN-LAST:event_endTurn_buttonActionPerformed

    private void CentralAmerica_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CentralAmerica_buttonActionPerformed
        soundOff();

        selectedLandID = 8; 
      
        if(Game.world[8].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[8].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_CentralAmerica_buttonActionPerformed

    private void easternUStates_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easternUStates_buttonActionPerformed
        soundOff();

        selectedLandID = 7; 
      
        if(Game.world[7].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[7].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_easternUStates_buttonActionPerformed

    private void easternUStates_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easternUStates_buttonMouseEntered
        easternUStates_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_easternUStates_buttonMouseEntered

    private void easternUStates_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easternUStates_buttonMouseExited
        easternUStates_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_easternUStates_buttonMouseExited

    private void CentralAmerica_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CentralAmerica_buttonMouseEntered
        CentralAmerica_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_CentralAmerica_buttonMouseEntered

    private void CentralAmerica_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CentralAmerica_buttonMouseExited
        CentralAmerica_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_CentralAmerica_buttonMouseExited

    private void Venezuela_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Venezuela_buttonActionPerformed
        soundOff();

        selectedLandID = 9; 
      
        if(Game.world[9].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[9].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Venezuela_buttonActionPerformed

    private void Venezuela_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Venezuela_buttonMouseEntered
        Venezuela_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Venezuela_buttonMouseEntered

    private void Venezuela_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Venezuela_buttonMouseExited
        Venezuela_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Venezuela_buttonMouseExited

    private void Peru_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Peru_buttonActionPerformed
        soundOff();

        selectedLandID = 10; 
      
        if(Game.world[10].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[10].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Peru_buttonActionPerformed

    private void Peru_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peru_buttonMouseEntered
        Peru_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Peru_buttonMouseEntered

    private void Peru_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peru_buttonMouseExited
        Peru_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Peru_buttonMouseExited

    private void Brazil_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brazil_buttonActionPerformed
        soundOff();

        selectedLandID = 11; 
      
        if(Game.world[11].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[11].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Brazil_buttonActionPerformed

    private void Brazil_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Brazil_buttonMouseEntered
        Brazil_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Brazil_buttonMouseEntered

    private void Brazil_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Brazil_buttonMouseExited
        Brazil_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Brazil_buttonMouseExited

    private void Argentina_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Argentina_buttonActionPerformed
        soundOff();

        selectedLandID = 12; 
      
        if(Game.world[12].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[12].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Argentina_buttonActionPerformed

    private void Argentina_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Argentina_buttonMouseEntered
        Argentina_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Argentina_buttonMouseEntered

    private void Argentina_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Argentina_buttonMouseExited
        Argentina_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Argentina_buttonMouseExited

    private void OBG_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBG_buttonActionPerformed
        soundOff();

        selectedLandID = 42; 
      
        if(Game.world[42].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[42].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_OBG_buttonActionPerformed

    private void OBG_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OBG_buttonMouseEntered
        Oldies_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        but_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        Goldies_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_OBG_buttonMouseEntered

    private void OBG_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OBG_buttonMouseExited
        Oldies_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        but_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        Goldies_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_OBG_buttonMouseExited

    private void Britain_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Britain_buttonActionPerformed
        soundOff();

        selectedLandID = 19; 
      
        if(Game.world[19].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[19].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Britain_buttonActionPerformed

    private void Britain_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Britain_buttonMouseEntered
        Britain_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Britain_buttonMouseEntered

    private void Britain_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Britain_buttonMouseExited
        Britain_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Britain_buttonMouseExited

    private void Iceland_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iceland_buttonActionPerformed
        soundOff();

        selectedLandID = 13; 
      
        if(Game.world[13].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[13].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Iceland_buttonActionPerformed

    private void Iceland_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iceland_buttonMouseEntered
        Iceland_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Iceland_buttonMouseEntered

    private void Iceland_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iceland_buttonMouseExited
        Iceland_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Iceland_buttonMouseExited

    private void Scandinavia_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Scandinavia_buttonActionPerformed
        soundOff();

        selectedLandID = 14; 
      
        if(Game.world[14].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[14].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Scandinavia_buttonActionPerformed

    private void Scandinavia_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Scandinavia_buttonMouseEntered
        Scandinavia_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Scandinavia_buttonMouseEntered

    private void Scandinavia_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Scandinavia_buttonMouseExited
        Scandinavia_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Scandinavia_buttonMouseExited

    private void Ukraine1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ukraine1_buttonActionPerformed
        soundOff();

        selectedLandID = 15; 
      
        if(Game.world[15].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[15].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Ukraine1_buttonActionPerformed

    private void Ukraine2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ukraine2_buttonActionPerformed
        soundOff();

        selectedLandID = 15; 
      
        if(Game.world[15].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[15].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Ukraine2_buttonActionPerformed

    private void Ukraine1_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ukraine1_buttonMouseEntered
        Ukraine_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Ukraine1_buttonMouseEntered

    private void Ukraine2_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ukraine2_buttonMouseEntered
        Ukraine_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Ukraine2_buttonMouseEntered

    private void Ukraine1_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ukraine1_buttonMouseExited
        Ukraine_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Ukraine1_buttonMouseExited

    private void Ukraine2_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ukraine2_buttonMouseExited
        Ukraine_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Ukraine2_buttonMouseExited

    private void NEurope_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEurope_buttonActionPerformed
        soundOff();

        selectedLandID = 16; 
      
        if(Game.world[16].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[16].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_NEurope_buttonActionPerformed

    private void NEurope_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEurope_buttonMouseEntered
        NorthernEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        NorthernEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_NEurope_buttonMouseEntered

    private void NEurope_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEurope_buttonMouseExited
        NorthernEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        NorthernEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_NEurope_buttonMouseExited

    private void SEurope_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEurope_buttonActionPerformed
        soundOff();

        selectedLandID = 17; 
      
        if(Game.world[17].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[17].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_SEurope_buttonActionPerformed

    private void SEurope_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEurope_buttonMouseEntered
        SouthernEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        SouthernEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_SEurope_buttonMouseEntered

    private void SEurope_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SEurope_buttonMouseExited
        SouthernEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        SouthernEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_SEurope_buttonMouseExited

    private void WEurope_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WEurope_buttonActionPerformed
        soundOff();

        selectedLandID = 18; 
      
        if(Game.world[18].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[18].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_WEurope_buttonActionPerformed

    private void WEurope_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WEurope_buttonMouseEntered
        WesternEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        WesternEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_WEurope_buttonMouseEntered

    private void WEurope_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WEurope_buttonMouseExited
        WesternEurope1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        WesternEurope2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_WEurope_buttonMouseExited

    private void Irkutsk_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Irkutsk_buttonActionPerformed
        soundOff();

        selectedLandID = 30; 
      
        if(Game.world[30].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[30].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Irkutsk_buttonActionPerformed

    private void NAfrica1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAfrica1_buttonActionPerformed
        soundOff();

        selectedLandID = 20; 
      
        if(Game.world[20].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[20].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_NAfrica1_buttonActionPerformed

    private void NAfrica_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAfrica_buttonActionPerformed
        soundOff();

        selectedLandID = 20; 
      
        if(Game.world[20].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[20].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_NAfrica_buttonActionPerformed

    private void NAfrica1_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAfrica1_buttonMouseEntered
        NorthAfrica_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_NAfrica1_buttonMouseEntered

    private void NAfrica_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAfrica_buttonMouseEntered
        NorthAfrica_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_NAfrica_buttonMouseEntered

    private void NAfrica1_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAfrica1_buttonMouseExited
        NorthAfrica_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_NAfrica1_buttonMouseExited

    private void NAfrica_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAfrica_buttonMouseExited
        NorthAfrica_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_NAfrica_buttonMouseExited

    private void Egypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Egypt_buttonActionPerformed
        soundOff();

        selectedLandID = 21; 
      
        if(Game.world[21].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[21].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Egypt_buttonActionPerformed

    private void Egypt_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egypt_buttonMouseEntered
        Egypt_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Egypt_buttonMouseEntered

    private void EAfrica1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAfrica1_buttonActionPerformed
        soundOff();

        selectedLandID = 23; 
      
        if(Game.world[23].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[23].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_EAfrica1_buttonActionPerformed

    private void EAfrica2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAfrica2_buttonActionPerformed
        soundOff();

        selectedLandID = 23; 
      
        if(Game.world[23].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[23].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_EAfrica2_buttonActionPerformed

    private void EAfrica1_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAfrica1_buttonMouseEntered
        EastAfrica1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        EastAfrica2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_EAfrica1_buttonMouseEntered

    private void EAfrica1_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAfrica1_buttonMouseExited
        EastAfrica1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        EastAfrica2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_EAfrica1_buttonMouseExited

    private void EAfrica2_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAfrica2_buttonMouseEntered
        EastAfrica1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        EastAfrica2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_EAfrica2_buttonMouseEntered

    private void EAfrica2_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAfrica2_buttonMouseExited
        EastAfrica1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        EastAfrica2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_EAfrica2_buttonMouseExited

    private void Congo_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Congo_buttonActionPerformed
        soundOff();

        selectedLandID = 22; 
      
        if(Game.world[22].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[22].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Congo_buttonActionPerformed

    private void Congo_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Congo_buttonMouseEntered
        Congo_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Congo_buttonMouseEntered

    private void Congo_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Congo_buttonMouseExited
        Congo_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Congo_buttonMouseExited

    private void SAfrica_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAfrica_buttonActionPerformed
        soundOff();

        selectedLandID = 24; 
      
        if(Game.world[24].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[24].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_SAfrica_buttonActionPerformed

    private void SAfrica_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAfrica_buttonMouseEntered
        SAfrica_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_SAfrica_buttonMouseEntered

    private void SAfrica_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAfrica_buttonMouseExited
        SAfrica_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_SAfrica_buttonMouseExited

    private void Madagascar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Madagascar_buttonActionPerformed
        soundOff();

        selectedLandID = 25; 
      
        if(Game.world[25].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[25].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Madagascar_buttonActionPerformed

    private void Madagascar_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Madagascar_buttonMouseEntered
        Madagascar_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Madagascar_buttonMouseEntered

    private void Madagascar_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Madagascar_buttonMouseExited
        Madagascar_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Madagascar_buttonMouseExited

    private void MiddleEast1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleEast1_buttonActionPerformed
        soundOff();

        selectedLandID = 35; 
      
        if(Game.world[35].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[35].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_MiddleEast1_buttonActionPerformed

    private void MiddleEast2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleEast2_buttonActionPerformed
        soundOff();

        selectedLandID = 35; 
      
        if(Game.world[35].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[35].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_MiddleEast2_buttonActionPerformed

    private void MiddleEast1_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiddleEast1_buttonMouseEntered
        MiddleEast1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        MiddleEast2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_MiddleEast1_buttonMouseEntered

    private void MiddleEast1_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiddleEast1_buttonMouseExited
        MiddleEast1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        MiddleEast2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_MiddleEast1_buttonMouseExited

    private void MiddleEast2_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiddleEast2_buttonMouseEntered
        MiddleEast1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        MiddleEast2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_MiddleEast2_buttonMouseEntered

    private void MiddleEast2_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiddleEast2_buttonMouseExited
        MiddleEast1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        MiddleEast2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_MiddleEast2_buttonMouseExited

    private void Afghanistan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Afghanistan_buttonActionPerformed
        soundOff();

        selectedLandID = 33; 
      
        if(Game.world[33].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[33].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Afghanistan_buttonActionPerformed

    private void Afghanistan_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Afghanistan_buttonMouseEntered
        Afghanistan_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Afghanistan_buttonMouseEntered

    private void Afghanistan_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Afghanistan_buttonMouseExited
        Afghanistan_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Afghanistan_buttonMouseExited

    private void India_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_India_buttonActionPerformed
        soundOff();

        selectedLandID = 36; 
      
        if(Game.world[36].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[36].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_India_buttonActionPerformed

    private void India_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_India_buttonMouseEntered
        India_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_India_buttonMouseEntered

    private void India_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_India_buttonMouseExited
        India_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_India_buttonMouseExited

    private void Siam_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siam_buttonActionPerformed
        soundOff();

        selectedLandID = 37; 
      
        if(Game.world[37].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[37].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Siam_buttonActionPerformed

    private void Siam_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Siam_buttonMouseEntered
        Siam_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Siam_buttonMouseEntered

    private void Siam_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Siam_buttonMouseExited
        Siam_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Siam_buttonMouseExited

    private void China_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_China_buttonActionPerformed
        soundOff();

        selectedLandID = 34; 
      
        if(Game.world[34].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[34].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_China_buttonActionPerformed

    private void China_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_China_buttonMouseEntered
        China_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_China_buttonMouseEntered

    private void China_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_China_buttonMouseExited
        China_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_China_buttonMouseExited

    private void Mongalia_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mongalia_buttonActionPerformed
        soundOff();

        selectedLandID = 31; 
      
        if(Game.world[31].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[31].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Mongalia_buttonActionPerformed

    private void Mongalia_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mongalia_buttonMouseEntered
        Mongalia_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Mongalia_buttonMouseEntered

    private void Mongalia_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mongalia_buttonMouseExited
        Mongalia_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Mongalia_buttonMouseExited

    private void Ural_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ural_buttonActionPerformed
        soundOff();

        selectedLandID = 26; 
      
        if(Game.world[26].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[26].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Ural_buttonActionPerformed

    private void Ural_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ural_buttonMouseEntered
        Ural_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Ural_buttonMouseEntered

    private void Ural_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ural_buttonMouseExited
        Ural_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Ural_buttonMouseExited

    private void Japan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Japan_buttonActionPerformed
        soundOff();

        selectedLandID = 32; 
      
        if(Game.world[32].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[32].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Japan_buttonActionPerformed

    private void Japan_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Japan_buttonMouseEntered
        Japan_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Japan_buttonMouseEntered

    private void Japan_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Japan_buttonMouseExited
        Japan_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Japan_buttonMouseExited

    private void Siberia_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siberia_buttonActionPerformed
        soundOff();

        selectedLandID = 27; 
      
        if(Game.world[27].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[27].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Siberia_buttonActionPerformed

    private void Siberia_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Siberia_buttonMouseEntered
        Siberia_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Siberia_buttonMouseEntered

    private void Siberia_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Siberia_buttonMouseExited
        Siberia_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Siberia_buttonMouseExited

    private void Irkutsk_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Irkutsk_buttonMouseExited
        Irkutsk_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Irkutsk_buttonMouseExited

    private void Irkutsk_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Irkutsk_buttonMouseEntered
        Irkutsk_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Irkutsk_buttonMouseEntered

    private void Yakutsk_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yakutsk_buttonActionPerformed
        soundOff();

        selectedLandID = 28; 
      
        if(Game.world[28].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[28].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Yakutsk_buttonActionPerformed

    private void Yakutsk_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Yakutsk_buttonMouseEntered
        Yakutsk_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Yakutsk_buttonMouseEntered

    private void Yakutsk_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Yakutsk_buttonMouseExited
        Yakutsk_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Yakutsk_buttonMouseExited

    private void Kamchatka_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kamchatka_buttonActionPerformed
        soundOff();

        selectedLandID = 29; 
      
        if(Game.world[29].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[29].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Kamchatka_buttonActionPerformed

    private void Kamchatka_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kamchatka_buttonMouseEntered
        Kamchatka_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Kamchatka_buttonMouseEntered

    private void Kamchatka_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kamchatka_buttonMouseExited
        Kamchatka_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Kamchatka_buttonMouseExited

    private void Indonesia_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Indonesia_buttonActionPerformed
        soundOff();

        selectedLandID = 38; 
      
        if(Game.world[38].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[38].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Indonesia_buttonActionPerformed

    private void Indonesia_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Indonesia_buttonMouseEntered
        Indonesia_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Indonesia_buttonMouseEntered

    private void Indonesia_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Indonesia_buttonMouseExited
        Indonesia_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Indonesia_buttonMouseExited

    private void Papua_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Papua_buttonActionPerformed
        soundOff();

        selectedLandID = 39; 
      
        if(Game.world[39].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[39].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_Papua_buttonActionPerformed

    private void Papua_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Papua_buttonMouseEntered
        Papua_button.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_Papua_buttonMouseEntered

    private void Papua_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Papua_buttonMouseExited
        Papua_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Papua_buttonMouseExited

    private void WAustralia1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WAustralia1_buttonActionPerformed
        soundOff();

        selectedLandID = 40; 
      
        if(Game.world[40].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[40].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_WAustralia1_buttonActionPerformed

    private void WAustralia2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WAustralia2_buttonActionPerformed
        soundOff();

        selectedLandID = 40; 
      
        if(Game.world[40].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[40].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_WAustralia2_buttonActionPerformed

    private void WAustralia1_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WAustralia1_buttonMouseEntered
        WesternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        WesternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_WAustralia1_buttonMouseEntered

    private void WAustralia1_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WAustralia1_buttonMouseExited
        WesternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        WesternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_WAustralia1_buttonMouseExited

    private void WAustralia2_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WAustralia2_buttonMouseEntered
        WesternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        WesternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_WAustralia2_buttonMouseEntered

    private void WAustralia2_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WAustralia2_buttonMouseExited
        WesternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        WesternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_WAustralia2_buttonMouseExited

    private void EAustralia1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAustralia1_buttonActionPerformed
        soundOff();

        selectedLandID = 41; 
      
        if(Game.world[41].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[41].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_EAustralia1_buttonActionPerformed

    private void EAustralia2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EAustralia2_buttonActionPerformed
        soundOff();

        selectedLandID = 41; 
      
        if(Game.world[41].getTroopsOnLand() == 0)
        {
            booleanArr[0] = true;
            booleanArr[1] = false;
            booleanArr[2] = false;
            
            UserSelections_jFrame s = new UserSelections_jFrame();
                                      
            s.setVisible(true);
            
            close();
            
        }else if(Game.world[41].getOwnerID() == Game.turn_count%Game.player_count)
        {
            booleanArr[0] = true;   booleanArr[1] = true;   booleanArr[2] = true;
            UserSelections_jFrame s = new UserSelections_jFrame();
            s.setVisible(true);
            close();         
            //attack
            //move
            //recruit
        }
        
        UserSelections_jFrame.setTroopsText(NewGame_jFrame.selectedLandID);
        UserSelections_jFrame.setOwnerId(NewGame_jFrame.selectedLandID);
    }//GEN-LAST:event_EAustralia2_buttonActionPerformed

    private void EAustralia1_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAustralia1_buttonMouseEntered
        EasternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        EasternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_EAustralia1_buttonMouseEntered

    private void EAustralia2_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAustralia2_buttonMouseEntered
        EasternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 14));
        EasternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 14));
    }//GEN-LAST:event_EAustralia2_buttonMouseEntered

    private void EAustralia1_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAustralia1_buttonMouseExited
        EasternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        EasternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_EAustralia1_buttonMouseExited

    private void EAustralia2_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EAustralia2_buttonMouseExited
        EasternAustralia1_text.setFont(new java.awt.Font("Tahoma", 1, 11));
        EasternAustralia2_text.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_EAustralia2_buttonMouseExited

    private void Egypt_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Egypt_buttonMouseExited
        Egypt_button.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_Egypt_buttonMouseExited

    private void quests_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quests_buttonActionPerformed
        soundOff();
        
        s.Quest1_text.setText(Game.players[Game.turn_count%Game.player_count].getQuest(0).getContent());
        s.Quest2_text.setText(Game.players[Game.turn_count%Game.player_count].getQuest(1).getContent());
        s.Quest3_text.setText(Game.players[Game.turn_count%Game.player_count].getQuest(2).getContent());
        s.Quest4_text.setText(Game.players[Game.turn_count%Game.player_count].getQuest(3).getContent());
        
        if(Game.menu1.questCheck(Game.players[Game.turn_count%Game.player_count].getQuest(0), Game.players, Game.world, Game.player_count))
            s.quest1_complete_button.setEnabled(true);
        
        if(Game.menu1.questCheck(Game.players[Game.turn_count%Game.player_count].getQuest(1), Game.players, Game.world, Game.player_count))
            s.quest2_complete_button.setEnabled(true);
        
        if(Game.menu1.questCheck(Game.players[Game.turn_count%Game.player_count].getQuest(2), Game.players, Game.world, Game.player_count))
            s.quest3_complete_button.setEnabled(true);
        
        if(Game.menu1.questCheck(Game.players[Game.turn_count%Game.player_count].getQuest(3), Game.players, Game.world, Game.player_count))
            s.quest4_complete_button.setEnabled(true);
        
        if(s.quest1_complete_button.isEnabled() && s.quest2_complete_button.isEnabled() && s.quest3_complete_button.isEnabled() && s.quest4_complete_button.isEnabled())
        {
            FinishScreen_jFrame f = new FinishScreen_jFrame();
            f.setVisible(true);
            close();
        }
        
        s.setVisible(true);
        close();
    }//GEN-LAST:event_quests_buttonActionPerformed

    private void Back_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_buttonMouseEntered
        Back_button.setFont(new java.awt.Font("Stencil", 0, 18));
    }//GEN-LAST:event_Back_buttonMouseEntered

    private void Back_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_buttonMouseExited
        Back_button.setFont(new java.awt.Font("Stencil", 0, 14));
    }//GEN-LAST:event_Back_buttonMouseExited

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Back_buttonActionPerformed
 
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
            java.util.logging.Logger.getLogger(NewGame_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGame_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGame_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGame_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGame_jFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Afghanistan_button;
    public static javax.swing.JButton Alaska_button;
    public static javax.swing.JButton Alberta_button;
    public static javax.swing.JButton Argentina_button;
    private javax.swing.JButton Back_button;
    public static javax.swing.JButton Brazil_button;
    public static javax.swing.JButton Britain_button;
    public static javax.swing.JButton CentralAmerica_button;
    public static javax.swing.JButton China_button;
    public static javax.swing.JButton Congo_button;
    public static javax.swing.JButton EAfrica1_button;
    public static javax.swing.JButton EAfrica2_button;
    public static javax.swing.JButton EAustralia1_button;
    public static javax.swing.JButton EAustralia2_button;
    public static javax.swing.JLabel EastAfrica1_text;
    public static javax.swing.JLabel EastAfrica2_text;
    public static javax.swing.JLabel EasternAustralia1_text;
    public static javax.swing.JLabel EasternAustralia2_text;
    public static javax.swing.JButton Egypt_button;
    public static javax.swing.JLabel Goldies_text;
    public static javax.swing.JButton Greenland_button;
    public static javax.swing.JButton Iceland_button;
    public static javax.swing.JButton India_button;
    public static javax.swing.JButton Indonesia_button;
    public static javax.swing.JButton Irkutsk_button;
    public static javax.swing.JButton Japan_button;
    public static javax.swing.JButton Kamchatka_button;
    public static javax.swing.JButton Madagascar_button;
    public static javax.swing.JButton MiddleEast1_button;
    public static javax.swing.JLabel MiddleEast1_text;
    public static javax.swing.JButton MiddleEast2_button;
    public static javax.swing.JLabel MiddleEast2_text;
    public static javax.swing.JButton Mongalia_button;
    public static javax.swing.JButton NAfrica1_button;
    public static javax.swing.JButton NAfrica_button;
    public static javax.swing.JButton NEurope_button;
    public static javax.swing.JLabel NorthAfrica_text;
    public static javax.swing.JButton NorthWest_button;
    public static javax.swing.JLabel NorthernEurope1_text;
    public static javax.swing.JLabel NorthernEurope2_text;
    public static javax.swing.JButton OBG_button;
    public static javax.swing.JLabel Oldies_text;
    public static javax.swing.JButton Ontario_button;
    public static javax.swing.JButton Papua_button;
    public static javax.swing.JButton Peru_button;
    public static javax.swing.JLabel Player1;
    public static javax.swing.JLabel Player2;
    public static javax.swing.JLabel Player3;
    public static javax.swing.JLabel Player4;
    public static javax.swing.JLabel Player5;
    public static javax.swing.JLabel Player6;
    public static javax.swing.JButton Quebec_button;
    public static javax.swing.JButton SAfrica_button;
    public static javax.swing.JButton SEurope_button;
    public static javax.swing.JButton Scandinavia_button;
    public static javax.swing.JButton Siam_button;
    public static javax.swing.JButton Siberia_button;
    public static javax.swing.JLabel SouthernEurope1_text;
    public static javax.swing.JLabel SouthernEurope2_text;
    public static javax.swing.JLabel Troops1;
    public static javax.swing.JLabel Troops2;
    public static javax.swing.JLabel Troops3;
    public static javax.swing.JLabel Troops4;
    public static javax.swing.JLabel Troops5;
    public static javax.swing.JLabel Troops6;
    private javax.swing.JLabel Troops_text;
    public static javax.swing.JButton Ukraine1_button;
    private javax.swing.JButton Ukraine2_button;
    public static javax.swing.JLabel Ukraine_text;
    public static javax.swing.JButton Ural_button;
    public static javax.swing.JButton Venezuela_button;
    public static javax.swing.JButton WAustralia1_button;
    public static javax.swing.JButton WAustralia2_button;
    public static javax.swing.JButton WEurope_button;
    public static javax.swing.JButton WUStates_button;
    public static javax.swing.JLabel WesternAustralia1_text;
    public static javax.swing.JLabel WesternAustralia2_text;
    public static javax.swing.JLabel WesternEurope1_text;
    public static javax.swing.JLabel WesternEurope2_text;
    public static javax.swing.JButton Yakutsk_button;
    public static javax.swing.JLabel but_text;
    public static javax.swing.JButton easternUStates_button;
    private javax.swing.JLabel endTurnText;
    private javax.swing.JButton endTurn_button;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel map;
    private javax.swing.JLabel playerID_text;
    private javax.swing.JButton quests_button;
    private javax.swing.JLabel quests_text;
    public static javax.swing.JLabel turn_text;
    public static javax.swing.JLabel whoseTurn_text;
    // End of variables declaration//GEN-END:variables
}
