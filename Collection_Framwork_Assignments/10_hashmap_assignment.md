
#### 1) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap without using an iterator.

```java
package com.examples.collection.assignment;

/*1) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap without using an iterator.

 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);
        
        System.out.println("Original HashMap elements are" + hs);
    }
}

```

```
Original TreeSet elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
```

#### 2) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap using an iterator.

```java
package com.examples.collection.assignment;

/*
2) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap using an iterator.
 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original HashMap elements are" + hs);
        Iterator i = hs.entrySet().iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}

```

```
Original HashMap elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
Rahul=15
Dinesh=11
Amol=8
Amit=2
Girish=3
```

#### 3) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap in ascending order first by key and then by value.

```java
package com.examples.collection.assignment;

/*
3) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap in ascending order first by key and then by value.
 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();
        LinkedHashMap<String,Integer> hs1 = new LinkedHashMap<>(); // Defining LinkedHashMap to maintain insertion order
        LinkedHashMap<String,Integer> hs2 = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original HashMap elements are" + hs);

        // Get Keys in ArrayList
        Set<String> ts = new TreeSet<>();
        ts = hs.keySet();
        ArrayList<String> alist = new ArrayList<>(ts);

        //Get Values in another ArrayList
        Collection getValues = hs.values();
        ArrayList<Integer> alist1 = new ArrayList<>(getValues);

        // Sort ArrayList based on keys
        Collections.sort(alist);

        // Sorting based on values:
        Collections.sort(alist1);

        // Traverse ArrayList , retrieve value from Map based on given key and create new Map
       for (String s : alist){
            Integer i = hs.get(s);
            hs1.put(s,i);
       }
        // Traverse ArrayList , retrieve key from Map based on given value and create new Map

                for (Integer i : alist1) {
                    for (Map.Entry<String, Integer> entry : hs.entrySet()) {
                        if (entry.getValue().equals(i)) {
                            hs2.put(entry.getKey(),entry.getValue());
                        }
                    }
                }

        // Print Map
        System.out.println("HashMap elements in ascending order based on Key" +hs1);
        System.out.println("HashMap elements in ascending order based on Values" +hs2);

    }
}

```

```
Original HashMap elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
HashMap elements in ascending order based on Key{Amit=2, Amol=8, Dinesh=11, Girish=3, Rahul=15}
HashMap elements in ascending order based on Values{Amit=2, Girish=3, Amol=8, Dinesh=11, Rahul=15}
```

#### 4) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap in descending order first by key and then by value.

```java
package com.examples.collection.assignment;

/*

4) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap in descending order first by key and then by value.
 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();
        LinkedHashMap<String,Integer> hs1 = new LinkedHashMap<>(); // Defining LinkedHashMap to maintain insertion order
        LinkedHashMap<String,Integer> hs2 = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original HashMap elements are" + hs);

        // Get Keys in ArrayList
        Set<String> ts = new TreeSet<>();
        ts = hs.keySet();
        ArrayList<String> alist = new ArrayList<>(ts);

        //Get Values in another ArrayList
        Collection getValues = hs.values();
        ArrayList<Integer> alist1 = new ArrayList<>(getValues);

        // Sort ArrayList based on keys
        Collections.sort(alist, new CustomComparator1()); // Adding CustomComparator for Key

        // Sorting based on values:
        Collections.sort(alist1,new CustomComparator2()); // Adding CustomComparator for Value

        // Traverse ArrayList , retrieve value from Map based on given key and create new Map
       for (String s : alist){
            Integer i = hs.get(s);
            hs1.put(s,i);
       }
        // Traverse ArrayList , retrieve key from Map based on given value and create new Map

                for (Integer i : alist1) {
                    for (Map.Entry<String, Integer> entry : hs.entrySet()) {
                        if (entry.getValue().equals(i)) {
                            hs2.put(entry.getKey(),entry.getValue());
                        }
                    }
                }

        // Print Map
        System.out.println("HashMap elements in ascending order based on Key" +hs1);
        System.out.println("HashMap elements in ascending order based on Values" +hs2);

    }
}

class CustomComparator2 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class CustomComparator1 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
```

```
Original HashMap elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
HashMap elements in ascending order based on Key{Rahul=15, Girish=3, Dinesh=11, Amol=8, Amit=2}
HashMap elements in ascending order based on Values{Rahul=15, Dinesh=11, Amol=8, Girish=3, Amit=2}
```

#### 5) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap in descending order using descending iterator.

```java

```

```

```

#### 6) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap. Now add ("Tom",9) to the first position of the list. Add ("Jerry",6) at the last position of the list.

```java
package com.examples.collection.assignment;

/*

6) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap. Now add ("Tom",9) to the first position of the list. Add ("Jerry",6) at the last position of the list.

 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();

        // Defining LinkedHashMap to maintain insertion order
        LinkedHashMap<String,Integer> hs1 = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original HashMap elements are" + hs);

        // Get Keys in ArrayList
        Set<String> ts = new TreeSet<>();
        ts = hs.keySet();
        ArrayList<String> alist = new ArrayList<>(ts);

        //Get Values in another ArrayList
        Collection getValues = hs.values();
        ArrayList<Integer> alist1 = new ArrayList<>(getValues);


        hs1.put("Tom",9);
        for(Map.Entry entry : hs.entrySet()){
            //System.out.println(entry);
            hs1.put((String)entry.getKey(),(Integer) entry.getValue());
        }
        hs1.put("Jerry",6);

        System.out.println("Modified HashMap elements After Operations are" + hs1);

    }
}


```

```
Original HashMap elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
Modified HashMap elements After Operations are{Tom=9, Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3, Jerry=6}
```

####  7) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap. Now add ("Gary",7) at the position 3 of the HashMap.

```java
package com.examples.collection.assignment;

/*

7) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap. Now add ("Gary",7) at the position 3 of the HashMap.

 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();

        // Defining LinkedHashMap to maintain insertion order
        LinkedHashMap<String,Integer> hs1 = new LinkedHashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        System.out.println("Original HashMap elements are" + hs);

        // Get Keys in ArrayList
        Set<String> ts = new TreeSet<>();
        ts = hs.keySet();
        ArrayList<String> alist = new ArrayList<>(ts);
        int sizeOfkey = alist.size();

        //Get Values in another ArrayList
        Collection getValues = hs.values();
        ArrayList<Integer> alist1 = new ArrayList<>(getValues);


        // Add new Key at specific position: 3
        alist.add(3,"Gary");



        Set s = hs.entrySet();  // Get Map entries in Set
        Iterator iterator = s.iterator(); // get Iterator object to traverse through those entries.
        int sizeOfMap = hs.size(); //get size of Map



        System.out.println("Modified HashMap elements After Operations are" + hs1);

    }
}


```

```
Not working.. need advice
```

#### 8) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a HashMap and display the whole HashMap. Now remove an element from position 2 from the HashMap.

```java

```

```
Map doesn't work based on index but on key,value pair only. 
```


#### 9) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a HashMap and display the whole HashMap. Now create a new HashMap and copy the previous HashMap into it and display the new HashMap.

```java
package com.examples.collection.assignment;

/*

9) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a HashMap and display the whole HashMap. Now create a new HashMap and copy the previous HashMap into it and display the new HashMap.

 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        // Defining New HAshMap
        HashMap<String,Integer> hs1 = new HashMap<>(hs);

        System.out.println("Original HashMap elements are" + hs);

        System.out.println("New HashMap" + hs1); // Order is not maintained

    }
}


```
Original HashMap elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
New HashMap{Amit=2, Rahul=15, Girish=3, Dinesh=11, Amol=8}
```

```

#### 10) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a HashMap and display the whole HashMap. Now create a new HashMap and copy the previous HashMap in ascending order into it and display the new HashMap.

```java
package com.examples.collection.assignment;

/*

10) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3), ("Amit", 2) in a HashMap and display the whole HashMap. Now create a new HashMap and copy the previous HashMap in ascending order into it and display the new HashMap.

 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        // Defining New HAshMap
        LinkedHashMap<String,Integer> hs1 = new LinkedHashMap<>(hs);

        System.out.println("Original HashMap elements are" + hs);

        hs1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        

    }
}


```

```
Original HashMap elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
Amit=2
Amol=8
Dinesh=11
Girish=3
Rahul=15
```

#### 11) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap. Now create a new HashMap and copy the previous HashMap in descending order into it and display the new HashMap.

```java
package com.examples.collection.assignment;

/*
11) Write a Java program to insert ("Amol",8), ("Rahul",15),("Dinesh",11), ("Girish",3),("Amit", 2) in a HashMap and display the whole HashMap. Now create a new HashMap and copy the previous HashMap in descending order into it and display the new HashMap.

 */
import java.util.*;
public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> hs = new HashMap<>();

        hs.put("Amol",8);
        hs.put("Rahul",15);
        hs.put("Dinesh",11);
        hs.put("Girish",3);
        hs.put("Amit", 2);

        // Defining New HAshMap
        LinkedHashMap<String,Integer> hs1 = new LinkedHashMap<>(hs);

        System.out.println("Original HashMap elements are" + hs);

        hs1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);


    }
}


```

```
Original HashMap elements are{Rahul=15, Dinesh=11, Amol=8, Amit=2, Girish=3}
Rahul=15
Girish=3
Dinesh=11
Amol=8
Amit=2
```

