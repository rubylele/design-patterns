package factory;

public class SmallBike extends Toy {

    @Override
    public void prepare() {
        setName("small bike");
        System.out.println("Assembling a small bike!");
    }
}