
##### 1) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset without using an iterator.

```java
package com.examples.collection.assignment;

/*
1) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset without using an iterator.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);


        System.out.println("Original TreeSet elements are" + ts);
        
    }

}

```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
```

##### 2) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset using an iterator.

```java
package com.examples.collection.assignment;

/*
2) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset using an iterator.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);
        
        System.out.println("Original TreeSet elements are" + ts);

        System.out.println("TreeSet Elements after Operations are :");
        Iterator i = ts.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());  // it will print in ascending order only since by default tree set elements aer sorted
        }

    }

}

```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
TreeSet Elements after Operations are :
2
3
8
11
15
```

##### 3) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset in ascending order.

```java
package com.examples.collection.assignment;

/*
3) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset in ascending order.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);

        System.out.println("Original TreeSet elements are" + ts);

        System.out.println("TreeSet Elements after Operations are :");
        Iterator i = ts.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());  // it will print in ascending order only since by default tree set elements aer sorted
        }

    }

}

```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
TreeSet Elements after Operations are :
2
3
8
11
15
```

##### 4) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset in descending order.

```java
package com.examples.collection.assignment;

/*
4) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset in descending order.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);

        System.out.println("Original TreeSet elements are" + ts);

        LinkedList<Integer> llist = new LinkedList<>(ts);
        Collections.sort(llist,new CustomComparator()); // Change to LinkedList for descending order

        System.out.println("Elements after Operations are :");
        Iterator i = llist.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}
class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
Elements after Operations are :
15
11
8
3
2
```

##### 5) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset in descending order using descending iterator.

```java
package com.examples.collection.assignment;

/*
5) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset in descending order using descending iterator.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);

        System.out.println("Original TreeSet elements are" + ts);

        LinkedList<Integer> llist = new LinkedList<>(ts);


        System.out.println("Elements after Operations are :");
        Iterator i = llist.descendingIterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
Elements after Operations are :
15
11
8
3
2
```


##### 6) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.assignment;

/*
6) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now add 9 to the first position of the list. Add 6 at the last position of the list.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);

        System.out.println("Original TreeSet elements are" + ts);

        LinkedList<Integer> llist = new LinkedList<>(ts);
        llist.add(0,9);
        llist.add(6);


        System.out.println("Elements after Operations are :");
        Iterator i = llist.descendingIterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
Elements after Operations are :
6
15
11
8
3
2
9
```


##### 7) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now add 7 at the position 3 of the treeset.

```java
package com.examples.collection.assignment;

/*
7) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now add 7 at the position 3 of the treeset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);

        System.out.println("Original TreeSet elements are" + ts);

        LinkedList<Integer> llist = new LinkedList<>(ts);
        llist.add(3,7);
   


        System.out.println("Elements after Operations are :");
        Iterator i = llist.descendingIterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}


```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
Elements after Operations are :
15
11
7
8
3
2
```


##### 8) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now remove an element from position 2 from the treeset.

```java
package com.examples.collection.assignment;

/*
8) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now remove an element from position 2 from the treeset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);

        System.out.println("Original TreeSet elements are" + ts);

        LinkedList<Integer> llist = new LinkedList<>(ts);
        llist.remove(2);



        System.out.println("Elements after Operations are :");
        Iterator i = llist.descendingIterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }

    }

}
```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
Elements after Operations are :
15
11
3
2
```


##### 9) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now create a new treeset and copy the previous treeset into it and display the new treeset.

```java
package com.examples.collection.assignment;

/*
9) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now create a new treeset and copy the previous treeset into it and display the new treeset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);


        System.out.println("Original TreeSet elements are" + ts);


        TreeSet<Integer> ts2 = new TreeSet<>(ts);


        System.out.println("New TreeSet Elements are :");
        Iterator i = ts2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());  // it will print in ascending order only since by default tree set elements aer sorted
        }

    }

}

```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
New TreeSet Elements are :
2
3
8
11
15
```

##### 10) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now create a new treeset and copy the previous treeset in ascending order into it and display the new treeset.

```java
package com.examples.collection.assignment;

/*
10) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now create a new treeset and copy the previous treeset in ascending order into it and display the new treeset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);


        System.out.println("Original TreeSet elements are" + ts);

        
        TreeSet<Integer> ts2 = new TreeSet<>(ts);


        System.out.println("New TreeSet Elements are :");
        Iterator i = ts2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());  // it will print in ascending order only since by default tree set elements aer sorted
        }

    }

}

```

```
Original TreeSet elements are[2, 3, 8, 11, 15]
New TreeSet Elements are :
2
3
8
11
15
```


##### 11) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now create a new treeset and copy the previous treeset in descending order into it and display the new treeset.

```java
package com.examples.collection.assignment;

/*
11) Write a Java program to insert 8, 15,11, 3, 2 in a treeset and display the whole treeset. Now create a new treeset and copy the previous treeset in descending order into it and display the new treeset.
 */

import java.util.*;

public class App {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(8);
        ts.add(15);
        ts.add(11);
        ts.add(3);
        ts.add(2);


        System.out.println("Original TreeSet elements are" + ts);

        LinkedList<Integer> llist = new LinkedList<>();
        llist.addAll(ts);
        Collections.sort(llist, new CustomComparator());

        System.out.println("Sorted LinkedList elements are" + llist);
        TreeSet<Integer> ts2 = new TreeSet<>(llist);


        System.out.println("New TreeSet Elements are :");
        Iterator i = ts2.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());  // it will print in ascending order only since by default tree set elements aer sorted in ascending order only.
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
Original TreeSet elements are[2, 3, 8, 11, 15]
Sorted LinkedList elements are[15, 11, 8, 3, 2]
New TreeSet Elements are :
2
3
8
11
15
```