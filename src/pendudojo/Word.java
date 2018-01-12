package pendudojo;

public class Word {

    private String goal;
    public String guessed_word;

    public Word(String text_goal) {
        System.out.println(text_goal);

        this.goal = text_goal;
        this.guessed_word = "";
        System.out.println(this.goal.length());

        for (int i = 1; i <= this.goal.length(); i++) {
            this.guessed_word += "_";
        }
    }

    public boolean check_win() {
        if (this.guessed_word == this.goal) {
            return true;
        } else {
            return false;
        }
    }
/*  
   
    Ici on a saisi une  lettre de longuere 1
    Le but est de rechercher cette lettre dans le mot à deviner
    
    On transforme le mot à deviner en tableau   
    On transforme l'état de la devinette (le pendu) en tableau   
    Quand les deux caratcteres sont égaux alors je me sers de l'indice oú je me positionne
    position [ i ]
    j'imprime le mot en ...
       */
    
    public void guess_letter(char letter) {
        char[] goal_array = this.goal.toCharArray();
        char[] guessedword_array = this.guessed_word.toCharArray();
        
        for (int i = 0; i < goal_array.length; i++) {
            if (letter == goal_array[i]) {
                guessedword_array[i]=letter; 
            }
        }
        this.guessed_word=guessedword_array.toString();
    }
}
