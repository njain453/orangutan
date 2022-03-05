package examples.corejava.patterns.one;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 1/24/2022, Monday
 **/

// the term pattern matching in Java means matching a regular expression (pattern) against a text using Java.

import java.util.regex.Pattern;

/**
 What this program snippet doing?
  demo check if a regular expression pattern matches a text

 **/
public class App {

    public static void main(String[] args) {
        String str = "This is the string to be searched for occurences of the pattern";

        String pattern = ".*is.*"; //"is" would be searched from the String including characters before and after

        boolean matches = Pattern.matches(pattern,str);
        System.out.println("matches = "+ matches);
    }



}
