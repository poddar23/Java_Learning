package classwork;
class InvalidAgeException extends Exception {  
    public InvalidAgeException(String message) {  
        super(message);  
    }  
}

public class AgeValidator {  
    public static void main(String[] args) throws InvalidAgeException {  
        int age = 18; 

        if (age < 18) {  
            throw new InvalidAgeException("Age is invalid! Must be 18 or above.");  
        }  
        
        System.out.println("Age is valid.");
    }  
}
