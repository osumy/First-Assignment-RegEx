import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
        String regex = "http(s)?://(www.)?[a-zA-Z0-9@:%._-]{2,256}\\.[a-zA-Z]{2,6}([-a-zA-Z0-9@:%_+.~#?&/=]*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            return matcher.group();
        }
        else{
            return null;
        }
    }

    /*
    implement the method below to validate an email address
     */

        public static boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9][\\w\\.]*@([\\w]+\\.)+[\\w]{2,4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        boolean isValid = matcher.find();

        return isValid;
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]*([a-zA-Z])[a-zA-Z]*\\1[a-zA-Z]*\\b");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            wordsWithRepeatLetters.add(matcher.group());
        }

        return wordsWithRepeatLetters;
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        return repeatedWords;
        // TODO
    }

    public static void main(String[] args) {}
}