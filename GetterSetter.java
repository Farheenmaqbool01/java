import java.util.Scanner;
public class GetterSetter{
    String name;
    int age;
public void setName(String n,int ag)
{
    name = n;
    age = ag;
}
public void getName(){
    System.out.println("Name:" + name + ", Age:" + age);
}
public static void main(String[] args)
{
    GetterSetter gs = new GetterSetter();
    gs.setName("farheen",20);
    gs.getName();
}
}
