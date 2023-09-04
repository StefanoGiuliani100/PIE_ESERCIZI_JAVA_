import java.util.Scanner;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String str = input.nextLine(); // legge la stringa inserita dall'utente
        int maxLength;
        do {
            System.out.print("Inserisci la lunghezza massima: ");
            while (!input.hasNextInt()) { // controlla se l'input è un numero intero
                System.out.println("Numero non valido, inserire di nuovo");
                input.next(); // consuma l'input non valido
            }
            maxLength = input.nextInt(); // legge la lunghezza massima inserita dall'utente
        } while (maxLength < 0); // controlla se la lunghezza massima è positiva o nulla
        input.close(); // chiude lo scanner per liberare le risorse

        int strLength = str.length(); // ottiene la lunghezza della stringa inserita dall'utente

        if (strLength > maxLength) { // verifica se la stringa è più lunga della lunghezza massima
            System.out.println("La stringa è più lunga della lunghezza massima di " + maxLength + " caratteri");
        } else if (strLength < maxLength) { // verifica se la stringa è più corta della lunghezza massima
            System.out.println("La stringa è più corta della lunghezza massima di " + maxLength + " caratteri");
        } else { // altrimenti, la stringa ha la stessa lunghezza della lunghezza massima
            System.out.println("La stringa ha esattamente " + maxLength + " caratteri");
        }
    }
}