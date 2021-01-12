/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class BazaDanych {
    
    public static Connection Baza() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection polaczenie=
                    DriverManager.getConnection(
                    "jdbc:sqlserver://BEST-KOMP\\SQLEXPRESS:1433;databaseName=Biblioteka",
                    "sa","zaq1@WSX");
            return polaczenie; 
            }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Błąd: "+ex.getMessage(),
                    "Błąd programu",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    };
}
 