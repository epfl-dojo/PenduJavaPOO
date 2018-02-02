package pendudojo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Word {

    private JSONArray words;
    private String goal;
    public String guessed_word;

    public Word(String text_goal) {
        System.out.println(text_goal);
        this.load_words();
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

        Iterator<String> iterator = this.words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return "";
    }

    public ArrayList<Integer> getRandomObject(JSONArray jsonArray) {
        int arraySize = this.words.size();
        
        int randomNum = ThreadLocalRandom.current().nextInt(1, arraySize + 1);
        
        
        Set<Integer> generated = new LinkedHashSet<>();
        
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(generated);
        return arrayList;
    }

    public void load_words() {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("c:\\words.json"));

            JSONObject jsonObject = (JSONObject) obj;

            // loop array
            JSONArray words_json = (JSONArray) jsonObject.get("result");
            this.words = words_json;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
