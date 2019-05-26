package stringCount;

import org.junit.Assert;
import org.junit.Test;
import stringcount.StringCount;

public class StringCountTest {
    @Test
    public void testStringCount(){
        int actual = StringCount.getStringCount();
        int expected = 6;
        Assert.assertEquals(expected,actual);
    }

}
