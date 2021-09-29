
package tugas_no2;
/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
public class Queue {
    int max, size, front, rear;
    Mahasiswa Q[];
    
public Queue (int n){
    max = n;
    Create();
}
public void Create(){
    Q = new Mahasiswa[max];
    size = 0;
    front = rear = -1;
}
public boolean IsEmpty(){
    if (size == 0){
        return true;
    }
    else {
        return false;
    }
}
public boolean IsFull(){
    if(size == max){
        return true;
    } 
    else {
        return false;
    }
}
public void Enqueue(Mahasiswa data){
    if (IsFull()){
        System.out.println("Queue sudah penuh");
    } else {
        if (IsEmpty()){
            front = rear = 0;
        } else {
        if (rear == max - 1){
            rear = 0;
        } else {
            rear++;
        }
    }
    Q[rear] = data;
    size++;
}
}
public Mahasiswa Dequeue(){
    Mahasiswa data = new Mahasiswa(" "," ",0,0);
    if (IsEmpty()){
        System.out.println("Queue masih kosong");
    } else {
        data = Q[front];
        size--;
        if (IsEmpty()){
            front = rear = -1;
        } else {
            if (front == max - 1){
                front = 0;
            } else {
                front++;
            }
        } 
    }
        return data;
}
public void peek(){
    if(!IsEmpty()){
        System.out.println("Elemen terdepan: " + Q[front].nim+" " +Q[front].nama
                + " " + Q[front].absen + " "+Q[front].ipk);
    } else {
        System.out.println("Queue masih kosong");
    }
}
public void peekRear(){
    if(!IsEmpty()){
        System.out.println("Elemen terdepan: " + Q[rear].nim+" " +Q[rear].nama
                + " " + Q[rear].absen + " " + Q[rear].ipk);
    } else {
        System.out.println("Queue masih kosong");
    }
}
public void print(){
    if (IsEmpty()){
        System.out.println("Queue masih kosong");
    } else {
        int i = front;
        while (i != rear){
            System.out.println(Q[i].nim + " " + Q[i].nama +
                    " " + Q[i].absen + " " + Q[i].ipk);
            i = (i + 1) % max;
        }
        System.out.println(Q[i].nim + " " + Q[i].nama +
                    " " + Q[i].absen + " " + Q[i].ipk);
        System.out.println("Jumlah elemen " + size);
    }
}
public void peekPosition(String nim){
        if (!IsEmpty()){
            for (int i=0; i<max;i++){
                if (nim.equalsIgnoreCase(Q[i].nim)){
                    System.out.println("Nim "+Q[i].nim+" Berada di index ke-"+i);
                }
            }
            }
         else {
            System.out.println("Queue masih kosong");
        }
}

public void clear(){
    if (!IsEmpty()){
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");     
    } else {
        System.out.println("Queue masih kosong");
    }
}
}