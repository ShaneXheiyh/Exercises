package Main.ExerciseMay8;

public class AreaparameterofCircle {


    public static void main(String[] args) {
        double radius = 7.5;
        System.out.println("The Perimeter is:" + perimeter(radius));
        System.out.println("The Area is:" + area(radius));
    }

    public static double perimeter(double r) {
        double p = 2 * Math.PI * r;
        return p;
    }

    public static double area( double a){
        double area = Math.PI * a * a;
        return area;
    }
}




