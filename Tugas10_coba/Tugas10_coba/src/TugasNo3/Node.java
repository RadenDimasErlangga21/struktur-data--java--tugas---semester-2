/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;
//Arifatun Nisa
//2031710118
//MI-1E
public class Node {
    String nama;
    int no;
    Node prev;
    Node next;

    Node( Node prev,int no, String nama,  Node next){
        this.prev = prev;
        this.nama = nama;
        this.no = no;
        this.next = next;
    }
}
