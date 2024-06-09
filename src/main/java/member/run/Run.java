package member.run;

import member.controller.Exception;
import member.controller.MemberRepository;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;

public class Run {
    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insertMember(new Silver("홍길동", "Silver", 1000));
        memberRepository.insertMember(new Silver("고길동", "Silver", 2000));
        memberRepository.insertMember(new Silver("홍동민", "Silver", 3000));
        memberRepository.insertMember(new Gold("김회장", "Gold", 1000));
        memberRepository.insertMember(new Gold("이회장", "Gold", 2000));
        memberRepository.insertMember(new Gold("오회장", "Gold", 3000));
        memberRepository.insertMember(new Vip("이순신", "Vip", 10000));

        try {
            new Exception().checkHowManyMember();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

        System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
        memberRepository.printData();

        System.out.println("=========================== 회원 물품 금액 정보 ===========================");
        int price = 10000;
        memberRepository.printBuyInfo(price);

    }
}