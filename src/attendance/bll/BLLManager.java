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

/**
 *
 * @author wailampoon
 */
public class BLLManager {
    
    private DALManager manager = new DALManager();
    
    public Student getStudent(String username, String password) throws AttendanceException
    {
        return manager.getStudent(username, password);
    }
    
    public Teacher getTeacher(String username, String password)
    {
        return manager.getTeacher(username, password);
    }
    
}
