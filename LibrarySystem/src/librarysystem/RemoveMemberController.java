
package librarysystem;

class RemoveMemberController{
    MembersFile m;

    void removeMember(String MemberName, int MemberID)
    {
         Member x= new Member(MemberName,MemberID); // controller >>> Member entity * create member *
          m=new MembersFile();
          m.RemoveMember(x);
    }
    
}
