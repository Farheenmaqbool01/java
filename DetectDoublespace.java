import java.util.Scanner;

public class DetectDoublespace{
    
    public static void main(String[] args){
        System.out.println("enter the string to detect double and triple spaces");

        Scanner  Sc = new Scanner(System.in);
        String str = "";
        str+=  str + Sc.nextLine();
        Sc.close();
        char charsArray[] = str.toCharArray();
        for(int i = 0;i < charsArray.length;i++){
        if( charsArray[i] == ' ' && charsArray[i+1] == ' ' && charsArray[i+2] ==' '){
            System.out.print("Triple space found at index" +i);
            i++;
            i++;
        }
        else if(charsArray[i] == ' '  && charsArray[i+1] == ' '){
            System.out.print("Double space found at index" +i);
            i++;
    }
        }
    }

}


