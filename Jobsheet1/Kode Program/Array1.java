import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        String[] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Rekayasa Perangkat Lunak",
            "Keselamatan dan Kesehatan Kerja"
        };
        int[] nilaiAngka = new int[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];
        int totalSks = 0;
        double Ip = 0;
        int[] sksMK = new int[matkul.length];

        System.out.println("===============================");
        System.out.println("Nama : Faatihurrizki Prasojo");
        System.out.println("Kelas : TI_1H");
        System.out.println("NIM : 244107020142");
        System.out.println("Absen : 08");
        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        for (int i = 0; i < matkul.length; i++) {
            boolean validInput = true;
            while (validInput) {
                System.out.print("Masukkan SKS untuk MK " + matkul[i] + " (1-4): ");
                sksMK[i] = pras.nextInt();
                
                if (sksMK[i] < 1 || sksMK[i] > 4) {
                    System.out.println("Input tidak valid. Silakan masukkan SKS antara 1 dan 4.");
                } else {
                    validInput = false;
                }
            }
            totalSks += sksMK[i];
        }
        System.out.println("------------------------------");
        for (int i = 0; i < nilaiAngka.length; i++) {
            boolean validInput = true;
            while (validInput) {
                System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + " : ");
                nilaiAngka[i] = pras.nextInt();
                
                if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                    System.out.println("Input tidak valid. Silakan masukkan nilai antara 0 dan 100.");
                } else {
                    validInput = false;
                }
            }
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
            Ip += nilaiSetara[i] * sksMK[i];
        }
        double nilaiAkhir = Ip / totalSks;
        System.out.println("===============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-40s %-15s %-13s %-13s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-15d %-13s %-13.1f%n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("===============================");
        System.out.printf("IP : %.2f", nilaiAkhir);
        System.out.println("\n===============================");
        pras.close();
    }
}