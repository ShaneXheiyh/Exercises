package Main.ExerciseMay8;

public class Multithreeand5 {
    public static void main(String[] args) {
        getSum();
        System.out.println(" The multiple of 3 or 5 is:" + " " + getSum());
    }
//        for (int i = 1; i < 1000; i++) {
//            if (i % 3 == 0) {
//                sum = sum + i;
//            } else if (i % 5 == 0) {
//                sum = sum + i;
//            }
//            System.out.println(sum);

    public static int getSum(){
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
        }
//    int sum = 0;
//
//       for (int i = 1; i <= 1000; i++) {
//        if (isMultiple3(i)) {
//            sum = sum + i;
//
//        } else if (isMultiple5(i)) {
//            sum = sum + i;
//        }
//
//    }
//
//       System.out.println(" The multiple of 3 or 5 is: " + sum);
//
//
//}
//
//
//    static boolean isMultiple3(int a) {
//
//        return a % 3 == 0;
//    }
//
//
//    static boolean isMultiple5(int a {
//
//        return a % 5 == 0;
    }