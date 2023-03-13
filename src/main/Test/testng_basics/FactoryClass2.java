package testng_basics;

import org.testng.annotations.Test;

public class FactoryClass2 {
    int a,b;

    FactoryClass2(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Test
    public void mul(){
        System.out.println("Mul: "+a+" "+b+" = "+(a*b));
    }

    @Test
    public void sub(){
        System.out.println("Div: "+a+" "+b+" = "+(a/b));
    }
}
