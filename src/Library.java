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

   public void borrowBook(String ISBN) {
        for (Book book : books) {
            if(book.getIsbn().equalsIgnoreCase(ISBN)){
                if(!book.getIsAvailable()){
                    System.out.println("Book " + book.getTitle() + " is not available!");
                }else{
                    book.setIsAvailable(false);
                    System.out.println("Book " + book.getTitle()+ " is available!");
                }
            } else{
                System.out.println("Book " + book.getIsbn() + " not found!");
            }
            return;
        }
   }

   public void returnBook(String ISBN) {
        for (Book book : books) {
            if(book.getIsbn().equalsIgnoreCase(ISBN)){
                if(!book.getIsAvailable()){
                    book.setIsAvailable(true);
                    System.out.println("Book " + book.getTitle() + " is successfully returned!");
                }else {
                    System.out.println("Book " + book.getTitle() + " is already returned!");
                }
            }else{
                System.out.println("Book " + book.getIsbn() + " not found!");
            }
        }
        return;
   }
}
