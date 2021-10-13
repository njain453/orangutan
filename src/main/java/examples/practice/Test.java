package examples.practice;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/9/2021, Saturday
 **/
/**
 What this program snippet doing?
 **/
import java.util.Enumeration;
import java.util.Vector;

public class Test
{
    public static void main(String[] args)
    {
        Vector<String> v = new Vector<>();

        v.add("ram");
        v.add("shyam");
        v.add("sami");
        v.add("sapna");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
