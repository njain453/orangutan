package collections.main.java.corejava.example_enum;

//declare enum outside class

enum Color{
    RED, BROWN, GREEN, WHITE
}

public class App {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        System.out.println(c1.getClass());  // enum Color is converted to class Color
    }
}

// Every enum internally implemented using class
/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/