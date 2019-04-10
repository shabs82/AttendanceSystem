
package attendance.gui.controller;

import attendance.AttendanceException;
import attendance.be.Student;
import attendance.be.Teacher;
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
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;


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
        Stage stage = new Stage();
        try{
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            if(model.getUserType() == UserType.TEACHER){
                Teacher teacher = model.getTeacher(username, password);
                System.out.println(teacher.getName());
                Parent root = FXMLLoader.load(getClass().getResource("/attendance/gui/view/TeacherField.fxml"));
        
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else{
                Student student = model.getStudent(username, password);
                System.out.println(student.getName());
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
