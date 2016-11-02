package com.vladyslavvlasov.app.homework.Lesson9;

import com.vladyslavvlasov.app.homework.lesson9.BubbleAndSelectionSorting;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Murcielago on 02.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class BubbleAndSelectionSortingTest {
    @Test
    @FileParameters(value ="src/test/resources/bubbleandselectionsortingdata1.csv",
    mapper = CsvWithHeaderMapper.class)
    public void testPositioninArrayBubbleFromSmallerToBigger(int argA, int expRes){
        BubbleAndSelectionSorting newObj = new BubbleAndSelectionSorting();
        int[] arrForTest= newObj.createNewArray();
        Assert.assertEquals(expRes,BubbleAndSelectionSorting.sortArrayfromSmallertoBigger(arrForTest)[argA]);
    }
    @Test
    @FileParameters(value ="src/test/resources/bubbleandselectionsortingdata1.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testPositioninArraySelectionFromSmallerToBigger(int argA, int expRes){
        BubbleAndSelectionSorting newObj = new BubbleAndSelectionSorting();
        int[] arrForTest= newObj.createNewArray();
        Assert.assertEquals(expRes,BubbleAndSelectionSorting.sortArrayUsingSelectionSortingfromSmallertoBigger(arrForTest)[argA]);
    }
    @Test
    @FileParameters(value ="src/test/resources/bubbleandselectionsortingdata2.csv",
            mapper = CsvWithHeaderMapper.class)
    public void testPositioninArrayBubbleFromBiggerToSmaller(int argA, int expRes){
        BubbleAndSelectionSorting newObj = new BubbleAndSelectionSorting();
        int[] arrForTest= newObj.createNewArray();
        Assert.assertEquals(expRes,BubbleAndSelectionSorting.sortArrayfromBiggertoSmaller(arrForTest)[argA]);
    }

}


