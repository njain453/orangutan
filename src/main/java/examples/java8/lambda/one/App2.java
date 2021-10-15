package examples.java8.lambda.one;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/15/2021, Friday
 **/

import java.util.ArrayList;

/**
 What this program snippet doing?
 Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
 **/
public class App2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(14);
        arrayList.add(21);

        arrayList.forEach((n) -> {
                                   System.out.println(n);     // lambda expression: parameter -> expression
                                 });
    }



}
