import java.util.Scanner;

public class UcapanTerimaKasih_01_1 {
    public static String PenerimaUcapan() {
        Scanner sc01 = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc01.nextLine();
        sc01.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }
    public static void main(String[] args){
        UcapanTerimaKasih();
        // Menambahkan Ucapan Tambahan
        String tambahanUcapan = "Your guidance has been invaluable. I am truly grateful.";
        UcapanTambahan(tambahanUcapan);
    }
}
