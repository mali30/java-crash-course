package company.mohamedali.HashTable;

import company.mohamedali.Comparable.Customer;

import java.util.HashMap;
import java.util.Map;

public class HashDemo {
    public static void main(String[] args) {

        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("Mohamed", "100");
        for(var element : hashMap.keySet()){
            if(element.equals("Mohamed"))
                System.out.println("found");
        }

        show();
    }

    public static void show(){
        Map<Integer, Customer> customerMap = new HashMap<>();
        customerMap.put(1 , new Customer("mohamed", "mohamed@gmail.com"));
        customerMap.put(2 , new Customer("ali", "ali@gmail.com"));
        customerMap.put(3 , new Customer("ronaldo", "ronaldo@gmail.com"));

        var cust = customerMap.get(1);
        var getOrDefault = customerMap.getOrDefault(10, new Customer("Unknown", ""));
        var containsKey = customerMap.containsKey(5);
        var replaceCustomer = customerMap.replace(1,new Customer("John", "john@gmail.com"));

        System.out.println(cust);
        System.out.println(getOrDefault);
        System.out.println(containsKey);
        System.out.println(replaceCustomer);

        // Maps are not Iterable so use methods below
        for(Map.Entry<Integer,Customer> items : customerMap.entrySet())
            System.out.println(items);

        for(var elements : customerMap.values())
            System.out.println(elements);

    }
}
