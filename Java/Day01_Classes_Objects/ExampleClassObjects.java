class Book{
    String title;
    String author;
    int price;
  
  void displayBook(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
  }
}


public class ExampleClassObjects{
    public static void main(String[] args){
        Book b1=new Book();
        b1.title="Java Programming";
        b1.author="James";
        b1.price=500;

        b1.displayBook();
    }
}
