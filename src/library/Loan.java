package library;

import java.time.LocalDate;

public class Loan{
    // Constants 
    private static final int LOAN_PERIOD_DAYS = 14; // Standart ödünç süresi
    // Fields
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate dueDate; 
    private boolean returned;

    // Constructor 
    public Loan(Book book, Member member){
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(LOAN_PERIOD_DAYS);
        this.returned = false;
    }
    // Getters
    public Book getBook(){return book;}
    public Member getMember(){return member;}
    public LocalDate getBorrowDate(){return borrowDate;}
    public LocalDate getDueDate(){return dueDate;}
    public boolean isReturned(){return returned;}

    // Return Process
    public void returnBook(){
        this.returned = true;
        this.book.setAvailable(true);
    }
    // Overdue Check
    public boolean isOverdue(){
        return !returned && LocalDate.now().isAfter(dueDate);
    }
    @Override
    public String toString() {
        return String.format(
            "Loan[%s → %s | Alış: %s | Son: %s | %s]",
            member.getName(),
            book.getTitle(),
            borrowDate,
            dueDate,
            returned ? "İade Edildi" : (isOverdue() ? "GECİKMİŞ" : "Aktif")
        );
    }
}