package May10Exercises;

public class Displaypattern {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; ++j){
                System.out.print(j + "");
            }
            System.out.println();
        }

    }
}
