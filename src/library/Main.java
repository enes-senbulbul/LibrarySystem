package library;

public class Main {
    public static void main(String[] args) {
        // Kütüphane oluştur
        Library library = new Library("ITU Kutuphanesi");

        // Kitapları Ekle
        Book b1 = new Book(1, "Clean Code", "Robert C. Martin", "978-0132350884");
        Book b2 = new Book(2, "Effective Java", "Joshua Bloch", "978-0134685991");
        Book b3 = new Book(3, "The Pragmatic Programmer", "Hunt & Thomas", "978-0135957059");
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

       // Üyeler
        Member m1 = new Member(1, "Ahmet Yilmaz", "ahmet@itu.edu.tr");
        Member m2 = new Member(2, "Zeynep Kaya", "zeynep@itu.edu.tr");
        library.addMember(m1);
        library.addMember(m2);

        // Ödünç alma senaryosu
        System.out.println("\n── Odunc Islemleri ──");
        library.borrowBook(m1, b1);     // Ahmet → Clean Code
        library.borrowBook(m2, b1);     // Zeynep → Clean Code (ödünçte, reddedilir)
        library.borrowBook(m2, b2);     // Zeynep → Effective Java

        // Aktif Ödünçler 
        library.listActiveLoans();

        // Kitap Listesi (Müsaitlik Durumu Değişti)
        library.listBooks();

        // İade
        System.out.println("\n── Iade Islemleri ──");
        library.returnBook(m1, b1);     // Ahmet iade etti
        library.borrowBook(m2, b1);     // Zeynep şimdi alabilir

        // Son durum
        library.listActiveLoans();
        library.listBooks();
    }
}