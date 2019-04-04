/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.dal;

import attendance.AttendanceException;
import attendance.be.Student;
import attendance.be.Teacher;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author wailampoon
 */
public class DALManager {
    
    private DatabaseConnector connector = new DatabaseConnector();
    
    public Student getStudent(String username, String password) throws AttendanceException 
    {
        try(Connection connection = connector.getConnection())
        {
            return null;
        }
        catch(SQLException ex)
        {
            throw new AttendanceException("Cannot connect to database");
        }
    }
    
    public Teacher getTeacher(String username, String password)
    {
        return null;
    }
    
}
