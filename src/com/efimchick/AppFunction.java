package com.efimchick;

/**
 * Created by Jerome on 15.02.2017.
 */
public abstract class AppFunction {
    private String name;
    private FunctionType type;
    private Object output;

    public AppFunction(String name) {
        this.name = name;
        this.type = type;
    }

    public void supplyParam(Parameter<String> p) {
    }

    public void lookForParamValues(ValueSource valueSource) {
    }

    public void isReady() {
    }

    public FunctionType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }


    public abstract void execute() throws FunctionExecutionException;
}
