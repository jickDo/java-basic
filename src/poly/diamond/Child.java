package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodCommon() {
        System.out.println("Childl.methodCommon");
    }

    @Override
    public void methodA() {
        System.out.println("Childl.methodA");
    }
    @Override
    public void methodB() {
        System.out.println("Childl.methodB");
    }
}
