public class Task3{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Programming");
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        sb.setLength(7);
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb.capacity());
        String result=sb.toString();
        System.out.println(result);
    }
}