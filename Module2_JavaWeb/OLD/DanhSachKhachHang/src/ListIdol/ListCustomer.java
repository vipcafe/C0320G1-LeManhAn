package ListIdol;

import ListIdol.Customer;

import java.util.ArrayList;
import java.util.List;

public class ListCustomer {
    public static List<Customer> customer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mewtwo","Siêu Nhiên","Huyền Thoại","img/mewtwo.jpg"));
        customers.add(new Customer("Rayquaza","Cỏ Mỹ","Huyền Thoại","img/Rayquaza.jpg"));
        customers.add(new Customer("Lugia","Nước","huyền thoại","img/Lugia.jpg"));
        customers.add(new Customer("Giratina","Rồng và Quỷ","huyền thoại","img/Giratina.jpg"));
        customers.add(new Customer("Dialga","Thời gian - Không gian","huyền thoại","img/Dialga.png"));
        return customers;
    }
}
