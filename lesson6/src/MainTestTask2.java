import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTestTask2 {
    private Main testClass;

    @Before
    public void prepare() {
        testClass = new Main();
    }

    @After
    public void reset() {
        testClass = null;
    }

    @Test
    public void test_task2_valid_arr() {
        Assert.assertTrue(testClass.task2(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void test_task2_only_1() {
        Assert.assertFalse(testClass.task2(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void test_task2_only_4() {
        Assert.assertFalse(testClass.task2(new int[]{4, 4, 4, 4}));
    }

    @Test
    public void test_task2_invalid_arr() {
        Assert.assertFalse(testClass.task2(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }
}