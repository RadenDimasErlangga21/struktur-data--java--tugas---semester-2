/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;

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
        System.out.println("|============================= DATA BUKU PERPUSTAKAAN =============================|");
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
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.print("Masukkan menu pilihan: ");
        int pilihan = scInt.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|================================ Entry Judul Buku ================================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Masukkan Judul Buku: ");
                String newJudul =  scString.nextLine();
                dll.push(newJudul);
                break;
            case 2:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|=============================== Ambil Buku Teratas ===============================|");
                System.out.println("------------------------------------------------------------------------------------");
                if (dll.IsEmpty()) {
                    System.out.println("Linked List Masih Kosong");
                } else {
                    dll.removeFirst();
                }
                break;
            case 3:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|============================= Cek Judul Buku Teratas =============================|");
                System.out.println("------------------------------------------------------------------------------------");
                if (dll.IsEmpty()){
                    System.out.println("Linked List Masih Kosong");
                } else {
                    System.out.println("Data Paling Atas Adalah : " + dll.GetFirst());
                }
                break;
            case 4:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|============================== Info semua Judul Buku =============================|");
                System.out.println("------------------------------------------------------------------------------------");
                dll.print();
                break;
            case 5:
                System.exit(0);
        }
    }
}
