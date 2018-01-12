package pendudojo;

import java.util.Scanner;

public class PenduDojo {

    public static void main(String[] args) {
        Word w1 = new Word("hello zuzu");
        Scanner scan = new Scanner(System.in);
        
        while( ! w1.check_win()){
            
            System.out.println("You didn't win");
            String letter = "aa";
            
            while (letter.length() > 1) {
                System.out.println("Please enter a char");
                letter = scan.next();
                if (letter.length() > 1) {
                    System.out.println("You must enter a single char");
                }
                w1.guess_letter(letter.charAt(0));
            }
        }    
    }
}
