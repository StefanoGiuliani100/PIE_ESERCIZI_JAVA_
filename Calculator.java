import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1;
        do {
            System.out.print("Inserisci il primo numero: ");
            while (!input.hasNextDouble()) { // controlla se l'input è un numero
                System.out.println("Numero non valido, inserire di nuovo");
                input.next(); // consuma l'input non valido
            }
            num1 = input.nextDouble(); // legge il primo numero inserito dall'utente
        } while (num1 == Double.NaN); // controlla se il numero è NaN

        double num2;
        do {
            System.out.print("Inserisci il secondo numero: ");
            while (!input.hasNextDouble()) { // controlla se l'input è un numero
                System.out.println("Numero non valido, inserire di nuovo");
                input.next(); // consuma l'input non valido
            }
            num2 = input.nextDouble(); // legge il secondo numero inserito dall'utente
        } while (num2 == Double.NaN); // controlla se il numero è NaN

        char operator;
        do {
            System.out.print("Inserisci l'operatore (+, -, *, /): ");
            operator = input.next().charAt(0); // legge l'operatore inserito dall'utente
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Operatore non valido, inserire di nuovo");
            }
        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');

        input.close(); // chiude lo scanner per liberare le risorse

        double result; // dichiara la variabile che conterrà il risultato dell'operazione

        switch (operator) { // seleziona l'operazione da eseguire in base all'operatore inserito dall'utente
            case '+':
                result = num1 + num2; // esegue l'addizione
                break;
            case '-':
                result = num1 - num2; // esegue la sottrazione
                break;
            case '*':
                result = num1 * num2; // esegue la moltiplicazione
                break;
            case '/':
                if (num2 == 0) { // gestisce l'errore di divisione per zero
                    System.out.println("Impossibile dividere per zero");
                    return;
                }
                result = num1 / num2; // esegue la divisione
                break;
            default:
                System.out.println("Operatore non valido"); // gestisce l'errore di operatore non valido
                return;
        }

        // stampa a schermo il risultato dell'operazione
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}