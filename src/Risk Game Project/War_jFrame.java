
import company.Game;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yerel Kullanıcı
 */
public class War_jFrame extends javax.swing.JFrame {

    /**
     * Creates new form War_jFrame
     */
    public War_jFrame() {
        initComponents();

        setBounds(260, 100, 1322, 800);
        
        setResizable(false);

    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public static void updateAll()
    {
        if(MainMenu_jFrame.newGame.selectedLandID == 0)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Alaska_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Alaska_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Alaska_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Alaska_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Alaska_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Alaska_button.setForeground(new java.awt.Color(51, 102, 155));
        }else if(MainMenu_jFrame.newGame.selectedLandID == 1)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.NorthWest_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.NorthWest_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.NorthWest_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.NorthWest_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.NorthWest_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.NorthWest_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 2)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Alberta_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Alberta_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Alberta_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Alberta_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Alberta_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Alberta_button.setForeground(new java.awt.Color(51, 102, 155));
        }else if(MainMenu_jFrame.newGame.selectedLandID == 3)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Ontario_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Ontario_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Ontario_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Ontario_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Ontario_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Ontario_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 4)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Quebec_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Quebec_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Quebec_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Quebec_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Quebec_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Quebec_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 5)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Greenland_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Greenland_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Greenland_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Greenland_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Greenland_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Greenland_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 6)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.WUStates_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.WUStates_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.WUStates_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.WUStates_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.WUStates_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.WUStates_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 7)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.easternUStates_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.easternUStates_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.easternUStates_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.easternUStates_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.easternUStates_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.easternUStates_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 8)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.CentralAmerica_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.CentralAmerica_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.CentralAmerica_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.CentralAmerica_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.CentralAmerica_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.CentralAmerica_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 9)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Venezuela_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Venezuela_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Venezuela_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Venezuela_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Venezuela_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Venezuela_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 10)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Peru_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Peru_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Peru_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Peru_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Peru_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Peru_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 11)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Brazil_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Brazil_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Brazil_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Brazil_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Brazil_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Brazil_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 12)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Argentina_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Argentina_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Argentina_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Argentina_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Argentina_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Argentina_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 13)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Iceland_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Iceland_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Iceland_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Iceland_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Iceland_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Iceland_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 14)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Scandinavia_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Scandinavia_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Scandinavia_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Scandinavia_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Scandinavia_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Scandinavia_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 15)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Ukraine_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Ukraine_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Ukraine_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Ukraine_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Ukraine_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Ukraine_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 16)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.NorthernEurope1_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.NorthernEurope1_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.NorthernEurope1_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.NorthernEurope1_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.NorthernEurope1_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.NorthernEurope1_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.NorthernEurope2_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.NorthernEurope2_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.NorthernEurope2_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.NorthernEurope2_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.NorthernEurope2_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.NorthernEurope2_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 17)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.SouthernEurope1_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.SouthernEurope1_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.SouthernEurope1_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.SouthernEurope1_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.SouthernEurope1_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.SouthernEurope1_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.SouthernEurope2_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.SouthernEurope2_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.SouthernEurope2_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.SouthernEurope2_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.SouthernEurope2_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.SouthernEurope2_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 18)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.WesternEurope1_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.WesternEurope1_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.WesternEurope1_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.WesternEurope1_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.WesternEurope1_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.WesternEurope1_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.WesternEurope2_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.WesternEurope2_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.WesternEurope2_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.WesternEurope2_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.WesternEurope2_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.WesternEurope2_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 19)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Britain_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Britain_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Britain_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Britain_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Britain_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Britain_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 20)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.NorthAfrica_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.NorthAfrica_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.NorthAfrica_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.NorthAfrica_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.NorthAfrica_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.NorthAfrica_text.setForeground(new java.awt.Color(51, 102, 155));
            
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 21)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Egypt_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Egypt_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Egypt_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Egypt_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Egypt_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Egypt_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 22)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Congo_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Congo_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Congo_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Congo_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Congo_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Congo_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 23)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.EastAfrica1_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.EastAfrica1_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.EastAfrica1_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.EastAfrica1_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.EastAfrica1_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.EastAfrica1_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.EastAfrica2_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.EastAfrica2_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.EastAfrica2_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.EastAfrica2_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.EastAfrica2_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.EastAfrica2_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 24)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.SAfrica_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.SAfrica_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.SAfrica_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.SAfrica_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.SAfrica_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.SAfrica_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 25)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Madagascar_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Madagascar_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Madagascar_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Madagascar_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Madagascar_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Madagascar_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 26)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Ural_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Ural_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Ural_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Ural_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Ural_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Ural_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 27)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Siberia_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Siberia_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Siberia_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Siberia_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Siberia_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Siberia_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 28)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Yakutsk_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Yakutsk_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Yakutsk_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Yakutsk_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Yakutsk_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Yakutsk_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 29)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Kamchatka_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Kamchatka_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Kamchatka_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Kamchatka_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Kamchatka_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Kamchatka_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 30)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Irkutsk_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Irkutsk_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Irkutsk_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Irkutsk_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Irkutsk_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Irkutsk_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 31)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Mongalia_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Mongalia_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Mongalia_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Mongalia_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Mongalia_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Mongalia_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 32)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Japan_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Japan_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Japan_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Japan_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Japan_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Japan_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 33)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Afghanistan_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Afghanistan_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Afghanistan_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Afghanistan_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Afghanistan_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Afghanistan_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 34)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.China_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.China_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.China_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.China_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.China_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.China_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 35)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.MiddleEast1_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.MiddleEast1_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.MiddleEast1_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.MiddleEast1_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.MiddleEast1_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.MiddleEast1_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.MiddleEast2_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.MiddleEast2_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.MiddleEast2_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.MiddleEast2_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.MiddleEast2_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.MiddleEast2_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 36)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.India_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.India_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.India_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.India_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.India_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.India_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 37)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Siam_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Siam_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Siam_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Siam_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Siam_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Siam_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 38)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Indonesia_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Indonesia_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Indonesia_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Indonesia_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Indonesia_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Indonesia_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 39)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Papua_button.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Papua_button.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Papua_button.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Papua_button.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Papua_button.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Papua_button.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 40)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.WesternAustralia1_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.WesternAustralia1_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.WesternAustralia1_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.WesternAustralia1_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.WesternAustralia1_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.WesternAustralia1_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.WesternAustralia2_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.WesternAustralia2_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.WesternAustralia2_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.WesternAustralia2_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.WesternAustralia2_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.WesternAustralia2_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 41)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.EasternAustralia1_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.EasternAustralia1_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.EasternAustralia1_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.EasternAustralia1_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.EasternAustralia1_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.EasternAustralia1_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.EasternAustralia2_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.EasternAustralia2_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.EasternAustralia2_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.EasternAustralia2_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.EasternAustralia2_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.EasternAustralia2_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        else if(MainMenu_jFrame.newGame.selectedLandID == 42)
        {
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Oldies_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Oldies_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Oldies_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Oldies_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Oldies_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Oldies_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.but_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.but_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.but_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.but_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.but_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.but_text.setForeground(new java.awt.Color(51, 102, 155));
            
            if(Game.players[Game.turn_count%Game.player_count].getColourID() == 0)
                MainMenu_jFrame.newGame.Goldies_text.setForeground(new java.awt.Color(153, 0, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 1)
                MainMenu_jFrame.newGame.Goldies_text.setForeground(new java.awt.Color(0, 102, 51));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 3)                
                MainMenu_jFrame.newGame.Goldies_text.setForeground(new java.awt.Color(0, 51, 102));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 2)
                MainMenu_jFrame.newGame.Goldies_text.setForeground(new java.awt.Color(0, 153, 153));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 4)
                MainMenu_jFrame.newGame.Goldies_text.setForeground(new java.awt.Color(153, 153, 0));
            else if(Game.players[Game.turn_count%Game.player_count].getColourID() == 5)
                MainMenu_jFrame.newGame.Goldies_text.setForeground(new java.awt.Color(51, 102, 155));
        }
        
        MainMenu_jFrame.newGame.setStatistics();
        MainMenu_jFrame.newGame.setTurnCount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        defenderTroops = new javax.swing.JLabel();
        attackerTroops = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        defenderInfo = new javax.swing.JLabel();
        attackerInfo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dateCorner_label = new javax.swing.JLabel();
        WarResult_text = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        date_menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("NUMBER OF SOLDIERS");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(670, 550, 150, 30);

        defenderTroops.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        defenderTroops.setForeground(new java.awt.Color(204, 204, 204));
        defenderTroops.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defenderTroops.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(defenderTroops);
        defenderTroops.setBounds(690, 580, 110, 150);

        attackerTroops.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        attackerTroops.setForeground(new java.awt.Color(204, 204, 204));
        attackerTroops.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attackerTroops.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(attackerTroops);
        attackerTroops.setBounds(690, 190, 110, 130);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("NUMBER OF SOLDIERS");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(670, 160, 150, 30);

        defenderInfo.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        defenderInfo.setForeground(new java.awt.Color(255, 255, 255));
        defenderInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        defenderInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Defender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(defenderInfo);
        defenderInfo.setBounds(130, 440, 350, 70);

        attackerInfo.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        attackerInfo.setForeground(new java.awt.Color(255, 255, 255));
        attackerInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attackerInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attacker", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(attackerInfo);
        attackerInfo.setBounds(130, 370, 350, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defenderr.jpg"))); // NOI18N
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 540, 490, 200);

        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(650, 540, 190, 200);

        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 150, 190, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attackerr.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 150, 490, 190);

        dateCorner_label.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        dateCorner_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateCorner_label.setText("Date");
        dateCorner_label.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        dateCorner_label.setPreferredSize(new java.awt.Dimension(70, 33));
        getContentPane().add(dateCorner_label);
        dateCorner_label.setBounds(10, 10, 210, 50);

        WarResult_text.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        WarResult_text.setForeground(new java.awt.Color(255, 255, 255));
        WarResult_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WarResult_text.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WAR RESULT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(WarResult_text);
        WarResult_text.setBounds(500, 350, 370, 170);

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USER INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 350, 370, 170);

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DEFENDER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 520, 750, 230);

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ATTACKER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 120, 750, 230);

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 90, 830, 670);

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
        getContentPane().add(Back_button);
        Back_button.setBounds(1161, 340, 120, 71);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/war_background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1320, 800);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        date_menu.setText("Date");
        jMenuBar1.add(date_menu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_buttonMouseEntered
        Back_button.setFont(new java.awt.Font("Stencil", 0, 18));
    }//GEN-LAST:event_Back_buttonMouseEntered

    private void Back_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_buttonMouseExited
        Back_button.setFont(new java.awt.Font("Stencil", 0, 14));
    }//GEN-LAST:event_Back_buttonMouseExited

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        if(WarResult_text.equals("Victory"))
        {
            MainMenu_jFrame.newGame.selectedLandID = MainMenu_jFrame.newGame.defenderLandID;
        }
        
        updateAll();
        
        MainMenu_jFrame.newGame.selectedLandID = 0;
        
        MainMenu_jFrame.newGame.setVisible(true);
    
        close();
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
            java.util.logging.Logger.getLogger(War_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(War_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(War_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(War_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new War_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    public static javax.swing.JLabel WarResult_text;
    public static javax.swing.JLabel attackerInfo;
    public static javax.swing.JLabel attackerTroops;
    private javax.swing.JLabel background;
    private javax.swing.JLabel dateCorner_label;
    private javax.swing.JMenu date_menu;
    public static javax.swing.JLabel defenderInfo;
    public static javax.swing.JLabel defenderTroops;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
