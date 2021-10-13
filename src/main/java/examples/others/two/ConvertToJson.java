package examples.others.two;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/12/2021, Tuesday
 **/

import net.minidev.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 What this program snippet doing?
 How to convert hashmap to JSON object in Java
 **/
public class ConvertToJson {

    public static void main(String[] args) {

        // define a Map
        HashMap<String,String> hs = new HashMap<>();
        hs.put("key1","value1");
        hs.put("key2","value2");
        hs.put("key3","value3");
        hs.put("key4","value4");
        hs.put("key5","value5");
        hs.put("key6","value6");
        hs.put("key7","value7");
        hs.put("key8","value8");
        hs.put("key9","value9");

        // Print Map
        System.out.println(hs);

        // convert to Json
        /* we will import JSONObject from this maven dependency
        <dependency>
            <groupId>net.minidev</groupId>
            <artifactId>json-smart</artifactId>
            <version>2.4.7</version>
        </dependency>
         */

        // construct JSONObject using map
        JSONObject json = new JSONObject(hs); // http://javadox.com/org.json/json/20151123/org/json/JSONObject.html#JSONObject-java.util.Map-

        // Print JSON
        System.out.println(json);

        System.out.println("Value of Key2 is "+ json.get("key2"));


    }













}
