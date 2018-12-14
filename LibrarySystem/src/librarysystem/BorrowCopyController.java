package librarysystem;
class BorrowCopyController{
  //BookArchieve b;
  MembersFile m;

    
void BorrowCopy(String MemberName, int MemberID, String BookName)
{   //b=new BookArchieve();
    m=new MembersFile();
   m.CheckNoOfBorrowedCopies(MemberName,MemberID,BookName);  //controller>>> members file,after checking if he exists in our database inside GNOBCmethod ,membersfile gets NoOfBorrowedCopies fromm the MemberClass
   
    
    
     
    
    
}
    
}
