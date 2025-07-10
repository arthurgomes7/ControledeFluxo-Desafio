package Exceptions;

public class InvalidParametersException extends Exception {
    public InvalidParametersException(){
        System.out.println("\nO segundo valor não pode ser maior que o primeiro");
    }
}
