package construct;

public class MemberInitMain3 {

    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.initMember("학생1",90,15);


        MemberInit memberInit2 = new MemberInit();
        memberInit2.initMember("학생2",80,16);

        MemberInit[] memberInits = {memberInit1,memberInit2};

        for (MemberInit s:memberInits){
            System.out.println("이름 "+s.name+" 점수 "+s.grade+" 나이 "+s.age);
        }
    }

}
