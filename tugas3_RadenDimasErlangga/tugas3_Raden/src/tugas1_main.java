
/**
 * # nim  : 2031710121
 * # nama : Raden Dimas Erlangga
 */
import java.util.Scanner;

public class tugas1_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        int input;
        String x;
        do {
            System.out.println("======================================");
            System.out.println("program calculator hitung bangun ruang");
            System.out.println("======================================");
            System.out.println("pilih bangun ruang");
            System.out.println("1. Kubus");
            System.out.println("2. Prisma");
            System.out.println("3. bola");
            System.out.print("masukkan nomor : ");
            input = sc.nextInt();
            if (input == 1) {
                System.out.println("======================================");
                System.out.println("anda memilih kubus");
                System.out.println("Kubus adalah bangun ruang tiga dimensi yang tersusun dari 6 bidang datar");
                System.out.println("yang kongruen, keenam bidang kongruen pada kubus berbentuk persegi.");
                System.out.println("======================================");
                System.out.print("masukkan jumlah array  : ");
                int nilai = sc.nextInt();
                tugas1_kubus[] kubArray = new tugas1_kubus[nilai];
                for (int i = 0; i < nilai; i++) {
                    kubArray[i] = new tugas1_kubus();
                    System.out.println("kubus ke-" + (i + 1));
                    System.out.print("Masukkan sisi : ");
                    kubArray[i].sisi = sc.nextInt();
                }
                System.out.println(">hasil : ");
                for (int i = 0; i < nilai; i++) {

                    System.out.println(" hasil luas kubus ke-"+(i+1)+": "+ kubArray[i].hitungLuas());
                    System.out.println(" hasil volume kubus ke-"+(i+1)+": "+ kubArray[i].hitungVolume());
                }
            } else if (input == 2) {
                System.out.println("======================================");
                System.out.println("anda memilih prisma");
                System.out.println("Prisma adalah bangun ruang yang terdiri dari atap dan alas dengan bentuk");
                System.out.println("segi-n yang kongruen beserta dipisahkan oleh sisi-sisi tegak berbentuk segi empat.");
                System.out.println("======================================");
                System.out.print("masukkan jumlah array : ");
                int nilai = sc.nextInt();
                tugas1_prisma[] prismArray = new tugas1_prisma[nilai];
                for (int i = 0; i < nilai; i++) {
                    prismArray[i] = new tugas1_prisma();
                    System.out.println("prisma ke-" + (i + 1));
                    System.out.print("Masukkan luas alas: ");
                    prismArray[i].luasAlas = sc.nextInt();
                    System.out.print("Masukkan keliling alas: ");
                    prismArray[i].kelilingAlas = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    prismArray[i].tinggiPrisma = sc.nextInt();
                }
                System.out.println(">_hasil : ");
                for (int i = 0; i < nilai; i++) {
                    System.out.println(" hasil luas prisma ke-"+(i+1)+": "+ prismArray[i].hitungLuasPrisma());
                    System.out.println(" hasil volume prisma ke-"+(i+1)+": "+ prismArray[i].hitungVolumePrisma());
                }
            } else if (input == 3) {
                System.out.println("======================================");
                System.out.println("anda memilih bola");
                System.out.println("Bola adalah bangun ruang dengan bentuk bulat sempurna yang tersusun oleh");
                System.out.println("lingkaran tidak terhingga yang mempunyai jari-jari dan pusat lingkaran yang sama.");
                System.out.println("======================================");
                System.out.print("masukkan jumlah array : ");
                int nilai = sc.nextInt();
                tugas1_bola[] blArray = new tugas1_bola[nilai];
                for (int i = 0; i < nilai; i++) {
                    blArray[i] = new tugas1_bola();
                    System.out.println("bola ke-" + (i + 1));
                    System.out.print("Masukkan Jari-Jari: ");
                    blArray[i].jariJari = sc.nextInt();
                }
                System.out.print(">_hasil : ");
                for (int i = 0; i < nilai; i++) {
                    System.out.printf("\n hasil luas bola ke-" +(i+1) +": "+"%4.1f", blArray[i].hitungLuasbola());
                    System.out.printf("\n hasil volume bola ke-" +(i+1)+": "+ "%4.1f", blArray[i].hitungVolumebola());
                    System.out.println(" ");
                }
            } else {
                System.out.println("Masukkan nilai yang benar");
            }
            System.out.print("apakah ingin kembali ke menu (yes/no) : ");
            x = inputS.next();
        } while (x.equalsIgnoreCase("yes"));
    }
}