package queuedatadequeue;

import org.junit.Test;
import queuedata.QueueData;
import org.junit.Assert;

public class QueueDataTest {
    @Test
    public  void testEnqueue(){
        QueueData queue = new QueueData(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(7);
        System.out.println(queue);

        queue.enqueue(12);
        System.out.println(queue);

        queue.enqueue(13);
        System.out.println(queue);

        Assert.assertEquals(1,queue.dequeue());
        System.out.println(queue);

        Assert.assertEquals(12,queue.dequeue());
        System.out.println(queue);

        Assert.assertEquals(13,queue.dequeue());
        System.out.println(queue);

        System.out.println(queue);
    }

    @Test public void test(){
        QueueData q =  new QueueData(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);

        q.shift();
        System.out.println(q);


//        System.out.println("I want : [2,3,0,0,0]");

    }

}
