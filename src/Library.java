
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
    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found -> " + book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }


    public void borrowBook(String ISBN) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(ISBN)) {

                if (!book.getIsAvailable()) {
                    System.out.println("Book " + book.getTitle() + " is not available!");
                } else {
                    book.setIsAvailable(false);
                    System.out.println("Book " + book.getTitle() + " borrowed successfully!");
                }

                return;
            }
        }

        System.out.println("Book with ISBN " + ISBN + " not found!");
    }



    public void returnBook(String ISBN) {
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(ISBN)) {

                if (!book.getIsAvailable()) {
                    book.setIsAvailable(true);
                    System.out.println("Book " + book.getTitle() + " returned successfully!");
                } else {
                    System.out.println("Book " + book.getTitle() + " is already returned!");
                }

                return;
            }
        }

        System.out.println("Book with ISBN " + ISBN + " not found!");
    }

    public void registerMember(Member member) {
        members.add(member);
    }

}
