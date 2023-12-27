package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }

    protected int protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod(){
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("==private 메서드 안==");
        System.out.println("publicValue = "+publicValue);
        System.out.println("proctedValue = "+protectedValue);
        System.out.println("defaultValue = "+defaultValue);
        System.out.println("privateValue = "+privateValue);

        //부모 메서드안에서 모두 접근가능
        defaultMethod();
        privateMethod();
    }
}
