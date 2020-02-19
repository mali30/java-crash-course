package company.mohamedali.Exceptions;

import java.io.IOException;

public class Account {

    private float balance = 50;

    public void deposit(float value) throws IOException {
        if(value <= 0)
            // throwing exception
            throw new IOException();
    }

    public void withDraw(float value) throws AccountException {
        if(value > balance)
//            var accountException = new AccountException(new InsufficientFundsException());
//            var fundsException = new InsufficientFundsException();
//            var accountException = new AccountException();
//            accountException.initCause(fundsException);
            throw new AccountException(new InsufficientFundsException());

    }
}
