package com.vladyslavvlasov.utils.runners;

import com.vladyslavvlasov.utils.convertors.PrimitiveConvertor;

/**
 * Created by Murcielago on 08.10.2016.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor1 = new PrimitiveConvertor();
        convertor1.charToInt('Z');
        convertor1.floatToChar(56.0f);
        convertor1.intToChar(36);
    }

}
