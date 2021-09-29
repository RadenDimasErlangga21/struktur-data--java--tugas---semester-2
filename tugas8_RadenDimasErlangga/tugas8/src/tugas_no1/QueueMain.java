
package tugas_no1;
/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int pilih, n;
    System.out.print("Masukkan kapasitas queue: ");
    n = sc.nextInt();
    Queue Q = new Queue(n);
    do {
    menu();
    pilih = sc.nextInt();
    switch (pilih){
        case 1:
            System.out.print("Masukkan data baru: ");
            int dataMasuk = sc.nextInt();
            Q.Enqueue(dataMasuk);
            break;
        case 2: 
            int dataKeluar = Q.Dequeue();
            if (dataKeluar != 0){
                System.out.println("Data yang dikeluarkan: " + dataKeluar);
                break;
            }
        case 3: 
            Q.print();
            break;
        case 4:
            Q.peek();
            break;
        case 5:
            System.out.print("input nilai yang di cari : ");
            int data = sc.nextInt();
            Q.peekPosition(data);
            break;
        case 6:
            System.out.println("input indeks yang di cari : ");
            int a = sc.nextInt();
            Q.peekAt(a);
            break;
        case 7:
            Q.clear();
    }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. cari data");
        System.out.println("6. cari indeks");
        System.out.println("7. Clear");
        System.out.println("-----------------");
    }
}
