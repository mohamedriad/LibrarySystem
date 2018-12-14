
package librarysystem;
import java.util.ArrayList;

public class BookArchieve {
    static ArrayList book=new ArrayList<Book>();

    void addBook(Book e)
    {
        for(int i=0;i<book.size();i++)
        { 
            Book b=(Book)book.get(i);
            if(b.getID()==e.getID()&&b.getCategory().equals(e.getCategory())&&b.getName().equals(e.getName())&&b.getNoOfPages()==e.getNoOfPages())
            {
              e.getBookDetails();
              System.out.println("book already exists,try again");
               System.out.println("==============");
              return;
            }
        
        }
        book.add(e);// method that goes for the archieve (DataBase) // msh lazzm ttktb mel akher
    }

    void removeBook(Book e) {
        for(int i=0;i<book.size();i++)
        { 
            Book b=(Book)book.get(i);
            if(b.getID()==e.getID()&&b.getCategory().equals(e.getCategory())&&b.getName().equals(e.getName())&&b.getNoOfPages()==e.getNoOfPages())
            {
              book.remove(b);
              System.out.println("Book Removed Correctly");
                 System.out.println("==============");
              return;
            }
        
        }
        System.out.println("Book didn't exist");
           System.out.println("==============");
     }

    void addBookCopy(Book e,int NoOfCopies)
    {
        for(int i=0;i<book.size();i++)
        { 
            Book b=(Book)book.get(i);
            if(b.getID()==e.getID()&&b.getCategory().equals(e.getCategory())&&b.getName().equals(e.getName())&&b.getNoOfPages()==e.getNoOfPages())
            {
              b.setNoOfCopies(b.getNoOfCopies()+NoOfCopies); // updateNoOfcopies in the book entity 
              System.out.println("book exist and the copies are updated");
               System.out.println("==============");
              return;
            }
        
        }
        System.out.println("book doesn't exist");
         System.out.println("==============");
        
    }

    void removeBookCopy(Book e, int NoOfCopies)
    {
          for(int i=0;i<book.size();i++)
        { 
            Book b=(Book)book.get(i);
            if(b.getID()==e.getID()&&b.getCategory().equals(e.getCategory())&&b.getName().equals(e.getName())&&b.getNoOfPages()==e.getNoOfPages())
            {
              b.setNoOfCopies(b.getNoOfCopies()-NoOfCopies);
              System.out.println("book exist and the copies are updated");
               System.out.println("==============");
              return;
            }
        
        }
        System.out.println("book doesn't exist");
         System.out.println("==============");
    }

    boolean CheckIfBookIsAvailable(String BookName)//CIBA method checks if it has available Copies if then decrement the NoOfCopies of the sent bookname then returns true
    {
        for(int i=0;i<book.size();i++)
        { 
            Book b=(Book)book.get(i);
            if(b.getName().equals(BookName))
            { 
              if(b.getNoOfCopies()>0)
              {   int n=b.getNoOfCopies();
                  b.setNoOfCopies(--n);
                  System.out.println("Book copy is available");
                  return true;
              }
              else 
              {
                System.out.println("Book Copy is not available");
                return false;
              }
              }
        }
        
        System.out.println("Book doesn't exist in the archieve");
        return false;
        }

    void UpdateBookCopy(String BookName)
    {
        for(int i=0;i<book.size();i++)
        {
            Book x=(Book) book.get(i);
            if(x.getName().equals(BookName))
            {
              int n=x.getNoOfCopies();
              x.setNoOfCopies(++n);
            }
        
        }
    }
        
    }
    
