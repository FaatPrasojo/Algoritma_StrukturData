package Jobsheet6.SourceCode;
import java.util.Scanner;

public class Mahasiswa08Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data Mahasiswa ke- " + (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

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
    
    
            System.out.println("Data Mahasiswa Belum Sorting");
            list.tampil();
    
            System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC)");
            list.bubbleSort();
            list.tampil();
    
            System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
            list.SelectionSort();
            list.tampil();
    
            System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
            list.insertionSort();
            list.tampil();
    
            sc.close();

    }
}