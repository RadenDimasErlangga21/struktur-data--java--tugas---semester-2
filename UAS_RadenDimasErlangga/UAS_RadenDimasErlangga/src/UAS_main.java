
/**
 * # nim : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class UAS_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        //UTS_SortingBarang sortBarang = new UTS_SortingBarang();
        int pilihan;
        String x;
        kendaraan kenArray[] = new kendaraan[4];
        kenArray[0]=new kendaraan(201, "Honda Verza", 2, 150, 2012, 5);
        kenArray[1]=new kendaraan(202, "Honda Beat", 2, 125, 2013, 2);
        kenArray[2]=new kendaraan(203, "Toyota", 4, 150, 2014, 4);
        kenArray[3]=new kendaraan(204, "Mitshubisi", 4, 150, 2015, 3);
        
      
        
        do {
            System.out.println("Tugas UAS ");
            System.out.println("1. input data kendaraan");
            System.out.println("2. Menampilkan Transaksi Data Sebelumnya");
            System.out.println("3. Mengurutkan Transaksi Data Sebelumnya (ASC)");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println("Menu Input Data Kendaraan");
                System.out.print("masukkan tnkb : ");
                int tNkb = input.nextInt();
                System.out.print("bulan harus di bayar : ");
                int bulan_bayar = input.nextInt();
                }
            
            else if (pilihan == 2) {
                System.out.println("Penjualan Barang");
                do {
                        System.out.println("Nama Tidak Ditemukan");
                    System.out.print("apakah anda ingin menambahkan barang yang dibeli (yes/no) : ");
                    x = inputS.nextLine();
                } while (x.equalsIgnoreCase("yes"));
            }
            else if (pilihan == 3) {
                System.out.println("Cek Stok Barang Terbanyak");
                System.out.println("----------------------------------");
                System.out.println(">_ data Stok Barang sesudah sorting (DSC) : ");
            }
            else {
                System.out.println("silahkan pilih menu yang tersedia");
            }
            System.out.print("apakah ingin kembali ke menu (yes/no) : ");
            x = inputS.nextLine();
        } while (x.equalsIgnoreCase("yes")); 
    }
}

