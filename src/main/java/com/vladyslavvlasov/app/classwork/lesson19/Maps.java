package com.vladyslavvlasov.app.classwork.lesson19;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Murcielago on 03.12.2016.
 */
public class Maps {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Zara",8);
        m1.put("Mahnaz",31);
        m1.put("Ayan", 12);
        m1.put("Daysie", 14);

        System.out.println(m1.get("Zara"));
        System.out.println(" Map Elements");
        System.out.println("\t" + m1);


    }
}
