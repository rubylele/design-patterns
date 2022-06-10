package singleton;

import command.*;
import objects.MagicBoard;
import objects.Toy;

import java.util.ArrayList;
import java.util.List;

public class Santa {

    private static Santa instance;

    private final List<Toy> toysWarehouse;

    public static Santa getInstance() {
        if(instance == null){
            instance = new Santa();
        }
        return instance;
    }

    private Santa(){
        toysWarehouse = new ArrayList<>();
    }

    public void addAToy(Toy toy) {
        if(toy != null) {
            toysWarehouse.add(toy);
        } else {
            throw new IllegalArgumentException("Toy cannot be null!");
        }
    }

    public void showAllToys() {
        for(Toy toy : toysWarehouse) {
            System.out.println(toy.toString() + ", ");
        }
        System.out.println("Amount of toys : " + toysWarehouse.size());
    }

    public void requestAToy(String wantedToy, MagicBoard magicBoard) {
        Command command = null;
        switch (wantedToy.toLowerCase()) {
            case "doll" -> command = new GetDoll(magicBoard);
            case "small doll" -> command = new GetSmallDoll(magicBoard);
            case "bike" -> command = new GetBike(magicBoard);
            case "small bike" -> command = new GetSmallBike(magicBoard);
            default -> System.out.println("Santa cannot ask for such toy!");
        }
        if(command == null) {
            throw new IllegalArgumentException("Null toy given!");
        }
        command.execute();
    }
}
