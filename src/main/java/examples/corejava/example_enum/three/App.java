package examples.corejava.example_enum.three;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 1/24/2022, Monday
 **/

/**
 What this program snippet doing?
 pass enum as an argument to switch statement
 Note:
 Every enum constant represents an object of type enum.
 enum type can be passed as an argument to switch statements
 **/

// An Enum class
enum Day {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
        }

public class App {
    Day day; // define object of enum class
    String obj1;

    public App(Day day) {
        this.day = day;
    }

    public static void main(String[] args) {

           String str = "MONDAY"; // define str value
           App app = new App(Day.valueOf(str));
           app.dayisLike();

    }

        public void dayisLike(){
            switch (day){
                case MONDAY:
                    System.out.println("Monday is nice");
                    break;
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                    System.out.println("Weekday Continues");
                    break;
                case FRIDAY:
                    System.out.println("TGIF");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekends are nice");
                    break;
                default:
                    System.out.println("Weekdays continues");
                    break;

            }
        }


}
