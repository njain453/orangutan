package examples.corejava.example_fileoperations.three;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/12/2022, Saturday
 **/

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

/**
 What this program snippet doing?
 Understanding ObjectMapper to do read and write operations
 **/
public class Car  {
    private String color;
    private String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car() {
    }

    public Car(String color, String type) {
        this.color=color;
        this.type=type;
    }


    public static void main(String[] args) throws IOException {

        // serializing a Java object into JSON using the writeValue method of the ObjectMapper class and writing contents to file car.txt
        ObjectMapper obj = new ObjectMapper();
        Car app = new Car("yellow", "renault");

        obj.writeValue(new File("src/main/resources/car.txt"),app); // creates a file car.txt and save content there

        // converting a JSON String to a Java object using the ObjectMapper class:

        Car car1 = obj.readValue(new File("src/main/resources/car.txt"), Car.class);

        System.out.println(car1.getColor());
        System.out.println(car1.getType());


        // Creating a java Map

        HashMap<String,String> hashMap = new HashMap<>();
        Car car2 = obj.readValue(new File("src/main/resources/car.txt"), Car.class);

        hashMap.put(car2.getColor(),car2.getType());

        System.out.println("hasmap content are "+hashMap);

        // printing hashmap using iterator
        Iterator i = hashMap.entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }











    }

}
