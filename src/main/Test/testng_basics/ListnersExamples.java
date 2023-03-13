package testng_basics;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnersClass.class)
public class ListnersExamples {
    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @Test(timeOut = 100)
    public void test3() throws InterruptedException {
        System.out.println("Test3 In");
        Thread.sleep(200);
        System.out.println("Test3 Out");
    }
}