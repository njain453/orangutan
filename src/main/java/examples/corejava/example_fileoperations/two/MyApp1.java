package examples.corejava.example_fileoperations.two;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/12/2022, Saturday
 **/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 What this program snippet doing?
 // In this Java program, we accept a file or directory name from
 // command line arguments. Then the program will read content of file and print to Stream
 //  .
 **/
public class MyApp1 {


    public static void main(String[] args) throws IOException {

        int ch;
        FileReader fr =null;

        try {
            fr  = new FileReader("D:\\mylearning\\SAMPLE_PROJECTS\\orangutan\\src\\main\\resources\\a.txt"); // file path is passed as command line argument


        }
        catch (FileNotFoundException e){

            System.out.println(e.getMessage());
        }

        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);

        // close the file
        fr.close();


    }

}
