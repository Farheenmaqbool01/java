import java.util.Scanner;
class SampleException extends Exception{
    public String toString()
    {
        return "i am tostring() method";
    }
     public String getMessage()
    {
        return " i am getMessage() Method";
    }
}
 public class Throw {
    public static void main(String args[])
    {
        System.out.println("enter the value of a");
        Scanner Sc = new Scanner(System.in);
        int  a = Sc.nextInt();
        try{
            if(a>100)
            {
                throw new SampleException();
            }
            else{
                System.out.println("a:" + a);
            }
        }
        catch (SampleException e)
        {
           System.out.println(e.getMessage());
           System.out.println(e.toString());
           System.out.println(e);
            e.printStackTrace();
        }
        Sc.close();
    }
}
