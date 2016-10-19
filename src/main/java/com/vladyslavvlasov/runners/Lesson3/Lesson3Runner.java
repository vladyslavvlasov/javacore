package com.vladyslavvlasov.runners.Lesson3;

import com.vladyslavvlasov.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Murcielago on 08.10.2016.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor1 = new PrimitiveConvertor();
        convertor1.charToInt('\\');
        convertor1.floatToChar(56.0f);
        convertor1.intToChar(0377);
    }

}
