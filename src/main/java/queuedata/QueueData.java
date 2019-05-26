package queuedata;
import java.util.Arrays;

public class QueueData {
    private int[] array;
    private int front;
    private int back;

    public QueueData(int size){
        this.array = new int[size];
        front = back = 0;
    }

    public void enqueue(int element){
        if(back < array.length){
            array[back] = element;
            back = back + 1;
        }
    }

    public int dequeue(){
        int value = -34;
        if(front < back){
            value = array[front];
            array[front] = 0;
            front++;
        }
        return value;
    }

    public void shift() {
        if (array.length < 5) {
            back = array[array.length] + 1;
        }
        for (int i = front; i < back; i++) {
            array[i] = array[i + 1];
            array[i + 1] = 0;
        }
    }

    public String toString(){
        return "Front = "+ front + "Back ="+ back + "\nQueue ="+ Arrays.toString(array);
    }
}

