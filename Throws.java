import java.util.Scanner;
public class Throws{
         public static int Divide(int a,int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String[] args)
    {
        try
        {
            int c= Divide(6,0);
              System.out.println(c);
        }
        catch(ArithmeticException e)
        {
             System.out.println("other than arthemetic exception");
              System.out.println(e);
        }
    }
}