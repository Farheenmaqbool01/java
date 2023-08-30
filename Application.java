import java.awt.*;
public class Application {
    public static void main(String args[]) {
        Frame f = new Frame("Application");
        f.setSize(400, 400);

        Label l = new Label("Name:");
        Label l2 = new Label("Department:");
        Label l3 = new Label("Courses Done:");
        Label l4 = new Label("Description:");
        Label l5 = new Label("Coures we offer:");
        l.setBounds(150, 100, 100, 20); 
        l2.setBounds(150, 150, 100, 20);
        l3.setBounds(150,200,100,20);
        l4.setBounds(150,350,100,20);
        l5.setBounds(150,500,100,20);

        TextField t = new TextField();
        t.setBounds(250, 100, 200, 40); 

        Choice c = new Choice();
        c.setBounds(250, 150, 200, 30); 
        c.add("CSE");
        c.add("ECE");
        c.add("CE");

        Checkbox c1 = new Checkbox("Java"); 
        c1.setBounds(250, 200, 100, 10); 

         Checkbox c2 = new Checkbox("python"); 
        c2.setBounds(250, 250, 100, 20); 

         Checkbox c3 = new Checkbox("c++"); 
        c3.setBounds(250, 300, 100, 20); 

        TextArea t1 = new TextArea();
        t1.setBounds(250,350,200,70);

        List list = new List(4);
        list.setBounds(250,500,150,50);
        list.add("python");
        list.add("React.js");
        list.add("node.js");
        list.add("javascript");

        Button b =new Button("Submit");
        b.setBounds(200,600,100,30);


        f.add(l);
        f.add(l2);
        f.add(t);
        f.add(c);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(list);
        f.add(l5);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
}