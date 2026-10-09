import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList();
    List<Member> members = new ArrayList();
    List<Loan> loans = new ArrayList();

    public void addBook(Book book) {
        books.add(book);
    }
   public void viewBooks() {
        for (Book book : books) {
            System.out.println(book + " ");
        }

   }
   public void searchBook(String name) {
        for (Book book : books) {
            if(name.equals(book.getTitle())){
                System.out.println(book);
            }
        }
   }
}
