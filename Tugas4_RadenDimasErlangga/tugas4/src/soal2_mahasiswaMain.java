
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class soal2_mahasiswaMain {

    public static void main(String[] args) {
        boolean mencari = false;
        Scanner sc = new Scanner(System.in);
        String x;
            soal2_mahasiswa[][] mhs = new soal2_mahasiswa[3][5];
            mhs[0][0] = new soal2_mahasiswa("Raden");
            mhs[0][1] = new soal2_mahasiswa("Tegar");
            mhs[0][2] = new soal2_mahasiswa("Hifdzi");
            mhs[0][3] = new soal2_mahasiswa("Hanif");
            mhs[0][4] = new soal2_mahasiswa("Edo");
            mhs[1][0] = new soal2_mahasiswa("Arik");
            mhs[1][1] = new soal2_mahasiswa("Candra");
            mhs[1][2] = new soal2_mahasiswa("Celline");
            mhs[1][3] = new soal2_mahasiswa("Firdha");
            mhs[1][4] = new soal2_mahasiswa("Dea");
            mhs[2][0] = new soal2_mahasiswa("Reihan");
            mhs[2][1] = new soal2_mahasiswa("Wendha");
            mhs[2][2] = new soal2_mahasiswa("Fariz");
            mhs[2][3] = new soal2_mahasiswa("Samid");
            mhs[2][4] = new soal2_mahasiswa("Ravi");

            System.out.println("#--------------------------------------------------#");
            for (int i = 0; i < 3; i++) {
                System.out.print("Kelompok " + (i + 1) + ":\t");
                for (int j = 0; j < 5; j++) {
                    System.out.print(mhs[i][j].namaMahasiswa + "\t");
                }
                System.out.println("");
            }
            System.out.println("#--------------------------------------------------#");

            System.out.print("Masukkan nama Mahasiswa yang akan di cari : ");
            String cariMahasiswa = sc.nextLine();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (cariMahasiswa.equalsIgnoreCase(mhs[i][j].namaMahasiswa)) {
                        mencari = true;
                        System.out.println("Mahasiswa bernama " + cariMahasiswa
                                + " berada pada kelompok ke-" + (i + 1) 
                                + " dan urutan ke-" + (j + 1) + " dalam kelompok");
                    }
                }
            }
            if (mencari == false) {
                System.out.println("Maaf Data Mahasiswa tidak di temukan");
            }
    }
}
