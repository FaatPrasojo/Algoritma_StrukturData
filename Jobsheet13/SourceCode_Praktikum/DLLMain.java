package Jobsheet12.SourceCode_Praktikum;

import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList08 list = new DoubleLinkedList08();
        Scanner pras = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus data tertentu");
            System.out.println("4. Hapus di awal");
            System.out.println("5. Hapus di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("8. Tambah setelah NIM tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = pras.nextInt();
            pras.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa08 mhs = inputMahasiswa(pras);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa08 mhs = inputMahasiswa(pras);
                    list.addLast(mhs);

                }
                case 3 -> {
                    System.out.println("Masukkan NIM yang ingin dihapus: ");
                    String keyNim = pras.nextLine();
                    list.remove(keyNim);

                }

                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> list.print();
                case 7 -> {
                    System.out.println("Masukkan NIM yang dicari : ");
                    String nim = pras.nextLine();
                    Node08 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan : ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 8 -> {
                    System.out.print("Masukkan NIM yang akan disisipkan setelahnya: ");
                    String keyNim = pras.nextLine();
                    Mahasiswa08 mhs = inputMahasiswa(pras);
                    list.insertAftrer(keyNim, mhs);
                }
                case 9 -> {
                    System.out.println("Masukkan NIM yang data setelahnya akan dihapus : ");
                    String keyNim = pras.nextLine();
                    list.removeAfter(keyNim);
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
        pras.close();

    }

    public static Mahasiswa08 inputMahasiswa(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa08(nim, nama, kelas, ipk);
    }
}
