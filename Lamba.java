import java.util.*;
interface inter{
    public void getdetails();
}
public class Lamba {
    public static void main(String[] args)
    {
        inter in =() -> {
            System.out.println("this is get details");
        };
        in.getdetails();
    }
    
}
