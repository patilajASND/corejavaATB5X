package AccessModifiers.police;

public class cop {
    public int gun;

   public cop(int gun){
       this.gun=gun;

    }

    protected void canIShoot(){
        System.out.println("off course" + gun);
    }
}
