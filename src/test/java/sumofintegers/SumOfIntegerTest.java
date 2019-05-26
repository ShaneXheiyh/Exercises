package sumofintegers;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SumOfIntegerTest {

    @Test
    public void testSumofintegersarray(){
        int actual = Sumofintegersarray.getSumOfInteger();
        int expected = 22;
        Assert.assertEquals(expected,actual);
    }
}
