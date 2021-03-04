
#### Create beans.xml from following java code which inject beans through Setter method. 

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
   public Cars()
   {
	   System.out.println("Inside Cars constructor.");
   }
   public void setTyre(Tyre tyre1) 
   {
      System.out.println("Inside setTyre." );
      this.tyre = tyre1;
   }
   
//   // a getter method to return spellChecker
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
       <property name = "tyre" ref = "tyre"/>
   </bean>

    <bean id = "tyre" class = "com.example.Tyre">
    </bean>
    
</beans>
```
Output->
```
Inside Cars constructor.
Inside Tyre constructor.
Inside setTyre.
Inside checkTyre.
```

```
- we are passsing "cars" id from SpringAppliccationcontext 
- so in beans.xml we need to define id=cars and provide class path
- since we need to call Setter method to create Tyre object,so we have defined propert tag and since we are passing object not value so ref is used. 
-  <property name = "tyre" ref = "tyre"/>
- this will invoke Tyre Contructor and then call setter method. 
- with the tyre object created we can call checkTyre method inside tyreCheck() method. 


```