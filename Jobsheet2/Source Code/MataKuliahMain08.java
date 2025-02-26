public class MataKuliahMain08 {
    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.kodeMK = "aa101";
        mk1.nama = "Daspro";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        System.out.println("------------------");
        mk1.ubahSKS(4);
        mk1.tambahJam(5);
        mk1.kurangJam(12);
        mk1.tampilkanInformasi();

        MataKuliah08 mk2 = new MataKuliah08();
        mk2.kodeMK = "aa102";
        mk2.nama = "Matdas";
        mk2.sks = 2;
        mk2.jumlahJam = 4;
        System.out.println("------------------");
        mk2.tampilkanInformasi();

    }
}
