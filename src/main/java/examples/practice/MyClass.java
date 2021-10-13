package examples.practice;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/9/2021, Saturday
 **/

/**
 What this program snippet doing?
 **/
public class MyClass {

    public static void main(String[] args) {

        MyGeneric<String,Integer> myGeneric = new MyGeneric<>(24,"This is MyString", 234);
        System.out.println(myGeneric.getT1());
        System.out.println(myGeneric.getT2());


    }
}
