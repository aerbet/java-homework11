import java.util.Scanner;

public class Task5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        double radius = sc.nextDouble();
        double sRadius = Math.PI * Math.pow(radius, 2);
        
        System.out.print("Введите сторону квадрата: ");
        double square = sc.nextDouble();
        double sSquare = Math.pow(square, 2);

        String tmpl = "\nПлощадь %s меньше\n";

        if (sRadius > sSquare) {
            System.out.printf(tmpl, "квадрата");
        } else if (sRadius < sSquare) {
            System.out.printf(tmpl, "круга");
        } else {
            tmpl = "\nПлощади равны\n";
            System.out.println(tmpl);
        } 

        sc.close();
    }
}