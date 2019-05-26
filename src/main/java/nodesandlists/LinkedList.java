package nodesandlists;

public class LinkedList {
    private Node first;

    public LinkedList(String firstNodeData) {
        this.first = new Node(firstNodeData);
    }

    public void add(Node nextNode) {
        Node currentNode = first;
        while (currentNode.next != null) {
            currentNode = currentNode.next;

        }
        currentNode.next = nextNode;
    }

    public void addFirst(Node node) {
        node.next = first;
        first = node;
    }

    public void remove(Node node) {
        Node currentNode = first;
        Node previousNode = null;

        while (first.data.equals(node.data)) ;
        previousNode = currentNode;
        currentNode = currentNode.next;
        previousNode.next = currentNode.next;
    }

    public String toString() {
        return first.data + " -> Next: " + first.next;
    }
}


