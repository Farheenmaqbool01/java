
 import java.util.Scanner;

class floydstra{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of lines");
    int num = sc.nextInt();
    int value=1;
    for(int i=1;i<=num;i++)
    {
       for( int j=1;j<=i;j++)
    {
    System.out.print(value + " ");
    value++;
    }
    System.out.println();
   sc.close();
}
}
}