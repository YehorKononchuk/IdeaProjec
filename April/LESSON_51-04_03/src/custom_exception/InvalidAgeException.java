package custom_exception;

public class InvalidAgeException extends Exception {

    public InvalidAgeException (String str){
        super(str);
    }

}