public class MahasiswaMain08 {
    public static void main(String[] args) {
        Mahasiswa08 mhs1 = new Mahasiswa08();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        System.out.println("------------------");
        mhs1.tampilkanInformasi();
        
        Mahasiswa08 mhs3 = new Mahasiswa08("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs3.updateIpk(3.30);
        System.out.println("------------------");
        mhs3.tampilkanInformasi();

        Mahasiswa08 mhsPrasojo = new Mahasiswa08("Faatihurrizki Prasojo", "244107020142", 3.83, "TI 1H");
        System.out.println("------------------");
        mhsPrasojo.tampilkanInformasi();
    }
}
