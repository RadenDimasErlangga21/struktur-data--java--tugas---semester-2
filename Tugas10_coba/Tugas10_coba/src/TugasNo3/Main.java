/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;

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
        System.out.println("|========================= PENGANTRIAN VAKSIN EXTRAVAGANZA ========================|");
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
        System.out.println("1. Tambah Data Penerimaan Vaksin");
        System.out.println("2. Hapus Data Pengantrian Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.print("Masukkan menu pilihan: ");
        int pilihan = scInt.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|========================= Tambah Data Penerimaan Vaksin ==========================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Masukkan Judul Buku: ");
                break;
            case 2:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|========================== Hapus Data Pengantrian Vaksin ==========================|");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Masukkan Data Posisi Tail: ");
                break;
            case 3:
                System.out.println();
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("|============================= Daftar Penerima Vaksin =============================|");
                System.out.println("------------------------------------------------------------------------------------");
                break;
            case 4:
                System.exit(0);
        }
    }
}
