import java.util.Scanner;
public class tugas1 {
    static char[] plat = {
        'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'
    };
    static char[][] kota = {
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}
    };
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        
        System.out.print("Masukkan kode plat nomor (A, B, D, E, F, G, H, L, N, T): ");
        char kodePlat = pras.next().charAt(0);
        
        int indeks = -1;
        for (int i = 0; i < plat.length; i++) {
            if (plat[i] == kodePlat) {
                indeks = i;
                break;
            }
        }
        
        if (indeks != -1) {
            System.out.print("Nama kota dengan kode plat " + kodePlat + " : ");
            for (char c : kota[indeks]) {
                System.out.print(c);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }
        
        pras.close();
    }
}
