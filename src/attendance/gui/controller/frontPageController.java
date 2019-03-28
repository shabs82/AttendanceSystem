/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

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
        showLoginPage();
    }

    @FXML
    private void studentHandleBtn(ActionEvent event) throws IOException {
        showLoginPage();
    }

    private void showLoginPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/attendance/gui/view/loginPage.fxml"));
        Scene scene = new Scene(root);
        
        Scene currentScene = studentBtn.getScene();
        Stage stage = (Stage) currentScene.getWindow();

        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();

    }

}
