package Jobsheet14.SourceCode_Praktikum;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa08(){
    }

    public Mahasiswa08(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tamplInformasi() {
        System.out.println("NIM: " + this.nim + " " +
        "Nama: " + this.nama + " " + " " +
        "Kelas: " + this.kelas + " " +
        "IPK: " + this.ipk);
    }
}
