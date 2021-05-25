import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass testObject = new MainClass();
        Assert.assertEquals("Test Failed", 14, testObject.getLocalNumber());
    }

    @Test
    public void testClassNumber() {
        MainClass testObject = new MainClass();
        int actual = testObject.getClassNumber();
        Assert.assertTrue("Result is incorrect", actual > 45);
    }

}
