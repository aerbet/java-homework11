public class Task1 {
    
    public static void main(String[] args) {
        
        System.out.print("Введдите название футбольного клуба: ");
        String clubName = System.console().readLine().strip();

        String result = "Название: %s\nКол-во символов: %s\n%s\n%s";

        System.out.printf(result, clubName, clubName.length(), clubName.toUpperCase(), clubName.toLowerCase());
    }
}