package com.efimchick;

/**
 * Created by Jerome on 15.02.2017.
 */
public class FunctionExecutionException extends Exception {

    public FunctionExecutionException() {
        super();
    }

    public FunctionExecutionException(String message) {
        super(message);
    }

    public FunctionExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionExecutionException(Throwable cause) {
        super(cause);
    }

    protected FunctionExecutionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
