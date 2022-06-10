package factory;

import objects.Bike;
import objects.SmallBike;
import objects.Toy;

public class BikeFactory extends ToyFactory {

    @Override
    public Toy createAToy(String toyName) {
        if(toyName.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        if(toyName.equalsIgnoreCase("small bike")) {
            return new SmallBike();
        }

        System.out.println("Unknown bike type!");
        return null;
    }
}
