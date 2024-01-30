package CollectionFrameWorkp;

import java.util.ArrayList;
import java.util.List;

public class lab002 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("omkar");
        list.add("omkar");
        list.add("element");
        list.add(1,"omkar");

        System.out.println(list);
        // list allows null value to the list
        list.add(null);
        list.add(null);

        System.out.println(list);
        System.out.println(list.get(3));
    }
}
