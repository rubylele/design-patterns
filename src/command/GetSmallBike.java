package command;

import objects.MagicBoard;

public class GetSmallBike implements Command {

    public MagicBoard magicBoard;

    public GetSmallBike(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }
    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("small bike");
    }
}
