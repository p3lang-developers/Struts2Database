/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p3lang.struts2.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Abhishek
 */
public class DBConnection {
    private static Connection connection;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver") ;
        }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
    public static Connection getConnection() throws SQLException
    {
        if((connection==null)||(connection.isClosed()))
        {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?" + "user=root&password=root");
        }
        return connection;
    }
}
