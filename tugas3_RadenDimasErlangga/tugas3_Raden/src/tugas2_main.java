
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class tugas2_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        int input;
        String x;
        System.out.println("===============================");
        System.out.println(">_program calculator luas tanah");
        System.out.println("===============================");
        System.out.print("masukkan jumlah tanah  : ");
        int nilai = sc.nextInt();
        tugas2_tanah[] t2Array = new tugas2_tanah[nilai];
        for (int i = 0; i < nilai; i++) {
            t2Array[i] = new tugas2_tanah();
            System.out.println("tanah ke-" + (i + 1));
            System.out.print("Masukkan panjang tanah : ");
            t2Array[i].panjangTanah = sc.nextInt();
            System.out.print("Masukkan lebar tanah   : ");
            t2Array[i].lebarTanah = sc.nextInt();
        }
        System.out.println(">hasil luas tanah ");
        for (int i = 0; i < nilai; i++) {
            System.out.println("hasil luas tanah ke-" + (i + 1) + " : " + t2Array[i].hitungLuas());
        }
         System.out.println("hasil tanah terluas   : " + tugas2_tanah.tugas3max(t2Array));
    }
}
