
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class soal4_pendudukMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        boolean mencari = false;
        System.out.print("Masukkan Jumlah Penduduk : ");
        int jumlah = input.nextInt();
        soal4_penduduk penduduk[] = new soal4_penduduk[jumlah];
        for (int i = 0; i < penduduk.length; i++) {
            penduduk[i] = new soal4_penduduk();
            System.out.println("penduduk ke-" + (i + 1));
            System.out.print("NIK : ");
            penduduk[i].nik = inputS.nextLine();
            System.out.print("Nama : ");
            penduduk[i].nama = inputS.nextLine();
            System.out.print("Alamat : ");
            penduduk[i].alamat = inputS.nextLine();
            System.out.print("Jenis Kelamin : ");
            penduduk[i].jenis_kelamin = inputS.nextLine();
            System.out.println(" ");
        }
        System.out.println("--- DATA PENDUDUK ---");
        System.out.println("NO \tNIK \tNAMA \tALAMAT \tJENIS KELAMIN");
        for (int i = 0; i < penduduk.length; i++) {
            System.out.println((i+1)+" \t"+penduduk[i].nik+" \t"+penduduk[i].nama
                    +" \t"+penduduk[i].alamat+" \t"+penduduk[i].jenis_kelamin);
        }
        System.out.println("--- CARI DATA PENDUDUK ---");
        System.out.println("Masukkan data yang dicari: ");
        String cari = inputS.nextLine();
        for (int i = 0; i < penduduk.length; i++) {
            if (cari.equalsIgnoreCase(penduduk[i].nik)){
                mencari = true;
                System.out.println((i+1)+"\t"+penduduk[i].nik+" "+penduduk[i].nama
                        +" "+penduduk[i].alamat+" "+penduduk[i].jenis_kelamin);
            }
        }
        if (mencari == false) {
            System.out.println("Maaf Data Mahasiswa tidak di temukan");
        }
    }
}
