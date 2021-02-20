
#### 1) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist without using an iterator.

```java
package com.examples.collection.day23;
/*

1) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist without using an iterator.

 */

import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println("LinkedList elements are " +obj);

        }
    }


```
```
LinkedList elements are [8, 15, 11, 3, 2]
```

#### 2) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist using an iterator.

```java
package com.examples.collection.day23;
/*

2) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist using an iterator.

 */

import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("LinkedList elements are " +lList);

        Iterator i = lList.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
LinkedList elements are [8, 15, 11, 3, 2]
8
15
11
3
2
```

####  3) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist in ascending order.

```java
package com.examples.collection.day23;
/*

3) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist in ascending order.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);
        Collections.sort(lList);

        Iterator i = lList.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
2
3
8
11
15
```

#### 4) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist in descending order.

```java
package com.examples.collection.day23;
/*

4) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist in descending order.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);
        Collections.reverse(lList);

        Iterator i = lList.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
2
3
11
15
8
```

####  5) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist in descending order using descending iterator.

```java
package com.examples.collection.day23;
/*

5) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist in descending order using descending iterator.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);


        Iterator i = lList.descendingIterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
2
3
11
15
8
```

#### 6) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.day23;
/*

6) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now add 9 to the first position of the list. Add 6 at the last position of the list.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);

        lList.addFirst(9);
        lList.addLast(6);

        Iterator i = lList.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
9
8
15
11
3
2
6
```

#### 7) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now add 7 at the position 3 of the linkedlist.

```java
package com.examples.collection.day23;
/*
7) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now add 7 at the position 3 of the linkedlist.
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);

        lList.add(3,7);


        Iterator i = lList.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
8
15
11
7
3
2
```

#### 8) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now remove an element from position 2 from the linkedlist.

```java
package com.examples.collection.day23;
/*
8) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now remove an element from position 2 from the linkedlist.
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);

        lList.remove(2);

        Iterator i = lList.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
8
15
3
2

```

#### 9) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now create a new linkedlist and copy the previous linkedlist into it and display the new linkedlist.

```java
package com.examples.collection.day23;
/*

9) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now create a new linkedlist and copy the previous linkedlist into it and display the new linkedlist.
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);

        LinkedList<Integer> lList2 = new LinkedList<>(lList);

        Iterator i = lList2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
8
15
11
3
2
```

#### 10) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now create a new linkedlist and copy the previous linkedlist in ascending order into it and display the new linkedlist.

```java
package com.examples.collection.day23;
/*

10) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now create a new linkedlist and copy the previous linkedlist in ascending order into it and display the new linkedlist.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);
        Collections.sort(lList);
        LinkedList<Integer> lList2 = new LinkedList<>(lList);

        Iterator i = lList2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
2
3
8
11
15
```

#### 11) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now create a new linkedlist and copy the previous linkedlist in descending order into it and display the new linkedlist.

```java
package com.examples.collection.day23;
/*

11) Write a Java program to insert 8, 15,11, 3, 2 in a linkedlist and display the whole linkedlist. Now create a new linkedlist and copy the previous linkedlist in descending order into it and display the new linkedlist.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();

        lList.add(8);
        lList.add(15);
        lList.add(11);
        lList.add(3);
        lList.add(2);

        System.out.println("Original LinkedList elements are " +lList);
        Collections.reverse(lList);
        LinkedList<Integer> lList2 = new LinkedList<>(lList);

        Iterator i = lList2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

        }
    }


```
```
Original LinkedList elements are [8, 15, 11, 3, 2]
2
3
11
15
8
```
