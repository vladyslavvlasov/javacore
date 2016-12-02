package com.vladyslavvlasov.app.classwork.lesson18;

/**
 * Created by Murcielago on 30.11.2016.
 */
public class BoxPrinter {
    private Object val;
    public BoxPrinter(Object arg){
        val=arg;
    }

    @Override
    public String toString() {
        return "{" + val + "}";
    }
    public Object getValue(){
        return val;
    }
}
