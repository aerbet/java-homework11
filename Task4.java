import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите скорость в км/час: ");
        double kmHour = sc.nextDouble();

        System.out.print("Введите скорость в м/сек: ");
        double mSec = sc.nextDouble();
        double mSecInKm = mSec * 3.6;

        String tmpl = "\n%s %s больше чем %s %s\n";

        if (mSecInKm < kmHour) {
            System.out.printf(tmpl, kmHour, "км/ч", mSec, "м/сек");
        } else if (mSecInKm > kmHour) {
            System.out.printf(tmpl, mSec, "м/сек", kmHour, "км/ч");
        } else {
            tmpl = "\nСкорости равны\n";
            System.out.println(tmpl);
        } 

        sc.close();
    }
}
