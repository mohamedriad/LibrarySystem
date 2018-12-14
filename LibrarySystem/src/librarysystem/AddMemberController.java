
package librarysystem;

public class AddMemberController{
    MembersFile m;

    void addMember(String MemberName, int MemberID){
        Member x= new Member(MemberName,MemberID); // controller >>> Member entity * create member *
        m=new MembersFile();
        m.AddMember(x);
      }
    
   
}
