package enumDemo;

public class test {

    public static void main(String[] args) {

         /*
        Enums : enumeration(listing things)

        - i.e. if we are using these Day names multiple times then best way : we declare them once and use again and again
               - for declaring : best way in Interface as static constant variable // class mei bhi kr skte hn but Interface mei by default variables 'static final' hote hn
               - isse bhi better way hai, by enum

        - INTERNAL WORKING: jo hmmne enum create kiya hai: vo compile time pe enum class banjati hai and these sunday/monday are the object of these class
                            - Day monday = Day.Monday; // created object of type Day
                            - enum when converted into class then then it is final class  // therefore, cannot be inherited , since constants hai tho inme tho koi change nhi krna tho fir Inherite krke kya hi kroge

        - hmm enum ke andrr methods bhi define krr skte hn
        - hmm custom constructor bhi bana skte hn enum ke andr
        - enum ko hmm class ke andrr bhi likh skte hn
   
         */

        System.out.println(DayClass.sunday);
        System.out.println(DayClass.monday); // by Interface

        System.out.println(Day.Sunday);  // by enum

        Day monday = Day.Monday; // created object of type Day
        int ordinal = monday.ordinal();    // will return Index
        System.out.println(ordinal);
        System.out.println(monday.name()); // will return the string


        Day enumDay = Day.valueOf("Monday"); // if "Monday" is present in enum ,then will return "Monday" string else give exception
        System.out.println(enumDay);

        Day[] values = Day.values();  // return complete array of elements

        for(Day i: values){
            System.out.println(i);
        }

        monday.display();


        // ### we can apply switch case on enum:
        Day saturday = Day.Saturday;

        // old switch case:
        switch (saturday){
            case Monday:{
                System.out.println("Today is monday");
                break;
            }
            case Tuesday:{
                System.out.println("Today is Tuesday");
                break;
            }
            default:{
                System.out.println("Weekend !!");
            }
        }

        // new switch case:
        String res = switch (saturday){
            case Monday -> "Today is monday";  // ye return ho raha hai
            case Tuesday -> "Today is tuesday";
            default -> "weekend!!";
        };

        System.out.println(res);
    }
}
