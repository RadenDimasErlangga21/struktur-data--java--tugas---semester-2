
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class Paskibraka {

    String nama, kelas;
    int tinggi;

    Paskibraka(String name, String klass, int height) {
        nama = name;
        kelas = klass;
        tinggi = height;
    }

    void tampilIdentitas() {
        System.out.println("nama   : " + nama);
        System.out.println("kelas  : " + kelas);
        System.out.println("tinggi : " + tinggi);
        if (tinggi >= 170) {
            System.out.println("peserta " + nama + " lolos masuk");
        } else {
            System.out.println("maaf peserta " + nama + " tidak lolos");
        }
    }
}
