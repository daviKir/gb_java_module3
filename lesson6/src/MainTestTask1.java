import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTestTask1 {
    private Main testClass;

    @Before
    public void prepare() {
        testClass = new Main();
    }

    @After
    public void reset() {
        testClass = null;
    }

    @Test(expected = RuntimeException.class)
    public void test_task1_empty_array() {
        testClass.task1(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void test_task1_without_4() {
        testClass.task1(new int[]{5, 3, 64, 3, 6, 32, 346, 43});
    }

    @Test
    public void test_task1_with_4() {
        int[] arr = new int[]{5, 3, 4, 64, 3, 6};
        Assert.assertArrayEquals(new int[]{64, 3, 6}, testClass.task1(arr));
    }

    @Test
    public void test_task1_with_some_4() {
        int[] arr = new int[]{5, 3, 4, 64, 3, 6, 4, 1, 7};
        Assert.assertArrayEquals(new int[]{1, 7}, testClass.task1(arr));
    }
}