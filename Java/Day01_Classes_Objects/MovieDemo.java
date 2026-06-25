class Movie{
    String movieName;
String hero;
int rating;

void displayMovie(){
    System.out.println("Movie Name: "+movieName);
    System.out.println("Hero: "+hero);
    System.out.println("Rating: "+rating);
}
}

public class MovieDemo{
    public static void main(String[] args){
        Movie m1=new Movie();
        Movie m2=new Movie();
        m1.movieName="Thuppakki";
        m1.hero="Vijay";
        m1.rating=10;

        m2.movieName="ghilli";
        m2.hero="Vijay";
        m2.rating=10;
        m1.displayMovie();
        m2.displayMovie();
    }
}