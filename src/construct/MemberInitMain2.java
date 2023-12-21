package construct;

public class MemberInitMain2 {

    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1,"학생1",90,15);


        MemberInit memberInit2 = new MemberInit();
        initMember(memberInit2,"학생2",80,16);

        MemberInit[] memberInits = {memberInit1,memberInit2};

        for (MemberInit s:memberInits){
            System.out.println("이름 "+s.name+" 점수 "+s.grade+" 나이 "+s.age);
        }
    }

    static void initMember(MemberInit memberInit, String name, int grade, int age){
        memberInit.name=name;
        memberInit.grade=grade;
        memberInit.age=age;
    }
}
