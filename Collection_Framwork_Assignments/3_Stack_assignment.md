
#### 1) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack without using an iterator.

```java
package com.examples.collection.day23;
/*

1) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack without using an iterator.

 */

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();
        
        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);
        
    }
}

```
```
[8,15,11,3,2]
```

#### 2) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack using an iterator.

```java
package com.examples.collection.day23;
/*

2) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack using an iterator.

 */

import java.util.Iterator;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);

        Iterator i = obj.iterator();
        while ((i.hasNext())){
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
3
2
```
#### 3) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack in ascending order.

```java
package com.examples.collection.day23;
/*

3) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack in ascending order.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);
        Collections.sort(obj);

        Iterator i = obj.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }
    }
}

```
```
[8, 15, 11, 3, 2]
2
3
8
11
15
```
#### 4) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack in descending order.

```java
package com.examples.collection.day23;
/*

4) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack in descending order.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);
        Collections.reverse(obj);

        Iterator i = obj.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());
        }
    }
}

```
```
[8, 15, 11, 3, 2]
2
3
11
15
8
```
#### 5) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack in descending order using descending iterator.

```java
package com.examples.collection.day23;
/*

5) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack in descending order using descending iterator.

 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);

        LinkedList<Integer> lList = new LinkedList<>(obj);
        int sizeoflList = lList.size();

        Iterator i = lList.descendingIterator();
        while ((i.hasNext()) && sizeoflList > 0){
            System.out.println(i.next());
            sizeoflList--;
        }
    }
}

```
```
[8, 15, 11, 3, 2]
2
3
11
15
8
```
#### 6) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now add 9 to the first position of the list. Add 6 at the last position of the list.

```java
package com.examples.collection.day23;
/*

6) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now add 9 to the first position of the list. Add 6 at the last position of the list.

 */

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);

        obj.add(0,9);
        obj.addElement(6);

        System.out.println(obj);

        }
    }


```
```
[8, 15, 11, 3, 2]
[9, 8, 15, 11, 3, 2, 6]
```
#### 7) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now add 7 at the position 3 of the stack.

```java
package com.examples.collection.day23;
/*

7) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now add 7 at the position 3 of the stack.

 */

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);

        obj.add(3,7);


        System.out.println(obj);

        }
    }


```
```
[8, 15, 11, 3, 2]
[8, 15, 11, 7, 3, 2]
```
#### 8) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now remove an element from position 2 from the stack.

```java
package com.examples.collection.day23;
/*

8) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now remove an element from position 2 from the stack.

 */

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println(obj);

        obj.remove(2);


        System.out.println(obj);

        }
    }


```
```
[8, 15, 11, 3, 2]
[8, 15, 3, 2]
```
#### 9) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now create a new stack and copy the previous stack into it and display the new stack..

```java
 package com.examples.collection.day23;
/*

9) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now create a new stack and copy the previous stack into it and display the new stack..

 */

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println("first stack" +obj);


        Stack<Integer>  obj2 = new Stack<>();
        obj2.addAll(obj);
        System.out.println("copied stack" +obj2);


        }
    }
```
```
first stack[8, 15, 11, 3, 2]
copied stack[8, 15, 11, 3, 2]
```
#### 10) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now create a new stack and copy the previous stack in ascending order into it and display the new stack.

```java
package com.examples.collection.day23;
/*
10) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now create a new stack and copy the previous stack in ascending order into it and display the new stack.
 */

import java.util.Collections;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println("first stack" +obj);


        Stack<Integer>  obj2 = new Stack<>();
        Collections.sort(obj);
        obj2.addAll(obj);

        System.out.println("copied stack" +obj2);


        }
    }


```
```
first stack[8, 15, 11, 3, 2]
copied stack[2, 3, 8, 11, 15]
```
#### 11) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now create a new stack and copy the previous stack in descending order into it and display the new stack.

```java
package com.examples.collection.day23;
/*

11) Write a Java program to insert 8, 15,11, 3, 2 in a stack and display the whole stack. Now create a new stack and copy the previous stack in descending order into it and display the new stack.

 */

import java.util.Collections;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();

        obj.add(8);
        obj.add(15);
        obj.add(11);
        obj.add(3);
        obj.add(2);

        System.out.println("first stack" +obj);


        Stack<Integer>  obj2 = new Stack<>();
        Collections.reverse(obj);
        obj2.addAll(obj);

        System.out.println("copied stack" +obj2);


        }
    }


```
```
first stack[8, 15, 11, 3, 2]
copied stack[2, 3, 11, 15, 8]
```
