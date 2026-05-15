package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Fields
    private String name;
    private List<Book> books;
    private List<Member> members;

    // Constructor 
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // --- Kitap İşlemleri ---
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kitap eklendi: " + book.getTitle());
    }
    
    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null; 
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
}