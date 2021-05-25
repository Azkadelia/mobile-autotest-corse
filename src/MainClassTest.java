import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass testObject = new MainClass();
        Assert.assertEquals("Test Failed", 14, testObject.getLocalNumber());
    }

}
