package java_codes;

public class AbstractMain extends AbstractClass {

    public static void main(String[] args) {
        AbstractClass obj = new AbstractMain();

        obj.methodWithBody();
        obj.publicMethod();

    }

    @Override
    public void publicMethod() {
        System.out.println("Public Mehotds");
    }

    @Override
    protected void defaultMethod() {
        System.out.println("Default method");
        System.out.println("Default Method Now implemented");
    }
}