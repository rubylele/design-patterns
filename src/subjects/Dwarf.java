package subjects;


import factory.Toy;
import subjects.Observable;
import subjects.Observer;
import subjects.Santa;

public class Dwarf implements Observer {

    private String name;

    private Observable observedMagicBoard;

    public Dwarf(String name) {
        setName(name);
    }

    @Override
    public void update() {
        if(observedMagicBoard == null) {
            throw new IllegalArgumentException("Magic board not specified!");
        }

        Toy toyPreparedForSanta = null;
        String writtenToy = observedMagicBoard.getToy();

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
