public class Book {
    // Attributes
    private String name;
    private String author;
    private boolean isAvalaible;
    private String borrowedBy;

    public Book(String name, String author, boolean isAvalaible) {
        this.name = name;
        this.author = author;
        this.isAvalaible = isAvalaible;
        borrowedBy=null;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvalaible() {
        return isAvalaible;
    }

    public String getBorrowedBy(){
        return borrowedBy;
    }

    // setter
    public void setAvalaible(boolean avalaible) {
        isAvalaible = avalaible;
    }

    public void setBorrowedBy(String name){
        this.borrowedBy=name;
    }
}
