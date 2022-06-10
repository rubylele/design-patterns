package subjects;

import command.*;
import factory.Toy;

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
}