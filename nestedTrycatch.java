import java.util.Scanner;

public class nestedTrycatch {
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
            System.out.println("exception handling");
        
        try{
            int c = arr[index]/divisor;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("array index out of bound");
            System.out.println(b);

        }
    }
        catch(ArithmeticException e)
        {
            System.out.println("Arthmatic exception occured");
            System.out.print(e);
        }
    }
}
