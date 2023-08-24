import java.awt .*;
class ButtonExamp extends  Frame{ 
    ButtonExamp()
    {
       
        Frame f = new Frame();
        Button b = new Button ("Print");
        f.add(b);
        b.setBounds(100,200,100,30);
        f.setSize(300,300);
         f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new ButtonExamp();
    }
    
}
