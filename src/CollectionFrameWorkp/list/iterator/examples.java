package CollectionFrameWorkp.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class examples {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("omkar");
        list.add("ajay");
        list.add("aaa");
        list.add("aditya");
        list.add("ppp");

        /// for loop
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        /// for each loop
        for (String lists:list){
            System.out.println(lists);
        }

        /// basic loop with iterator
        for(Iterator iterator = list.iterator(); iterator.hasNext();){
            String lis =(String) iterator.next();
            System.out.println(lis);
        }

        // with the while loop
        Iterator<String> iterator =list.iterator();
        while(iterator.hasNext()){
            String course =(String) iterator.next();
            System.out.println(course);
        }

    }
}
