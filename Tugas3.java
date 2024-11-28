public class Tugas3 {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) { 
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }

    public static void main(String[] args) {
        int bulan = 12; 
        System.out.println("Jumlah total pasangan marmut pada bulan ke-" + bulan + ": " + fibonacci(bulan));
    }
}
