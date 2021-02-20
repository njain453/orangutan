
#### 1.Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector without using an iterator.

```java
/*
Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector without using an iterator.
 */

package com.examples.collection.day23;

import java.util.Vector;
 
public class App {

     Vector<Integer> vector1 = new Vector<>();

    public static void main(String[] args) {
  
        App obj = new App();
        obj.vector1.addElement(8);
        obj.vector1.addElement(15);
        vector1.addElement(11);
        vector1.addElement(3);
        vector1.addElement(2);

        System.out.println(vector1);


    }
}

```
```
[8, 15, 11, 3, 2]
```
#### 2. Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector using an iterator.

```java

/*
Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector  using an iterator.
 */
package com.examples.collection.day23;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class App {

    static Vector<Integer> vector1 = new Vector<>();

    public static void main(String[] args) {

        vector1.addElement(8);
        vector1.addElement(15);
        vector1.addElement(11);
        vector1.addElement(3);
        vector1.addElement(2);

        Iterator i = vector1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }



    }
}

```
```
8
15
11
3
2
```

#### 3. Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector in ascending order.

```java
/*
Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector in ascending order.
 */

package com.examples.collection.day23;

import java.util.Collections;
import java.util.Vector;
 
public class App {

    static Vector<Integer> vector1 = new Vector<>();

    public static void main(String[] args) {

        vector1.addElement(8);
        vector1.addElement(15);
        vector1.addElement(11);
        vector1.addElement(3);
        vector1.addElement(2);

        Collections.sort(vector1);

        System.out.println(vector1);


    }
}
```

```
[2, 3, 8, 11, 15]
```
#### 4.Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector in descending order.

```java
/*
Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector in descending order.
 */

package com.examples.collection.day23;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
 
public class App {

    static Vector<Integer> vector1 = new Vector<>();

    public static void main(String[] args) {

        vector1.addElement(8);
        vector1.addElement(15);
        vector1.addElement(11);
        vector1.addElement(3);
        vector1.addElement(2);

       Collections.reverse(vector1);
        System.out.println(vector1);



    }
}

```
```
[2, 3, 11, 15, 8]
```

#### 5.  Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector in descending order using descending iterator.

```java
/*
Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector in descending order using descending iterator.
 */

package com.examples.collection.day23;

 
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    static LinkedList<Integer> lList = new LinkedList<>();

    public static void main(String[] args) {

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        Iterator i = lList.descendingIterator();

        while (i.hasNext()) {

            System.out.println(i.next());
        }






    }
}

```
```
2
3
11
15
8
```

#### 6) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.day23;

/*
6) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now add 9 to the first position of the list. Add 6 at the last position of the list.
 */

import java.util.Iterator;
import java.util.Vector;


public class App {

    static Vector<Integer> vector1 = new Vector<>();

    public static void main(String[] args) {

        vector1.add(8);
        vector1.add(15);
        vector1.add(11);
        vector1.add(3);
        vector1.add(2);

        System.out.println(vector1);
        vector1.add(0,9);
        vector1.add(vector1.size(),6);

        Iterator i = vector1.iterator();

        while (i.hasNext()) {

            System.out.println(i.next());
        }

    }
}


```

```
[8, 15, 11, 3, 2]
9
8
15
11
3
2
6
```

#### 7) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now add 7 at the position 3 of the vector.

```java
package com.examples.collection.day23;

/*
7) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now add 7 at the position 3 of the vector.
 */

import java.util.Iterator;
import java.util.Vector;


public class App {

    static Vector<Integer> vector1 = new Vector<>();

    public static void main(String[] args) {

        vector1.add(8);
        vector1.add(15);
        vector1.add(11);
        vector1.add(3);
        vector1.add(2);

        System.out.println(vector1);
        vector1.add(3,7);


        Iterator i = vector1.iterator();

        while (i.hasNext()) {

            System.out.println(i.next());
        }

    }
}

```
```
[8, 15, 11, 3, 2]
8
15
11
7
3
2
```
#### 8) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now remove an element from position 2 from the vector.

```java
package com.examples.collection.day23;

/*
8) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now remove an element from position 2 from the vector.
 */

import java.util.Iterator;
import java.util.Vector;


public class App {

    static Vector<Integer> vector1 = new Vector<>();

    public static void main(String[] args) {

        vector1.add(8);
        vector1.add(15);
        vector1.add(11);
        vector1.add(3);
        vector1.add(2);

        System.out.println(vector1);
        vector1.remove(2);


        Iterator i = vector1.iterator();

        while (i.hasNext()) {

            System.out.println(i.next());
        }

    }
}

```
```
[8, 15, 11, 3, 2]
8
15
3
2
```

####  9) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now create a new vector and copy the previous vector into it and display the new vector.

```java
package com.examples.collection.day23;
/*
9) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now create a new vector and copy the previous vector into it and display the new vector.
 */

import java.util.Vector;
public class App {

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();

        vector1.add(8);
        vector1.add(15);
        vector1.add(11);
        vector1.add(3);
        vector1.add(2);

        System.out.println(vector1);
        Vector<Integer> vector2 = new Vector<>(vector1);
        System.out.println(vector2);


    }
}

```
```
[8, 15, 11, 3, 2]
[8, 15, 11, 3, 2]
```

####  10) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now create a new vector and copy the previous vector in ascending order into it and display the new vector

```java
package com.examples.collection.day23;
/*

10) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now create a new vector and copy the previous vector in ascending order into it and display the new vector

 */

import java.util.Collections;
import java.util.Vector;
public class App {

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();

        vector1.add(8);
        vector1.add(15);
        vector1.add(11);
        vector1.add(3);
        vector1.add(2);

        System.out.println(vector1);
        Collections.sort(vector1);
        Vector<Integer> vector2 = new Vector<>(vector1);
        System.out.println(vector2);


    }
}

```
```
[8, 15, 11, 3, 2]
[2, 3, 8, 11, 15]
```

####  11) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now create a new vector and copy the previous vector in descending order into it and display the new vector.

```java
package com.examples.collection.day23;
/*
11) Write a Java program to insert 8, 15,11, 3, 2 in a vector and display the whole vector. Now create a new vector and copy the previous vector in descending order into it and display the new vector.

 */

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
public class App {

    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();


        vector1.add(8);
        vector1.add(15);
        vector1.add(11);
        vector1.add(3);
        vector1.add(2);

        System.out.println(vector1);
        Vector<Integer> vector3 = new Vector<Integer>(vector1);

        Collections.reverse(vector1); // here descending order is for order of insertion of elements to the list.
        Vector<Integer> vector2 = new Vector<>(vector1);
        System.out.println(vector2);


        vector3.sort(Comparator.reverseOrder());// here actual elements in the list will be sorted in descending order
        System.out.println(vector3);
        
    }
}

```
```
[8, 15, 11, 3, 2]
[2, 3, 11, 15, 8]
[15, 11, 8, 3, 2]
```
