/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNo4;
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

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nim, String nama, Double ipk) {
        if (isEmpty()) {
            head = new Node(null, nim, nama, ipk, null);
        } else {
            Node newNode = new Node(null, nim, nama, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nim, String nama, Double ipk) {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node (current, nim, nama, ipk, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int nim, String nama,Double ipk, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, ipk);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nim, nama, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nim, nama, ipk, current);
                newNode.prev = newNode;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
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
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("NIM\t\t Nama \t\t IPK");
            while (tmp != null) {
                System.out.print(tmp.nim + "\t\t ");
                System.out.print(tmp.nama + "\t\t ");
                System.out.print(tmp.ipk + "\t");
                System.out.println("");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indexs diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        return (head.nim + head.nama + head.ipk);
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (tmp.nim + tmp.nama + tmp.ipk);
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (tmp.nim + tmp.nama + tmp.ipk);
    }

    public void cari(int cari) {
        boolean cek = false;
        int i = 1;
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            if (temp.nim == cari) {
                cek = true;
                break;
            }
            temp = temp.next;
            i++;
        }
        if (cek) {
            System.out.println("Data " + cari + " ditemukan pada indeks ke : " + i);
            System.out.println("NIM : " + temp.nim);
            System.out.println("Nama : " + temp.nama);
            System.out.println("IPK : " +temp.ipk);
        } else {
            System.out.println("Index tidak ditemukan");
        }
    }

    public void urutData(){
        Node current = null, index = null;
        double temp, tmpn;
        if (head == null){
            return;
        }else{
            for (current = head;current.next != null;current = current.next){
                for (index = current.next; index != null;index = index.next){
                    if (current.ipk < index.ipk){
                        temp = current.ipk;
                        current.ipk = index.ipk;
                        index.ipk = (int) temp;
                    }
                }
            }
        }
    }
}
