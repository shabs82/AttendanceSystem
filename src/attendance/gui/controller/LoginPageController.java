/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

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
        // TODO
        String inputUserName = idInput.getText();
        
        
    }   
    
    public void setModel(MainModel model)
    {
        this.model = model;
    }

    @FXML
    private void loginAction(ActionEvent event) {
        String username = idInput.getText();
        String password = passwordInput.getText();
        if(model.getUserType() == UserType.TEACHER)
        {
            //show teacher view
        }
        else
        {
            //show student view
        }
    }
    
}
