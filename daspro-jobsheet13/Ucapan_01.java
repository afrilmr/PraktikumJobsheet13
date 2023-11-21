import java.util.Scanner;

public class Ucapan_01 {
    public static String PenerimaUcapan() {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc01.nextLine();
        System.out.println("Ucapan diterima untuk: " + namaOrang); // Menambahkan System.out.println di dalam fungsi dengan nilai kembalian
        sc01.close();
        return namaOrang;
    }
    public static void main(String[] args){
        // Memanggil fungsi tanpa menyimpan nilai kembalian dalam variabel
        System.out.println("Thank you " + PenerimaUcapan() + "\nMay the force be with you.");
    }
}


