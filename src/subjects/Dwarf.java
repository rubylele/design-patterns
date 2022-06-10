package subjects;

import factory.BikeFactory;
import factory.DollFactory;
import objects.Toy;
import observer.Observable;
import observer.Observer;
import singleton.Santa;

public class Dwarf implements Observer {

    private String name;

    private Observable observedMagicBoard;

    private final BikeFactory bikeFactory;

    private final DollFactory dollFactory;

    public Dwarf(String name) {
        setName(name);
        dollFactory = new DollFactory();
        bikeFactory = new BikeFactory();
    }

    @Override
    public void update() {
        if(observedMagicBoard == null) {
            throw new IllegalArgumentException("Not listed on the magic board!");
        }

        Toy toyPreparedForSanta = null;
        String writtenToy = observedMagicBoard.getToy();

        switch (writtenToy) {
            case "doll" -> toyPreparedForSanta = dollFactory.produceAToy("doll");
            case "small doll" -> toyPreparedForSanta = dollFactory.produceAToy("small doll");
            case "small bike" -> toyPreparedForSanta = bikeFactory.produceAToy("small bike");
            case "bike" -> toyPreparedForSanta = bikeFactory.produceAToy("bike");
            default -> System.out.println("There is no such a type of a toy!");
        }

        if(toyPreparedForSanta == null) {
            throw new IllegalArgumentException("Cannot be null!");
        }
        Santa.getInstance().addAToy(toyPreparedForSanta);
    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        if(magicBoard == null) {
            throw new IllegalArgumentException("Cannot be null!");
        }
        observedMagicBoard = magicBoard;
    }

    @Override
    public void removeMagicBoard() {
        observedMagicBoard = null;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Cannot be null or empty!");
        }
        this.name = name;
    }
}
