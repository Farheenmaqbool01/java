
 import java.awt .*;
class DButton extends Component { 
    DButton()
    {
       
        Frame f = new Frame("List");
        List L = new List(5);
          L.add("CSE");
        L.add("ECE");
        L.add("Civ");
        f.add(L);
        f.setSize(300,300);
        L.setBounds(100,200,100,30);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new DButton();
    }
}    

