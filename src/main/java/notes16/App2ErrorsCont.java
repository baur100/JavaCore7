package notes16;

public class App2ErrorsCont {
    public static void main(String[] args) {
        int[] arr = {1,5};//if want to see without exception make array longer to have index 4
        System.out.println("Before try/catch");
        try{
            System.out.println("Before error");
            arr[4]=10;//set new value to arraay
            int xx = 5/0;
            System.out.println("Before error");
        }catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Wrong index");
        }catch (ArithmeticException error){
            System.out.println("Check math");
        }
        //if you want to catch any error use exception
        //not good to use because we want to know what we caught
        catch (Exception error){
            System.out.println("Caught!");
        }finally {
            System.out.println("This code will run in any case!");
        }
        System.out.println("Before try/catch");
    }
}
