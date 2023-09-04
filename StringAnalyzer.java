import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String str = input.nextLine(); // legge la stringa inserita dall'utente
        input.close(); // chiude lo scanner per liberare le risorse

        int aCount = 0; // inizializza il contatore delle lettere 'a'
        int vowelCount = 0; // inizializza il contatore delle vocali
        int digitCount = 0; // inizializza il contatore delle cifre numeriche

        for (int i = 0; i < str.length(); i++) { // scorre tutti i caratteri della stringa
            char ch = str.charAt(i); // ottiene il carattere corrente
            if (ch == 'a') { // se il carattere è una 'a'
                aCount++; // incrementa il contatore delle lettere 'a'
            }
            if (isVowel(ch)) { // se il carattere è una vocale
                vowelCount++; // incrementa il contatore delle vocali
            }
            if (Character.isDigit(ch)) { // se il carattere è una cifra numerica
                digitCount++; // incrementa il contatore delle cifre numeriche
            }
        }

        // stampa a schermo il numero di lettere 'a', vocali e cifre numeriche presenti nella stringa
        System.out.println("La stringa contiene " + aCount + " lettere 'a'");
        System.out.println("La stringa contiene " + vowelCount + " vocali");
        System.out.println("La stringa contiene " + digitCount + " cifre numeriche");
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // converte il carattere in minuscolo
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; // restituisce true se il carattere è una vocale, false altrimenti
    }
}