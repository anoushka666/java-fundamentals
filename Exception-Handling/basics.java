public class hello{
    public static void main(String[] args){

        //1. Arithmetic Exception
        try {
            int a = 10/0;

        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }

        //2. Array index out of bound Exception
        try {
            int arr[] = {10,20,30};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }

        //3. Null pointer Exception
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Cannot access a null reference");
        }
    }
}
