import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        int menu;

            System.out.println("============--Kubus--============");
            System.out.print("Imput Panjang Rusuk Kubus : ");
            int rusuk = pras.nextInt();

        do {
            System.out.println("=================================");
            System.out.println("---------------Menu--------------");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.println("---------------------------------");
            System.out.print("Pilih menu (1-4): ");
            menu = pras.nextInt();
            System.out.println("=================================");

            switch (menu) {
                case 1:
                    System.out.println("--------------Volume-------------");
                    hitungVolume(rusuk);
                    System.out.println("=================================");
                    break;
                case 2:
                    System.out.println("----------Luas Permukaan---------");
                    hitungLuasPermukaan(rusuk);
                    System.out.println("=================================");
                    break;
                case 3:
                    System.out.println("------------Keliling------------");
                    hitungKeliling(rusuk);
                    System.out.println("=================================");
                    break;
                case 4:
                    System.out.println("-----------Terima Kasih----------");
                    System.out.println("=================================");
                    break;
                default:
                    System.out.println("Pilihan tidak Valid. Silakan pilih antara 1-4.");
                    System.out.println("=================================");
                    break;
            }
        } while (menu != 4);

        pras.close();
    }

    static void hitungVolume(int x) {
        
        double v = x * x * x;
        System.out.printf("Volume = %.1f", v);
        System.out.println();
    }

    static void hitungLuasPermukaan(int x) {
        x = x * x;
        double s = x * 6;
        System.out.printf("Luas Permukaan = %.1f", s);
        System.out.println();
    }

    static void hitungKeliling(int x) {
        double t = x * 12 ;
        System.out.printf("Keliling = %.1f " , t);
        System.out.println();
    }
}