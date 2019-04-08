/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.bll;

import attendance.AttendanceException;
import attendance.be.Student;
import attendance.be.Teacher;
import attendance.dal.DALManager;
import attendance.dal.StudentDAO;
import attendance.dal.TeacherDAO;


public class BLLManager {
    
    private DALManager dalmanager = new DALManager();
    private StudentDAO sdao = new StudentDAO();
    private TeacherDAO tdao = new TeacherDAO();
    
    public Student getStudent(String username, String password) throws AttendanceException
    {
        return dalmanager.getStudent(username, password);
    }
    
    public Teacher getTeacher(String username, String password)
    {
        return dalmanager.getTeacher(username, password);
    }
                
}
