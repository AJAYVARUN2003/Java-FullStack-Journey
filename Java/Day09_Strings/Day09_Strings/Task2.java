public class Task2{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Jva");
        sb.insert(1,"a");
        sb.append(" Programming");
        sb.replace(5,13,"Spring Boot");
        sb.delete(10,14);
        sb.reverse();
        System.out.println(sb);

    }
}