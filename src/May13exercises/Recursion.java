package May13exercises;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("The sum is: " + sumRecursive(10));
        System.out.println(FibRecursive(0));
        System.out.println(FibRecursive(1));
        System.out.println(FibRecursive(2));
        System.out.println(FibRecursive(3));
        System.out.println(FibRecursive(10));
//        System.out.println(fibo(0));
//        System.out.println(fibo(1));
//        System.out.println(fibo(2));
//        System.out.println(fibo(10));


    }

    static int sumRecursive(int n) {
        int sum = 0;
        if (n == 0) {
            return sum;
        }
        return n + sumRecursive(n -1);
    }
//
    static int FibRecursive(int x){
        if(x == 0){
            return 0;
        } if(x == 1){
            return 1;
        } else {
            return FibRecursive(x-2) + FibRecursive(x-1);
        }
    }
    static int fibo(int n){
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        if(n == f1 || n == f2){
            return n;
        }
        while( n >= 2){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            n--;
        }
        return  f3;
    }

}
