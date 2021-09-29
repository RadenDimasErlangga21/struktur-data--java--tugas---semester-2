/**
 * # nim : 2031710121 
 * # nama : Raden Dimas Erlangga
 */
public class UTS_SortingBarang {
    UTS_Barang list[] = new UTS_Barang[4];
    int id, bayar = 0;
 
    void tambahkan(UTS_Barang m) {
        if (id < list.length) {
            list[id] = m;
            id++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }
    
    void tampil() {
        for (UTS_Barang m : list) {
            m.tampil_Barang();
            System.out.println("==================================");
        }
    }
    void tampilStruk() {
        for (UTS_Barang m : list) {
            m.struk();
            System.out.println("==================================");
        }
    }
    void jual (String kd, int jumlah){
        for (int i = 0; i < list.length; i++){
            if (kd.equalsIgnoreCase(list[i].kode)){
                list[i].jumlah = jumlah;
                list[i].stok -= list[i].jumlah;
                list[i].totalharga = list[i].jumlah * list[i].harga;
                System.out.println("total ="+list[i].totalharga);
            }
        }
    }
    void total(){
        int total = 0;
        for (int i = 0; i<list.length; i++){
            total += list[i].totalharga;
        }
        System.out.println("Total Bayar Adalah : "+total);
    }
    void Sorting() {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j].stok > list[j - 1].stok) {
                    UTS_Barang temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
    }
    void Sorting2(){
        for (int i = 0; i<list.length - 1; i++){
            for (int j = 1; j<list.length - i; j++){
                if(list[j].jumlah > list[j-1].jumlah){
                    UTS_Barang tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1]=tmp;
                }
            }
        }
    }
    void terlaris(){
        for(int i = 0; i<1; i++){
            System.out.println("Barang Terlaris Adalah "+list[i].nama+" dengan jumlah penjualan "+list[i].jumlah);
        }
    }
    
        public int cari(String key) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (key.equalsIgnoreCase(list[i].kode))  {
                index = i;
            }
        }
        return index;
    }
}

