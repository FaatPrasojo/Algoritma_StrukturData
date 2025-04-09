package Jobsheet6.SourceCode;

public class Dosen08 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen08(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode + "\nNama: " + nama + "\nJenis Kelamin: " + (jenisKelamin ? "Pria" : "Wanita") + "\nUsia: " + usia);
        System.out.println("---------------------------------");
    }
}

