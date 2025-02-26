public class DosenMain08 {
    public static void main(String[] args) {
        Dosen08 d1 = new Dosen08();
        d1.nama = "Prasojo";
        d1.idDosen = "aa00";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Daspro";

        d1.tampilInformasi();
        d1.setStatusAktif(true);
        d1.hitungMasaKerja(2020);
        d1.ubahKeahlian("Matdas");
        System.out.println("----------------------");
        d1.tampilInformasi();
    }
}
