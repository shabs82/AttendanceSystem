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
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Hyperlink;


/**
 * FXML Controller class
 *
 * @author wailampoon
 */
public class LoginPageController implements Initializable {

    private MainModel model;
    
    
   
    @FXML
    private JFXButton loginbtn;
    @FXML
    private JFXTextField usernameInput;
    @FXML
    private Hyperlink link;
    @FXML
    private JFXPasswordField passwordInput;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String inputUserName = usernameInput.getText();  
    }   
    
    public void setModel(MainModel model)
    {
        this.model = model;
    }

    @FXML
    private void loginAction(ActionEvent event) throws IOException {
        try{
            String username = usernameInput.getText();
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

   

    @FXML
    private void goForgotPassword(ActionEvent event) throws Exception {
        
         Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://moodle.easv.dk/login/forgot_password.php"));
    }
    
}
