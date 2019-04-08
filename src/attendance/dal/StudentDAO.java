/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.dal;

import attendance.be.Student;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Test
 */
public class StudentDAO {
    
    private SQLServerDataSource ds;
 
    public  StudentDAO(){
          try {
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
    
    public Student createStudent(int id, String name, String username, String password) throws SQLException{
        Student s = null;
        try (Connection con = ds.getConnection()) {
            String sql = "INSERT INTO Student(id, name, username, password) VALUES(?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, username);
            stmt.setString(4, password);
            stmt.execute();
            s = new Student(id, name);
            //cmDAO.setCategoriesToMovie(m, categories);
            return s;    
        }
        catch(SQLServerException ex){
            ex.printStackTrace();
            throw ex;
        }
    }
 }

