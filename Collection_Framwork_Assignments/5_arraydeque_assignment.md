
####  1) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque without using an iterator.

```java
package com.examples.collection.day23;
/*

1) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque without using an iterator.

 */

import java.util.ArrayDeque;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " +adq);


        }
    }
```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
```

#### 2) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque using an iterator.

```java
package com.examples.collection.day23;
/*

2) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque using an iterator.

 */

import java.util.ArrayDeque;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " +adq);

        Iterator i = adq.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


        }
    }


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
8
15
11
3
2
```


#### 3) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque in ascending order.

```java
package com.examples.collection.day23;
/*
3) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque in ascending order.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " +adq);
         
        // Creating list for sorting 
        LinkedList<Integer> lList = new LinkedList<>(adq);
        Collections.sort(lList);
        Iterator i = lList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        }
    }


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
2
3
8
11
15
```

#### 4) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque in descending order.

```java
package com.examples.collection.day23;
/*

4) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque in descending order.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " +adq);

        // Creating list for sorting
        LinkedList<Integer> lList = new LinkedList<>(adq);
        Collections.reverse(lList);
        Iterator i = lList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        }
    }


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
2
3
11
15
8
```

#### 5) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque in descending order using descending iterator.

```java
package com.examples.collection.day23;
/*

5) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque in descending order using descending iterator.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " +adq);

        // Creating list for sorting
        LinkedList<Integer> lList = new LinkedList<>(adq);

        Iterator i = lList.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        }
    }


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
2
3
11
15
8
```

#### 6) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.day23;
/*

6) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now add 9 to the first position of the list. Add 6 at the last position of the list.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " +adq);

        // Adding more elements
        adq.addFirst(9);
        adq.addLast(6);

        System.out.println(adq);


        }
    }


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
[9, 8, 15, 11, 3, 2, 6]
```


#### 7) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now add 7 at the position 3 of the arraydeque.

```java
package com.examples.collection.day23;
/*

7) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now add 7 at the position 3 of the arraydeque.
 */

import java.sql.Array;
import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " + adq);

        // Adding more elements

        ArrayList<Integer> al = new ArrayList<>(adq);
        al.add(3, 7);
        System.out.println(al);

    }
}


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
[8, 15, 11, 7, 3, 2]
```


#### 8) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now remove an element from position 2 from the arraydeque.

```java
package com.examples.collection.day23;
/*

8) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now remove an element from position 2 from the arraydeque.
 */

import java.sql.Array;
import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " + adq);

        // Adding more elements

        ArrayList<Integer> al = new ArrayList<>(adq);
        al.remove(2);
        System.out.println(al);

    }
}

```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
[8, 15, 3, 2]
```


#### 9) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now create a new arraydeque and copy the previous arraydeque into it and display the new arraydeque.

```java
package com.examples.collection.day23;
/*

9) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now create a new arraydeque and copy the previous arraydeque into it and display the new arraydeque.
 
 */

 
import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " + adq);

        ArrayDeque<Integer> adq1 = new ArrayDeque<>(adq);
        System.out.println(adq1);

         

    }
}


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
[8, 15, 11, 3, 2]
```


#### 10) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now create a new arraydeque and copy the previous arraydeque in ascending order into it and display the new arraydeque.

```java
package com.examples.collection.day23;
/*

10) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now create a new arraydeque and copy the previous arraydeque in ascending order into it and display the new arraydeque.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " + adq);
        ArrayList<Integer> al = new ArrayList<>(adq);
        Collections.sort(al);

        ArrayDeque<Integer> adq1 = new ArrayDeque<>(al);

        System.out.println(adq1);



    }
}


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
[2, 3, 8, 11, 15]
```


#### 11) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now create a new arraydeque and copy the previous arraydeque in descending order into it and display the new arraydeque.

```java
package com.examples.collection.day23;
/*

11) Write a Java program to insert 8, 15,11, 3, 2 in a arraydeque and display the whole arraydeque. Now create a new arraydeque and copy the previous arraydeque in descending order into it and display the new arraydeque.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(8);
        adq.add(15);
        adq.add(11);
        adq.add(3);
        adq.add(2);

        System.out.println("Original ArrayDeque elements are " + adq);
        ArrayList<Integer> al = new ArrayList<>(adq);
        Collections.reverse(al);

        ArrayDeque<Integer> adq1 = new ArrayDeque<>(al);

        System.out.println(adq1);



    }
}


```

```
Original ArrayDeque elements are [8, 15, 11, 3, 2]
[2, 3, 11, 15, 8]
```


 
