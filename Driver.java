public class Driver {
    public static void main(String[] args) {

        Bottle myBottle = new Bottle ();
        myBottle.brand = "SimpleModern";
        myBottle.volume = 18;
        myBottle.fluid = "Coffee";
        myBottle.insulated = true;
        myBottle.straw = false;

        System.out.println(myBottle.brand);

    }
}
