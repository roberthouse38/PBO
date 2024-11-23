public class Digital {
    public static void main(String[] args) {

        // Header tabel kebenaran
        System.out.println("A | B | A OR B | A XOR B | NOT A | NOT B");
        System.out.println("----------------------------------------");

        // Semua kombinasi untuk A dan B
        int[][] combinations = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};

        for (int[] pair : combinations) {
            int a = pair[0];
            int b = pair[1];

            // Operasi OR (|)
            int orResult = a | b;

            // Operasi XOR (^)
            int xorResult = a ^ b;

            // Operasi NOT (~)
            int notA = ~a & 1; // Memastikan hasilnya 0 atau 1
            int notB = ~b & 1;

            // Menampilkan hasil dalam bentuk tabel
            System.out.println(a + " | " + b + " |   " + orResult + "    |    " + xorResult + "    |   " + notA + "   |   " + notB);
        }
    }
}
