package company.mohamedali.Comparable;

/*
    This class is used with the Comparable so we can compare and
    sort Customer by name.
 */
public class Customer implements Comparable<Customer> {
    private String name;
    public String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);

    }

    @Override
    public String toString() {
        return name;
    }
}
