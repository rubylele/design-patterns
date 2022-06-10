package subjects;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private String requestedToy;

    private final List<Observer> dwarfsInService;

    public MagicBoard() {
        dwarfsInService = new ArrayList<>();
    }
}