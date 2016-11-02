package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson9.Multiplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Murcielago on 02.11.2016.
 */
public class MultiplicationTest {
    @Test
    public void testLengthOfMultiTable() {
        Multiplication newObj = new Multiplication();
        int expRes = 36;
        Assert.assertEquals(expRes, Multiplication.createMultiplicationTable().length);
    }

    @Test
    public void testThatExamplesDoNotRepeatInMultiTable() {
        int flag = 0;
        int expRes = 0;
        String[] newTable = Multiplication.createMultiplicationTable();
        for (int i = 0; i < newTable.length - 1; i++) {
            for (int j = 0; j < newTable.length; j++) {
                if (i != j && newTable[i].equals(newTable[j])) {
                    flag = 1;
                }
            }
        }
        Assert.assertEquals(expRes, flag);
    }

    @Test
    public void testThatExamplesDoNotRepeatInTeacherArray() {
        int flag = 0;
        int expRes = 0;
        String[] newArr = Multiplication.createTeacherArray();
        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (i != j && newArr[i].equals(newArr[j])) {
                    flag = 1;
                }
            }
        }
        Assert.assertEquals(expRes, flag);
    }

    @Test
    public void testLengthOTeacherArray() {
        Multiplication newObj = new Multiplication();
        int expRes = 15;
        Assert.assertEquals(expRes, Multiplication.createTeacherArray().length);
    }
}
