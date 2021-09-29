
package tugas9_no1;
/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;
public class SLLMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int pilih, data, dataBaru;
       SingleLinkedList singLL=new SingleLinkedList();
       do {
    menu();
    pilih = sc.nextInt();
    switch (pilih){
        case 1:
            System.out.print("input data yang akan di add pertama kali : ");
            data = sc.nextInt();
            singLL.addFirst(data);
            break;
        case 2: 
            System.out.print("input data yang akan di add pada baris terakhir : ");
            data = sc.nextInt();
            singLL.addLast(data);
                break;
        case 3: 
            singLL.print();
            System.out.println("--------------------------------------------");
            System.out.print("input data yang tersedia pada linked list : ");
            data = sc.nextInt();
            System.out.print("input data yang ingin di tambahkan setelah nya : ");
            dataBaru = sc.nextInt();
            singLL.insertAfter(data, dataBaru);
            break;
        case 4:
            System.out.print("input index data : ");
            data = sc.nextInt();
            System.out.print("input data yang ingin di sisipkan pada indeks tersebut : ");
            dataBaru = sc.nextInt();
            singLL.insertAt(data, dataBaru);
            break;
        case 5:
        singLL.print();
            System.out.println("--------------------------------------------");
            System.out.print("input data yang tersedia pada linked list : ");
            data = sc.nextInt();
            System.out.print("input data yang ingin di tambahkan sebelum nya : ");
            dataBaru = sc.nextInt();
            singLL.insertBefore(data, dataBaru);
            break;
        case 6:
            System.out.print("input data yang ingin di remove : ");
            data = sc.nextInt();
            singLL.remove(data);
            break;
        case 7:
            singLL.print();
    }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
       }
        public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. add first ");
        System.out.println("2. add last ");
        System.out.println("3. insert after ");
        System.out.println("4. insert at ");
        System.out.println("5. insert before ");
        System.out.println("6. remove ");
        System.out.println("7. print");
        System.out.println("-------------------");
    }
}
