/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo2;
//Arifatun Nisa
//2031710118
//MI-1E
public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void push(String judulbuku) {
        if (IsEmpty()) {
            head = new Node(null, judulbuku, null);
        } else {
            Node newNode = new Node(null, judulbuku, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!IsEmpty()) {
            Node tmp = head;
            System.out.println("--------------------------");
            System.out.println("Cetak Seluruh Judul Buku");
            System.out.println("--------------------------");
            while (tmp != null) {
                System.out.println(tmp.judulBuku + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List Masih kosong, tidak depat dihapus");
        } else {
            System.out.println(head.judulBuku + " Berhasil Di Hapus");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public String GetFirst() {
        return head.judulBuku;
    }
}
