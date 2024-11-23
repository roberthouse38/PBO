public class belajarArray {
    public static void main(String[] args) {

    //int []nama Array
    //int [][]nama array dengan kotak awal baris dan kotak akhir kolom

        class InisialisasiArray2D {

            public static void main(String[] args) {

                int[][] Array2D = {{10,20,30},{40,50,60},{70,80,90},{100,110,120}};

                for(int i=0; i<2; i++) {
                    for (int j=0; j<3; j++) {
                        System.out.print(Array2D[i][j]);
                        if (j < 2) System.out.print(" ");
                    }
                    System.out.println();
                    }
                }
           }
        }
    }
