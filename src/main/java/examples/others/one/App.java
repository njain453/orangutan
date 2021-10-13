package examples.others.one;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/9/2021, Saturday
 **/

/**
 What this program snippet doing?
 Java Program to Get System IP Address in Windows and Linux Machine

 io (input-output): This package provides for system input and output through data streams, serialization, and the file system.
 net (network): This package provides the classes for implementing networking applications.
 util (utility): It contains the collection framework, legacy collection classes, event model, date and time facilities, internationalization, and miscellaneous utility classes


 **/

import jdk.nashorn.internal.objects.NativeJSON;
import net.minidev.json.JSONObject;
import netscape.javascript.JSObject;

import java.io.*;
import java.net.*;
import java.util.*;


public class App {

    public static void main(String[] args) throws SocketException, UnknownHostException {

        //Get System info in Json format
        Map SystemProp = System.getProperties();
        //System.out.println(SystemProp); // this list out property in a=b format, we will convert it into json format

        // json format conversion
        JSONObject json = new JSONObject(SystemProp);
        System.out.println(json);


       // Logic for IP address
        InetAddress address = InetAddress.getLocalHost(); //  instance of InetAddress represents the IP address with its corresponding host name.
        System.out.println(address);

        String ipAddress = address.getHostAddress(); // //Getting IPAddress of localhost - getHostAddress return IP Address
        System.out.println(ipAddress);
        System.out.println("IP address of localhost from Java Program: " + ipAddress);

        // this is not giving correct IPV4 address




    }

}
