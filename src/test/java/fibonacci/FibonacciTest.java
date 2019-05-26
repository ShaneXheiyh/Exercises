package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFib(){
        int actualResult = Fibonacci.fib(6);
        int expected = 8;
        Assert.assertEquals(expected,actualResult);
    }
}
