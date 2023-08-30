import java.awt.*;
public class Login {
    public static void main(String[]args)
    {
        Frame f = new Frame("Login page");
        Label l1 = new Label("username");
        Label l2 = new Label("password");
        f.setLayout(null);
       l1.setBounds(100,100,100,20);
        l2.setBounds(100,150,100,20);

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        t1.setBounds(220,100,150,20);
         t2.setBounds(220,150,150,20);
           
          Button b1 = new Button("submit");
           Button b2 = new Button("cancel");
           b1.setBounds(150,200,100,30);
           b2.setBounds(270,200,100,30);
           f.add(l1);
           f.add(l2);
           f.add(t1);
           f.add(t2);
           f.add(b1);
           f.add(b2);
           f.setVisible(true);

    }
}
