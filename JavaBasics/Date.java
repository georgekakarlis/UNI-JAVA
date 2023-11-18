//The point of this exercise is (1) to use string concatenation
//to display values with different types (int and String), and (2) to practice
//developing programs gradually by adding a few statements at a time.
//1. Create a new program named Date.java. Copy or type in something like
//the Hello World program and make sure you can compile and run it.
//2. Following the example in Section 2.4, write a program that creates vari-
//ables named day, date, month, and year. The variable day will contain
//the day of the week (like Friday), and date will contain the day of the
//month (like the 13th). Assign values to those variables that represent
//today's date.

public class Date {
    public static void main(String[] args) {
        String day = "Saturday";
        int date = 18;
        int month = 11;
        int year = 2023;
        System.out.println(day + " " + date + " " + month + " " +  year);
    }
}
