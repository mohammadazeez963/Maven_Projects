package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;


public final class App {
   
    public static void main(String[] args) {


    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Temp1234");

            // String query = "SELECT name,gender,age from test1";
            String name ="azeez";
            int age = 22;
            String gender = "male";
            String query = "insert into test1 values('"+name+"',"+age+",'"+gender+"')";
            System.out.println(query);
            PreparedStatement ps = con.prepareStatement(query);

            // ResultSet rs = ps.executeQuery();
            

            // System.out.println("Names :-");
            // while(rs.next()) {
            //     System.out.println(rs.getString("name"));
            //     System.out.println(rs.getString("gender"));
            //     System.out.println(rs.getInt("age"));
            // }
            System.out.println(ps.execute());
            con.close();
        } catch(SQLException | ClassNotFoundException se) {
            System.out.println(se.getMessage());
        }
    }

 }

