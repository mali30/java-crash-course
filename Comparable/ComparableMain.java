package company.mohamedali.Comparable;

import company.mohamedali.ComparatorInterface.EmailComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
    public static void main(String[] args) {
        /*
            Created a list of customers and sorted them using the
            Collections.sort(). I overrode the compareTo() to compare
            to cusotmers by name. Also changed toString to return the name of customers

         */

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("b", "e3"));
        customerList.add(new Customer("a", "e2"));
        customerList.add(new Customer("c", "e1"));
        // sorting by comparing the emails.
        Collections.sort(customerList, new EmailComparator());
//        Collections.sort(customerList);
        System.out.println(customerList);
    }
}
