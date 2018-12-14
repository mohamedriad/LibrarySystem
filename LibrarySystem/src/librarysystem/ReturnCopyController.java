package librarysystem;

class ReturnCopyController{
    MembersFile mf;

    void ReturnCopy(String MemberName, int MemberID, String BookName){
        mf=new MembersFile();
        mf.ReturnCopy(MemberName,MemberID,BookName);
     }
    
}
