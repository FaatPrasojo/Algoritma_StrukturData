import java.util.Scanner;
public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim,tahunMasuk;
        double nilaiUAS, nilaiUTS;

        DataMahasiswa[] arrDataMhs = new DataMahasiswa[8];
        
        for (int i = 0; i < arrDataMhs.length; i++) {
            System.out.println("Input Data Mahasiswa ke-" + (i+1) + " : ");
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("NIM : ");
            nim = sc.nextLine();
            System.out.print("Tahun Masuk : ");
            tahunMasuk = sc.nextLine();
            System.out.print("Nilai UTS : ");
            nilaiUTS = Double.parseDouble(sc.nextLine());
            System.out.print("Nilai UAS : ");
            nilaiUAS = Double.parseDouble(sc.nextLine());
            System.out.println("------------------------------");
            arrDataMhs[i] = new DataMahasiswa(nama, nim, tahunMasuk, nilaiUAS, nilaiUTS);
            arrDataMhs[i].tambahData(nama, nim, tahunMasuk, nilaiUAS, nilaiUTS);
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("=====================-Daftar Nilai Mahasiswa-=====================");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-18s %-10s %-15s %-10s %-10s%n", 
            "Nama", "NIM", "Tahun Masuk", "UTS", "UAS");
        System.out.println("------------------------------------------------------------------");
        
        for (DataMahasiswa mhs : arrDataMhs) {
            System.out.printf("%-15s %-15s %-12s %-10.1f %-10.1f%n", 
                mhs.nama, 
                mhs.nim, 
                mhs.tahunMasuk, 
                mhs.nilaiUTS, 
                mhs.nilaiUAS);
        }
        System.out.println("------------------------------------------------------------------");
        double maxUTS = DataMahasiswa.cariUTSTertinggi(arrDataMhs, 0, arrDataMhs.length - 1);
        double minUTS = DataMahasiswa.cariUTSTerendah(arrDataMhs, 0, arrDataMhs.length - 1);
        double avgUAS = DataMahasiswa.hitungRataUAS(arrDataMhs);

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Nilai UTS Tertinggi: " + maxUTS);
        System.out.println("Nilai UTS Terendah: " + minUTS);
        System.out.println("Rata-Rata Nilai UAS: " + avgUAS);

        sc.close();
    }
    
}
