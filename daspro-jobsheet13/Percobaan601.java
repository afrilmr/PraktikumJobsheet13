import java.util.Scanner;
public class Percobaan601 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang");
        p = sc01.nextInt();
        System.out.println("Masukkan Lebar");
        l = sc01.nextInt();
        System.out.println("Masukkan Tinggi");
        t = sc01.nextInt();

        L = p*l;
        System.out.println("Luas Persegi Panjang adalah : "+ L);
        vol = p*l*t;
        System.out.println("Volume Balok Adalah : "+ vol);
    }
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b){
        int volume=hitungLuas(a, b)*tinggi;
        return volume;
    }
    
}