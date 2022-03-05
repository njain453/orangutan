package examples.corejava.patterns.two;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 1/24/2022, Monday
 **/
// If you need to match a text against a regular expression pattern more than one time,
// you need to create a Pattern instance using the Pattern.compile() method.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 What this program snippet doing?
 Java Pattern.compile() example:
 **/
public class App {

    public static void main(String[] args) {
        String str = "This is the string to be searched for occurences of the pattern";

        String patternString = ".*is.*"; //"is" would be searched from the String including characters before and after

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

        // Once you have obtained a Pattern instance, you can use that to obtain a Matcher instance.
        // The Matcher instance is used to find matches of the pattern in texts.

        Matcher matcher = pattern.matcher(str);

        // The Matcher class has a matches() method that tests whether the pattern matches the text.
        // If the regular expression matches the whole text, then the matches() method returns true. If not, the matches() method returns false.

        boolean match = matcher.matches();

        System.out.println("Matches = " + match);


    }

}
