package Practicejava;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayslist {
    // array uses the array to store the elements
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("omkar");
        list.add("patil");
        list.add("soham");
        list.add("link");

        System.out.println(list.get(2));
   //     Collections.sort(list);
      Collections.sort(list,Collections.reverseOrder());
        for(String lists:list){
            System.out.println(lists);
        }
    }

}
