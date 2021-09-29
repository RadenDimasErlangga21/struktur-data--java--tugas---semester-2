
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class DaftarAnggotaPaskibraka {

    Paskibraka listPeserta[] = new Paskibraka[10];
    int id;

    void tambah(Paskibraka m) {
        if (id < listPeserta.length) {
            listPeserta[id] = m;
            id++;
        }
    }

    void tampil() {
        for (Paskibraka m : listPeserta) {
            m.tampilIdentitas();
            System.out.println("==================================");
        }
    }

    void Sorting() {
        for (int i = 0; i < listPeserta.length - 1; i++) {
            for (int j = 1; j < listPeserta.length - i; j++) {
                if (listPeserta[j].tinggi > listPeserta[j - 1].tinggi) {
                    Paskibraka temp = listPeserta[j];
                    listPeserta[j] = listPeserta[j - 1];
                    listPeserta[j - 1] = temp;
                }
            }
        }
    }
}
