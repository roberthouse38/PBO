public class classString {
    public static void main(String[] args) {

        // S1.Nama
        String firstName = "Lucky";
        String middleName = "Barga";
        String lastName = "Aretama";

        // s2.NIM
        String S2 = "21120122140138";

        // Panjang s1 & s2
        int lengthS1 = firstName.length() + middleName.length() + lastName.length();
        int lengthS2 = S2.length();

        System.out.println("Panjang S1 (Nama): " + lengthS1);
        System.out.println("Panjang S2 (NIM): " + lengthS2);

        // Gabungkan s1 & s2 dengan concat
        String fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        String combined = fullName.concat(" ").concat(S2);
        System.out.println("Gabungan Nama dan NIM: " + combined);

        // Replace nama awal dengan "Selamat datang"
        String welcome = "Selamat datang ".concat(middleName).concat(" ").concat(lastName);
        System.out.println(welcome);

        // Replace huruf 'a' jadi 'o' dan huruf 'i' jadi 'u'
        String replacedName = fullName.replace('a', 'o').replace('i', 'u');
        System.out.println("Nama setelah penggantian huruf: " + replacedName);

        // Menggunakan substring untuk mengganti nama tengah/belakang dengan PB0
        String modifiedName = fullName.substring(0, firstName.length()).concat(" PB0");
        System.out.println("Nama setelah diubah dengan substring: " + modifiedName);
    }
}
