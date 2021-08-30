import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			String input = scanner.nextLine();
			if (input.equals("0")) {
				break;
			}
			Pattern pattern = Pattern.compile("([^А-Яа-я -])+");
			Matcher matcher = pattern.matcher(input);
			String regex = "\\s";
			String[] strings = input.split(regex);
			if (strings.length != 3 || matcher.find()) {
				System.out.println("Введенная строка не является ФИО");
				return;
			}
			System.out.println("Фамилия: " + strings[0]);
			System.out.println("Имя: " + strings[1]);
			System.out.println("Отчество: " + strings[2]);
		}
	}

}