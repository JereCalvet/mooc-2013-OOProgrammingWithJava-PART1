
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        /* respuesta propuesta: misma logica, escrito brevemente diferente. 
        usa un return en vez de nergar el primer if
           
        if (this.guessedLetters.contains(letter)) {
            return;
        }
 
        if (!this.word.contains(letter)) {
            this.numberOfFaults++;
        }
 
        this.guessedLetters = this.guessedLetters + letter;
        */
        if (!this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }
        }
    }

    public String hiddenWord() {
        /*
        respuesta propuesta: uso el cheat que yo evite, el mio es mejor in ur face.
        le puso nombre de letra al iterador, yo lo pense tmb
        guardo la letra ena variable char, mas legible pero ocupa mas lugar
        
        conclusion: vale la pena declarar otra variable para hacer el codigo mas legible? 
                    es recomendable usar este tipo de "hacks"? String.contrains(charVariable+"")
        
        String hiddenVersionOfWord = "";
 
        int letterIndex = 0;
        while (letterIndex < this.word.length()) {
            char character = this.word.charAt(letterIndex); 
 
            if (this.guessedLetters.contains("" + character)) { <---- cheat
                hiddenVersionOfWord = hiddenVersionOfWord + character;
            } else {
                hiddenVersionOfWord = hiddenVersionOfWord + "_";
            }
 
            letterIndex++;
        }
 
        return hiddenVersionOfWord;
    }
        */
        
        
        int i = 0;
        String hidden = "";
        while (this.word.length() > i) {
            //si las letras adivinadas contienen el char en posicion i, revelo en hidden
            //casi contrario _
            if (this.guessedLetters.indexOf(this.word.charAt(i)) != -1 ){
                hidden += this.word.charAt(i);
            } else {
                hidden += "_"; 
            }
            i++;
        }
        return hidden;
    }
}
