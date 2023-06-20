import java.util.Scanner;

class pascals{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of lines");
    int n = sc.nextInt();
    int space = n;
    int number=1;
    for(int i=0;i<=n;i++)
    {
       for(int s=1;s<=space;s++)
    {
    System.out.print(" ");
    }
    number=1;
    for( int j=1;j<=i;j++)
    {
    System.out.print(number+  " ");
     number= number*(i-j)/(j+1);
    }
    space--;
    System.out.println();
   sc.close();
}
}
}
