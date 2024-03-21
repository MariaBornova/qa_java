import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;
    private final Animal animal = new Animal();

    @Test
    public void EatMeat() throws Exception{
        Assert.assertEquals(animal.getFood("Хищник"), feline.eatMeat());
    }

    @Test
    public void GetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void GetKittensNoParam() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void GetKittensWithParam() {
        feline.getKittens(1);
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}
