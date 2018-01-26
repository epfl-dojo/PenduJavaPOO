package pendudojo;

import java.util.Scanner;

public class PenduDojo {

    public static void main(String[] args) {
        Word w1 = new Word("Welcome");
        Scanner scan = new Scanner(System.in);
        
        Life l1 = new Life(5);
        while( ! w1.check_win()){

            System.out.println(w1.guessed_word);
            String letter = "aa";
          
            while (letter.length() > 1) {
                System.out.println("Please enter a letter");
                letter = scan.next();
                if (letter.length() > 1) {
                    System.out.println("You must enter a single letter");
                }
                if (w1.guess_letter(letter.charAt(0))){
                    System.out.println("You have found a letter");

                } else {
                    l1.lifekill();
                    l1.showLife();
                
                }
            }


        }   
        System.out.println("you won !");
    }
}
