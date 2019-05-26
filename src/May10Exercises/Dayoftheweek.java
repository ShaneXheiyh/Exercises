package May10Exercises;
import java.util.Scanner;

public class Dayoftheweek {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch(i) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                //you keep adding till case 7 monday-sunday
            case 3:
                System.out.println("Wednesday");
                break;
        }

    }
}
