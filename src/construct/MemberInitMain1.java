package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.name="학생1";
        memberInit1.grade=90;
        memberInit1.age=15;


        MemberInit memberInit2 = new MemberInit();
        memberInit2.name="학생2";
        memberInit2.grade=80;
        memberInit2.age=16;

        MemberInit[] memberInits = {memberInit1,memberInit2};

        for (MemberInit s:memberInits){
            System.out.println("이름 "+s.name+" 점수 "+s.grade+" 나이 "+s.age);
        }
    }
}
