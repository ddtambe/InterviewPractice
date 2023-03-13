package testng_basics;

import org.testng.annotations.*;

public class TestGroupsAnnotations {
    @BeforeClass
    public void setup(){
        System.out.println("Setup()");
    }

    @BeforeGroups(value = {"Sanity", "Regression"})
    public void beforeGroups(){
        System.out.println("Before Group");
    }

    @Test(groups = {"Sanity"})
    public void saintyGroup1(){
        System.out.println("Sainty Group 1");
    }

    @Test(groups = {"Sanity","Regression"})
    public void saintyGroup2(){
        System.out.println("Sainty Group 2");
    }

    @Test(groups={"Regression"})
    public void regression1(){
        System.out.println("Regression 1");
    }

    @Test(groups = {"Regression"})
    public void regression2(){
        System.out.println("Regression 2");
    }

    @AfterGroups(value = {"SanityAfter","RegressionAfter"})
    public void afterGroups(){
        System.out.println("After Group");
    }

    @Test(groups = {"SanityAfter"})
    public void SanityAfter1(){
        System.out.println("Sanity After 1");
    }

    @Test(groups = {"SanityAfter"})
    public void SanityAfter2(){
        System.out.println("Sanity After 2");
    }

    @Test(groups = {"RegressionAfter"})
    public void RegressionAfter1(){
        System.out.println("Regression After 1");
    }

    @Test(groups = {"RegressionAfter"})
    public void RegressionAfter2(){
        System.out.println("Regression After 2");
    }

    @AfterClass
    public void tearOut(){
        System.out.println("Tear Out");
    }
}
