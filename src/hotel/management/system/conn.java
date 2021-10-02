/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  

public class conn{
    Connection c;
    Statement s;
    public conn(){

        try {

            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "abhibarkade");
            s = c.createStatement();
            System.out.println("Hello Connected.");
        } catch (Exception var2) {
            System.out.println(var2);
        }
    }  
}  

