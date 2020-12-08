package com.interfaces.exceptions;

// Checked -> Exception
// UnChecked (runtime) -> RuntimeException

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(){
        super("Insuffecient funds in your account");
    }

    public InsufficientFundsException(String message){
        super(message);
    }
}
