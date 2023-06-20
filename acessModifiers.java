class student
 {
    public int x=10;
    protected int y =20;
    private int z=30;
    int p=22;
    
}
class acessModifiers extends student
{
    public static void main(String [] args)
    {
        student x = new student();
        System.out.println(x.x);
        System.out.println(x.y);
        System.out.println(x.p);

    }
}