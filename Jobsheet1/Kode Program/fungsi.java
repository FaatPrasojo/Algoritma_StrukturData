import java.util.Scanner;
public class fungsi {
    static double[] pendapatan = new double[4]; 

    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);

        int[][] garden = new int[4][4];
        String[] bunga = {
            "Aglonela",
            "Keladi",
            "Alocasia",
            "Mawar"
        };
        double[] harga = {75000, 50000, 60000, 10000};

        System.out.println("======= Input Bunga Tiap Cabang =======");
        for (int i = 0; i < 4; i++) {
            System.out.println("RoyalGarden " + (i + 1));
            for (int j = 0; j < garden[i].length; j++) {
                System.out.print(bunga[j] + " : ");
                while (true) {
                    if (pras.hasNextInt()) {
                        garden[i][j] = pras.nextInt();
                        if (garden[i][j] >= 0) {
                            break;
                        } else {
                            System.out.print("Jumlah tidak boleh negatif. Silakan masukkan ulang: ");
                        }
                    } else {
                        System.out.print("Input tidak valid. Silakan masukkan angka: ");
                        pras.next();
                    }
                }
            }
            System.out.println("--------------------------------");
        }

        hitungPendapatan(garden, harga);

        System.out.println("==================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "\t\tAglonela", "Keladi", "Alocasia", "Mawar", "\t Pendapatan");
        for (int i = 0; i < garden.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + " : ");
            for (int j = 0; j < garden[i].length; j++) {
                System.out.printf("%-15d ", garden[i][j]);
            }
            System.out.printf("| %.1f%n", pendapatan[i]);
        }
        int[] penguranganStok = {-1, -2, 0, -5};
        kurangiStok(garden, penguranganStok);

        System.out.println("=========Pengurangan Stok=========");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "\t\tAglonela", "Keladi", "Alocasia", "Mawar", "\t Pendapatan");
        for (int i = 0; i < garden.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + " : ");
            for (int j = 0; j < garden[i].length; j++) {
                System.out.printf("%-15d ", garden[i][j]);
            }
            System.out.printf("| %.1f%n", pendapatan[i]);
        }
        System.out.println("==================================");
        pras.close();
    }

    static void hitungPendapatan(int[][] garden, double[] harga) {
        for (int i = 0; i < garden.length; i++) {
            double total = 0;
            for (int j = 0; j < garden[i].length; j++) {
                total += garden[i][j] * harga[j];
            }
            pendapatan[i] = total;
        }
    }
    static void kurangiStok(int[][] garden, int[] penguranganStok) {
        for (int j = 0; j < penguranganStok.length; j++) {
            for (int i = 0; i < garden.length; i++) {
                garden[i][j] += penguranganStok[j];
                if (garden[i][j] < 0) {
                    garden[i][j] = 0;
                }
            }
        }
    }
}