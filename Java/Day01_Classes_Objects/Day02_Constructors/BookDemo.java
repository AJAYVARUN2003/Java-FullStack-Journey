class Book{
   int bookId;
String bookName;
String author;
double price;

Book(int id,String bname,String author,double price){
    this.bookId=id;
  this.bookName=bname;
    this.author=author;
    this.price=price;
}

void displayBook(){
    System.out.println("Book ID: "+bookId);
    System.out.println("Book Name: "+bookName);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
}
}

public class BookDemo{
    public static void main(String[] args){
    Book b1=new Book(101,"Secret","James",50);
    b1.displayBook();
    Book b2=new Book(102,"Secret of the universe","romes",100);
    b2.displayBook();
    Book b3=new Book(103,"Victory ","Ajay",150);
    b3.displayBook();
}
}