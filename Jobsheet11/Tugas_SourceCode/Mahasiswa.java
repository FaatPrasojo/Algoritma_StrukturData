package Jobsheet11.Tugas_SourceCode;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    int semester;

    public Mahasiswa(String nim, String nama, String prodi, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.semester = semester;
    }

    void display() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi + ", Semester: " + semester);
    }
}
