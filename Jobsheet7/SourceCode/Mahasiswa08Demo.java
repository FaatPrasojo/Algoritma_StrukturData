package Jobsheet7.SourceCode;
import java.util.Scanner;

public class Mahasiswa08Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        
        System.out.println("---------------------------------");
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int x = sc.nextInt();
        System.out.println("---------------------------------");

        for (int i = 0; i < x; i++) {
            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            System.out.println("---------------------------------");
            list.tambah(new Mahasiswa08(nim, nama, kelas, ipk));
        }
            // MahasiswaBerprestasi list = new MahasiswaBerprestasi();
    
            // Mahasiswa08 m1 = new Mahasiswa08("123", "Zidan", "2A", 3.2);
            // Mahasiswa08 m2 = new Mahasiswa08("124", "Ayu", "2A", 3.5);
            // Mahasiswa08 m3 = new Mahasiswa08("125", "Sofi", "2A", 3.1);
            // Mahasiswa08 m4 = new Mahasiswa08("126", "Sita", "2A", 3.9);
            // Mahasiswa08 m5 = new Mahasiswa08("127", "Miki", "2A", 3.7);
    
            // list.tambah(m1);
            // list.tambah(m2);
            // list.tambah(m3);
            // list.tambah(m4);
            // list.tambah(m5);
        list.tampil();

        System.out.println("----------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang ingin dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        // System.out.println("---------------------------------");
        // System.out.println("Menggunakan Sourting Searching : ");
        // System.out.println("---------------------------------");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("---------------------------------");
        System.out.println("Menggunakan Binary Search :");
        System.out.println("---------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, x-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
        sc.close();
    }
}