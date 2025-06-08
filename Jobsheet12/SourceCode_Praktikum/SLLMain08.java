package Jobsheet12.SourceCode_Praktikum;

import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList08 sll = new SingleLinkedList08();

        System.out.print("Masukkan jumlah data: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // konsumsi newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Nilai: ");
            double nilai = sc.nextDouble();
            sc.nextLine();
            Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas, nilai);
            sll.addFirst(mhs);
        }

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAftrer("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();

        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOF("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
