public class Task1{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        System.out.println(sb);
        sb.setCharAt(0,'V');
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
}
}
