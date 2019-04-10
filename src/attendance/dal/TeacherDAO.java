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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Test
 */
public class TeacherDAO {
    
        private DatabaseConnector connector;
    
    public  TeacherDAO(){
        connector = new DatabaseConnector();
    }
    
    public Teacher getTeacher(String username, String password) throws AttendanceException{
        Teacher t = null;
        try (Connection con = connector.getConnection()) {
            String sql = "SELECT * FROM Teacher WHERE username = ? AND password = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                return new Teacher(id, name);
            }
            else
            {
                throw new AttendanceException("Cannot find teacher with given credentials");
            }
        }
        catch(SQLException ex)
        {
            throw new AttendanceException("Cannot connect to the database");
        }
    }
    
}
