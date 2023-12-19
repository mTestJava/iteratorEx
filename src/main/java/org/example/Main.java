package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        org.example.MyList<String> myList = new MyList<>();

        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");

        // Iterate through the list using For Each Loop
        for (String string : myList) {
            System.out.println(string);
        }

        // Iterate through the list using iterator
        org.example.MyIterator<String> iter = (org.example.MyIterator<String>) myList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.current.data);
            iter.next();
        }

/////////////////////////////////////////////////////////////
// //another integer list

        org.example.MyList<Integer> myListInt = new MyList<>();
        myListInt.add(3);
        myListInt.add(4);
        myListInt.add(5);
        myListInt.add(6);

        // Iterate through the list using For Each Loop
        for (Integer string : myListInt) {
            System.out.println(string);
        }
    }
}