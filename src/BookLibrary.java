class Book {
    String title;
    String Author;
    double price;
    boolean isBestseller;

    Book(){
        System.out.println("This is a constructor");
    }

    Book(String title, String author, double price, boolean isBestseller){
        this.Author = author;
        this.isBestseller = isBestseller;
        this.price = price;
        this.title = title;
    }

    
}



public class BookLibrary {
    static void main() {
        //dune
        //alchemist
        //spiderman

        Book book1 = new Book("alchemist", "Jacques", 99.9, true);
        System.out.println(book1.title);

        Book book2 = new Book("Naruto", "Bavurhe", 199.0, false);
        System.out.println(book2.title.toUpperCase());
        System.out.println(book1);



    }

}