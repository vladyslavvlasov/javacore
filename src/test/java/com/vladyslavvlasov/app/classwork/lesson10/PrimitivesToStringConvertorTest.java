package com.vladyslavvlasov.app.classwork.lesson10;

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
public class PrimitivesToStringConvertorTest {
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/inttostring.csv",
            mapper = CsvWithHeaderMapper.class)
public void testIntToStrConversion(int argA,String expRes){
        PrimitivesToStringConvertor newObj= new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,PrimitivesToStringConvertor.convertIntToString(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/longtostring.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testLongToStringConversion(long argA,String expRes){
        PrimitivesToStringConvertor newObj = new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,newObj.convertLongToString(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/doubletostring.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testDoubleToStringConversion(double argA, String expRes){
        PrimitivesToStringConvertor newObj = new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,newObj.convertDoubleToString(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/booltostring.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testBooleanToStringConversion(boolean argA, String expRes){
        PrimitivesToStringConvertor newObj = new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,newObj.convertBoolToString(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/stringtoint.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testStringToIntConversion(String argA, int expRes){
        PrimitivesToStringConvertor newObj = new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,newObj.convertStringtoInt(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/stringtolong.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testStringToLongConversion(String argA, long expRes){
        PrimitivesToStringConvertor newObj = new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,newObj.convertStringtoLong(argA));
    }
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/stringtodouble.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testStringToDoubleConversion(String argA, double expRes){
        PrimitivesToStringConvertor newObj = new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,newObj.convertStringtoDouble(argA),0.0);
    }
    @Test
    @FileParameters(value = "src/test/resources/lesson10PrimitiveConvertor/booltostring.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testStringToBooleanConversion(String argA, boolean expRes){
        PrimitivesToStringConvertor newObj = new PrimitivesToStringConvertor();
        Assert.assertEquals(expRes,newObj.convertStringtoBoolean(argA));
    }
}
