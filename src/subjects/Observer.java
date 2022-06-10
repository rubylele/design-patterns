package subjects;

import subjects.Observable;

public interface Observer {

    void update();

    void setMagicBoard(Observable topic);

    void removeMagicBoard();
}
