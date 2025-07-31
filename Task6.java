import java.util.Scanner;

public class Task6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine().strip();

        System.out.print("Введите вашу фамилию: ");
        String surName = sc.nextLine().strip();

        System.out.print("Введите место проживания: ");
        String country = sc.nextLine().strip(); // использовал nextLine() из за того что с System.console().readLine() возникла ошибка при выводе текста в консоли, вставлялись лишиние табы.

        System.out.print("Введите год рождения: ");
        int yearOfBirth = sc.nextInt();

        int currentYear = 2025;
        int minYear = 1900;

        String tmpl = "\nYour name: %s\nYour lastname: %s\nYour country: %s\nYear of birth: %s\n";
        String tmpl2 = "\nYour name is, %s %s. And you %s years old, and you are from in %s";

        if (yearOfBirth > currentYear) {
            tmpl = "\nВы ввели некорректную дату рождения, начните заново"; // в задании сказано: Предпологать что пользователь не введет неверный год рождения. Но я не смог написать без проверки:(
            System.out.println(tmpl);
        } else if (yearOfBirth <= minYear) {
            tmpl = "\nВы ввели некорректную дату рождения, начните заново";
            System.out.println(tmpl);
        } else {
            System.out.printf(tmpl, name, surName, country, yearOfBirth);
            System.out.printf(tmpl2, name.toUpperCase(), surName.toUpperCase(), currentYear-yearOfBirth, country);
        }

        sc.close();
    }
}