/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo3;
//Arifatun Nisa
//2031710118
//MI-1E

public class DoubleLinkedList {

    Node front, rear;
    int size;

    public DoubleLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void Enqueue(int no, String nama) {
        Node newNode = new Node(null, no, nama, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(front.nama + "telah selesai divaksin");
            front = front.next;
            front.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (front.next == null) {
            front = null;
            size--;
            return;
        }
        Node current = front;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = front;
            System.out.println("|No.\t|Nama\t|");
            while (tmp != null) {
                System.out.println("|" + tmp.no + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.print("Sisa Antrian: " + size);
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
