package observer;

public interface Observer {

    void update();

    void setMagicBoard(Observable topic);

    void removeMagicBoard();
}
