package command;

import objects.MagicBoard;

public class GetSmallDoll implements Command {

    public MagicBoard magicBoard;

    public GetSmallDoll(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }
    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("small doll");
    }
}

