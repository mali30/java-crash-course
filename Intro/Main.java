package company.mohamedali.Intro;

import java.awt.*;
import java.text.NumberFormat;
import java.time.temporal.IsoFields;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        mortgageCalcuator();

        System.out.println("Hello World");
        System.currentTimeMillis();

        /*
            primitive types
            stores simple values
         */

        int age = 25;
        byte anotherAge = 100;
        // underscore for large numbers
        int viewCount = 123_456;
        long viewCounts = 12345678010L;
        double price = 10.90;
        float prices = 100.21F;
        char letter = 'A';
        boolean isEligible = true;


        // reference types
        // stores complex objects
        Date now = new Date();
        System.out.println(now);


        // primitive types are copies by value
        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y);

        /* point1 is pointing to point memoery address
         so if you change point1 then point changes also
         */
        Point point = new Point(1,1);
        Point point1 = point;
        point1.x = 100;
        System.out.println(point);
        /*
            Strings in java are immutable

         */
        String message = "  hello world" + " it's Mohamed  ";
        System.out.println(message.endsWith("ed"));
        System.out.println(message.length());
        System.out.println(message.indexOf('M'));
        System.out.println(message.replace(" ", "*"));
        System.out.println(message.trim());
        System.out.println(message);

        // Special characters and escape sequences
        System.out.println("Hello \"Mosh\"");
        System.out.println("c:\\\nMohamed\\Drive\\\tDesktop");

        // Arrays

        int [] sizeArray = new int [10];
        sizeArray[0] = 1;
        // prints your array
        System.out.println(Arrays.toString(sizeArray));
        int [] myArray = {5,4,3,2,1};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        // multi-dimensional array
        int [][] multiArray = new int [5][5];
        multiArray[0][0] = 1;
        System.out.println(Arrays.deepToString(multiArray));

        /* constants
         capital letters for constants
         */
        final float PI = 3.14f;

        // Arithmetic Expressions

        int result = 10;
        result = result + 3;
        System.out.println(result);

        // prefix and postfix
        ++result;
        result++;


        int values = 10 * (3 + 2);
        System.out.println(values);

        // implicit casting

        short z = 1;
        int b = z + 2;
        System.out.println(b);

        // explicit casting
        short aa = 10;
        double bb = 2.2;
        double newMe = (double) aa + bb;
        System.out.println();

        String myNumber = "1.1";
        double anotherNumber = Double.parseDouble(myNumber) + 10;
        System.out.println(myNumber);

        // Math class
        int result2 =  Math.round(1.5F);
        int result3 =  (int) Math.ceil(1.5F);
        int result4 =  (int) Math.floor(1.5F);
        int result5 =  (int) Math.max(1,2);
        double result6 =  (int) Math.random();
        double result7 =  (int) Math.random() * 100;
        int result8 = (int) Math.round(Math.random() * 100);

        // formatting numbers
        // $123,456

        // NumberFormat is abstract so you cant create instance of it.
//        NumberFormat currency = new NuberFormat();

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result9 = currency.format(1234567.891);
        System.out.println(result9);

        NumberFormat percent = NumberFormat.getPercentInstance();
        // method chaining - easier way to write also
        String newResult = NumberFormat.getPercentInstance().format(0.1);
        String result10 = percent.format(0.1);
        System.out.println(result10);

        // Reading Input
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Age : ");
            byte age1 = myScanner.nextByte();
            System.out.print("You are " + age1);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }finally {
            System.out.println("Well there might be trouble");
        }












    }


    public static void mortgageCalcuator(){
        // divide by 100 then divide by 12
        // multiply period by 12

        final byte PERCENT = 100;
        final byte MONTHS_IN_A_YEAR = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal : ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble();

        double monthlyInterestRate =  (interestRate / PERCENT) / MONTHS_IN_A_YEAR;
        System.out.println("Period: ");
        byte payments = scanner.nextByte();

        int numberofPayments = payments * MONTHS_IN_A_YEAR;

        double numerator = monthlyInterestRate *  Math.pow( 1 + monthlyInterestRate , numberofPayments);
        double denominator = Math.pow(1 + monthlyInterestRate , numberofPayments) - 1;
        double finalAmount = principal * (numerator/denominator);



        System.out.println("Mortagage: " + NumberFormat.getCurrencyInstance().format(finalAmount));
    }
}
