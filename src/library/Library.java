package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    // Fields
    private String name;
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    // Constructor 
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    // --- Kitap İşlemleri ---
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kitap eklendi: " + book.getTitle());
    }

    public Optional<Book> findBookById(int id) {
        return books.stream()
                    .filter(b -> b.getId() == id)
                    .findFirst();
    }

    public void listBooks() {
        System.out.println("\n── " + name + " Kitap Listesi ──");
        if (books.isEmpty()) {
            System.out.println("Henüz kitap yok.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public int getTotalBooks() {
        return books.size();
    }

    // --- Üye İşlemleri ---
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Üye eklendi: " + member.getName());
    }

    public void listMembers() {
        System.out.println("\n── " + name + " Üye Listesi ──");
        if (members.isEmpty()) {
            System.out.println("Henüz üye yok.");
            return;
        }
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // --- Loan İşlemleri ---
    public Loan borrowBook(Member member, Book book){ // Kitap ödünç ver
        if(!book.isAvailable()){
            throw new IllegalStateException("Kitap musait degil: "+ book.getTitle());
        }
        if(!member.canBorrow()){
            throw new IllegalStateException("Uye odunc limitine ulasti: "+member.getName());
        }
        book.setAvailable(false);
        member.incrementLoanCount();
        Loan loan = new Loan(book, member);
        loans.add(loan);
        System.out.println("Odunc verildi: "+book.getTitle()
            + " → " + member.getName()
            + " (İade: " + loan.getDueDate() + ")");
        return loan;
    }
    public void returnBook(Member member, Book book){ // Kitabi iade al
        Optional<Loan> activeLoan = loans.stream()
            .filter(l -> l.getBook() == book
                      && l.getMember() == member
                      && !l.isReturned())
            .findFirst();

        if (activeLoan.isEmpty()) {
            System.out.println("❌ Aktif odunc kaydi bulunamadi..");
            return;
        }
        activeLoan.get().returnBook();
        System.out.println("✅ İade alindi: " + book.getTitle()
            + " ← " + member.getName());
    }
    public void listActiveLoans(){  // Tüm Aktif Ödünçleri Listele
        System.out.println("\n── Aktif Oduncler ──");
        loans.stream()
             .filter(l -> !l.isReturned())
             .forEach(System.out::println);
    }
}