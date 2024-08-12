package test.java;

import main.java.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testAdd() {
        Main main = new Main();
        int result = main.add(5, 10);
        Assert.assertEquals(15, result);
    }
}
