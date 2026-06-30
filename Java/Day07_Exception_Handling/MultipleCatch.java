public class MultipleCatch{
    public static void main(String[] args){
        try{
            int arr[]={1,2};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error ");
        }
        catch(Exception e){
System.out.println("Exception occured..");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("Program End");
    }
}