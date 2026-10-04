package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button btnCansel;

    @FXML
    private Button btnLogin;

    @FXML
    void btnOnClickCansel(ActionEvent event) {
        System.out.println("Clicked Cansel..");
    }

    @FXML
    void btnOnclick(ActionEvent event) {
        System.out.println("Clicked Login...");
    }

}
