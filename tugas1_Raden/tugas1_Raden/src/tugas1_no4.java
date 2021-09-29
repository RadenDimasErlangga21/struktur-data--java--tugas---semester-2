
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class tugas1_no4 {

    static void pilihanMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String x;
        do {
            System.out.println("#============ Program menghitung luas v1.0 =============#");
            System.out.println("1. Luas Segitiga ");
            System.out.println("2. Luas Persegi Panjang ");
            System.out.println("3. Luas Lingkaran ");
            System.out.print("Pilih luas yang akan di hitung : ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("# ======= silahkan input nilai alas dan tinggi segitiga ======= #");
                System.out.print("Alas    : ");
                int atiga = input.nextInt();
                System.out.print("Tinggi  : ");
                int ttiga = input.nextInt();
                luasSegitiga(atiga, ttiga);
            } else if (pilihan == 2) {
                System.out.println("# === silahkan input nilai panjang dan lebar persegi panjang === #");
                System.out.print("Panjang : ");
                int pPersegi = input.nextInt();
                System.out.print("Lebar   : ");
                int lPersegi = input.nextInt();
                luasPersegiPanjang(pPersegi, lPersegi);
            } else if (pilihan == 3) {
                System.out.println("# === silahkan input jari-jari lingkaran === #");
                System.out.print("Jari-Jari : ");
                int jariJari = input.nextInt();
                luasLingkaran(jariJari);
            } else {
                System.out.println("silahkan masukkan nilai yang benar");
            }
            System.out.println(" ");
            System.out.print("apakah ingin kembali ke menu (yes/no) : ");
            x = input.next();//input yes/no
        } while (x.equalsIgnoreCase("yes")); //jika input "yes" program akan kembali ke menu pemilihan
    }

    static double luasSegitiga(int aStiga, int tStiga) {
        double luasSegitiga = 0.5 * aStiga * tStiga;
        System.out.printf("luas segitiga adalah %4.1f" , luasSegitiga);
        return (luasSegitiga);
    }

    static double luasPersegiPanjang(int paPersegi, int lePersegi) {
        double luasPersegiPanjang = paPersegi * lePersegi;
        System.out.printf("luas persegi panjang adalah %4.1f" , luasPersegiPanjang);
        return (luasPersegiPanjang);
    }

    static double luasLingkaran(double rLingkaran) {
        double luasLingkaran, phi = 3.14;
        luasLingkaran = phi * rLingkaran * rLingkaran;
        System.out.printf("luas lingkaran adalah %4.1f" , luasLingkaran);
        return (luasLingkaran);
    }

    public static void main(String[] args) {
        pilihanMenu();
    }
}
