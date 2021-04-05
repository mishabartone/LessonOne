package HomeWork21.Array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    private ArrayFromFour arrayFromFour = new ArrayFromFour();

    @Test
    public void testArrayFour1() {
        int [] expected = {1, 7};
        int [] original = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int [] testArr = arrayFromFour.ArrayFromFour(original);

        Assert.assertArrayEquals(testArr, expected);
    }

    @Test
    public void testArrayFour2() {
        int [] expected = {2, 7};
        int [] original = {4, 2, 7};
        int [] testArr = arrayFromFour.ArrayFromFour(original);

        Assert.assertArrayEquals(testArr, expected);
    }

    @Test
    public void testArrayFour3() {
        int [] expected = {0};
        int [] original = {1, 2, 4, 0};
        int [] testArr = arrayFromFour.ArrayFromFour(original);

        Assert.assertArrayEquals(testArr, expected);
    }

    @Test
    public void testArrayOneFour1(){
        int [] original = {1, 1, 1, 4, 4, 1, 4, 4};
        boolean itsTrue = arrayFromFour.ArrayOneAndFour(original);

        Assert.assertEquals(itsTrue, true);
    }

    @Test
    public void testArrayOneFour2(){
        int [] original = {1, 1, 1, 1, 1, 1};
        boolean itsTrue = arrayFromFour.ArrayOneAndFour(original);

        Assert.assertEquals(itsTrue, false);
    }
    @Test
    public void testArrayOneFour3(){
        int [] original = {4, 4, 4, 4};
        boolean itsTrue = arrayFromFour.ArrayOneAndFour(original);

        Assert.assertEquals(itsTrue, false);
    }

    @Test
    public void testArrayOneFour4(){
        int [] original = {1, 4, 4, 1, 1, 4, 3};
        boolean itsTrue = arrayFromFour.ArrayOneAndFour(original);

        Assert.assertEquals(itsTrue, false);
    }

}
