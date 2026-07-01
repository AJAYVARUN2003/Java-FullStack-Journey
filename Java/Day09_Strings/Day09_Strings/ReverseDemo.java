public class ReverseDemo{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Spring");
        System.out.println("Before reversed:" +sb);
        sb.reverse();
        System.out.println("After reversed:"+sb);
    }
}