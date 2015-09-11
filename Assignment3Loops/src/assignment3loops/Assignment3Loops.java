package assignment3loops;
import java.util.Scanner;

public class Assignment3Loops {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int cont = 1;
        
        print("Welcome to Steve's word Mixer-upper!\n\n");
       do{
        print("Please Enter A word you would "
                + "Like to mix up: ");
                String word = keyboard.nextLine();
                for(int i = word.length()-1; i >= 0; i--){
                    System.out.print(word.charAt(i));  
                }
        print("\nIf you would like to continue, press 1, if not, press 0 ");
        cont = keyboard.nextInt();
       }
       while(cont != 0);
    }
    
    public static void print(String str){//print method
     System.out.print(str);
 } 
}
