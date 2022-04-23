/*
Scrivere un programma contenente un metodo (e relativa chiamata) che dato un numero intero n restituisca la sua metà,
se n è pari, altrimenti getti un'eccezione OddNumberException. Scrivere anche la relativa classe dell'eccezione.
 */

public class Main {
    public static void main (String[] args) throws OddNumberException {
        Restituzione r1 = new Restituzione();

        r1.restituisci(5);
        r1.restituisci(6);
    }
}