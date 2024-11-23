// Kelas dasar Karyawan
public class Karyawan {

    protected String name;
    protected String position;

    public Karyawan(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String info() {
        return name + " adalah seorang " + position + ".";
    }
}

//================================================JABATAN====================================//
class Manajer extends Karyawan {
    public Manajer(String name) {
        super(name, "Manajer");
    }
}

class Direktur extends Karyawan {
    public Direktur(String name) {
        super(name, "Direktur");
    }
}

class Staff extends Karyawan {
    public Staff(String name) {
        super(name, "Staff");
    }
}

//==============================================LOKASI=========================================================//
class Lokasi1Manajer extends Manajer {
    public Lokasi1Manajer(String name) {
        super(name);
    }

    public String infoLokasi() {
        return super.info() + " Berlokasi di Lokasi 1.";
    }
}

class Lokasi2Manajer extends Manajer {
    public Lokasi2Manajer(String name) {
        super(name);
    }

    public String infoLokasi() {
        return super.info() + " Berlokasi di Lokasi 2.";
    }
}

class Lokasi1Direktur extends Direktur {
    public Lokasi1Direktur(String nama) {
        super(nama);
    }

    public String infoLokasi() {
        return super.info() + " Berlokasi di Lokasi 1.";
    }
}

class Lokasi2Direktur extends Direktur {
    public Lokasi2Direktur(String nama) {
        super(nama);
    }

    public String infoLokasi() {
        return super.info() + " Berlokasi di Lokasi 2.";
    }
}

class Lokasi1Staff extends Staff {
    public Lokasi1Staff(String nama) {
        super(nama);
    }

    public String infoLokasi() {
        return super.info() + " Berlokasi di Lokasi 1.";
    }
}

class Lokasi2Staff extends Staff {
    public Lokasi2Staff(String nama) {
        super(nama);
    }

    public String infoLokasi() {
        return super.info() + " Berlokasi di Lokasi 2.";
    }
}

//===================================================GENDER=============================================//
// Gender untuk Manajer di Lokasi 1
class PriaManajer1 extends Lokasi1Manajer {
    public PriaManajer1(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Pria.";
    }
}

class WanitaManajer1 extends Lokasi1Manajer {
    public WanitaManajer1(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Wanita.";
    }
}

// Gender untuk Manajer di Lokasi 2
class PriaManajer2 extends Lokasi2Manajer {
    public PriaManajer2(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Pria.";
    }
}

class WanitaManajer2 extends Lokasi2Manajer {
    public WanitaManajer2(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Wanita.";
    }
}

// Gender untuk Direktur di Lokasi 1
class PriaDirektur1 extends Lokasi1Direktur {
    public PriaDirektur1(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Pria.";
    }
}

class WanitaDirektur1 extends Lokasi1Direktur {
    public WanitaDirektur1(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Wanita.";
    }
}

// Gender untuk Direktur di Lokasi 2
class PriaDirektur2 extends Lokasi2Direktur {
    public PriaDirektur2(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Pria.";
    }
}

class WanitaDirektur2 extends Lokasi2Direktur {
    public WanitaDirektur2(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Wanita.";
    }
}

// Gender untuk Staff di Lokasi 1
class PriaStaff1 extends Lokasi1Staff {
    public PriaStaff1(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Pria.";
    }
}

class WanitaStaff1 extends Lokasi1Staff {
    public WanitaStaff1(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Wanita.";
    }
}

// Gender untuk Staff di Lokasi 2
class PriaStaff2 extends Lokasi2Staff {
    public PriaStaff2(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Pria.";
    }
}

class WanitaStaff2 extends Lokasi2Staff {
    public WanitaStaff2(String nama) {
        super(nama);
    }

    public String infoGender() {
        return super.infoLokasi() + " Berjenis kelamin Wanita.";
    }
}

//==================================================== USIA ======================================================//

// Usia untuk Pria Manajer di Lokasi 1
class Usia25_35PriaManajer1 extends PriaManajer1 {
    public Usia25_35PriaManajer1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50PriaManajer1 extends PriaManajer1 {
    public Usia36_50PriaManajer1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Wanita Manajer di Lokasi 1
class Usia25_35WanitaManajer1 extends WanitaManajer1 {
    public Usia25_35WanitaManajer1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50WanitaManajer1 extends WanitaManajer1 {
    public Usia36_50WanitaManajer1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Pria Direktur di Lokasi 1
class Usia25_35PriaDirektur1 extends PriaDirektur1 {
    public Usia25_35PriaDirektur1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50PriaDirektur1 extends PriaDirektur1 {
    public Usia36_50PriaDirektur1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Wanita Direktur di Lokasi 1
class Usia25_35WanitaDirektur1 extends WanitaDirektur1 {
    public Usia25_35WanitaDirektur1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50WanitaDirektur1 extends WanitaDirektur1 {
    public Usia36_50WanitaDirektur1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Staff Pria di Lokasi 1
class Usia25_35PriaStaff1 extends PriaStaff1 {
    public Usia25_35PriaStaff1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50PriaStaff1 extends PriaStaff1 {
    public Usia36_50PriaStaff1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun";
    }
}

// Usia untuk Staff Wanita di Lokasi 1
class Usia25_35WanitaStaff1 extends WanitaStaff1 {
    public Usia25_35WanitaStaff1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50WanitaStaff1 extends WanitaStaff1 {
    public Usia36_50WanitaStaff1(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun";
    }
}





class Usia25_35PriaManajer2 extends PriaManajer2 {
    public Usia25_35PriaManajer2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

// Usia untuk Pria Manajer di Lokasi 2
class Usia36_50PriaManajer2 extends PriaManajer2 {
    public Usia36_50PriaManajer2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Wanita Manajer di Lokasi 2
class Usia25_35WanitaManajer2 extends WanitaManajer2 {
    public Usia25_35WanitaManajer2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50WanitaManajer2 extends WanitaManajer2 {
    public Usia36_50WanitaManajer2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Pria Direktur di Lokasi 2
class Usia25_35PriaDirektur2 extends PriaDirektur2 {
    public Usia25_35PriaDirektur2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50PriaDirektur2 extends PriaDirektur2 {
    public Usia36_50PriaDirektur2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Wanita Direktur di Lokasi 2
class Usia25_35WanitaDirektur2 extends WanitaDirektur2 {
    public Usia25_35WanitaDirektur2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50WanitaDirektur2 extends WanitaDirektur2 {
    public Usia36_50WanitaDirektur2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun.";
    }
}

// Usia untuk Staff Pria di Lokasi 2
class Usia25_35PriaStaff2 extends PriaStaff2 {
    public Usia25_35PriaStaff2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50PriaStaff2 extends PriaStaff2 {
    public Usia36_50PriaStaff2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun";
    }
}

// Usia untuk Staff Wanita di Lokasi 2
class Usia25_35WanitaStaff2 extends WanitaStaff2 {
    public Usia25_35WanitaStaff2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 25-35 tahun.";
    }
}

class Usia36_50WanitaStaff2 extends WanitaStaff2 {
    public Usia36_50WanitaStaff2(String nama) {
        super(nama);
    }
    public String infoUsia() {
        return super.infoGender() + " Berusia 36-50 tahun";
    }
}

