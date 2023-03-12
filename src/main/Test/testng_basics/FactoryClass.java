package testng_basics;

import org.testng.annotations.Factory;

public class FactoryClass {
    @Factory
    public Object[] factory(){
        return new Object[]{new FactoryClass1(10,10), new FactoryClass1(20, 20), new FactoryClass1(30, 30),
        new FactoryClass2(40,40), new FactoryClass2(50, 50)};
    }
}
