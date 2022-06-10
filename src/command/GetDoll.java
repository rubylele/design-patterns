package command;

import objects.MagicBoard;

public class GetDoll implements Command {

    public MagicBoard magicBoard;

    public GetDoll(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }
    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("doll");
    }
}
