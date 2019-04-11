/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author wailampoon
 */
public class StudentFieldController implements Initializable {

    @FXML
    private BorderPane StudentFieldBorderPane;
    @FXML
    private Button closebtn;
    @FXML
    private JFXButton sHomeBtn;
    @FXML
    private JFXButton sOVerviewbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     public void loadUI(String ui) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(ui + ".fxml"));
        Parent root = fxmlLoader.load();
        StudentFieldBorderPane.setCenter(root);
    }


    @FXML
    private void close(ActionEvent event) {
        
         Stage stage = (Stage) StudentFieldBorderPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void studentHome(ActionEvent event) throws IOException {
        
         loadUI("StudentHome");
    }

    @FXML
    private void studentOverview(ActionEvent event) {
        
        // loadUI("StudentHome");
    }
    
}
