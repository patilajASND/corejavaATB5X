package CollectionFrameWorkp.list;

import java.util.ArrayList;
import java.util.List;

public class lab005 {

//  How to check if an ArrayList is empty using the isEmpty() method.
//  How to find the size of an ArrayList using the size() method.
//  How to access the element at a particular index in an ArrayList using the get() method.
//  How to modify the element at a particular index in an ArrayList using the set() method.

    public static void main(String[] args) {
        List<String> topProgrammingLanguages=new ArrayList<>();

        System.out.println("Is the topProgrammingLanguages List Empty :"
        + topProgrammingLanguages.isEmpty());
        topProgrammingLanguages.add("c");
        topProgrammingLanguages.add("java");
        topProgrammingLanguages.add("c++");
        topProgrammingLanguages.add("python");
        System.out.println("Here is the Top "+ topProgrammingLanguages.size()+ "Programming Languages of World");

    String bestProgrammingLang=topProgrammingLanguages.get(1);
        System.out.println(bestProgrammingLang);
        System.out.println( topProgrammingLanguages.get(3));
       topProgrammingLanguages.set(3,".net");
        System.out.println(topProgrammingLanguages);

    }
}
