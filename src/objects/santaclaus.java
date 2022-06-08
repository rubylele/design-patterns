package objects;



import java.util.ArrayList;
import java.util.List;

public class santaclaus {

    private static santaclaus instance;

  

    public static santaclaus getInstance() {
        if(instance == null){
            instance = new santaclaus();
        }
        return instance;
    }
}
