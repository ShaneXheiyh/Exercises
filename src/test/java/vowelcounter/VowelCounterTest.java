package vowelcounter;

import org.junit.Assert;
import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void testTransform(){
        String str = "Un String cu vocale";
        char[] arr = VowelCounter.transform(str);
        char actual = arr[0];
        char expected = 'U';
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCount(){
        String a = "Un String cu vocale";
        int expected = 6;
        int actual = VowelCounter.count(a);
        Assert.assertEquals(expected,actual);
    }
}
