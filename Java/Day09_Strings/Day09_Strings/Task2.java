public class Task2{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Java Programming");
        String result=sb.substring(5);
        System.out.println(result);
        System.out.println(sb.indexOf("Program"));
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.lastIndexOf("Java"));
    }
}