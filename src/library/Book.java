package library;

public class Book{
    public enum Category {
        PROGRAMMING, MATHEMATICS, SCIENCE,
        LITERATURE, HISTORY, GENERAL
    }

    // Fields 
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    private String isbn;
    private String genre;
    private Category category;

    // Constructor 
    public Book(int id, String title, String author, String isbn){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // A new book is available for default 
        this.isbn = isbn;
        this.genre = "Genel";
        this.category = Category.GENERAL;
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
    public String getGenre(){ 
        return genre;
    }
    public Category getCategory()  { return category; }

    // Setters 
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
    public String getAvailabilityStatus(){
        return isAvailable ? "Musait" : "Oduncte";
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setCategory(Category category)  { this.category = category; }

    // toString
    @Override 
    public String toString(){
        String availability = isAvailable ? "Available" : "Borrowed";
        String text = String.format("[%d] \"%s\" - %s | ISBN: %s (%s)", id, title, author, isbn, availability);
        return text; 
    }
}