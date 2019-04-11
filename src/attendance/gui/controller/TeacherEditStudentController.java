/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class TeacherEditStudentController implements Initializable {

    @FXML
    private JFXTextField txtFieldName;
    @FXML
    private JFXTextField txtFieldEmail;
    @FXML
    private JFXDatePicker datePicker;
    @FXML
    private TableView<?> tableView;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnSave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showCalender(ActionEvent event) {
    }

    @FXML
    private void addStudent(ActionEvent event) {
    }

    @FXML
    private void clearForm(ActionEvent event) {
    }

    @FXML
    private void saveData(ActionEvent event) {
    }
    
}
