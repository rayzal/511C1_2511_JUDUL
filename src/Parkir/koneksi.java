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
public class koneksi {
    private static Connection con;
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkirmall","root","");
//            JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal: "+e.getMessage());
        }
        return con;
    }
}