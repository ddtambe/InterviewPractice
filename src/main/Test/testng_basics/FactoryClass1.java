package testng_basics;

import org.testng.annotations.Test;

public class FactoryClass1 {
    int a,b;

    FactoryClass1(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Test
    public void add(){
        System.out.println("Add: "+a+" "+b+" = "+(a+b));
    }

    @Test
    public void sub(){
        System.out.println("Sub: "+a+" "+b+" = "+(a-b));
    }
}
