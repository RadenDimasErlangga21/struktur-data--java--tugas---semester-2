
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class tugas1_no3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;
        do {
            System.out.println("# === menampilkan deret ganjil dengan kelipatan 4 nilai === #");
            System.out.println("==============================");
            System.out.print("Input Nilai Deret (n) : ");
            int nilai = input.nextInt();
            for (int j = 0; j <= nilai * 4; j++) {
                if ((j % 2 == 0)
                        && (j % 4 != 0)) {
                    System.out.print("["+ j + "]");
                }
            }
            System.out.println(" ");
            System.out.println("==============================");
            System.out.println("apakah ingin kembali melakukan perulangan (yes/no) : ");
            pilihan = input.next();
        } while (pilihan.equalsIgnoreCase("yes"));
    }
}
