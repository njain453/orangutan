package examples.practice;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/9/2021, Saturday
 **/

import java.util.ArrayList;
import java.util.Scanner;

/**
 * What this program snippet doing?
 **/
public class Practice {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        // arrayList.add("str1"); // Adding String
        arrayList.add(23);  // Adding int
        arrayList.add(342); // Adding int
        //  arrayList.add(new Scanner(System.in)); // Adding Object

        // Now if we print
        // int a = arrayList.get(2); -> this gives error since compiler doesn't know if arrayList.get(2) is integer or any other type
        // we will need to type cast it
        int a = arrayList.get(0);
        System.out.println(a);

    }
}


