
import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTests {

    @Test
    public void testSum(){

        int resultToTest = MainClass.sum(33, 12);
        assertEquals( 45, resultToTest);

    }

}
