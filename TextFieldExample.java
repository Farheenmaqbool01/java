import java.awt .*;
public class TextFieldExample {
    public static void main(String[] args)
    {
       
        Frame f = new Frame("TextField");
        TextField  t1 = new TextField("CSE");
        t1.setBounds(100,200,100,30);
        f.add(t1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}


