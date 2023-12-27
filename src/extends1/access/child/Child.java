package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 2; //상속 관계에서 접근가능
        //defaultValue = 3; //같은 패키지 안에서만 접근가능 현재 child와 parent는 다른 패키지
        //privateValue = 4; //자신말곤 접근 불가

        publicMethod();
        protectedMethod();
//        defaultMethod(); //같은 패키지 안에서만 접근가능 현재 child와 parent는 다른 패키지
//        privateMethod(); //자신말곤 접근 불가

        printMethod();
    }
}
