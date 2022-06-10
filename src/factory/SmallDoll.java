package factory;

public class SmallDoll extends Toy {
    @Override
    public void prepare() {
        setName("wooden doll");
        System.out.println("Assembling a wooden doll!");
    }
}
