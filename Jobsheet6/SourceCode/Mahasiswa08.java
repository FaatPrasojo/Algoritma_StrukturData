package Jobsheet6.SourceCode;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    Mahasiswa08(){
    }

    // Konstruktor berparamete (dibuat ada yang nama var parameter inputnya dama ada yang tidak)
    Mahasiswa08(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim );
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
