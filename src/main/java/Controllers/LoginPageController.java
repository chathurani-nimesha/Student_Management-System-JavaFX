package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    private void btnLoginOnAction(ActionEvent event) {
        String name=txtUserName.getText();
        String password=txtPassword.getText();
        boolean b=checkUsernameandPassword(name,password);

        System.out.println(b);
        if(b){
            Stage stage=new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/home_page.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Home Page");
            stage.show();
        }else{
            Stage stage=new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_error.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Login Error");
            stage.show();
        }
    }

    private boolean checkUsernameandPassword(String name, String password) {
        if(name.equals("Chathu") && password.equals("chathu")){
            return true;
        }
        return false;
    }
}