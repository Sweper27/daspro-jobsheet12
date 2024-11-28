public class tugas1 {
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Deret Descending (Rekursif):");
        deretDescendingRekursif(5);
        System.out.println("Deret Descending (Iteratif):");
        deretDescendingIteratif(5);
    }
}
