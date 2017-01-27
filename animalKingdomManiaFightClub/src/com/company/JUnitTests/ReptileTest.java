import com.company.Cyborgs.Reptiles.Crocodile;
import com.company.Cyborgs.Reptiles.Iguana;
import com.company.Mamals.Lion;


/**
 * Created by fraser on 1/27/17.
 */
public class ReptileTest {
    @org.junit.Test
    public void exterminate() throws Exception {
        Crocodile crocodile = new Crocodile();

        Lion lion = new Lion();
        Iguana iguana = new Iguana();
        crocodile.exterminate(lion);
        iguana.exterminate(crocodile);

        org.junit.Assert.assertTrue(lion.health == 0);
        org.junit.Assert.assertTrue(crocodile.health != 0);
    }
}