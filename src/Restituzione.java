public class Restituzione {
    public static void restituisci(int n) throws OddNumberException{
        try {
            System.out.println(restituisciMetà(n));
        }
        catch (OddNumberException exception){
            System.out.println(exception);
        }
    }

    private static int restituisciMetà(int n) throws OddNumberException {
        if (n % 2 == 0)
            return n / 2;
        else
            throw new OddNumberException();
    }
}
