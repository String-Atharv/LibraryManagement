public class user {
    // Attributes
    private final String name;
    private Book borrowedBook;


    public user(String name) {
        this.name = name;
        this.borrowedBook = null;
    }

    // method to borrow the book
     void borrowBook(Book b){
        if(b.isAvalaible()){
            borrowedBook=b;
            b.setAvalaible(false);
           b.setBorrowedBy(this.name);
            System.out.println(this.name+" borrowed "+b.getName());
        }
        else{
            System.out.println(b.getName()+" is not available , it is borrowed by "+b.getBorrowedBy());
        }

    }

    public void returnBook(Book b){
        // check if the book is borrowed or not
        if(borrowedBook!=null){
            System.out.println(b.getName()+ " is returned... ");
            b.setAvalaible(true);
            borrowedBook=null;
        }
        else{
            System.out.println(b.getName()+" was not borrowed by "+this.name);
        }
    }
}
