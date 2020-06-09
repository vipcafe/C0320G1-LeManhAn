package Sort;

import Models.Customer;

import java.util.Comparator;

public class NameCustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getName().compareTo(o2.getName())==0){
            return o1.getBirthday().compareTo(o2.getBirthday());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
