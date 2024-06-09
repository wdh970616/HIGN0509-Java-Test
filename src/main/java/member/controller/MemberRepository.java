package member.controller;

import member.model.vo.*;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private List<Member> memberList = new ArrayList<>(10);

    public MemberRepository() {
    }

    private static int memberCount = 0;

    public void insertMember(Member m) {
        memberList.add(m);
        memberCount++;
    }

    public void printData() {
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

    public static int howManyMembers() {
        return memberCount;
    }

    public void printBuyInfo(int price) {
        for (int i = 0; i < memberList.size(); i++) {
            System.out.print(memberList.get(i).getGrade() + "등급 회원 "
            + memberList.get(i).getName() + "은(는) "
            + price + "원 상품을 ");
            if (memberList.get(i) instanceof Silver) {
                System.out.print(((Silver) memberList.get(i)).buy(price));
            } else if (memberList.get(i) instanceof Gold) {
                System.out.print(((Gold) memberList.get(i)).buy(price));
            } else {
                System.out.print(((Vip) memberList.get(i)).buy(price));
            }
            System.out.println("원에 구입합니다.");
        }
    }
}
