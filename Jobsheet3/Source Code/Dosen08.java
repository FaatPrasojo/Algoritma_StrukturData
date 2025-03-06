public class Dosen08 {
    public String kode;
    public String nama;
    Boolean jenisKelamin;
    int usia;


    public Dosen08(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void tampilkanInfo() {
        System.out.println("Kode Dosen     : " + kode);
        System.out.println("Nama Dosen     : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
        System.out.println("------------------------------------");
    }
}
