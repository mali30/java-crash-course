package company.mohamedali.ComparatorInterface;

import company.mohamedali.Comparable.Customer;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.email.compareTo(o2.email);
    }
}
