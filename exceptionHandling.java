import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args)
      {
        int arr[] = new int [5];
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the values of array");
        for(int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("enter the index value");
        int index = sc.nextInt();
        System.out.print("enter the divisor value");
        int divisor = sc.nextInt();
        try{
            int c=index/divisor;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("exception occured");
            System.out.print(e);
        }
      }
}
