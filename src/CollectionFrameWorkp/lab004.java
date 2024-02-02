package CollectionFrameWorkp;

import java.util.ArrayList;
import java.util.List;

public class lab004 {
    public static void main(String[] args) {
//      how to create an array list from collection
      //  using Arraylist(collection c )method.
//  Array list using the addll () method.
        List<Integer> firstprimenumbers=new ArrayList<>();
        firstprimenumbers.add(2);
        firstprimenumbers.add(3);
        firstprimenumbers.add(5);
        firstprimenumbers.add(7);
        firstprimenumbers.add(11);

       List<Integer>firstTenPrimeNumber=new ArrayList<>(firstprimenumbers);

       List <Integer> nextFivePrimeNumber=new ArrayList<>();
       nextFivePrimeNumber.add(13);
       nextFivePrimeNumber.add(15);
       nextFivePrimeNumber.add(17);
       nextFivePrimeNumber.add(19);
       nextFivePrimeNumber.add(23);
       firstTenPrimeNumber.addAll(nextFivePrimeNumber);;

        System.out.println(firstTenPrimeNumber);

    }
}
