
import java.util.Scanner;

class fact{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n= sc.nextInt();
    int fact=1;
    for(int i=n;i>0;i--)
    {
       fact=fact*i;
    }
    System.out.println(fact);

    System.out.println("\n");
    sc.close();
}
}