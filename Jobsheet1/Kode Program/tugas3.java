import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);

        System.out.println("==================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = pras.nextInt();
        pras.nextLine(); 

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        System.out.println("==================================");
        System.out.println("----------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah " + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = pras.nextLine();
            System.out.print("SKS: ");
            sks[i] = pras.nextInt();
            System.out.print("Semester: ");
            semester[i] = pras.nextInt();
            System.out.print("Hari Kuliah: ");
            pras.nextLine(); 
            hariKuliah[i] = pras.nextLine();
            System.out.println("----------------------------------");
        }
        
        while (true) {
            System.out.println("==================================");
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.println("----------------------------------");
            System.out.print("Pilih opsi: ");
            int pilihan = pras.nextInt();
            pras.nextLine(); 
            System.out.println("==================================");
            switch (pilihan) {
                case 1:
                    System.out.println("\nJadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                    }
                    break;

                case 2:
                    System.out.print("Masukkan hari kuliah (Senin, Selasa, dst.): ");
                    String hari = pras.nextLine();
                    System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = pras.nextInt();
                    System.out.println("\nJadwal Kuliah pada semester " + sem + ":");
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == sem) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaDicari = pras.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMataKuliah[i].equalsIgnoreCase(namaDicari)) {
                            System.out.println("Ditemukan: Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mata kuliah dengan nama '" + namaDicari + "' tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    pras.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}