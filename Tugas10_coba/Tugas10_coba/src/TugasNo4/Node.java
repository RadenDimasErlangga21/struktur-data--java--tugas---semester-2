/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;
//Arifatun Nisa
//2031710118
//MI-1E

public class Node {

    String nama;
    int nim;
    double ipk;
    Node prev, next;
    int data;

    Node(Node prev, int nim, String nama, double ipk, Node next) {
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.next = next;
    }
}
