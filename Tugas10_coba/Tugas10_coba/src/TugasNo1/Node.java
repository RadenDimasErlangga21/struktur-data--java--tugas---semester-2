/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo1;
//Arifatun Nisa
//2031710118
//MI-1E
public class Node {
    int data;
    Node prev;
    Node next;
    
    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
