package Practicejava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Duplicatearraylist {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(6);

        System.out.println(arrayList);


        LinkedHashSet<Integer> sortedlist=new LinkedHashSet<>(arrayList);

        arrayList.clear();

        arrayList.addAll(sortedlist);

        System.out.println("Array list after removing duplicates"+arrayList);

    }

}
