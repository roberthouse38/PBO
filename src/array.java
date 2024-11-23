public class array {
    public static void main(String[] args) {
        int[][] duaD = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(duaD[i][j]);
                if (j < 2) System.out.print(" "); // Menambahkan spasi antar kolom
            }
            System.out.println(); // Pindah ke baris berikutnya setelah 3 kolom tercetak
        }
    }
}
