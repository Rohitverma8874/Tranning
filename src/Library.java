import java.awt.print.Book;
import java.util.List;
import java.util.Scanner;
public class Library  {

    private List<Member> memberList;

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
    public void addMember(Member member){
        memberList.add(member);
    }
}


