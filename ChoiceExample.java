 import java.awt .*;
public class ChoiceExample { 
    public static void main(String[] args)
    {
       
        Frame f = new Frame();
        Choice  c = new Choice ();
        c.setBounds(100,200,100,30);
          c.add("CSE");
        c.add("ECE");
        c.add("Civ");
        f.add(c);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}


