public class Main {
    public static void main(String[] args) {
        // Contoh untuk Pria Manajer di Lokasi 1, usia 25-35
        Usia25_35PriaManajer1 priaManajer1 = new Usia25_35PriaManajer1("Andi");
        System.out.println(priaManajer1.infoUsia());

        // Contoh untuk Wanita Direktur di Lokasi 2, usia 36-50
        Usia36_50WanitaDirektur2 wanitaDirektur2 = new Usia36_50WanitaDirektur2("Siti");
        System.out.println(wanitaDirektur2.infoUsia());

        // Contoh untuk Pria Staff di Lokasi 1, usia 36-50
        Usia36_50PriaStaff1 priaStaff1 = new Usia36_50PriaStaff1("Budi");
        System.out.println(priaStaff1.infoUsia());

        // Contoh untuk Wanita Staff di Lokasi 2, usia 25-35
        Usia25_35WanitaStaff2 wanitaStaff2 = new Usia25_35WanitaStaff2("Ani");
        System.out.println(wanitaStaff2.infoUsia());
    }
}
