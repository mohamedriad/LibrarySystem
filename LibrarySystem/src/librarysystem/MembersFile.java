
package librarysystem;

import java.util.ArrayList;

public class MembersFile{
    static  ArrayList member= new ArrayList<Member>();
    
public void AddMember(Member m)
    {
        for(int i=0;i<member.size();i++)
        {
            Member x=(Member) member.get(i);
            if(m.getID()==x.getID()&&m.getName().equals(x.getName()))
            {
                x.GetMemberDetails();
                System.out.println("Member Already Exists");
                  System.out.println("==============");
                return;
            }
        }
        System.out.println("Member succefuly added");
           System.out.println("==============");
        member.add(m);
    }

void RemoveMember(Member x){
        for(int i=0;i<member.size();i++)
        {
            Member f=(Member) member.get(i);
            if(f.getID()==x.getID()&&f.getName().equals(x.getName()))
            {
               member.remove(f);
               System.out.println("MemberRemovedSuccefuly");
                System.out.println("==============");
               return;
            }
        }
        System.out.println("Member doesn't exist to be removed");
         System.out.println("==============");
       
     }

   
void CheckNoOfBorrowedCopies(String MemberName, int MemberID, String BookName)
{ // check if the member exists first
    Member m=new Member(MemberName,MemberID);
    BookArchieve b=new BookArchieve();
    for(int i=0;i<member.size();i++)
        {
            Member x=(Member) member.get(i);
            if(m.getID()==x.getID()&&m.getName().equals(x.getName()))
            {
              int NBC= x.getNoOfBorrowedBookCopies();
              if(NBC<5 && b.CheckIfBookIsAvailable(BookName)) // CIBA method checks if it has available Copies if then decrement the NoOfCopies of the sent bookname then returns true
              {   x.BorrowedBooks.add(BookName);
                  x.setNoOfBorrowedBookCopies(NBC + 1);
                  System.out.println("Copy is Transferred to :"+x.getName());
                   System.out.println("==============");
                  return;
              }
              else if(NBC>=5 && b.CheckIfBookIsAvailable(BookName))
              {
               System.out.println("Copy Wasn't transferred to : "+x.getName()+" Because he has outstanding number of borrowed copies");
                 System.out.println("==============");
                return;
              }
              else if(!(b.CheckIfBookIsAvailable(BookName)))
              {
                 
                   System.out.println("==============");
                   return;
                  
              }
            }
            else
            {
                 System.out.println("Member Doesn't exists"); 
       System.out.println("================");
            }
        }
    
      // System.out.println("Member Doesn't exists"); 
      // System.out.println("================");
}

void ShowHistory(Member m)
{  // check if member exists
        for(int i=0;i<member.size();i++)
        {  Member e=(Member) member.get(i);
           if(m.getName().equals(e.getName())&& m.getID()==e.getID())
           {
               e.GetMemberDetails(); // this is only a printing method the sequence may stop at member's file or consider it to be method ayankan
              
               return;
           
           }
        }
        System.out.println("Member doesn't exist");
         System.out.println("==============");
        
}

    void ReturnCopy(String MemberName, int MemberID, String BookName)
    { //check if member exists..search for him in the arraylist
        Member k=new Member(MemberName,MemberID);
        BookArchieve ba=new BookArchieve();
        for(int i=0;i<member.size();i++)
        {  Member x=(Member)member.get(i);
           if(x.getName().equals(k.getName())&&x.getID()==k.getID()) // this means the member really exists
           {   
               x.BorrowedBooks.remove(BookName);
               x.ReturnedBooks.add(BookName);
               int n=x.getNoOfBorrowedBookCopies();
               x.setNoOfBorrowedBookCopies(--n);
               ba.UpdateBookCopy(BookName); //update NoOfCopies for that book
               System.out.println("Copy is successfully returned");
               System.out.println("==============");
                return;
               
          }
        }
       System.out.println("Wrong Member's Name Or ID"); 
        System.out.println("==============");
    }
    
}
