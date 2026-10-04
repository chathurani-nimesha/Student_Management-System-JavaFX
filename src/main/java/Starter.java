import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application{
    public static void main(String[] args) {
        launch(); //trigger fx
    }

    @Override
    public void start(Stage stage) throws Exception {
        //set the stage and give the path of fxml
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/login_page.fxml"))));
        //set title
        stage.setTitle("Login Page");
        //show the stage
        stage.show();
    }
}