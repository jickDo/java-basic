package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        //public 호출 가능
        accessData.publicField=10;
        accessData.publicMethod();

        //default 패키지 호출 가능
        accessData.defaultField=5;
        accessData.defaultMethod();

        //private 호출 불가능
//        accessData.privateField =1;
//        accessData.privateMethod();

        accessData.innerAccess();
    }
}
