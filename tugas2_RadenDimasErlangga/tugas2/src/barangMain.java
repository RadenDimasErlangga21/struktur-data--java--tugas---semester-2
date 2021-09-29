
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class barangMain {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     barang b1 = new barang();
        System.out.println("=============================================");
        System.out.println("========= program kasir mini-market =========");
        System.out.println("=============================================");
        System.out.print("masukkan nama barang : ");
        b1.nama=input.nextLine();
        System.out.print("masukkan harga satuan barang : ");
        b1.hargaSatuan = input.nextInt();
        System.out.print("masukkan jumlah barang : ");
        b1.jumlah = input.nextInt();
        
        System.out.println("=============================================");
        System.out.println("============== struk pembayaran =============");
        System.out.println("=============================================");
        System.out.println("Nama Barang    : " + b1.nama);
        System.out.println("Harga Satuan   : " + b1.hargaSatuan);
        System.out.println("Jumlah Barang  : " + b1.jumlah);        
        System.out.println("=============================================");
        System.out.println("============== total pembayaran =============");
        System.out.println("=============================================");
        System.out.println("harga total               : "+b1.hitungHargaTotal());
        System.out.println("keterangan diskon         : " + b1.hitungDiskon());
        System.out.println("harga yang harus di bayar : " + b1.hitungHargaBayar());
        System.out.println("=============================================");
        System.out.println("======= terima kasih telah berbelanja =======");
        System.out.println("=============================================");
    }
    
}
