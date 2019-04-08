/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

import attendance.AttendanceException;
import attendance.be.Student;
import attendance.gui.model.MainModel;
import attendance.gui.model.MainModel.UserType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author wailampoon
 */
public class LoginPageController implements Initializable {

    private MainModel model;
    
    @FXML
    private Button logInbtn;
    @FXML
    private TextField idInput;
    @FXML
    private TextField passwordInput;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String inputUserName = idInput.getText();  
    }   
    
    public void setModel(MainModel model)
    {
        this.model = model;
    }

    @FXML
    private void loginAction(ActionEvent event) {
        try{
            String username = idInput.getText();
            String password = passwordInput.getText();
            if(model.getUserType() == UserType.TEACHER){
                //show teacher view
            }
            else{
                Student student = model.getStudent(username, password);
                System.out.println("I logged in student");
            }
            
            
       }
        catch(AttendanceException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
