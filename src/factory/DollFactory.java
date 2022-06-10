package factory;

import objects.Doll;
import objects.SmallDoll;
import objects.Toy;

public class DollFactory extends ToyFactory {

    @Override
    public Toy createAToy(String toyName) {
        if(toyName.equalsIgnoreCase("doll")) {
            return new Doll();
        }

        if(toyName.equalsIgnoreCase("small doll")) {
            return new SmallDoll();
        }

        System.out.println("Unknown doll type!");
        return null;
    }
}