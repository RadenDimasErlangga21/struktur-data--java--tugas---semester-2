
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class barang {
    String nama;
    int hargaSatuan, jumlah;

    int hitungHargaTotal() {
        int total = hargaSatuan * jumlah;
        return total;
    }
    int hitungDiskon() {
        int totalDiskon;
        if (hitungHargaTotal() > 100000) {
            totalDiskon = hitungHargaTotal() * 10 /100;
        } else if (hitungHargaTotal() > 50000 && hitungHargaTotal() <= 100000) {
            totalDiskon = hitungHargaTotal() * 5 /100;
        } else {
            totalDiskon = 0;
        }
        return totalDiskon;
    }
    int hitungHargaBayar() {
        int bayar;
        bayar = hitungHargaTotal()-hitungDiskon();
        return bayar;
    }
}
