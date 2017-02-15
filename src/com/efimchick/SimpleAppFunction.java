package com.efimchick;

/**
 * Created by Jerome on 15.02.2017.
 */
public class SimpleAppFunction extends AppFunction {
    public SimpleAppFunction(String name) {
        super(name);

    }

    @Override
    public void execute() {
        System.out.println("HelloWorld");
    }
}
