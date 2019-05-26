package sumofintegers;

public class Sumofintegersarray {

    public static void main(String [] args){
        getSumOfInteger();
        System.out.println("The sum of an array:" + getSumOfInteger());


    }
    public static int getSumOfInteger() {
        int[] a = {5, 7, 6, 4};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }


}

