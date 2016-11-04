package com.vladyslavvlasov.app.homework.lesson10;

import com.vladyslavvlasov.app.classwork.lesson10.Palindrome;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 04.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class PalindromeTest {
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/palindromedata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testPalindomeChecker1(String argA, boolean expRes) {
        Palindrome newObj = new Palindrome();
        Assert.assertEquals(expRes, newObj.checkIfPalindrome1(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/palindromedata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testPalindomeChecker2(String argA, boolean expRes) {
        Palindrome newObj = new Palindrome();
        Assert.assertEquals(expRes, newObj.checkIfPalindrome2(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/palindromedata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testPalindomeChecker3(String argA, boolean expRes) {
        Palindrome newObj = new Palindrome();
        Assert.assertEquals(expRes, newObj.checkIfPalindrome3(argA));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/palindromedata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testPalindomeChecker4(String argA, boolean expRes) {
        Palindrome newObj = new Palindrome();
        Assert.assertEquals(expRes, newObj.checkIfPalindrome4(argA));
    }
}
