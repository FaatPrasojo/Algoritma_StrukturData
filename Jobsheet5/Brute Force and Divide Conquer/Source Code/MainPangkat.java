import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + " : ");
            int baris = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + " : ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(baris, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE : ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+ " : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVINE AND CONQUER : ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+ " : " + p.pangkatDC(p.nilai, p.pangkat));
        }
        input.close();
    }
}
