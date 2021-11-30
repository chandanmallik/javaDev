
class vc{

    protected String name = "ford";

    public void sound(){
    System.out.println("tuut utuu");
    }


}


public class  vechile extends vc {
    private String model = "mustange";
    public static void main(String[] args) {
        vechile myCar = new vechile();
        System.out.println(myCar.name + " model : "+ myCar.model);
        myCar.sound();
    }
    
}
