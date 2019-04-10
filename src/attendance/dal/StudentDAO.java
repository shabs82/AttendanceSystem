/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.dal;

import attendance.AttendanceException;
import attendance.be.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Test
 */
public class StudentDAO {
    
    private DatabaseConnector connector;
 
    public  StudentDAO(){
        connector = new DatabaseConnector();
    }
    
    public Student getStudent(String username, String password) throws AttendanceException{
        Student s = null;
        try (Connection con = connector.getConnection()) {
            String sql = "SELECT * FROM Student WHERE username = ? AND password = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                return new Student(id, name);
            }
            else
            {
                throw new AttendanceException("Cannot find student with given credentials");
            }
        }
        catch(SQLException ex)
        {
            throw new AttendanceException("Cannot connect to the database");
        }
    }
 }

