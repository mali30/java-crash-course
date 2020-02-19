package company.mohamedali.Exceptions;

// checked -> Exception
// unchecked (runtime) -> RuntimeException

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(){
        super("Insufficient funds in your account");
    }

}
