/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    static Scanner scInt = new Scanner(System.in);
    static Scanner scString = new Scanner(System.in);
    static String ab;
    static DoubleLinkedList dll = new DoubleLinkedList();

    public static void main(String[] args) throws Exception {

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("|======================== SISTEM PENGOLAHAN DATA MAHASISWA ========================|");
        System.out.println("------------------------------------------------------------------------------------");

        while (true) {
            menuUtama();
        }
    }

    static void menuUtama() throws Exception{
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("|=================================== MENU UTAMA ===================================|");
        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut Data IPK-DECS");
        System.out.println("10. Keluar");
        System.out.print("Masukkan menu pilihan: ");
        int pilihan = scInt.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|================================ Tambah Data Awal ================================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Masukkan NIM : ");
                int nim = scInt.nextInt();
                System.out.print("Masukkan Nama : ");
                String nama = scString.next();
                System.out.print("Masukkan IPK : ");
                double ipk = scInt.nextDouble();
                dll.addFirst(nim, nama, ipk);
                break;
            case 2:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|================================ Tambah Data Akhir ===============================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Masukkan NIM : ");
                nim = scInt.nextInt();
                System.out.print("Masukkan Nama : ");
                nama = scString.next();
                System.out.print("Masukkan IPK : ");
                ipk = scInt.nextDouble();
                dll.addLast(nim, nama, ipk);
                break;
            case 3:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("=========================== Tambah Data Index Tertentu ============================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Masukkan NIM : ");
                nim = scInt.nextInt();
                System.out.print("Masukkan Nama : ");
                nama = scString.next();
                System.out.print("Masukkan IPK : ");
                ipk = scInt.nextDouble();
                System.out.print("Masukkan posisi indeks data : ");
                int id = scInt.nextInt();
                dll.add(nim, nama, ipk, id);
                break;
            case 4:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|=============================== Hapus Data Pertama ===============================|");
                System.out.println("------------------------------------------------------------------------------------");
                dll.removeFirst();
                break;
            case 5:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|============================== Hapus Data Terakhir ===============================|");
                System.out.println("------------------------------------------------------------------------------------");
                dll.removeLast();
                break;
            case 6:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|============================== Hapus Data Tertentu ===============================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Masukkan posisi indeks data : ");
                id = scInt.nextInt();
                dll.remove(id);
                break;  
            case 7:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|===================================== Cetak ======================================|");
                System.out.println("------------------------------------------------------------------------------------");
                dll.print();
                break;
            case 8:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|==================================== Cari NIM ====================================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Masukkan data yang ingin dicari : ");
                int in = scInt.nextInt();
                dll.cari(in);
                break;
            case 9:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|=============================== Urut Data IPK-DECS ===============================|");
                System.out.println("------------------------------------------------------------------------------------");
                dll.urutData();
                dll.print();
                break;
            case 10:
                System.exit(0);
        }
    }
}
