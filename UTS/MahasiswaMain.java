import java.util.Scanner;

public class MahasiswaMain {

    static Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
    static MataKuliah[] daftarMataKuliah = new MataKuliah[3];
    static Penilaian[] daftarPenilaian = new Penilaian[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inisialisasiData();

        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMataKuliah();
                    break;
                case 3:
                    tampilkanDataPenilaian(daftarPenilaian);
                    analisisNilaiMhs(daftarPenilaian);
                    break;
                case 4:
                    urutkanDataPenilaianBubbleSort(daftarPenilaian);
                    analisisNilaiMhs(daftarPenilaian);
                    break;
                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String nimCari = sc.nextLine();
                    cariDataPenilaianLinearSearch(daftarPenilaian, nimCari);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        sc.close();
    }

    // Method untuk inisialisasi data
    static void inisialisasiData() {
        daftarMahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "TI");
        daftarMahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "SIB");
        daftarMahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "TI");

        daftarMataKuliah[0] = new MataKuliah("MK001", "Struktur Data", 3);
        daftarMataKuliah[1] = new MataKuliah("MK002", "Basis Data", 3);
        daftarMataKuliah[2] = new MataKuliah("MK003", "Desain Web", 2);

        daftarPenilaian[0] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[0], 80, 85, 90);
        daftarPenilaian[1] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[1], 90, 90, 95);
        daftarPenilaian[2] = new Penilaian(daftarMahasiswa[1], daftarMataKuliah[0], 75, 70, 80);
        daftarPenilaian[3] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[1], 85, 90, 95);
        daftarPenilaian[4] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[2], 80, 90, 65);
    }

    // Method untuk menampilkan menu
    static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mata Kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
        System.out.println("5. Cari Data Penilaian Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
    }

    // Method untuk menampilkan data mahasiswa
    static void tampilkanDataMahasiswa() {
        System.out.println("\n=== DATA MAHASISWA ===");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i] != null) {
                daftarMahasiswa[i].tampilMahasiswa();
                System.out.println("-------------");
            }
        }
    }

    // Method untuk menampilkan data mata kuliah
    static void tampilkanDataMataKuliah() {
        System.out.println("\n=== DATA MATA KULIAH ===");
        for (int i = 0; i < daftarMataKuliah.length; i++) {
            if (daftarMataKuliah[i] != null) {
                daftarMataKuliah[i].tampilMatakuliah();
                System.out.println("-------------");
            }
        }
    }

    static void tampilkanDataPenilaian(Penilaian[] daftarPenilaian) {
        System.out.println("\n=== DATA PENILAIAN MAHASISWA ===");
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null) {
                daftarPenilaian[i].tampilPenilaian();
                System.out.println("-------------");
            }
        }
    }

    static void urutkanDataPenilaianBubbleSort(Penilaian[] daftarPenilaian) {
        int n = daftarPenilaian.length;
        Penilaian temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarPenilaian[j] != null && daftarPenilaian[j + 1] != null) {
                    if (daftarPenilaian[j].getNilaiAkhir() < daftarPenilaian[j + 1].getNilaiAkhir()) {
                        temp = daftarPenilaian[j];
                        daftarPenilaian[j] = daftarPenilaian[j + 1];
                        daftarPenilaian[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("\nData Penilaian Setelah Diurutkan Berdasarkan Nilai Akhir (Bubble Sort):");
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null) {
                daftarPenilaian[i].tampilPenilaian();
                System.out.println("-------------");
            }
        }
    }

    static void cariDataPenilaianLinearSearch(Penilaian[] daftarPenilaian, String nimCari) {
        System.out.println("\nHasil Pencarian (Linear Search):");
        boolean found = false;
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null && daftarPenilaian[i].getNIMMahasiswa().equals(nimCari)) {
                daftarPenilaian[i].tampilPenilaian();
                System.out.println("-------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data penilaian untuk NIM " + nimCari + " tidak ditemukan.");
        }
    }

    static void analisisNilaiMhs(Penilaian[] daftarPenilaian) {
        int nilaiLebih80 = 0;
        int nilaiKurang80 = 0;
        int nilaiKurang70 = 0;
        int Mhs1 = 0;
        int Mhs2 = 0;
        int Mhs3 = 0;

        for (int j = 0; j < daftarPenilaian.length; j++) {
                if (daftarPenilaian[j] !=  null) {
                    double nilaiAkhir = daftarPenilaian[j].getNilaiAkhir();
                    if (nilaiAkhir >= 80) {
                        if (Mhs1 < (j+1)) {
                            nilaiLebih80++;
                            Mhs1++;
                        }
                    } else if (nilaiAkhir < 70) {
                        if(Mhs2 < (j+1)){
                            nilaiKurang70++;
                            Mhs2++;
                        }
                    } else {
                        if (Mhs3 < (j+1)) {
                            nilaiKurang80++;
                            Mhs3++;
                        }
                        
                    }
                }
            }
        
        System.out.println("Jumlah Mahasiswa yang Nilai akhir lebih dari 80 adalah " + nilaiLebih80 + " Mahasiswa");
        System.out.println("Jumlah Mahasiswa yang Nilai Akhir kurang dari 80 adalah " + nilaiKurang80 + " Mahasiswa");
        System.out.println("Jumlah Mahasiswa yang Nilai Akhir kurang dari 70 adalah " + nilaiKurang70 + " Mahasiswa");
        
    }
}
