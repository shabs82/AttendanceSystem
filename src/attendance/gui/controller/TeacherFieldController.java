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
public class TeacherFieldController implements Initializable {

    @FXML
    private BorderPane TeacherFieldBorderPane;
    @FXML
    private Button closebtn;
    @FXML
    private JFXButton tHomeBtn;
    @FXML
    private JFXButton allStudentOverviewbtn;
    @FXML
    private JFXButton editStudentbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void close(ActionEvent event) {
         Stage stage = (Stage) TeacherFieldBorderPane.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void teacherHome(ActionEvent event) {
    }

    @FXML
    private void allStudentOverview(ActionEvent event) {
    }

    @FXML
    private void goEditStudent(ActionEvent event) throws IOException {
        loadUI("/attendance/gui/view/TeacherView");
        
    }
    
    
    
    public void loadUI(String ui) throws IOException{
      
        
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(ui+".fxml"));
        Parent root = fxmlLoader.load();
        TeacherFieldBorderPane.setCenter(root);
    }
            
}
