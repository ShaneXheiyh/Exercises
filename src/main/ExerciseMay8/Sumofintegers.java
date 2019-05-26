package Main.ExerciseMay8;

public class Sumofintegers {
    public static void main(String [] args){
        int a = 25;
        System.out.println(getSumOfInteger(a));
    }

    public static int getSumOfInteger(int a){
        int sum = 0;
            while( a != 0){
                sum = sum + a % 10;
                a = a / 10;
            }
            return sum;
        }

    }









