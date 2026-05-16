package library;

public class Member{
    // Constants
    private static final int MAX_LOAN_COUNT = 3;

    // Fields 
    private int id;
    private String name;
    private String email;
    private int activeLoanCount;

    // Constructor 
    public Member(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
        this.activeLoanCount = 0;
    }

    // Getters 
    public int getId()       { return id; }
    public String getName()  { return name; }
    public String getEmail() { return email; }

    // --- Loan Methods ---
    public boolean canBorrow() {
        return activeLoanCount < MAX_LOAN_COUNT;
    }

    public void incrementLoanCount() { activeLoanCount++; }
    public void decrementLoanCount() { activeLoanCount--; }
    public int getActiveLoanCount()  { return activeLoanCount; }

    public String getLoanSummary(){
        return String.format("%s — Aktif odunc: %d/3", name, activeLoanCount);
    }

    // --- toString ---
    @Override
    public String toString() {
        return String.format("[%d] %s <%s>", id, name, email);
    }
}
