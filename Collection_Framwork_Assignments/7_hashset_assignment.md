
#### 1) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset without using an iterator.

```java
package com.examples.collection.assignment;
/*

1) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset without using an iterator.

 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);

        System.out.println("Original hashset elements are " + hs); // No guarantee is made as to the iteration order of the set which means that the class does not guarantee the constant order of elements over time

    }
}

```

```
Original HashSet elements are [2, 3, 8, 11, 15]
```

#### 2) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset using an iterator.

```java
package com.examples.collection.assignment;
/*

2) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset using an iterator.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);

        System.out.println("Original hashset elements are " + hs);

        Iterator i = hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
2
3
8
11
15
```

#### 3) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset in ascending order.

```java
package com.examples.collection.assignment;
/*

3) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset in ascending order.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);

        System.out.println("Original hashset elements are " + hs);

        LinkedList<Integer> llist = new LinkedList<>(hs); // Although in (2) output is ascending order but we cant take it as granted as actual ordering is random
        
        Collections.sort(llist);

        Iterator i = llist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
2
3
8
11
15

```

#### 4) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset in descending order. 

```java
package com.examples.collection.assignment;
/*

4) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset in descending order.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);

        System.out.println("Original hashset elements are " + hs);

        LinkedList<Integer> llist = new LinkedList<>(hs);
        Collections.sort(llist, new Customcomparator());

        Iterator i = llist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
class Customcomparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2- o1;
    }
}
```

```
Original hashset elements are [2, 3, 8, 11, 15]
15
11
8
3
2
```

####  5) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset in descending order using descending iterator.

```java
package com.examples.collection.assignment;
/*

5) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset in descending order using descending iterator.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);

        System.out.println("Original hashset elements are " + hs);

        LinkedList<Integer> llist = new LinkedList<>(hs);


        Iterator i = llist.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
15
11
8
3
2
```

#### 6) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.assignment;
/*

6) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now add 9 to the first position of the list. Add 6 at the last position of the list.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);

        System.out.println("Original hashset elements are " + hs);

        LinkedList<Integer> llist = new LinkedList<>(hs);
        llist.add(0,9);
        llist.add(6);


        Iterator i = llist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
9
2
3
8
11
15
6
```

####  7) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now add 7 at the position 3 of the hashset.

```java
package com.examples.collection.assignment;
/*

7) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now add 7 at the position 3 of the hashset.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);

        System.out.println("Original hashset elements are " + hs);

        LinkedList<Integer> llist = new LinkedList<>(hs);
        llist.add(3,7);

        Iterator i = llist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
2
3
8
7
11
15
```

#### 8) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now remove an element from position 2 from the hashset. 

```java
package com.examples.collection.assignment;
/*

8) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now remove an element from position 2 from the hashset.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);


        System.out.println("Original hashset elements are " + hs);

        LinkedList<Integer> llist = new LinkedList<>(hs);
        llist.remove(2);

        Iterator i = llist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
2
3
11
15
```


####  9) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now create a new hashset and copy the previous hashset into it and display the new hashset.

```java
package com.examples.collection.assignment;
/*

9) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now create a new hashset and copy the previous hashset into it and display the new hashset.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);


        System.out.println("Original hashset elements are " + hs);

        HashSet<Integer> hs2 = new HashSet<>(hs);

        Iterator i = hs2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
2
3
8
11
15
```


####  10) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now create a new hashset and copy the previous hashset in ascending order into it and display the new hashset.

```java
package com.examples.collection.assignment;
/*

10) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now create a new hashset and copy the previous hashset in ascending order into it and display the new hashset.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);


        System.out.println("Original hashset elements are " + hs);

        LinkedList<Integer> llist = new LinkedList<>(hs);
        Collections.sort(llist);

        HashSet<Integer> hs2 = new HashSet<>(llist);

        Iterator i = hs2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original hashset elements are [2, 3, 8, 11, 15]
2
3
8
11
15
```


#### 11) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now create a new hashset and copy the previous hashset in descending order into it and display the new hashset. 

```java
package com.examples.collection.assignment;
/*

11) Write a Java program to insert 8, 15,11, 3, 2 in a hashset and display the whole hashset. Now create a new hashset and copy the previous hashset in descending order into it and display the new hashset.

 */

import java.util.*;

public class App2 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(8);
        hs.add(15);
        hs.add(11);
        hs.add(3);
        hs.add(2);


        System.out.println("Original hashset elements are " + hs);

        List<Integer> llist = new ArrayList<>(hs);
        Collections.sort(llist, new Customcomparator());

        System.out.println("List in descending order " + llist);

        HashSet<Integer> hs2 = new HashSet<>(llist);

        Iterator i = hs2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

class Customcomparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 -o1;
    }
}
```

```
Original hashset elements are [2, 3, 8, 11, 15]
List in descending order [15, 11, 8, 3, 2]
2
3
8
11
15
```


