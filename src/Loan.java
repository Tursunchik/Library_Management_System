import java.lang.reflect.Member;
import java.time.LocalDate;

public class Loan {
   private Book book;
   private Member member;
   private LocalDate borrowDate;
   private LocalDate returnDate;

   public Loan(Book book, Member member, LocalDate borrowDate, LocalDate returnDate) {
       this.book = book;
       this.member = member;
   }

   public Book getBook() {
       return book;
   }
   public Member getMember() {
       return member;
   }
}
