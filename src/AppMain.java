import subjects.Dwarf;
import subjects.MagicBoard;
import subjects.Santa;

public class AppMain {

    public static Santa santaInstance = Santa.getInstance();

    static class Workshop {

        public MagicBoard magicBoard;

        public Dwarf dwarf;

        public Workshop(String dwarfName) {
            magicBoard = new MagicBoard();
            dwarf = new Dwarf(dwarfName);
            magicBoard.subscribe(dwarf);
        }

        public MagicBoard getMagicBoard() {
            return magicBoard;
        }
    }
}