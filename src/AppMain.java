import objects.MagicBoard;
import singleton.Santa;
import subjects.Dwarf;

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
    public static void main(String[] args) {
        Workshop santasWorkshop = new Workshop("Dwarf's factory");
//        santaInstance.requestAToy("bike", santasWorkshop.getMagicBoard());
//        santaInstance.requestAToy("small bike", santasWorkshop.getMagicBoard());
//        santaInstance.requestAToy("doll", santasWorkshop.getMagicBoard());
        santaInstance.requestAToy("small doll", santasWorkshop.getMagicBoard());
        santaInstance.showAllToys();
    }
}


