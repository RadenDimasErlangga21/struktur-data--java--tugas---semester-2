
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class persewaanGameMain {
    public static void main(String[] args) {
    Scanner inputInt = new Scanner(System.in);
    Scanner inputS = new Scanner(System.in);
    persewaanGame pg = new persewaanGame();
        System.out.println("#############################################");
        System.out.println("========== program persewaan game ===========");
        System.out.println("========= harga sewa 15.000 / hari ==========");
        System.out.println("#############################################");
        System.out.print("masukkan ID pelanggan   : ");
        pg.id = inputInt.nextInt();
        System.out.print("masukkan nama pelanggan : ");
        pg.nama_member = inputS.nextLine();
        System.out.print("masukkan nama game      : ");
        pg.nama_game = inputS.nextLine();
        System.out.print("masukkan lama peminjaman (hari) : ");
        pg.lama_pinjam = inputInt.nextInt();
        System.out.println("=========== Struk Pembayaran Anda ============");
        System.out.println("ID pelanggan        : " + pg.id);
        System.out.println("Nama Pelanggan      : " + pg.nama_member);
        System.out.println("Game yang di pinjam : " + pg.nama_game);
        System.out.println("lama peminjaman     : " + pg.lama_pinjam); 
        System.out.println("total pembayaran anda adalah : " + pg.peminjaman());
        System.out.println("=============================================");
        System.out.println("======= terima kasih telah berbelanja =======");
        System.out.println("=============================================");
    }

}
