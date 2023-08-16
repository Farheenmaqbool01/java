import java.util.Scanner;
  public class Super{
    int x=5;
 }
class sub extends Super{
        int x=10;
void Print()
{
   System.out.print(x);
   System.out.print(super.x);

}
}
class Main()
{
    public static void main(String[] args) {
        sub S = new sub();
        S.print(); 
    }
}