package Jobsheet8.Tugas_SourceCode;
import java.util.Scanner;

public class SuratIzinDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat08 stack = new StackSurat08(100);

        while (true) {
            System.out.println("=============---Surat Izin---=============");
            System.out.println("\nMenu Surat Izin Mahasiswa");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat (berdasarkan nama mahasiswa)");
            System.out.println("5. Lihat Semua Surat");
            System.out.println("0. Keluar");
            System.out.println("-----------------------------------------");
            System.out.print("Pilih menu: ");
            System.out.println("-----------------------------------------");
            int pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    Surat08 surat = new Surat08(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat08 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat berikut telah diproses:");
                        diproses.printSurat();
                    }
                    break;
                case 3:
                    Surat08 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        terakhir.printSurat();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    stack.printAll();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

