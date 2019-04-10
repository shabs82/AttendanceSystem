/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * FXML Controller class
 *
 * @author wailampoon
 */
public class StudentHomeController implements Initializable {

    @FXML
    private Label currentTime;
    @FXML
    private Label currentDate;
    @FXML
    private Label nameOfStudent;
    @FXML
    private Label Course;
    @FXML
    private JFXButton takeAttendanceBtn;
    @FXML
    private Button icon;
    @FXML
    private Label dayOfWeek;

    /**
     * Initializes the controller class.
     */
    public void getDateAndTime() {
        SimpleDateFormat forDate = new SimpleDateFormat("YYYY/MM/dd");
        SimpleDateFormat forTime = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat forDayOfWeek = new SimpleDateFormat("EEEE");
        Date dateForDate = new Date();

        currentDate.setText(forDate.format(dateForDate));
        currentTime.setText(forTime.format(dateForDate));
        dayOfWeek.setText(forDayOfWeek.format(dateForDate));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        getDateAndTime();
    }

    @FXML
    private void submitAttendance(ActionEvent event) {
    }


}
