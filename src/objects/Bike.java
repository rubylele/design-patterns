package objects;

public class Bike extends Toy {

    @Override
    public void prepare() {
        setName("bike");
        System.out.println("Gnomes do a bike!");
    }
}