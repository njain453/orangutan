
#### 1) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue without using an iterator.

```java
package com.examples.collection.day23;
/*

1) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue without using an iterator.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
```

#### 2) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue using an iterator.

```java
package com.examples.collection.day23;
/*

2) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue using an iterator.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);

        Iterator i = pq.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
2
3
11
15
8
```

#### 3) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue in ascending order.

```java
package com.examples.collection.day23;
/*

3) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue in ascending order.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);

        List<Integer> list = new ArrayList<>(pq);
        Collections.sort(list);


        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
2
3
8
11
15
```

#### 4) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue in descending order.

```java
package com.examples.collection.day23;
/*

4) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue in descending order.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);

        List<Integer> list = new ArrayList<>(pq);
        Collections.reverse(list);


        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
8
15
11
3
2
```

#### 5) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue in descending order using descending iterator.

```java
package com.examples.collection.day23;
/*

5) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue in descending order using descending iterator.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);

        LinkedList<Integer> list = new LinkedList<>(pq);



        Iterator i = list.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
8
15
11
3
2
```

#### 6) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.day23;
/*

6) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now add 9 to the first position of the list. Add 6 at the last position of the list.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);



        LinkedList<Integer> list = new LinkedList<>(pq);
        list.addFirst(9);
        list.addLast(6);


        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
9
2
3
11
15
8
6
```

#### 7) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now add 7 at the position 3 of the priorityqueue.

```java
package com.examples.collection.day23;
/*


7) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now add 7 at the position 3 of the priorityqueue.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);



        LinkedList<Integer> list = new LinkedList<>(pq);
        list.add(3,7);



        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
2
3
11
7
15
8

```

#### 8) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now remove an element from position 2 from the priorityqueue.

```java
package com.examples.collection.day23;
/*

8) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now remove an element from position 2 from the priorityqueue.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);
        
        // Converting to LinkedList 
        LinkedList<Integer> list = new LinkedList<>(pq);
        list.remove(2);

        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
2
3
15
8
```

#### 9) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now create a new priorityqueue and copy the previous priorityqueue into it and display the new priorityqueue

```java
package com.examples.collection.day23;
/*

9) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now create a new priorityqueue and copy the previous priorityqueue into it and display the new priorityqueue.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(pq);

        Iterator i = pq1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
2
3
11
15
8
```

#### 10) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now create a new priorityqueue and copy the previous priorityqueue in ascending order into it and display the new priorityqueue.

```java
package com.examples.collection.day23;
/*

10) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now create a new priorityqueue and copy the previous priorityqueue in ascending order into it and display the new priorityqueue.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);

        // Since we cannot sort pq directly using Collections.sort hence we will use Linkedlist here
        LinkedList<Integer> llist = new LinkedList<>(pq);
        Collections.sort(llist);

        // creating another priorityqueue by passing LinkedList object.
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(llist);

        Iterator i = pq1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());   
        }


    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
2
3
8
11
15
```

#### 

```java
package com.examples.collection.day23;
/*

11) Write a Java program to insert 8, 15,11, 3, 2 in a priorityqueue and display the whole priorityqueue. Now create a new priorityqueue and copy the previous priorityqueue in descending order into it and display the new priorityqueue.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(8);
        pq.add(15);
        pq.add(11);
        pq.add(3);
        pq.add(2);

        System.out.println("Original ArrayDeque elements are " + pq);

        // Since we cannot sort pq directly using Collections.sort hence we will use Linkedlist here
        LinkedList<Integer> llist = new LinkedList<>(pq);

        Collections.sort(llist,new CustomComparator());

        System.out.println(llist);  // Print Linked list in descending order

        // creating another priorityqueue by passing LinkedList object.
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(llist);

        Iterator i = pq1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}

class CustomComparator implements  Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 -o1;
    }
}

```

```
Original ArrayDeque elements are [2, 3, 11, 15, 8]
[15, 11, 8, 3, 2]
2
3
8
15
11

```

