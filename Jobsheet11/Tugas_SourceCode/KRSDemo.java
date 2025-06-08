package Jobsheet11.Tugas_SourceCode;

import java.util.Scanner;

public class KRSDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian antrian = new Antrian();
        
        while (true) {
            System.out.println("\nMenu Antrian KRS:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Terakhir");
            System.out.println("6. Status Antrian");
            System.out.println("7. Reset Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                    if (!antrian.isFull()) {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Prodi: ");
                        String prodi = sc.nextLine();
                        System.out.print("Semester: ");
                        int semester = sc.nextInt();
                        
                        antrian.enqueue(new Mahasiswa(nim, nama, prodi, semester));
                        System.out.println("Mahasiswa ditambahkan!");
                    } else {
                        System.out.println("Antrian penuh!");
                    }
                    break;
                    
                case 2:
                    Mahasiswa[] processed = antrian.dequeueTwo();
                    if (processed != null) {
                        System.out.println("Mahasiswa yang diproses:");
                        processed[0].display();
                        processed[1].display();
                    }
                    break;
                    
                case 3:
                    antrian.displayAll();
                    break;
                    
                case 4:
                    antrian.displayFrontTwo();
                    break;
                    
                case 5:
                    antrian.displayRear();
                    break;
                    
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.count());
                    System.out.println("Sudah diproses: " + antrian.getProcessed());
                    System.out.println("Belum diproses: " + antrian.getRemaining());
                    break;
                    
                case 7:
                    antrian.clear();
                    System.out.println("Antrian dikosongkan!");
                    break;
                    
                case 0:
                    System.out.println("Program selesai");
                    System.exit(0);
                    
                default:
                    System.out.println("Pilihan salah!");
            }
        }
    }
}

