package Interface.RealtimeExamples;

public class car implements Engine,Break{

    void start(){
        System.out.println("Started the car");
          StartEngine();
          breaks();
    }


    @Override
    public void StartEngine() {
        System.out.println("Started Engine");
    }

    @Override
    public void breaks() {
        System.out.println("break the car");
    }
}
