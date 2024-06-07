package member.controller;

import member.model.vo.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private List<Member> memberList = new ArrayList<>(40);

    public MemberRepository() {
    }

    public void insertMember(Member m) {
        memberList.add(m);
    }
}
