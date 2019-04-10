/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.dal;

import attendance.AttendanceException;
import attendance.be.Student;
import attendance.be.Teacher;

/**
 *
 * @author wailampoon
 */
public class DALManager {
    
    private StudentDAO sDao = new StudentDAO();
    private TeacherDAO tDao = new TeacherDAO();
    
    public Student getStudent(String username, String password) throws AttendanceException 
    {
            return sDao.getStudent(username, password);
    }
    
    public Teacher getTeacher(String username, String password) throws AttendanceException
    {
        return tDao.getTeacher(username, password);
    }
    
}
