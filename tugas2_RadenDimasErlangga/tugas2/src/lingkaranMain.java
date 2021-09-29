
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class lingkaranMain {

    public static void main(String[] args) {
        lingkaran ling1 = new lingkaran();
        int menu;
        String x;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("=============================================");
            System.out.println("= program menghitung luas & hitung keliling =");
            System.out.println("=============================================");
            System.out.println("pilih menu : ");
            System.out.println("1. hitung luas lingkaran");
            System.out.println("2. hitung keliling lingkaran");
            System.out.println("pilih di antara nomor 1-2");
            System.out.print("masukkan pilihan anda : ");
            menu = input.nextInt();
            if (menu == 1) {
                System.out.println("=========================================");
                System.out.println("program menghitung luas lingkaran");
                System.out.print("Masukkan jari-jari lingkaran : ");
                ling1.r = input.nextInt();
                System.out.printf("%4.1f", ling1.hitungLuas());
            } else if (menu == 2) {
                System.out.println("=========================================");
                System.out.println("program menghitung keliling lingkaran");
                System.out.print("masukkan jari-jari lingkaran : ");
                ling1.r = input.nextInt();
                System.out.printf("%4.1f", ling1.hitungKeliling());
            } else {
                System.out.print("silahkan masukkan input antar nomor 1 dan 2");
            }
            System.out.println(" ");
            System.out.print("apakah ingin kembali ke menu (yes/no) : ");
            x = input.next();
        } while (x.equalsIgnoreCase("yes"));
    }
}
