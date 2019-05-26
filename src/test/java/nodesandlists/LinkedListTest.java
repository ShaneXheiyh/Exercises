package nodesandlists;

import org.junit.Test;


public class LinkedListTest {

    @Test
    public void testAdd(){
        LinkedList linkedList = new LinkedList("Wagon");
        Node node1 = new Node("Wagon1");
        Node node2 = new Node("Wagon2");
        Node node3 = new Node("Wagon3");

        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        System.out.println(linkedList);










    }
}
