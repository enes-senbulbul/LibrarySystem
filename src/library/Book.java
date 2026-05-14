package library;

public class Book{
    // Fields 
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    // Constructor 
    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // A new book is available for default 
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
    // toString
    @Override 
    public String toString(){
        String availability = isAvailable ? "Available" : "Borrowed";
        String text = String.format("[%d] \"%s\" - %s (%s)", id, title, author, availability);
        return text; 
    }
}