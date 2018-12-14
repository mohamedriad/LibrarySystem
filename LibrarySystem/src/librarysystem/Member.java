
package librarysystem;

import java.util.ArrayList;

public class Member{
    private String Name;
    private int ID;
    private int NoOfBorrowedBookCopies;
    ArrayList<String> BorrowedBooks = new ArrayList<String>(); // save borrowed books of each member
    ArrayList<String> ReturnedBooks= new ArrayList<String>(); // save returned books of each member
    public Member(String Name,int ID)
    {   this.Name=Name;
        this.ID=ID;
     }
    public void GetMemberDetails()
    {
        System.out.println("Member's Name:"+this.Name);
        System.out.println("Member's Id:"+this.ID);
        System.out.println("Member's NoOfBorrowedBooks:"+this.NoOfBorrowedBookCopies);
        //=================
        System.out.println("The Borrowed Boooks: ");
        for(int i=0;i<this.BorrowedBooks.size();i++)
        {
         System.out.println("Book Name: "+this.BorrowedBooks.get(i));
        }
        //=================
        System.out.println("The Returned Books: ");
        for(int i=0;i<this.ReturnedBooks.size();i++)
        {
         System.out.println("Book Name: "+this.ReturnedBooks.get(i));
        }
        System.out.println("==============");
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the NoOfBorrowedBookCopies
     */
    public int getNoOfBorrowedBookCopies() {
        return NoOfBorrowedBookCopies;
    }

    /**
     * @param NoOfBorrowedBookCopies the NoOfBorrowedBookCopies to set
     */
    public void setNoOfBorrowedBookCopies(int NoOfBorrowedBookCopies) {
        this.NoOfBorrowedBookCopies = NoOfBorrowedBookCopies;
    }
    
    
}
