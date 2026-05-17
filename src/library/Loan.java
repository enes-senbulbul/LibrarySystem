package library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan{
    // Constants 
    private static final int LOAN_PERIOD_DAYS = 14; // Standart ödünç süresi
    private static final double DAILY_FINE_RATE = 0.50;   // TL/gün

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
    public double calculateFine() {
        if (!isOverdue()) {
            return 0.0;
        }
        long daysOverdue = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
        return daysOverdue * DAILY_FINE_RATE;
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