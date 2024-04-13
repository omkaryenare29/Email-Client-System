/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sendmail.Login;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class ConnectionProvider {
    public Statement s;
    public ConnectionProvider(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            //make sure to put your username and password in the below parameters
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/email","username","password");
            s=con.createStatement();
            System.out.println("Connected ! ");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
