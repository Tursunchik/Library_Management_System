import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Library library = new Library();

        try (Scanner sc = new Scanner(System.in)) {
            boolean finish = false;

            do {
                showMenu();
                int choice = sc.nextInt();

                finish = handleChoice(choice, library , sc);

            } while (!finish);
        }
    }

    public static void showMenu() {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add a book");
        System.out.println("2. View all books");
        System.out.println("3. Search for a book");
        System.out.println("4. Register a member");
        System.out.println("5. Borrow a book");
        System.out.println("6. Return a book");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
    }

   public static boolean handleChoice(int choice, Library library , Scanner sc) {
       switch (choice) {
           case 1:
               sc.nextLine();

               System.out.println("Enter book title: ");
               String title = sc.nextLine();

               System.out.println("Enter book author: ");
               String author = sc.nextLine();

               System.out.println("Enter book ISBN: ");
               String isbn = sc.nextLine();

               Book book = new Book(title, author, isbn);
               library.addBook(book);
               System.out.println("Book added successfully!");
               break;
           case 2:
               System.out.println();
               System.out.println("Showing all books");
               library.viewBooks();
               break;
           case 3:
               sc.nextLine();
               System.out.println("Write name of the book that you want to find: ");
               String name = sc.nextLine();
               library.searchBook(name);
               break;
           case 4:
               sc.nextLine();

               System.out.println("Write your member id: ");
               int memberId = sc.nextInt();

               System.out.println("Write your name: ");
               String memberName = sc.nextLine();

               Member member = new Member(memberId, memberName);
               System.out.println("You successfully registered");


       }


       return false;
   }
}
