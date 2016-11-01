package com.vladyslavvlasov.app.homework.runners;

import com.vladyslavvlasov.app.homework.homework4.Msg1Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Murcielago on 13.10.2016.
 */
public class Msg1TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Msg1Test.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

