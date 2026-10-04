package Controllers.Login;

public class LoginController {

    public boolean checkUsernameandPassword(String username, String password) {
        if(username.equals("Chathu")&& password.equals("chathu")){
            return true;
        }
        return false;
    }
}
