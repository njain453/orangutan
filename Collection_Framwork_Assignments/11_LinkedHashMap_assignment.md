
#### 1) Write a Java program to insert ("Amol",8),("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap without using an iterator.

```java
package com.examples.collection.assignment;

/*  Write a Java program to insert ("Amol",8),("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap without using an iterator.
 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> hs = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + hs);
    }
}
```
Output:
```
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
```

#### 2)  Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap using an iterator.

```java
package com.examples.collection.assignment;

/*  Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap using an iterator. */
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> hs = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + hs);


        Iterator i = hs.entrySet().iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}

```

Output:
```text
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
Amol=8
Rahul=15
Dinesh=11
Girish=3
Amit=2
```

#### 3) Write a Java program to insert ("Amol",8),("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap  and display the whole LinkedHashMap in ascending order first by key and then by value.
 
```java
package com.examples.collection.assignment;

/*  3) Write a Java program to insert ("Amol",8),("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap  and display the whole LinkedHashMap in ascending order first by key
and then by value.

 */
import java.sql.SQLOutput;
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> hs = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + hs);

//
//        Iterator i = hs.entrySet().iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

       // Sorting in ascending order: converting to stream and then sorting using comparator and printing results on screen
        System.out.println("sorting Map entries in ascending order by key");
        hs.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("sorting Map entries in ascending order by value");
        hs.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}

```

Output:
```text
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
sorting Map entries in ascending order by key
Amit=2
Amol=8
Dinesh=11
Girish=3
Rahul=15
sorting Map entries in ascending order by value
Amit=2
Girish=3
Amol=8
Dinesh=11
Rahul=15

```


#### 4) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap  and display the whole LinkedHashMap in descending order first by key

```java
package com.examples.collection.assignment;

/*  4) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap  and display the whole LinkedHashMap in descending order first by key
and then by value.

 */
import java.sql.SQLOutput;
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> hs = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + hs);

//
//        Iterator i = hs.entrySet().iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

       // Sorting in ascending order: converting to stream and then sorting using comparator and printing results on screen
        System.out.println("sorting Map entries in descending order by key");
        hs.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("sorting Map entries in descending order by value");
        hs.entrySet().stream().sorted(Map.Entry.comparingByValue(new CustomComparatorbyValue())).forEach(System.out::println);

    }
}

class CustomComparatorbyValue implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
```

Output:
```text
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
sorting Map entries in descending order by key
Rahul=15
Girish=3
Dinesh=11
Amol=8
Amit=2
sorting Map entries in descending order by value
Rahul=15
Dinesh=11
Amol=8
Girish=3
Amit=2
```


#### 5) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap  and display the whole LinkedHashMap in descending order using
descending iterator.

```java

```

Output:
```text
NA- we can't use descending iterator over Map. 
```


#### 6) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap
and display the whole LinkedHashMap. Now add ("Tom",9) to the first  position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.assignment;

/* 6) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap
and display the whole LinkedHashMap. Now add ("Tom",9) to the first  position of the list. Add 6 at the last position of the list.

 */
import java.sql.SQLOutput;
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> lhm = new LinkedHashMap<>();

        // Defining LinkedHashMap to maintain insertion order
        LinkedHashMap<String,Integer> lhm1 = new LinkedHashMap<>();

        lhm.put("Amol",8);
        lhm.put("Rahul",15);
        lhm.put("Dinesh",11);
        lhm.put("Girish",3);
        lhm.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + lhm);

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

        System.out.println("Modified LinkedHashMap elements After Operations are" + lhm1);




    }
}


```

Output:
```text
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
Modified LinkedHashMap elements After Operations are{Tom=9, Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2, Jerry=6}
```


####  7) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap
and display the whole LinkedHashMap. Now add 7 at the position 3 of  the LinkedHashMap

```java

```

Output:
```text
NA Map doesn't work based on index but on key,value pair only.
```


#### 8) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap. Now remove an element from position 2 from the LinkedHashMap.

```java

```

Output:
```text
Map doesn't work based on index but on key,value pair only.
```


#### 9) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap. Now create a new linkedhashmap and copy the previous LinkedHashMap into it and display the new LinkedHashMap.

```java
package com.examples.collection.assignment;

/* 9) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap. Now create a new linkedhashmap and copy the previous LinkedHashMap into it and display the new LinkedHashMap.

 */
import java.sql.SQLOutput;
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> lhm = new LinkedHashMap<>();


        lhm.put("Amol",8);
        lhm.put("Rahul",15);
        lhm.put("Dinesh",11);
        lhm.put("Girish",3);
        lhm.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + lhm);



        LinkedHashMap<String,Integer> lhm1 = new LinkedHashMap<>(lhm);

        System.out.println("Copied LinkedHashMap elements  are" + lhm1);




    }
}


```

Output:
```text
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
Copied LinkedHashMap elements  are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
```


#### 10) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap. Now create a new LinkedHashMap and copy the previous LinkedHashMap in ascending order into it and display the new LinkedHashMap.

```java
package com.examples.collection.assignment;

/* 10) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap. Now create a new LinkedHashMap and copy the previous LinkedHashMap in ascending order into it and display the new LinkedHashMap.

 */
import java.sql.SQLOutput;
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> lhm = new LinkedHashMap<>();


        lhm.put("Amol",8);
        lhm.put("Rahul",15);
        lhm.put("Dinesh",11);
        lhm.put("Girish",3);
        lhm.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + lhm);

        LinkedHashMap<String,Integer> lhm1 = new LinkedHashMap<>(lhm);

        lhm1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        
    }
}


```

Output:
```text
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
Amit=2
Amol=8
Dinesh=11
Girish=3
Rahul=15
```


#### 11) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap. Now create a new LinkedHashMap and copy the previous LinkedHashMap in descending order into it and display the new LinkedHashMap.

```java
package com.examples.collection.assignment;

/* 11) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a LinkedHashMap and display the whole LinkedHashMap. Now create a new
LinkedHashMap and copy the previous LinkedHashMap in descending order into it and display the new LinkedHashMap.

 */
import java.sql.SQLOutput;
import java.util.*;
public class App {

    public static void main(String[] args) {

        Map<String,Integer> lhm = new LinkedHashMap<>();


        lhm.put("Amol",8);
        lhm.put("Rahul",15);
        lhm.put("Dinesh",11);
        lhm.put("Girish",3);
        lhm.put("Amit", 2);

        System.out.println("Original LinkedHashMap elements are" + lhm);

        LinkedHashMap<String,Integer> lhm1 = new LinkedHashMap<>(lhm);

        lhm1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

    }
}


```

Output:
```text
Original LinkedHashMap elements are{Amol=8, Rahul=15, Dinesh=11, Girish=3, Amit=2}
Rahul=15
Girish=3
Dinesh=11
Amol=8
Amit=2
```

