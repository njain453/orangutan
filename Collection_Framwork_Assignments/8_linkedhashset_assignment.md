
####  1) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset without using an iterator.

```java
package com.examples.collection.assignment;

/*
1) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset without using an iterator.
 */

import java.util.LinkedHashSet;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);

        System.out.println("Original LinkedHashSet elements are" + lhs);

    }

}

```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
```

####  2) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset using an iterator.

```java
package com.examples.collection.assignment;

/*
2) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset using an iterator.
 */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);

        System.out.println("Original LinkedHashSet elements are" + lhs);

        Iterator i = lhs.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}

```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
8
15
11
3
2
```

####  3) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset in ascending order.

```java
package com.examples.collection.assignment;

/*
3) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset in ascending order.
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);

        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>(lhs);
        Collections.sort(llist);

        System.out.println("elements Sorted in Ascending order :");
        Iterator i = llist.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}

```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
elements Sorted in Ascending order :
2
3
8
11
15
```

####  4) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset in descending order.

```java
package com.examples.collection.assignment;

/*
4) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset in descending order.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);

        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>(lhs);
        Collections.sort(llist, new CustomComparator());

        System.out.println("elements Sorted in Descending order :");
        Iterator i = llist.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}
  class CustomComparator implements Comparator<Integer> {

      @Override
      public int compare(Integer o1, Integer o2) {
          return o2 -o1;
      }

  }

```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
elements Sorted in Descending order :
15
11
8
3
2
```

####  5) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset in descending order using descending iterator.

```java
package com.examples.collection.assignment;

/*
5) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset in descending order using descending iterator.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);

        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>(lhs);


        System.out.println("elements Sorted using Descending iterator order :");
        Iterator i = llist.descendingIterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
elements Sorted using Descending iterator order :
2
3
11
15
8
```

####  6) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.assignment;

/*
6) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now add 9 to the first position of the list. Add 6 at the last position of the list.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);



        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>();
        llist.addAll(lhs);
        llist.add(0,9);
        llist.add(6);


        System.out.println("elements after above Operations :");
        Iterator i = llist.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
elements after above Operations :
9
8
15
11
3
2
6
```

####  7) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now add 7 at the position 3 of the linkedhashset.

```java
package com.examples.collection.assignment;

/*
7) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now add 7 at the position 3 of the linkedhashset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);



        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>();
        llist.addAll(lhs);
        llist.add(3,7);



        System.out.println("elements after above Operations :");
        Iterator i = llist.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
elements after above Operations :
8
15
11
7
3
2
```

####  8) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now remove an element from position 2 from the linkedhashset.

```java
package com.examples.collection.assignment;

/*
8) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now remove an element from position 2 from the linkedhashset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);



        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>();
        llist.addAll(lhs);
        llist.remove(2);



        System.out.println("elements after above Operations :");
        Iterator i = llist.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
elements after above Operations :
8
15
3
2
```

####  9) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now create a new linkedhashset and copy the previous linkedhashset into it and display the new linkedhashset.

```java
package com.examples.collection.assignment;

/*
9) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now create a new linkedhashset and copy the previous linkedhashset into it and display the new linkedhashset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);



        System.out.println("Original LinkedHashSet elements are" + lhs);


        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>(lhs);


        System.out.println("New LinkedHashSet Elements are :");
        Iterator i = lhs2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
New LinkedHashSet Elements are :
8
15
11
3
2
```

####  10) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now create a new linkedhashset and copy the previous linkedhashset in ascending order into it and display the new linkedhashset.

```java
package com.examples.collection.assignment;

/*
10) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now create a new linkedhashset and copy the previous linkedhashset in ascending order into it and display the new linkedhashset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);



        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>();
        llist.addAll(lhs);
        Collections.sort(llist, new CustomComparator());


        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>(llist);


        System.out.println("New LinkedHashSet Elements are :");
        Iterator i = lhs2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}

class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 -o2;
    }
}

```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
New LinkedHashSet Elements are :
2
3
8
11
15
```

####  11) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now create a new linkedhashset and copy the previous linkedhashset in descending order into it and display the new linkedhashset.

```java
package com.examples.collection.assignment;

/*
11) Write a Java program to insert 8, 15,11, 3, 2 in a linkedhashset and display the whole linkedhashset. Now create a new linkedhashset and copy the previous linkedhashset in descending order into it and display the new linkedhashset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(8);
        lhs.add(15);
        lhs.add(11);
        lhs.add(3);
        lhs.add(2);



        System.out.println("Original LinkedHashSet elements are" + lhs);

        LinkedList<Integer> llist = new LinkedList<>();
        llist.addAll(lhs);
        Collections.sort(llist, new CustomComparator());


        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>(llist);


        System.out.println("New LinkedHashSet Elements are :");
        Iterator i = lhs2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}

class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 -o1;
    }
}

```

```
Original LinkedHashSet elements are[8, 15, 11, 3, 2]
New LinkedHashSet Elements are :
15
11
8
3
2
```


