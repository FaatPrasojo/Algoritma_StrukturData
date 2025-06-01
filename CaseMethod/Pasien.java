package CaseMethod;

public class Pasien {

    String namaPasien, nik, keluhan;

    public Pasien (String namaPasien,String nik,String keluhan){
        this.namaPasien=namaPasien;
        this.nik=nik;
        this.keluhan= keluhan;
    }
    public void tampilkanInformasi() {
        System.out.println("Nama Pasien : " + namaPasien);
        System.out.println("NIK: " + nik);
        System.out.println("Keluhan : " + keluhan);
    }
}