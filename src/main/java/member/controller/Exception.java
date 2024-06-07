package member.controller;

import member.exception.MemberIsFullException;

public class Exception {
    public void checkHowManyMember(int memberCount) throws java.lang.Exception {
        if (memberCount > 10) {
            throw new MemberIsFullException("Member List is full");
        }
    }
}
