package homework_6.task_1;

public class WrongLoginException extends Exception {

    WrongLoginException(String message){
        super(message);
    }

    WrongLoginException(){
        System.out.println("Wrong Login");
    }
}
