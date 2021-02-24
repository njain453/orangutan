
#### 1) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList without using an iterator.

```java
/*
Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList without using an iterator.
 */

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Complete ArrayList is " + obj1);

        System.out.println("List of ArrayList Values are ");

        for (int i = 0; i < obj1.size(); i++) {

            System.out.println(obj1.get(i));

        }

    }

}
```

```
Complete ArrayList is [8, 15, 11, 3, 2]
List of ArrayList Values are 
8
15
11
3
2
```

#### 2) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList using an iterator.

```java

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Complete ArrayList is " + obj1);

        System.out.println("List of ArrayList Values are ");

        Iterator i = obj1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
```

```
Complete ArrayList is [8, 15, 11, 3, 2]
List of ArrayList Values are 
8
15
11
3
2
```

#### 3) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList in ascending order.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        Collections.sort(obj1);

        System.out.println("List of ArrayList Values in ascending order are ");

        Iterator i = obj1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}

```
```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
List of ArrayList Values in ascending order are 
2
3
8
11
15
```

#### 4) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList in descending order.
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        Collections.sort(obj1, Comparator.reverseOrder());
        // Collections.reverse(obj1); -> can also be usd to achieve same. 

        System.out.println("List of ArrayList Values in descending order are ");

        Iterator i = obj1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
```

```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
List of ArrayList Values in descending order are 
15
11
8
3
2
```

#### 5) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList in descending order using descending iterator.

```java
package com.examples.collection.day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList in descending order using descending iterator.
 */
public class Test {


    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<>();


        aList.add(8);
        aList.add(15);
        aList.add(11);
        aList.add(3);
        aList.add(2);

        LinkedList<Integer> lList = new LinkedList<>(aList);

        Iterator i1 = lList.descendingIterator();
      

        int sizeOfaList = aList.size();

        while (i1.hasNext() && sizeOfaList > 0) {
            System.out.println(i1.next());
            sizeOfaList--;

        }


    }


}
```

```
Since Only LinkedList have got descending iterator method so I am using linkedList iterator for traversing elements in descending ordet. 
Also, LinkedList have no fixed size so we have to use size method for looping. 
2
3
11
15
8
```

#### 6) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
/*
Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList. Now add 9 to the first position of the list. Add 6 at the last position of the list.
 */
import java.util.ArrayList;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        // Performing operation on List

        obj1.add(0,9);
        obj1.add(6); // default element added at last position only.



        System.out.println("List of ArrayList Values after above Operations are  ");

        Iterator i = obj1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
```

```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
List of ArrayList Values after above Operations are 
9
8
15
11
3
2
6
```

#### 7) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList. Now add 7 at the position 3 of the ArrayList.

```java
 
import java.util.ArrayList;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        // Performing operation on List

        obj1.add(3,7);
        

        System.out.println("List of ArrayList Values after above Operations are ");

        Iterator i = obj1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}

```

```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
List of ArrayList Values after above Operations are 
8
15
11
7
3
2
```

#### 8) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList. Now remove an element from position 2 from the ArrayList.

```java
import java.util.ArrayList;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        // Performing operation on List

        obj1.remove(2);


        System.out.println("List of ArrayList Values after above Operations are ");

        Iterator i = obj1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
```
```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
List of ArrayList Values after above Operations are 
8
15
3
2
```

#### 9) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList. Now create a new ArrayList and copy the previous ArrayList into it and display the new ArrayList.

```java

import java.util.ArrayList;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        // Performing operation on List

         ArrayList<Integer> obj2 = new ArrayList<>(obj1);  // copy list at time of creation of new list. 
         // obj2.addAll(obj1);// This is another way to copy  Arraylist from one object to another. 

        System.out.println("Values of Second ArrayList is ");

        Iterator i = obj2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
```

```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
Values of Second ArrayList is 
8
15
11
3
2
```

#### 10) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList. Now create a new ArrayList and copy the previous ArrayList in ascending order into it and display the new ArrayList.

```java

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        // Performing operation on List
         Collections.sort(obj1);
         ArrayList<Integer> obj2 = new ArrayList<>(obj1);


        System.out.println("Values of Second ArrayList is ");

        Iterator i = obj2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
```

```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
Values of Second ArrayList is 
2
3
8
11
15
```

#### 11) Write a Java program to insert 8, 15,11, 3, 2 in a ArrayList and display the whole ArrayList. Now create a new ArrayList and copy the previous ArrayList in descending order into it and display the new ArrayList.

```java
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(15);
        obj1.add(11);
        obj1.add(3);
        obj1.add(2);

        System.out.println("Before Sorting ArrayList is " + obj1);

        // Performing operation on List

        CustomComparator customcomparator = new CustomComparator();
        Collections.sort(obj1,customcomparator);

         ArrayList<Integer> obj2 = new ArrayList<>(obj1);


        System.out.println("Values of Second ArrayList is ");

        Iterator i = obj2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}

class  CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
```

```
Before Sorting ArrayList is [8, 15, 11, 3, 2]
Values of Second ArrayList is 
15
11
8
3
2
```
