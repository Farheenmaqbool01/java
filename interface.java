interface abc
{
    void fx1();
    void fx2();
}
interface efg 
{
   void fx3();
   void fx4();
}class inter implements  abc ,efg{
   public void fx1()
    {
        System.out.println("hello");
    }
    public void fx2()
    {
        System.out.println("hi");
    }
    public void fx3()
    {
        System.out.println("hey");
    }
     public void fx4()
    {
        System.out.println("bye");
    }
}
class interfaces
{
    public static void main(String[] args)
    {
        inter i = new inter();
        i.fx1();
        i.fx2();
        i.fx3();
        i.fx4();
    }
}