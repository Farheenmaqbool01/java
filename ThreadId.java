class ThreadTest extends Thread{
    public ThreadTest(String name)
    {
        super(name);

    }
    public void  run(){
        System.out.println("thread test");
    }
}
public class ThreadId {
    public static void main(String[] args)
    {
     ThreadTest t1 = new ThreadTest("farheen");
     t1.start();
     System.out.println("id of Thread is :" + t1.getId());
     System.out.println("name of Thread is " +t1.getName());
}
}
