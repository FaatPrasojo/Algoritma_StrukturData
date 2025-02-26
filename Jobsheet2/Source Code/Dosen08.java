public class Dosen08 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("Id Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status aktif : " + statusAktif);
        System.out.println("Bidang keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkg) {
        System.out.println("Pengalaman Menjadi dosen : " + (thnSkg - tahunBergabung) + " tahun");
        return thnSkg;
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}