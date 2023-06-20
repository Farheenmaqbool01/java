import java.util.Scanner; 
 class one
  {
     abstract void disp();
     void display()
     {
        System.out.println("hey there");
     }
}
class two extends one {
    void disp()
    {
        System.out.println("this is a java course");
    }
}
class Abstract
{
public static void main(String [] args)
{
    one o new two();
    o.disp();
    o.display();
}
}