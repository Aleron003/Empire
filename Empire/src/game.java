
import java.util.ArrayList;
import java.util.*;

public class game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<City> Empires = new ArrayList<>();
        int nPlayercount = 4;
        City city;

        for (int i = 0; i <= nPlayercount; i++) {
            System.out.println(i);
            System.out.println("wopkrs");
            city = new City();
            city.nOilrigs = 2;
            city.nHouses = 4;
            city.nBarracks = 1;
            Empires.add(city);
        }

        //init things


        while (true) { //game loop
            city = Empires.get(1);
            System.out.println(city.nBarracks);
            break;
        }



    }
}
