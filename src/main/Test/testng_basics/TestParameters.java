package testng_basics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
    @Test
    @Parameters({"a","b"})
    public void add(int a, int b){
        int ans = a+b;
        System.out.println("add: "+ans);
    }

    @Test
    @Parameters({"a","b"})
    public void multiply(int a, int b){
        int ans = a*b;
        System.out.println("Multiply: "+ans);
    }
}
