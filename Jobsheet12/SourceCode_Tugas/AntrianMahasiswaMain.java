package Jobsheet12.SourceCode_Tugas;

import java.util.Scanner;

public class AntrianMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(10);

        while (true) {
            System.out.println("\n=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Panggil antrian (Layani mahasiswa)");
            System.out.println("3. Cek antrian kosong");
            System.out.println("4. Cek antrian penuh");
            System.out.println("5. Kosongkan antrian");
            System.out.println("6. Tampilkan antrian terdepan");
            System.out.println("7. Tampilkan antrian paling akhir");
            System.out.println("8. Tampilkan jumlah mahasiswa yang mengantre");
            System.out.println("9. Keluar");
            System.out.println("-------------------------------------------------");
            System.out.print("Pilih menu : ");

            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jurusan mahasiswa: ");
                    String jurusan = sc.nextLine();
                    queue.enqueue(nim, nama, jurusan);
                    break;
                case "2":
                    queue.dequeue();
                    break;
                case "3":
                    if (queue.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case "4":
                    if (queue.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                case "5":
                    queue.clear();
                    break;
                case "6":
                    queue.dataPertama();
                    break;
                case "7":
                    queue.dataTerakhir();
                    break;
                case "8":
                    queue.count();
                    break;
                case "9":
                    System.out.println("Terima kasih !!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}
