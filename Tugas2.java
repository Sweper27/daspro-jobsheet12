public class Tugas2 {
    
    static int penjumlahanRekursif(int f) {
        if (f == 0) {
            return 0;
        } else {
            return f + penjumlahanRekursif(f - 1);
        }
    }

    public static void main(String[] args) {
        int f = 8;
        System.out.println("Penjumlahan Rekursif dari 1 sampai " + f + " = " + penjumlahanRekursif(f));
    }
}
