public class Task7 {
    
    public static void main(String[] args) {

        System.out.print("Введите любое простое предложение: ");
        String sentence = System.console().readLine().strip();

        System.out.print("Введите слово: ");
        String word = System.console().readLine().strip();

        int index = sentence.indexOf(word);

        if (index < 0) {
            System.out.println("Такого слова нет в введенном приложении");
        } else {
            System.out.println("Такое слово есть в введенном предложении и оно начинется с позиции: " + index);
        }
    }
}
