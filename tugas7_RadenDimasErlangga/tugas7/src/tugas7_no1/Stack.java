package tugas7_no1;

/**
 * # nim : 2031710121 
 * # kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
public class Stack {

    int size;
    int top;
    char data[];

    public Stack(int size) {
        this.size = size;
        data = new char[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(char dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isis stack penuh!");
        }
    }

    public void print() {
        System.out.print("Hasil : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i]);
        }
        System.out.println("");
    }
}
