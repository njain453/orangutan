package examples.practice;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/11/2021, Monday
 **/

/**
 What this program snippet doing?
 **/
interface Cat {     //Cat Interface refers => Iterator Interface of Collection Framework,  it has got hasNext(), Next(), remove() methods etc.
    void meeeeow();
}
public class App1 {     // App1 => ArrayList  class which implements List<>

    public Cat nextCat() {    // this is nextCat() method which is returning object of Cat type.
        // So object name is same name as parent interface so its  trigger point is anonymous object creation. CAt is now class rather than interface.
        // nextCat => iterator()

        return new Cat() {       // anonymous class method can be called with Cat object only.
            public void meeeeow() {   // same as  hasNext(), Next(), remove()

                System.out.println("meeeeeeeeeow!!!!");
            }
        };
    }
    public static void main(String Args[])

    {
        //  Cat obj1= new Cat();
        App1 obj= new App1();   // obj is object of App1 which is can be assumed same as ArrayList
        Cat c= obj.nextCat();   // obj is calling method of class App1 which is nextCat and it returns object of Cat class. so this can call method of Cat class( which is anonymous class)
        // same happens in case of ArrayList Object calling iterator() method which returns Iterator object and it can call methods of Iterator class which are hasNext() etc.
        c.meeeeow();

    }
}
