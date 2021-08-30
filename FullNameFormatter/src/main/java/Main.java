import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            int countWords = 0;
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    System.out.println("Введенная строка не является ФИО");
                    return;
                }
                if (input.charAt(i) == ' ')
                    countWords++;
            }
            if (countWords != 2) {
                System.out.println("Введенная строка не является ФИО");
                return;
            }
            String first = input.substring(0, input.indexOf(' '));
            String second = input.substring((input.indexOf(' ') + 1), input.indexOf((' '), (input.indexOf(' ') + 1)));
            String last = input.substring(input.lastIndexOf(' '), input.length());

            System.out.println("Фамилия: " + first.trim());
            System.out.println("Имя: " + second.trim());
            System.out.println("Отчество: " + last.trim());
        }
    }

}