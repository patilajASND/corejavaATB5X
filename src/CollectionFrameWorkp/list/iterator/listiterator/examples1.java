package CollectionFrameWorkp.list.iterator.listiterator;

import com.sun.jdi.InconsistentDebugInfoException;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class examples1 {
    public static void main(String[] args) {
        List<String> languages=new ArrayList<>();
        languages.add("java");
        languages.add("c");
        languages.add("c++");

        ListIterator<String> iterator= languages.listIterator();
        System.out.println("foreward Direction");
        //hasnext()
       //next()
       while(iterator.hasNext()){
            String elemnt= iterator.next();
            System.out.println(elemnt);
        }

        System.out.println("previous");

       while(iterator.hasPrevious()){
           String element= iterator.previous();
            System.out.println(element);
        }
    }


}
