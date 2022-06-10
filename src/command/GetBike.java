package command;

import objects.MagicBoard;

public class GetBike implements Command {

    public MagicBoard magicBoard;

    public GetBike(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }
    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("bike");
    }
}
