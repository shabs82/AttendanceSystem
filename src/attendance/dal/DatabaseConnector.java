/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 *
 * @author wailampoon
 */
public class DatabaseConnector {
    
    private SQLServerDataSource ds;

    public DatabaseConnector()
    {
        try
        {
            Properties databaseProperties = new Properties();
            databaseProperties.load(new FileInputStream("database.settings"));
            ds = new SQLServerDataSource();
            ds.setServerName(databaseProperties.getProperty("Server"));
            ds.setDatabaseName(databaseProperties.getProperty("Database"));
            ds.setUser(databaseProperties.getProperty("User"));
            ds.setPassword(databaseProperties.getProperty("Password"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() throws SQLServerException
    {
        return ds.getConnection();
    }
}
