import java.util.Scanner;

public class ReplaceSpace {
    
    public static void main(String[] args){
        System.out.println("enter the string to replace the whitespace with underscores");

        Scanner  Sc = new Scanner(System.in);
        String s = "";
        s += Sc.nextLine();
        Sc.close();
        char charsArray[] = s.toCharArray();
        for(int i = 0;i < charsArray.length;i++)
        {
        if(charsArray[i] == ' '){
            charsArray[i] = '_';
        }
    }
    for(int i=0;i < charsArray.length;i++){
        System.out.print(charsArray[i]);
    }
    }
}

