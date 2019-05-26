package May13exercises;

public class SortArray {
    public static void main(String[] args) {
        int[] x = {7,5,9,3,2,4,1};
        for( int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] < x[j]) {
                    int y = x[i];
                    x[i] = x[j];
                    x[j] = y;
                }
            }
        }
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }

    }


}
