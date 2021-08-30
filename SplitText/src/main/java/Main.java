import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(splitTextIntoWords("asdasd asd asda das dasd asdsa d asdasdasdad"));
    }

    public static String splitTextIntoWords(String text) {
        String result = "";
        int countWords = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                countWords++;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z’]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            result = result.concat(text.substring(start, end));
            if (countWords >= 0)
                result = result.concat("\n");
            countWords--;
        }
        return result;
    }

}