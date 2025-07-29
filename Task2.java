public class Task2 {
    
    public static void main(String[] args) {

        System.out.print("Введите превую фамилию: ");
        String surname1 = System.console().readLine().strip();
        System.out.print("Введите вторую фамилию: ");
        String surname2 = System.console().readLine().strip();

        String tmpl = "Фамилия %s %s чем %s\n";
        String snt = "";

        System.out.println("\nФамилия: " + surname1 + " | длина: " + surname1.length());
        System.out.println("Фамилия: " + surname2 + " | длина: " + surname2.length() + "\n");

        if (surname1.length() > surname2.length()) {
            snt = "длиннее";
        } else if (surname1.length() < surname2.length()) {
            snt = "короче";
        } else {
            tmpl = "Фамилии равны";
        }

        System.out.printf(tmpl, surname1, snt, surname2);
    }
}
