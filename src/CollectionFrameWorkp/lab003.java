package CollectionFrameWorkp;

import java.util.ArrayList;
import java.util.List;

public class lab003 {
    public static void main(String[] args) {
        List<String> Fruit = new ArrayList<>();
        Fruit.add("apple");
        Fruit.add("banana");
        Fruit.add("mango");

        System.out.println(Fruit);

        List<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(00);
        num.add(66);
        num.add(33);
        System.out.println(num);

        System.out.println(num.get(0));

    }


}



