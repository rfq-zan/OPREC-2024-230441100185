/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sewakamar;
// Penulisan import agar program dapat berjalan secara dinamis
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
// main class mengekstensi kelas parent yaitu Kamar.java
public class SewaKamar extends Kamar{
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Penulisan attribute didalam class SewaKamar 
 int tipeKamar;
 double hargaKamar;
 String namaPenyewa;
//        Pembuatan objek scanner agar program dapat diinputkan secara dinamis
        Scanner scanner = new Scanner();
//        Perulangan do while digunakan agar program dapat diulang saat user menginputkan y/n
        do{
            System.out.println("==============================");
            System.out.println("Sewa Kamar");
            System.out.println("==============================");
//            Tipe kamar yang disewakan oleh hotel
            System.out.println("Pilih Tipe Kamar Yang Anda Inginkan!");
            System.out.println("1. Reguler (Kapasitas : 1 Orang)");
            System.out.println("   Harga : Rp. 100.000");
            System.out.println("2. Double Reguler (Kapasitas : 2 Orang)");
            System.out.println("   Harga : Rp. 200.000");
            System.out.println("3. Premium (Kapasitas : 2 Orang)");
            System.out.println("   Harga : Rp. 250.000");
            System.out.println("4. Deluxe (Kapasitas : 2 Orang)");
            System.out.println("   Harga : Rp. 350.000");
            System.out.println("5. Super Premium (Kapasitas : 2 Orang)");
            System.out.println("   Harga : Rp. 500.000");
//            User diminta memasukkan pilihan kamar yang akan disewa
            System.out.println("Masukkan Pilihan anda : ");
            scanner.next();
            scanner.nextLine();
//            Memasukkan kriteria administrasi hotel
            SewaKamar Nama = new SewaKamar();
            System.out.println("Masukkan Nama Anda : ");
            scanner.next(Nama);
            SewaKamar Umur = new SewaKamar();
            System.out.println("Masukkan Umur Anda : ");
            scanner.nextInt(Umur);
            SewaKamar Hari = new SewaKamar();
            System.out.println("Sewa Kamar Berapa Lama (Hari) : ");
            scanner.nextInt(Hari);
            System.out.println("==============================");
            
//            Perulangan if else digunakan untuk menentukan apakah si penginput suddah diatas umur 19 tahun
            if(Umur >= 19){
                continue;
            } else{
            System.out.println("==============================");
                System.out.println("Maaf Anda Belum Cukup Umur Untuk Memesan Kamar");
            System.out.println("==============================");
                break;
            }
        }while();
        
//      Switch case digunakan agar program berjalan sesuai keinginan saat diinputkan pemilihan kriteria penyewaan kamar        
        switch(){
            case 1 : Reguler(scanner);
            break;
            case 2 : DoubleReguler(scanner);
            break;
            case 3 : Premium(scanner);
            break;
            case 4 : Deluxe(scanner);
            break;
            case 5 : SuperPremium(scanner);
            break;
                
        }
        
//        pembuatan DisplayData guna mengoutputkan data yang nantinya akan dioutputkan saat user telah memasukkan kriteria program
        private void DisplayData(){
            System.out.println("Jenis Kamar : " +);
            System.out.println("Nama Tamu : " +Nama);
            System.out.println("Lama Menginap : " +Hari);
            System.out.println("Total Harga Sebelum Diskon : " +hargaAwal);
            System.out.println("Diskon : " +disc);
            System.out.println("Total Harga Setelah Diskon : " +totalidr);
        }
    }
    
}
