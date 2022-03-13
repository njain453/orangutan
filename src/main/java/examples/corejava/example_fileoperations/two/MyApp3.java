package examples.corejava.example_fileoperations.two;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/12/2022, Saturday
 * <p>
 * What this program snippet doing?
 * Reading File using Files.lines(PAth) Method
 **/

/**
 What this program snippet doing?
 Reading File using Files.lines(PAth) Method
 **/

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MyApp3 {
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);

        // Using Files.lines(Path) method

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using Files.lines(Path, Charset) method

        try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



