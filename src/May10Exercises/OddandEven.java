package May10Exercises;

public class OddandEven {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        System.out.println(getEven(arr));
        System.out.println(getOdd(arr));

    }

    private static int getOdd(int[] x) {
        int odd = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    static int getEven(int[] x) {
        int even = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }


}