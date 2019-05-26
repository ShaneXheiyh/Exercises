package stackdatatest;

import org.junit.Assert;
import org.junit.Test;
import stackdata.StackData;

public class StackDataTest {

    @Test
    public void testAddElementToStack(){
        StackData stackData = new StackData(2);
        stackData.push(45);
        stackData.push(100);
        stackData.push(400);

        int actual =stackData.pop();
        int expected = 100;

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testOverflowAndUnderFlow(){
        StackData stackData1 = new StackData(5);
        stackData1.push(4);
        stackData1.push(6);
        stackData1.push(8);

        int actual = stackData1.pop();
        int expected = 8;

        Assert.assertEquals(expected,actual);

        stackData1.pop();
        int actualPopResult = stackData1.pop();
        int expectedPopResult = 4;

        Assert.assertEquals(expectedPopResult,actualPopResult);
    }

    @Test
    public void testPeek(){
        StackData stackData2 = new StackData(5);
        stackData2.push(4);
        stackData2.push(6);
        stackData2.push(5);

        int actual = stackData2.peek();
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty(){
        StackData stackData3 = new StackData(5);
        stackData3.push(3);
        stackData3.push(4);
        stackData3.push(5);
        stackData3.push(6);

        boolean actual = stackData3.isEmpty();

        Assert.assertFalse(actual);
    }

}
