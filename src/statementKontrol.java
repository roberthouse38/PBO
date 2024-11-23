class statementKontrol {
    public static void main(String[] args) {
        for (int i=0; i<39; i++) {
            System.out.print("Pada saat i=" + i + ": ");
            for (int j=0; j<39; j++) {
                if (j==20) {
                    return;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}