package Jobsheet7.SourceCode;

import java.util.Scanner;

public class Dosen08Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen08 dataDosen = new DataDosen08();

        while (true) {
            System.out.println("\n=====---Menu---=====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Insertion Sort");
            System.out.println("6. Cari Nama Dosen");
            System.out.println("7. Cari Usia Dosen");
            System.out.println("8. Keluar");
            System.out.println("--------------------");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            System.out.println("====================");

            switch (pilihan) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (Pria / Wanita): ");
                    String jenisKelaminInput = sc.nextLine().toLowerCase();
                    boolean jenisKelamin;
                    if (jenisKelaminInput.equalsIgnoreCase("pria")) {
                        jenisKelamin = true;
                    } else if (jenisKelaminInput.equalsIgnoreCase("wanita")) {
                        jenisKelamin = false;
                    } else {
                    System.out.println("Input jenis kelamin tidak valid! Masukkan 'pria' atau 'wanita'.");
                    continue;
                    }
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    Dosen08 dosenBaru = new Dosen08(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dosenBaru);
                    break;

                case 2:
                    dataDosen.tampil();
                    break;

                case 3:
                    dataDosen.SortingASC();
                    break;

                case 4:
                    dataDosen.sortingDSC();
                    break;

                case 5:
                    dataDosen.insertionSort();
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Masukkan Nama Dosen : ");
                    String name = sc.nextLine();
                    dataDosen.PencarianDataSequential08(name);
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Masukkan Usia Dosen : ");
                    int us = sc.nextInt();
                    dataDosen.PencarianDataBinary08(us);
                    break;

                case 8:
                    System.out.println("Keluar dari program.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

