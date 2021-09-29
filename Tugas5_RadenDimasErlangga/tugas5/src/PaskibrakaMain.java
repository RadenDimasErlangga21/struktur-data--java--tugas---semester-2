
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class PaskibrakaMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        DaftarAnggotaPaskibraka daftarPaskib = new DaftarAnggotaPaskibraka();
        System.out.println("||-----------------------------||");
        System.out.println("||>_ Program Sorting Paskibraka||");
        System.out.println("||-----------------------------||");
        int jumlahPaskip = 10;
        for (int i = 0; i < jumlahPaskip; i++) {
            System.out.print("Nama      : ");
            String nama = inputS.nextLine();
            System.out.print("Kelas     : ");
            String kelas = inputS.nextLine();
            System.out.print("Tinggi    : ");
            int tinggi = input.nextInt();
            System.out.println(" ");

            Paskibraka m = new Paskibraka(nama, kelas, tinggi);
            daftarPaskib.tambah(m);
        }
        System.out.println("----------------------------------");
        System.out.println(">_ data peserta sebelum sorting       : ");
        daftarPaskib.tampil();
        System.out.println("----------------------------------");
        System.out.println(">_ data peserta sesudah sorting (DSC) : ");
        daftarPaskib.Sorting();
        daftarPaskib.tampil();
    }

}
