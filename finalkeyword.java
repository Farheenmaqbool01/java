import java.util.Scanner; 
final class display
 {
    final String s = "hello";
    void print()
    {
        System.out.println(s);
    }   
}
/* one extends display 
{
    System.ot.println("this is a child class");
}*/
class finalkeyword
{
    public static void main(String [] args)
    {
        display d = new display();
        /*d.s = "hi";*/
        d.print();
    }
}
