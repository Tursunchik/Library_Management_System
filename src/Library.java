import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

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
                System.out.println("Book " + name + " was found!");

            } else{
                System.out.println("Book " + name + " not found!");
            }
        }
   }

   public void BorrowBook(Book book) {
        if(book.getIsAvailable() == false){
            System.out.println("Book " + book.getTitle() + " was not borrowed!");
        } else {
            System.out.println("Book " + book.getTitle() + " borrowed!");
        }

   }
}
