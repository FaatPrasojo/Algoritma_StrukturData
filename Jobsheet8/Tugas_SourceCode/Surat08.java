package Jobsheet8.Tugas_SourceCode;

public class Surat08 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' untuk sakit, 'I' untuk izin keperluan lain
    int durasi;

    public Surat08() {
    }

    public Surat08(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void printSurat() {
        System.out.println("ID Surat      : " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas         : " + kelas);
        System.out.println("Jenis Izin    : " + (jenisIzin == 'S' ? "Sakit" : "Izin"));
        System.out.println("Durasi        : " + durasi + " hari");
        System.out.println("-----------------------------");
    }
}