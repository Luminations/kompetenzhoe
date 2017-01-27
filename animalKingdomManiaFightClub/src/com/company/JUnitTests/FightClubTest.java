import com.company.Animal;
import com.company.Cyborgs.Reptiles.Crocodile;
import com.company.Cyborgs.Reptiles.Iguana;
import com.company.FightClub;
import com.company.Mamals.Lion;
import com.company.Mamals.Mammal;
import com.company.Mamals.RedPanda;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by fraser on 1/27/17.
 */
public class FightClubTest {

    @Test
    public void fightclubNight() throws Exception {

        FightClub fightClub = new FightClub();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Iguana());
        animals.add(new Crocodile());
        animals.add(new RedPanda());
        ArrayList<Integer> healths = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++){
            healths.add(animals.get(i).health);
        }
        fightClub.FightclubNight(animals);

        for (int i = 0; i < animals.size(); i++){
            Assert.assertTrue(healths.get(i) > animals.get(i).health);
        }
    }

    @org.junit.Test
    public void mamalFighting() throws Exception {
        FightClub fightClub = new FightClub();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Crocodile());
        animals.add(new Iguana());
        animals.add(new RedPanda());
        ArrayList<Integer> healths = new ArrayList<>();

        for (int i = 0; i < animals.size(); i++){
            healths.add(animals.get(i).health);
        }

        fightClub.MamalFighting(animals);
        for (int i = 0; i < animals.size(); i++){
            if (Mammal.class.isAssignableFrom(animals.get(i).getClass())){
                Assert.assertTrue(healths.get(i) > animals.get(i).health);
            }else {
                Assert.assertTrue(healths.get(i) != animals.get(i).health);
            }
        }

    }

    @org.junit.Test
    public void reptileFighting() throws Exception {

    }

}