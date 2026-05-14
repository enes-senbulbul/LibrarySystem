// %% [LibrarySystem - Main]
// Uygulamanın giriş noktası

package library;

public class Main {
    public static void main(String[] args) {
        // Kütüphane oluştur
        Library library = new Library("İTÜ Kütüphanesi");

        // Kitaplar ekle
        library.addBook(new Book(1, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "The Pragmatic Programmer", "Hunt & Thomas"));

        // Üyeler ekle
        library.addMember(new Member(1, "Ahmet Yılmaz", "ahmet@itu.edu.tr"));
        library.addMember(new Member(2, "Zeynep Kaya", "zeynep@itu.edu.tr"));

        // Listele
        library.listBooks();
        library.listMembers();
    }
}