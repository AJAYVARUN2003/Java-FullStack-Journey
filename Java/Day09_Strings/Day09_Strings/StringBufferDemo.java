public class StringBufferDemo{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Java");
        System.out.println(sb);
        sb.append(" Spring");
        System.out.println(sb);
        sb.insert(11," Boot");
        System.out.println(sb);
        sb.replace(5,11,"Programming");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}