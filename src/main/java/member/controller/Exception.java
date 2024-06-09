package member.controller;

import member.exception.MemberIsFullException;

public class Exception {
    public void checkHowManyMember() throws java.lang.Exception {
        int memberCount = MemberRepository.howManyMembers();
        if (memberCount > 10) {
            throw new MemberIsFullException("Member List is full");
        }
    }
}
