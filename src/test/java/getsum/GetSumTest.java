package getsum;

import getSum.GetSum;
import org.junit.Assert;
import org.junit.Test;

public class GetSumTest {
    @Test
    public void testGetSum(){
        int actual = GetSum.getSum();
        int expected = 233168;
        Assert.assertEquals(expected,actual);
    }
}
