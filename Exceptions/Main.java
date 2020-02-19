package company.mohamedali.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    /*
        Three types of Exceptions
        Checked, Unchecked, Error

     */

    public static void main(String[] args) {
        //show();
        FileReader reader = null;
        // exception handling
        try {
            reader = new FileReader("test.txt");
            var value = reader.read();
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist");
            ex.getMessage();
        } catch (IOException ex) {
            System.out.println("Cant read file");
        }

        // you can also put exceptions together like this

        // try with resources
        try (var readers = new FileReader("test.txt")) {
//            var anotherReader = new FileReader("name.txt");
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException | ParseException e) {
            System.out.println("You messed up buddy");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // finally always get executed no matter what
//        finally {
//            if(reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        Account account = new Account();
//        try {
//            account.deposit(-5);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        ExceptionsDemo.withDrawMoney();

    }
}
