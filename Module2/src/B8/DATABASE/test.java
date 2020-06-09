package B8.DATABASE;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;


public class test  {
    private int age ;
    private String name ;
    void  name(){
        System.out.println("abc");
}
    public static void main(String[] args) {

     Student s1 = new Student("Ta",24);
     Student s2 = new Student("Ta",24);

     System.out.println(s1.getName().equals(s2.getName()) && s1.getAge()==s2.getAge());
}
}
