import java.util.Scanner;
public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        Dosen08[] arrayOfDosen08 = new Dosen08[3];

        for(int i = 0; i<3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode     : ");
            kode = sc.nextLine();
            System.out.print("Nama     : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia     : ");
            usia = sc.nextInt();
            sc.nextLine();
            arrayOfDosen08[i] = new Dosen08(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------------");
            
        }
        DataDosen08 dataDosen = new DataDosen08();
        dataDosen.dataSemuaDosen(arrayOfDosen08);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen08);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen08);
        dataDosen.infoDosenPalingTua(arrayOfDosen08);
        dataDosen.infoDosenPalingMuda(arrayOfDosen08);
        
        sc.close();
    }
}
