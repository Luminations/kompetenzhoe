import com.company.Cyborgs.Reptiles.Iguana;
import com.company.Mamals.Lion;
import org.junit.Assert;

/**
 * Created by fraser on 1/27/17.
 */
public class AnimalTest {
    @org.junit.Test
    public void fight() throws Exception {
        Lion lion = new Lion();
        Iguana iguana = new Iguana();
        int i = iguana.health;
        lion.Fight(iguana);
        Assert.assertTrue(i > iguana.health);
    }

    @org.junit.Test
    public void regenerate() throws Exception {
        Lion lion = new Lion();
        int i = lion.health;
        lion.Regenerate();
        Assert.assertTrue(lion.health > i);
    }

}