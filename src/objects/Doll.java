package objects;

public class Doll extends Toy {
    @Override
    public void prepare() {
        setName("doll");
        System.out.println("Gnomes do a doll!");
    }
}
