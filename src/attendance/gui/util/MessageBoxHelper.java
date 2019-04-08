/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.util;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author Test
 */
public class MessageBoxHelper {
    
     public static boolean askYesNo(String prompt) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText(prompt);
        Optional<ButtonType> action = alert.showAndWait();
        return action.get() == ButtonType.OK;
    }
    
    public static void displayError(String errorMessage) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText("An error has occurred: " + errorMessage);
        alert.showAndWait();
    }
    
    public static void displayException(Exception ex) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText("An error has occurred: " + getErrorMessage(ex));
        alert.showAndWait();
    }
    
    private static String getErrorMessage(Exception ex) {
        if(ex instanceof NumberFormatException) {
            return "Invalid format for number";
        }
        return ex.getLocalizedMessage();
    }
    
}
