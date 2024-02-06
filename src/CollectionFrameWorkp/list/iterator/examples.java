package CollectionFrameWorkp.list.iterator;

import java.util.ArrayList;
import java.util.List;

public class examples {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("omkar");
        list.add("ajay");
        list.add("aaa");
        list.add("aditya");
        list.add("ppp");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
