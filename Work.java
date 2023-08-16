import java.util.Scanner;
class thread1 extends Thread{
    public void run()
    {
      while(true)
      {
            System.out.println("thread1 is implementing");
            System.out.println("work efficiency");
        }
    }
}
class thread2  extends Thread{
    public void run()
        {
            while(true)
            {
            System.out.println("thread2 is implementing");
            System.out.println(" good work ");
        }
    }
}

        class Work
     {
    public static void main(String[] args)
    {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        
        t1.start();
        t2.start();

    }
}



