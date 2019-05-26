import java.util.Scanner;

public class MultiplacationTable {

    public static void main(String [] args) {
        int a = 8;
        multiplicationTable(a);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number one:");
        int x = scanner.nextInt();
        System.out.println("Give number two:");
        int y = scanner.nextInt();
        System.out.println("Give operation:");
        String operation = scanner.next();
        double result = 0;

        switch (operation){
            case "+":
                result = sum(x,y);
                break;
            case "-":
                result = diff(x,y);
                break;
            case "/":
                result = division(x,y);
                break;
            case "*":
                result = product(x,y);
                break;
            default:
                System.out.println("operations can be any +,-,*,/");
        }
        System.out.println(result);
    }

    public static void multiplicationTable(int b){
        int result;
         for (int i = 1; i < 10; i++){
             result = b * i;
             System.out.println(b + "*" + i + "=" + result);

         }
    }


    public  static int sum(int a , int b) {
        return a + b;
    }
    public static int diff(int a, int b){
        return a - b;
    }
    public static double division(int a, int b){
        return (double) a / (double) b;
    }
    public static int product(int a, int b){
        return a * b;
    }
}
