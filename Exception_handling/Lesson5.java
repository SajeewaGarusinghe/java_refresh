package Exception_handling;

//program to print the exception information using printStackTrace() method
public class Lesson5 {
    public static void main (String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();//java.lang.ArithmeticException: / by zero
            //at Lesson5.main(File.java:10)
        }
    }
}
