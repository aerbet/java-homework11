import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
        
        System.out.print("Введите значение x: ");
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y;

        String tmpl = "Уравнение не решается: 0 != %s(%s)";

        if (x < 0) {
            y = 3 * x + 1;
            System.out.println("y = " + y);
        } else if (x == 0) {
            System.out.printf(tmpl, "cos", Math.round(x));
        } else {
            if (x == Math.PI) {
                System.out.println("Уравнение решено: 0 = sin(Math.PI)");
            } else {
                System.out.printf(tmpl, "sin", Math.round(x));
            }
        }

        System.out.println();

        sc.close();
    }
}
