public class MataKuliah08 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("Sks : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam(int jamBaru) {
        jumlahJam += jamBaru;
    }
    void kurangJam(int jamBaru) {
        if (jumlahJam >= jamBaru) {
            jumlahJam -= jamBaru;
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan.\nJumlah jam saat ini: " + jumlahJam + "\nJam yang ingin dikurangi: " + jamBaru);
        }
    }
}
