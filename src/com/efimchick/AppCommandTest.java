package com.efimchick;

import org.hamcrest.CoreMatchers;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jerome on 15.02.2017.
 */
public class AppCommandTest {
    @Test
    public void appFunctionBasicAPI() throws Exception{
        AppFunction af = new SimpleAppFunction("name");
        ValueSource valueSource = null;
        af.lookForParamValues(valueSource);
        af.isReady();
        assertThat(af.getName(), is("name"));
    }

    @Test
    public void simpleAppFunctionPerformingBasically() throws Exception {
        AppFunction saf = new SimpleAppFunction("helloWorld");
        saf.execute();
    }
}
