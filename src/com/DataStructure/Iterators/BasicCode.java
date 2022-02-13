package com.DataStructure.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicCode {
    public static void main(String[] args) {

        //Declaring collections
        ArrayList<String> list = new ArrayList<>();

        list.add("car");
        list.add("bike");
        list.add("scooty");
        list.add("bicycle");
        list.add("bus");
        list.add("truck");

        //Get the iterator
        Iterator<String> it = list.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println("1234");

        while(it.hasNext()){
//            if (it.next().equalsIgnoreCase("car")) {
//                it.remove();
//            } else if (it.next().equalsIgnoreCase("bike")) {
//                it.remove();
//            }
            String items = it.next();
            if(items.equalsIgnoreCase("car") || items.equalsIgnoreCase("bike")){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
