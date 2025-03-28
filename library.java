public class library {
    public static void main(String[] args) {
        // creating three instances of book
        Book b1=new Book("wings of fire","APJ Kalam",true);
        Book b2=new Book("harry potter","jk rowling",true);
        Book b3=new Book("Memory","shreya kulkarni",true);

        // creating the user josh and sam
        user josh=new user("josh");
        user sam=new user("sam");
        user krish=new user("krish");

        josh.borrowBook(b1);
        sam.borrowBook(b1);
        josh.returnBook(b1);
        sam.borrowBook(b1);
        josh.returnBook(b1);
        josh.returnBook(b3);





    }
}
