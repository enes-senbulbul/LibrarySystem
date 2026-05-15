package library;

public class Book{
    // Fields 
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    private String isbn;

    // Constructor 
    public Book(int id, String title, String author, String isbn){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // A new book is available for default 
        this.isbn = isbn;
    }

    // Getters 
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // toString
    @Override 
    public String toString(){
        String availability = isAvailable ? "Available" : "Borrowed";
        String text = String.format("[%d] \"%s\" - %s | ISBN: %s (%s)", id, title, author, isbn, availability);
        return text; 
    }
}