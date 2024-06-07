package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.Vip;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private List<Member> memberList = new ArrayList<>(40);

    public MemberRepository() {
    }

    public void insertMember(Member m) {
        memberList.add(m);
    }

    public void printData() {
        System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
        for (int i = 0; i < memberList.size(); i++) {
            System.out.print(memberList.get(i).getGrade() + " 등급 회원 "
                    + memberList.get(i).getName() + "의 포인트는 "
                    + memberList.get(i).getPoint() + "이고, 이자 포인트는 ");
            if (memberList.get(i) instanceof Silver) {
                System.out.print(((Silver) memberList.get(i)).calculateInterest());
            } else if (memberList.get(i) instanceof Gold) {
                System.out.print(((Gold) memberList.get(i)).calculateInterest());
            } else {
                System.out.print(((Vip) memberList.get(i)).calculateInterest());
            }
            System.out.println("입니다.");
        }
    }
}
