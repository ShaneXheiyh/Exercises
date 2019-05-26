package stackdata;

public class StackData {
    private int[] array;
    private int top;

    public StackData(int size) {
        this.array = new int[size];
        this.top = 0;
    }

    public void push(int n) {
        if (top < array.length) {
            array[top] = n;
            top++;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        int value = -1;
        if (top > 0) {
            top--;
            value = array[top];
            array[top] = 0;
        }
        return value;
    }

    public int peek() {
        int value = -1;
        if (top > 0) {
            value = array[--top];
        }
        return value;
//        return top > 0 ? array[--top] : -1;
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String result = " ";
        for (top = 0; top < array.length; top++) {
            result = result + top + " ";
        }
        return result;
    }
}
