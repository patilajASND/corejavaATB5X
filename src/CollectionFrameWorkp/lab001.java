package CollectionFrameWorkp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class lab001 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("omkar");
        collection.add("apple");
        collection.add("ass");
   //     System.out.println(collection);

        collection.remove("ass");
        System.out.println(collection);

    }
}
