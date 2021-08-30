import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println( calculateSalarySum("Текст = Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"));
    }

    public static int calculateSalarySum(String text){
        int result = 0;
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            result += Integer.parseInt(text.substring(start, end));
        }
        return result;
    }
}