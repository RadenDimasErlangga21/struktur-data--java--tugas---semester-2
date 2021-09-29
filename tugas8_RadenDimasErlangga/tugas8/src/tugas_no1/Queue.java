package tugas_no1;

/**
 * # nim : 2031710121 # Kelas : MI-1E # nama : Raden Dimas Erlangga
 */
public class Queue {

    int max, size, front, rear, Q[];

    public Queue(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(int data) {
        if (!IsEmpty()) {
            for (int i = 0; i < max; i++) {
                if (data == Q[i]) {
                    System.out.println("Data " + Q[i] + " Berada di index ke-" + i);
                    break;
                } 
            } 
        }  
        else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekAt(int position) {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            //catatan 
            //jika posisi yang di cari lebih dari jumlah index atau kurang dari 0
            if (position > (max - 1) || position < (0)) {
                System.out.println("indeks yang dipilih tidak ada");
            } else {
                System.out.println("Data " + position + " Berada di position ke-" + Q[position]);
            }
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.print(Q[i] + " ");
            System.out.println("Jumlah elemen " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
}
