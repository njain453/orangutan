
##### 1) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap without using an iterator.

```java
package com.examples.collection.assignment;

/* 1) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap without using an iterator.

 */
 
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> tm = new TreeMap<>();


        tm.put("Amol",8);
        tm.put("Rahul",15);
        tm.put("Dinesh",11);
        tm.put("Girish",3);
        tm.put("Amit", 2);

        System.out.println("Original TreeMap elements are" + tm);


    }
}


```
Output:
```text
Original TreeMap elements are{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
```

##### 2) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap using an iterator.

```java
package com.examples.collection.assignment;

/*  2) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap using an iterator.
 */

import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> tm = new TreeMap<>();


        tm.put("Amol",8);
        tm.put("Rahul",15);
        tm.put("Dinesh",11);
        tm.put("Girish",3);
        tm.put("Amit", 2);

        //System.out.println("Original TreeMap elements are" + tm);

        Iterator i = tm.entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}


```
Output:
```text
Amit=2
Amol=8
Dinesh=11
Girish=3
Rahul=15
```

##### 3) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap in ascending order first by key and then by value.

```java
package com.examples.collection.assignment;

/*  3) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap in ascending order first by key and then by value.
 */

import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> tm = new TreeMap<>();


        tm.put("Amol",8);
        tm.put("Rahul",15);
        tm.put("Dinesh",11);
        tm.put("Girish",3);
        tm.put("Amit", 2);

        System.out.println("Original TreeMap elements are" + tm);

        System.out.println("TreeMap elements in ascending order by key");
        tm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("TreeMap elements in ascending order by value");
        tm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}


```
Output:
```text

```

##### 4) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap in descending order first by key and then by value..

```java
package com.examples.collection.assignment;

/*  4) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap in descending order first by key and then by value..
 */

import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> tm = new TreeMap<>();


        tm.put("Amol",8);
        tm.put("Rahul",15);
        tm.put("Dinesh",11);
        tm.put("Girish",3);
        tm.put("Amit", 2);

        System.out.println("Original TreeMap elements are" + tm);

        System.out.println("TreeMap elements in descending order by key");
        tm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("TreeMap elements in descending order by value");
        tm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }
}


```
Output:
```text
Original TreeMap elements are{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
TreeMap elements in descending order by key
Rahul=15
Girish=3
Dinesh=11
Amol=8
Amit=2
TreeMap elements in descending order by value
Rahul=15
Dinesh=11
Amol=8
Girish=3
Amit=2
```

##### 5) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap in descending order using descending iterator.

```java

```
Output:
```text
NA 
```

##### 6) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap. Now add ("Tom",9) to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.assignment;

/* 6) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap. Now add ("Tom",9) to the first position of the list. Add 6 at the last position of the list.

 */
import java.sql.SQLOutput;
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> lhm = new TreeMap<>();

        // Defining LinkedHashMap to maintain insertion order
        LinkedHashMap<String,Integer> lhm1 = new LinkedHashMap<>();

        lhm.put("Amol",8);
        lhm.put("Rahul",15);
        lhm.put("Dinesh",11);
        lhm.put("Girish",3);
        lhm.put("Amit", 2);

        System.out.println("Original TeeMap elements are" + lhm);

        // Get Keys in ArrayList
        Set<String> ts ;
        ts = lhm.keySet();
        ArrayList<String> alist = new ArrayList<>(ts);

        //Get Values in another ArrayList
        Collection getValues = lhm.values();
        ArrayList<Integer> alist1 = new ArrayList<>(getValues);

        lhm1.put("Tom",9);

        for(Map.Entry entry : lhm.entrySet()){
            //System.out.println(entry);
            lhm1.put((String)entry.getKey(),(Integer) entry.getValue());
        }
        lhm1.put("Jerry",6);

        System.out.println("Modified TreeMap elements After Operations are" + lhm1);




    }
}
```
Output:
```text
Original TeeMap elements are{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
Modified TreeMap elements After Operations are{Tom=9, Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15, Jerry=6}
```

##### 7) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap. Now add 7 at the position 3 of the TreeMap.

```java

```
Output:
```text
NA Map doesn't work based on index but on key,value pair only.
```

#####  8) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a TreeMap and display the whole TreeMap. Now remove an element from position 2 from the TreeMap.

```java

```
Output:
```text
NA Map doesn't work based on index but on key,value pair only.
```
##### 9) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a TreeMap and display the whole TreeMap. Now create a new linkedhashmap and copy the previous TreeMap into it and display the new TreeMap.

```java
package com.examples.collection.assignment;

/*  9) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a TreeMap and display the whole TreeMap. Now create a new linkedhashmap and copy the previous TreeMap into it and display the new TreeMap.
 */

import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> tm = new TreeMap<>();


        tm.put("Amol",8);
        tm.put("Rahul",15);
        tm.put("Dinesh",11);
        tm.put("Girish",3);
        tm.put("Amit", 2);

        System.out.println("Original TreeMap elements are" + tm);

        Map<String,Integer> tm1 = new TreeMap<>(tm);

        System.out.println(" New TreeMap elements are" + tm1);


    }
}


```
Output:
```text
Original TreeMap elements are{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
 New TreeMap elements are{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
```

##### 10) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a TreeMap and display the whole TreeMap. Now create a new TreeMap and copy the previous TreeMap in ascending order into it and display the new TreeMap.

```java
package com.examples.collection.assignment;

/*  10) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a TreeMap and display the whole TreeMap. Now create a new TreeMap and copy the previous TreeMap in ascending order into it and display the new TreeMap.
 */

import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> tm = new TreeMap<>();


        tm.put("Amol",8);
        tm.put("Rahul",15);
        tm.put("Dinesh",11);
        tm.put("Girish",3);
        tm.put("Amit", 2);

        System.out.println("Original TreeMap elements are" + tm);

        Map<String,Integer> tm1 = new TreeMap<>(tm);

        System.out.println(" New TreeMap elements in ascending order by key");
        tm1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println(" New TreeMap elements in ascending order by value");
        tm1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}


```
Output:
```text
Original TreeMap elements are{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
 New TreeMap elements in ascending order by key
Amit=2
Amol=8
Dinesh=11
Girish=3
Rahul=15
 New TreeMap elements in ascending order by value
Amit=2
Girish=3
Amol=8
Dinesh=11
Rahul=15
```


##### 11) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap. Now create a new TreeMap and copy the previous TreeMap in descending order into it and display the new TreeMap.

```java
package com.examples.collection.assignment;

/*  11) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a TreeMap and display the whole TreeMap. Now create a new TreeMap and copy the previous TreeMap in descending order into it and display the new TreeMap.
 */

import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> tm = new TreeMap<>();


        tm.put("Amol",8);
        tm.put("Rahul",15);
        tm.put("Dinesh",11);
        tm.put("Girish",3);
        tm.put("Amit", 2);

        System.out.println("Original TreeMap elements are" + tm);

        Map<String,Integer> tm1 = new TreeMap<>(tm);

        System.out.println("TreeMap elements in descending order by key");
        tm1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("TreeMap elements in descending order by value");
        tm1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }
}


```
Output:
```text
Original TreeMap elements are{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
 New TreeMap elements in descending order by key
Rahul=15
Girish=3
Dinesh=11
Amol=8
Amit=2
 New TreeMap elements in descending order by value
Rahul=15
Dinesh=11
Amol=8
Girish=3
Amit=2
```

