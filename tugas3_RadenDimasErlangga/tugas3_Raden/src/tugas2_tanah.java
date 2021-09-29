
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
public class tugas2_tanah {
     int panjangTanah;
     int lebarTanah;
    
public int hitungLuas(){
    int luas = panjangTanah * lebarTanah;
    return luas;
}
static int tugas3max(tugas2_tanah tnah[]){
    int max=0;
    
    for (int i = 0; i < tnah.length; i++){
        if (tnah[i].hitungLuas() > max){
            max = tnah[i].hitungLuas();
        }
    }
    return max;
}
}