package tugas7_no1;

/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class tugas1main {

    public static void main(String[] args) {
        char pilih;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Kalimat : ");
            String kata = sc.nextLine();
            Stack stak = new Stack(kata.length());

            for (int i = 0; i < kata.length(); i++) {
                stak.push(kata.charAt(i));
            }
            stak.print();

            System.out.print("Apakah Anda ingin memasukkan kalimat lagi? (y/n) : ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        } while (pilih == 'y');
    
    }
}
