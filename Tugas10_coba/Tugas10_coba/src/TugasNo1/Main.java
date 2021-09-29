/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;

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
        System.out.println("|=============== PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LIST ===============|");
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
        System.out.println("1. Tambah Head");
        System.out.println("2. Tambah Tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
        System.out.print("Masukkan menu pilihan: ");
        int pilihan = scInt.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|=================================== Tambah Head ==================================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Masukkan Data Posisi Head: ");
                int newHead = scInt.nextInt();
                dll.addFirst(newHead);
                break;
            case 2:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|=================================== Tambah Tail ==================================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Masukkan Data Posisi Tail: ");
                int newTail = scInt.nextInt();
                dll.addLast(newTail);
                break;
            case 3:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|=================================== Tambah Data ==================================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Masukkan Data: ");
                int newData = scInt.nextInt();
                System.out.println("Masukkan Alamat Pointer: ");
                int link = scInt.nextInt();
                dll.add(newData, link);
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
                System.out.println("Masukkan Alamat Pointer: ");
                int pointer = scInt.nextInt();
                dll.remove(pointer);
                break;  
            case 7:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|===================================== Cetak ======================================|");
                System.out.println("------------------------------------------------------------------------------------");
                dll.print();
                break;
            case 8:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|====================================== Cari ======================================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.print("Masukkan data yang ingin dicari : ");
                int in = scInt.nextInt();
                dll.cari(in);
                break;
            case 9:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|==================================== Urut Data ===================================|");
                System.out.println("------------------------------------------------------------------------------------");
                dll.urutData();
                dll.print();
                break;
            case 10:
                System.exit(0);
        }
    }
}
