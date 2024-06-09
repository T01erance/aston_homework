package homework_6.task_1;

public class WrongPasswordException extends Exception {
    WrongPasswordException(String message) {
        super(message);
    }

    WrongPasswordException(){
        System.out.println("Wrong Password");
    }
}
