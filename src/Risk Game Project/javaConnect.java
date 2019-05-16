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
import javax.swing.*;

public class javaConnect {
Connection conn = null;   
    
    public static Connection ConnecrDb(){
        
        
        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:C:\\Users\\Servan Tanaman\\Desktop\\Risk Game Project\\Risk Game Project\\RiskGameDataBase.db";
            Connection conn = DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null, "Bağlantı Başarılı!");
            
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
    
}
