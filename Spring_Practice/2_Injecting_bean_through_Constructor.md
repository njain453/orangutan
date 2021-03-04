#### Create beans.xml from following java code which inject beans through Constructor. 

Tyre.java
```java
package com.example;

public class Tyre 
{
	   public Tyre()
                {
		      System.out.println("Inside Tyre constructor." );
		   }
		   public void checkTyre()
                {
		      System.out.println("Inside checkTyre." );
		   }
}
```
Cars.java
```java
package com.example;

public class Cars
{
   private Tyre tyre;
   
   // a setter method to inject the dependency.
   public Cars(Tyre tyre1)
   {
	   System.out.println("Inside Cars constructor.");
	   this.tyre = tyre1;
   }
//   public void setTyre(Tyre tyre1) 
//   {
//      System.out.println("Inside setTyre." );
//      this.tyre = tyre1;
//   }
//   
//   // a getter method to return Tyre object.
//   public Tyre getTyre() 
//   {
//      return tyre;
//   }
   public void tyreCheck() 
   {
      tyre.checkTyre();
   }
}
```

Test.java
```java
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       Cars cr = (Cars) context.getBean("cars");
       cr.tyreCheck();
       ((ClassPathXmlApplicationContext) context).close();

    }
}

```
**Solution**:


Beans.xml
```xml
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "cars" class = "com.example.Cars">
       <constructor-arg ref = "tyre"/>
   </bean>

    <bean id = "tyre" class = "com.example.Tyre">
    </bean>
    
</beans>
```

Output:
```
Inside Tyre constructor.
Inside Cars constructor.
Inside checkTyre
```

```text
- Since we now have to inject bean using Constructor so we have to pass <constructor-arg ref = "tyre"/>
-  This will call Cars Constructor which will lead to creation of Tyre Beans hence Tyre constructor is first displayed
```