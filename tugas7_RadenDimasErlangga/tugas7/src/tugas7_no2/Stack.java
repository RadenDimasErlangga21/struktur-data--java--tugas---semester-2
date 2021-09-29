
package tugas7_no2;

/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
public class Stack {
    int size; 
    int top;
    StrukBelanja data[];
    
public Stack(int size){
    this.size = size;
    data = new StrukBelanja [size];
    top = -1;
}
public boolean IsEmpty(){
    if (top == -1){
        return true;
    } else {
        return false;
    }
}
public boolean IsFull(){
    if (top == size - 1){
        return true;
    } else {
        return false;
    }
}
public void push(StrukBelanja struk){
    if (!IsFull()){
        top++;
        data[top] = struk;
    } else {
        System.out.println("Isi stack penuh!");
    }
}
public void pop(){
    if(!IsEmpty()){
        StrukBelanja x = data[top];
        top--;
        System.out.println("Data yang keluar: " + x.nota + " " +x.tanggal+" "+
                x.jumlah+" "+x.total); 
    } else {
        System.out.println("Stack masih kosong");
    }
}
public void print(){
    System.out.println(" ");
    System.out.println("Isi stack: ");
    for (int i = top; i >= 0; i-- ){
        System.out.println(data[i].nota + " " + data[i].tanggal + " " +
                data[i].jumlah + " " + data[i].total);
    }
    System.out.println(" ");
}
}
