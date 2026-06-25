class LibraryBook{
   int bookId;
String bookName;
String author;
double price;


LibraryBook(){
System.out.println("Default Library constructor was executed..");
}

LibraryBook(int bookId){
    this.bookId=bookId;
}
LibraryBook(int bookId,String bookName){
    this.bookId=bookId;
    this.bookName=bookName;
}
LibraryBook(int bookId,String bookName,String author,double price){
    this.bookId=bookId;
    this.bookName=bookName;
    this.author=author;
    this.price=price;
}

void displayLibrary(){
    System.out.println("BookId: "+bookId);
System.out.println("BookName: "+bookName);
System.out.println("Author: "+author);
System.out.println("Price: "+price);
}
}

public class LibraryDemo{
    public static void main(String[] args){
        LibraryBook l1=new LibraryBook();
        LibraryBook l2=new LibraryBook(101);
        LibraryBook l3=new LibraryBook(102,"Secret");
        LibraryBook l4=new LibraryBook(103,"Secret of the universe","James",500);

        l1.displayLibrary();
        l2.displayLibrary();
        l3.displayLibrary();
        l4.displayLibrary();
    }
}