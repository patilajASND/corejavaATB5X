package Basicsofjava;

public class Arrays1 {
    public static void main(String[] args) {
        // Syntax type  for is
        // type arrayName=new type[size];
        //examples
        int []marks= new int [3];
        // Array is index based Data type and it is a primitive data type
         marks[0]=21;
         marks[1]=22;
         marks[2]=44;
        System.out.println(marks.length);
      //  System.out.println(marks.[]);

        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }

// if we know that Exact length of the array then we can define it directly
        int m[]={10,20,30};
        System.out.println(1);
    } 
}