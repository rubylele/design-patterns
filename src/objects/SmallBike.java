package objects;

public class SmallBike extends Toy {

    @Override
    public void prepare() {
        setName("small bike");
        System.out.println("Gnomes do a small bike!");
    }
}