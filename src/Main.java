import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            CheckLoginPassword.checkEnterData("walterWhite", "95123", "95123");
            System.out.println("Login Or Password incorrect");

        } catch (WrongPasswordException e) {
            System.out.println("Wrong Password");

        } catch (WrongLoginException e) {
            System.out.println("Wrong Login");
        }
        finally{
            System.out.println("Welcome");
        }
    }
}