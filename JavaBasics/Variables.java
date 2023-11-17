// a variable is a named location in memory that stores a value. values could be any data type.
// variable names are case sensitive

public class Variables {
    public static void main(String[] args) {
        String message = "hello!";
        int hour = 11;
        int minute = 59;
        System.out.println( hour);
        System.out.println( message);
        System.out.println( minute);

        // arithmetic operations
        System.out.print("Number of minutes since midnight: " );
        System.out.println(hour * 60 + minute);
        
    }
}
