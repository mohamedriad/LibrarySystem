
package librarysystem;

class ShowMemberHistoryController {
    MembersFile mf;

    void ShowHistory(String MemberName, int MemberID)
    {  mf= new MembersFile();
       Member m=new Member(MemberName,MemberID);
       mf.ShowHistory(m);
        
    }
    
}
