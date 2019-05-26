package getSum;

public class GetSum {

    public static void main(String[] args) {
        System.out.println(" The multiple of 3 or 5 is:" + " " + getSum());
        getSum();
    }
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}


