/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist.pkg311.form2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author tme5209
 */
public class FXMLFormController implements Initializable{   
    @FXML private Text actiontarget;
    @FXML private TextField username;
    @FXML private PasswordField password;
    
    private StringProperty user_id = new SimpleStringProperty("null"), 
            user_pass = new SimpleStringProperty("null");
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {  
        actiontarget.setText("Sign in button pressed. Your user id is: " + user_id);   
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        username.textProperty().bindBidirectional(user_id);
        //password.textProperty().bindBidirectional(user_pass);
    }
}
