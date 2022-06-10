package objects;

import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public class MagicBoard implements Observable {

    private String requestedToy;

    private final List<Observer> dwarfsInService;

    public MagicBoard() {
        dwarfsInService = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        if(observer != null) {
            dwarfsInService.add(observer);
            observer.setMagicBoard(this);
        } else {
            throw new IllegalArgumentException("Cannot be null of the Dwarfs!");
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        if(observer != null) {
            dwarfsInService.remove(observer);
            observer.removeMagicBoard();
        } else {
            throw new IllegalArgumentException("Cannot be null of the Dwarfs!");
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer dwarf : dwarfsInService) {
            dwarf.update();
        }
    }

    @Override
    public String getToy() {
        return requestedToy;
    }

    public void requestToyFromDwarfs(String requestedToyFromSanta) {
        if(requestedToyFromSanta == null || requestedToyFromSanta.isBlank()) {
            throw new IllegalArgumentException("Needed toy cannot be null or empty!");
        }
        requestedToy = requestedToyFromSanta;
        System.out.printf("%s is already on the board! \n", requestedToyFromSanta);
        notifyObservers();
        System.out.println("---------------------------------------------------");
    }
}
