import java.util.Scanner;
public class MataKuliahDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam, jmlMk;

        System.out.print("Masukkan Jumlah Matakuliah : ");
        jmlMk = sc.nextInt();
        System.out.println("------------------------------------");
        MataKuliah08[] arrayOfMataKuliah08 = new MataKuliah08[jmlMk];
        

        for(int i = 0; i < jmlMk; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");
            arrayOfMataKuliah08[i] = new MataKuliah08(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah08[i].tambahData(kode, nama, sks, jumlahJam);
        }
        for(int i=0; i<jmlMk; i++){
            System.out.println("Data Matakuliahj ke-" + (i+1));
            arrayOfMataKuliah08[i].cetakInfo();
            System.out.println("------------------------------------");
        }
        sc.close();
    }
}
