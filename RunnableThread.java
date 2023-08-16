class thread1 implements Runnable{
    public void run()
    {
        while(true)
    
    {
        System.out.println("thread1 running");
    }
}
}
class thread2 implements Runnable{
    public void run()
    {
        while(true)
    {
        System.out.println("thread2 running");
    }
}
}
public class RunnableThread {
    public static void main(String[] args)
    {
        thread1  t1= new thread1();
        thread2 t2 = new thread2();
        Thread r1 = new Thread(t1);
         Thread r2 = new Thread(t2);
         r1.start();
        r2.start();
        
    }

}




























