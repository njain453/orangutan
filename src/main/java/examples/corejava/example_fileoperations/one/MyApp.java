package examples.corejava.example_fileoperations.one;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/12/2022, Saturday
 **/


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import examples.corejava.example_fileoperations.one.*;

import java.io.File;
import java.io.FileNotFoundException;

/**
 What this program snippet doing?
 // In this Java program, we accept a file or directory name from
 // command line arguments. Then the program will check if
 // that file or directory physically exist or not and
 // it displays the property of that file or directory.
 **/
public class MyApp {



    public static void main(String[] args)  {


        File file = new File(args[0]);

        //get file path
        System.out.println("File Absolute Path is " + file.getAbsolutePath());
        System.out.println("File path is" + file.getPath());

        //get File Name
        System.out.println("file name is " + file.getName());

        //check if File Exists else throw exception

        if(file.exists()){
            System.out.println("File Exists");
        }

        if (file.exists()) {
            System.out.println("Is writable:"
                    + file.canWrite());
            System.out.println("Is readable " + file.canRead());
            System.out.println("Is a directory:"
                    + file.isDirectory());
            System.out.println("File Size in bytes "
                    + file.length());
        }


    }


}
