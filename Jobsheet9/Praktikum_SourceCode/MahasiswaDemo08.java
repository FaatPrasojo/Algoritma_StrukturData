package Jobsheet9.Praktikum_SourceCode;
import java.util.Scanner;
public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(5);
        int pilih;
        
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas yang Sudah Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();    
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.println(mhs.name+ "'s assigment has been successfully submitted!!");
                    break;
                
                case 2:
                    Mahasiswa08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.name);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.grading(nilai);
                        System.out.printf("Assignment grade of %s is %d\n", dinilai.name, nilai);
                        String binary = stack.convertToBinary(nilai);
                        System.out.printf("Assignment grade in binary is %s\n" , binary);
                    }
                    break;

                case 3:
                    Mahasiswa08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("The last assignmentcomes from " + lihat.name);
                    }
                    break;
                
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                
                case 5:
                    Mahasiswa08 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("The first assignment comes from " + terbawah.name);
                        System.out.println("NIM: " + terbawah.nim);
                        System.out.println("Kelas: " + terbawah.className);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.count());
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid.");
            } 
        } while (pilih >= 1 && pilih <=6);
    sc.close();
    }
}
