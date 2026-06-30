public class FinallyDemo{
    public static void main(String[] args){
        try{
            System.out.println("Java Learning");
        }
        catch(ArithmeticException e){
            System.out.println("Invalid number");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of boundary ");
        }

        finally{
            System.out.println("Cleaning Resources");
        }

        System.out.println("Program End");
    }
}