import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class CheckLoginPassword {

    public static boolean checkEnterData(String login, String password, String passwordConfirm) {

        if (login.length() > 20) {
            throw new WrongLoginException();
        }

        if (!password.equals(passwordConfirm) || password.length() >= 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException();
        }
        return true;
    }
}