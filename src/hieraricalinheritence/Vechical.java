package hieraricalinheritence;

public class Vechical {

    Vechical(){
        System.out.println("DC Vechical");
    }
    void VechicalHasTopSpeed(){
        System.out.println("Yeah from" + getClass().getSimpleName());
    }
}
