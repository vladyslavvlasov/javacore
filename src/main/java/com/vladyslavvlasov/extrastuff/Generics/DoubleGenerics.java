package com.vladyslavvlasov.extrastuff.Generics;

/**
 * Created by Murcielago on 04.12.2016.
 */
public class DoubleGenerics <T,V>{
    T obj1;
    V obj2;
    public DoubleGenerics(T o1, V o2){
        obj1= o1;
        obj2= o2;
    }
T getObj1(){
        return obj1;
}
V getObj2(){
    return obj2;
    }

    public static void main(String[] args) {
        DoubleGenerics  myObj = new DoubleGenerics("hello", 85);
       String a =(String) myObj.obj1;
        System.out.println(myObj.obj1);
    }

}
