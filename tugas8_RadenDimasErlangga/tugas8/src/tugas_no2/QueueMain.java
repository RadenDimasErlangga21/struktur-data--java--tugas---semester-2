
package tugas_no2;
/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int pilih, jumlah;
    System.out.print("Masukkan kapasitas queue: ");
    jumlah = sc.nextInt();    
    Queue antri = new Queue(jumlah);
        do {
    menu();
    pilih = sc.nextInt();
    switch (pilih){
        case 1:
            System.out.print("Nim: ");
            sc.nextLine();
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String name = sc.nextLine();
            System.out.print("Absen: ");
            int abs = sc.nextInt();
            System.out.print("ipk: ");
            double ipk = sc.nextDouble();
            Mahasiswa p = new Mahasiswa(nim, name, abs, ipk);
            sc.nextLine();
            antri.Enqueue(p);
            break;
        case 2: 
            Mahasiswa data = antri.Dequeue();
            if (!" ".equals(data.nim) && !" ".equals(data.nama)
                    && data.absen != 0 && data.ipk != 0){
                System.out.println("Antrian yang keluar:" + data.nim + " " + 
                         data.nama + " " + data.absen + " " +  data.ipk);
                break;
            }
        case 3: 
            antri.peek();
            break;
        case 4:
            antri.print();
            break;
        case 5:
        System.out.println("Cari NIM : ");
        sc.nextLine();
        String cariNim = sc.nextLine();
        antri.peekPosition(cariNim);
        break;
        case 6:
        antri.peekRear();
        break;
    }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru ");
        System.out.println("2. Antrian Keluar ");
        System.out.println("3. Cek Antrian terdepan ");
        System.out.println("4. Cek Semua Antrian ");
        System.out.println("5. Cek Posisi berdasarkan NIM "); 
        System.out.println("6. Cek Antrian paling belakang");
        System.out.println("-------------------");
    }
    
}