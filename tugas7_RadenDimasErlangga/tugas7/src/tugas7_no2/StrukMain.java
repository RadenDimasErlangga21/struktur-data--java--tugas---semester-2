
package tugas7_no2;
/**
 * # nim : 2031710121 
 * # Kelas : MI-1E
 * # nama : Raden Dimas Erlangga
 */
public class StrukMain {

    public static void main(String[] args) {
        Stack st = new Stack(8);
        System.out.println("Dewi sudah mempunyai delapan struk belanja");
        System.out.println("Dewi berencana " +
        "mengambil lima struk belanja untuk ditukarkan dengan voucher belanja.");
        System.out.println("berikut adalah data Dewi setelah mengambil 5 Struk Belanja : ");
        System.out.println(" ");
        
        StrukBelanja st1 = new StrukBelanja ("| 104781724 | ", "10 Januari 2021 ", "total belanja 8  ", "Rp.96.000");
        st.push(st1);
        StrukBelanja st2 = new StrukBelanja ("| 209490612 | ", "17 Januari 2021 ", "total belanja 12 ", "Rp.120.000");
        st.push(st2); 
        StrukBelanja st3 = new StrukBelanja ("| 301246551 | ", "24 Januari 2021 ", "total belanja 4  ", "Rp.45.000");
        st.push(st3);   
        StrukBelanja st4 = new StrukBelanja ("| 405517767 | ", "31 Januari 2021  ", "total belanja 5  ", "Rp.125.000");
        st.push(st4);     
        StrukBelanja st5 = new StrukBelanja ("| 505404303 | ", "7  Februari 2021 ", "total belanja 14 ", "Rp.235.000");
        st.push(st5);     
        StrukBelanja st6 = new StrukBelanja ("| 609420777 | ", "14 Februari 2021 ", "total belanja 25 ", "Rp.335.000");
        st.push(st6);   
        StrukBelanja st7 = new StrukBelanja ("| 707771724 | ", "21 Februari 2021 ", "total belanja 5  ", "Rp.150.000");
        st.push(st7);
        StrukBelanja st8 = new StrukBelanja ("| 804732715 | ", "28 Februari 2021 ", "total belanja 15 ", "Rp.345.000");
        st.push(st8);
        
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.print();
    }
    
}
