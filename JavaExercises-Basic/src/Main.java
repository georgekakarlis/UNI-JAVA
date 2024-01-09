import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Write a Java program to print 'Hello' on screen and your name on a separate line.
        Expected Output :
        Hello
        Alexandra Abramov
        System.out.println("Hello: ");
        System.out.println("Georgios");*/


        /*2. Write a Java program to print the sum of two numbers.
                Test Data:
        74 + 36
        Expected Output :
        110
        System.out.println(74 + 36);*/

        /*3. Write a Java program to divide two numbers and print them on the screen.
        Test Data :
        50/3
        Expected Output :
        16
        System.out.println(50 / 3);*/

        /*
        4. Write a Java program to print the results of the following operations.
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a + " " + b + " " + c + " " + d);*/

        /*5. Write a Java program that takes two numbers as input and displays the product of two numbers.
                Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);*/


       /* //6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
         //Test Data:
        //Input first number: 125
        //Input second number: 24
        //Expected Output :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));*/

       /* 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        8 x 10 = 80*//*
        Scanner in = new Scanner(System.in);
        System.out.print("Input your number: ");
        int num1 = in.nextInt();

        for (int i = 0; i < 10; i++){
            System.out.println(num1 + " x " + ( i + 1 ) + " = " + (num1 * (i + 1)));
        }*/

       /* *//*8. Write a Java program to display the following pattern.
                Sample Pattern :

        J    a   v     v  a
        J   a a   v   v  a a
        J  J  aaaaa   V V  aaaaa
        JJ  a     a   V  a     a*//*
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");*/

        /*9. Write a Java program to compute the specified expressions and print the output.
                Test Data:
        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        Expected Output
        2.138888888888889*/
        //System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));


        /*10. Write a Java program to compute a specified formula.
                Specified Formula :
        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        Expected Output
        2.9760461760461765
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);*/
    }
}