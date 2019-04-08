/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.model;

import attendance.AttendanceException;
import attendance.be.Student;
import attendance.bll.BLLManager;

/**
 *
 * @author wailampoon
 */
public class MainModel {
    
    private BLLManager bllmanager = new BLLManager();
    private UserType type;
    
    public enum UserType {
        STUDENT, TEACHER
    }
    
    public void setUserType(UserType type)
    {
        this.type = type;
    }
    
    public UserType getUserType()
    {
        return type;
    }
    
    public Student getStudent(String username, String password) throws AttendanceException
    {
        return bllmanager.getStudent(username, password);
    }
}
