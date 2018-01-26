package pendudojo;

public class Word {

    private String goal;
    public String guessed_word;

    public Word(String text_goal) {
        System.out.println(text_goal);

        this.goal = text_goal;
        this.guessed_word = "";
        System.out.println("Le mot a " + this.goal.length() + " lettres");

        for (int i = 1; i <= this.goal.length(); i++) {
            this.guessed_word += "_";
        }
    }

    public boolean check_win() {
        return new String(this.guessed_word).equals(this.goal);

    }

    /*  
   
    Ici on a saisi une  lettre de longueur 1
    Le but est de rechercher cette lettre dans le mot à deviner
    
    On transforme le mot à deviner en tableau   
    On transforme l'état de la devinette (le pendu) en tableau   
    Quand les deux caratctères sont égaux alors je me sers de l'indice oú je me positionne
    position [ i ]
    j'imprime le mot en ...
     */
    public boolean guess_letter(char letter) {
        char[] goal_array = this.goal.toCharArray();
        //    String goal = new String(goal_array);
        //    System.out.println("goal = "+goal);
        char[] guessedword_array = this.guessed_word.toCharArray();
        boolean has_found = false;
        
        for (int i = 0; i < goal_array.length; i++) {
            if (letter == goal_array[i]) {
                guessedword_array[i] = letter;
                has_found = true;
            }
        }
        this.guessed_word = new String(guessedword_array);
        
        return has_found;
    }
    
    public String get_random_word() {
        
    }
}
