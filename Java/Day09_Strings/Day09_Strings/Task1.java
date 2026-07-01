public class Task1{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Java");
        sb.append(" Spring");

        sb.insert(11," Boot");

        System.out.println(sb);
    }
}