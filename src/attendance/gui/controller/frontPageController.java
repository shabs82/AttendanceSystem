/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

import attendance.gui.model.MainModel;
import attendance.gui.model.MainModel.UserType;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author wailampoon
 */
public class frontPageController implements Initializable {

    private MainModel model = new MainModel();
    
    private Label label;
    @FXML
    private Button teacherBtn;
    @FXML
    private Button studentBtn;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void teacherHandleBtn(ActionEvent event) throws IOException {
        model.setUserType(UserType.TEACHER);
        showLoginPage();
    }

    @FXML
    private void studentHandleBtn(ActionEvent event) throws IOException {
        model.setUserType(UserType.STUDENT);
        showLoginPage();
    }

    private void showLoginPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/attendance/gui/view/loginPage.fxml"));
        Parent root = fxmlLoader.load();
        
        LoginPageController controller = fxmlLoader.getController();
        controller.setModel(model);
        
        
        Scene scene = new Scene(root);
        
        Scene currentScene = studentBtn.getScene();
        Stage stage = (Stage) currentScene.getWindow();
        //currentScene.setRoot(root);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();

    }

}
