/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;
//Arifatun Nisa
//2031710118
//MI-1E
public class Node {
    String judulBuku;
    Node prev; 
    Node next;


    Node(Node prev, String judulBuku, Node next){
        this.prev = prev;
        this.judulBuku = judulBuku;
        this.next = next;
    }
}
