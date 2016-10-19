package com.vladyslavvlasov.app.homework.homework4;

import com.vladyslavvlasov.app.homework.lesson4.Msg1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Murcielago on 13.10.2016.
 */
public class Msg1CompareMessagesTest {
    @Test

    public void testtwomessages() {
        String aloha = "aloha";
        Msg1 testmessage = new Msg1("aloha");

        assertEquals(aloha, testmessage.printMsg1());
    }

}
