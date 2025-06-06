package Jobsheet11.SourceCode_Tugas;

public class Mahasiswa {
    String nim;
    String nama;
    String jurusan;
    Mahasiswa next;
    
    public Mahasiswa(String nim, String nama, String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.next = null;
    }
}
