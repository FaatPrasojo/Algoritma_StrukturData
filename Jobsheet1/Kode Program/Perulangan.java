import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner pras = new Scanner(System.in);
        System.out.println("========================");
        System.out.print("Input NIM : ");
        long nim = pras.nextLong();
        System.out.println("========================");
        int n = (int) (nim % 100);
        if (n < 10){
            n += 10;
            System.out.println("n = " + n);
            System.out.println("========================");
            for (int i = 1; i < n; i++){
                if ( i % 2 == 1){
                    System.out.print("*");
                } else if(i == 6 || i == 10){
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("\n========================");
        } else{
            System.out.println("n = " + n);
            System.out.println("========================");
            for (int i = 1; i < n; i++){
                if ( i % 2 == 1){
                    System.out.print("*");
                } else if(i == 6 || i == 10){
                    System.out.print("*");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("\n========================");
        }pras.close();
    }
}
