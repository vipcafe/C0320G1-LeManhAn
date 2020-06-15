package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class library {
    static Map<String,String> dictionary;
     static {
         dictionary = new HashMap<>();
        dictionary.put("book","sách");
        dictionary.put("hello","xin chào");
        dictionary.put("orange"," cam");
        dictionary.put("apple","táo");
    }

    public static String findMap(String search){
         if(dictionary.get(search)) {
             return dictionary.get(search);
         }
         else {
             return "Error Search";
         }
    }
}

