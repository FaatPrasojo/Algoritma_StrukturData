import java.util.Scanner;
public class Percobaan1 {
    
    static double nilaiTugas = 0;
    static double nilaiKuis = 0;
    static double nilaiUTS = 0;
    static double nilaiUAS = 0;
    
    static double hitungNilai(int nilaiTgs, int nilaikuis, int nilaiUts, int nilaiUas){
        int nilaiAkhir = 0;
        nilaiTugas = nilaiTgs * 0.1;
        nilaiKuis = nilaikuis * 0.2;
        nilaiUTS = nilaiUts * 0.3;
        nilaiUAS = nilaiUas * 0.4;
        
        nilaiAkhir += nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS;

        if (nilaiAkhir > 80){
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("NIlai Huruf : A");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
            System.out.println("======================");
        } else if (nilaiAkhir > 73){
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("NIlai Huruf : B+");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
            System.out.println("======================");
        } else if (nilaiAkhir > 65){
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("NIlai Huruf : B"); 
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
            System.out.println("======================");
        } else if (nilaiAkhir > 60){
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("NIlai Huruf : C+");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
            System.out.println("======================");
        } else if (nilaiAkhir > 50){
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("NIlai Huruf : C");
            System.out.println("======================");
            System.out.println("SELAMAT ANDA LULUS");
            System.out.println("======================");
        }else if (nilaiAkhir > 39){
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("NIlai Huruf : D");
            System.out.println("======================");
            System.out.println("ANDA TIDAK LULUS");
            System.out.println("======================");
        }else {
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("NIlai Huruf : E");
            System.out.println("======================");
            System.out.println("ANDA TIDAK LULUS");
            System.out.println("======================");
        }
        return nilaiAkhir;
    }
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        System.out.println("======================");
        System.out.print("Masukkan nilai tugas : ");
        int nilai1 = pras.nextInt();
        System.out.print("Masukkan nilai Kuis : ");
        int nilai2 = pras.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        int nilai3 = pras.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int nilai4 = pras.nextInt();
        System.out.println("======================");
        if ((nilai1 < 0 || nilai1 > 100) || (nilai2 < 0 || nilai2 > 100) || 
            (nilai3 < 0 || nilai3 > 100) || (nilai4 < 0 || nilai4 > 100)) {
            System.out.println("Nilai tidak valid.");
            System.out.println("======================");
        } else {
            hitungNilai(nilai1, nilai2, nilai3, nilai4);
        }
        pras.close();
    }
}