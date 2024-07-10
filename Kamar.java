/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewakamar;

/**
 *
 * @author ASUS
 */
// Pembuatan class kamar untuk menyimpan data harga dari biaya per kamar
abstract class Kamar {
// Pembuatan access modifier dan tipe data dengan atrribut yang berupa jenis kamar 
private double Reguler;
private double DoubleReguler;
private double Premium;
private double Deluxe;
private double SuperPremium;

// Pembuatan constructor guna menyimpan value dari data yang sudah ditetapkan oleh user
public Kamar(double Reguler, double DoubleReguler, double Premium, double Deluxe, double SuperPremium){
this.Reguler = Reguler;    
this.DoubleReguler = DoubleReguler;
this.Premium = Premium;
this.Deluxe = Deluxe;
this.SuperPremium = SuperPremium;
}

// Setter getter method untuk mengambil data dan menyimpan data apabila nantinya sudah terkena diskon
    public double getReguler() {
        return Reguler;
    }

    public void setReguler(double Reguler) {
        this.Reguler = 100.000;
    }

    public double getDoubleReguler() {
        return DoubleReguler;
    }

    public void setDoubleReguler(double DoubleReguler) {
        this.DoubleReguler = 200.000;
    }

    public double getPremium() {
        return Premium;
    }

    public void setPremium(double Premium) {
        this.Premium = 250.000;
    }

    public double getDeluxe() {
        return Deluxe;
    }

    public void setDeluxe(double Deluxe) {
        this.Deluxe = 350.000;
    }

    public double getSuperPremium() {
        return SuperPremium;
    }

    public void setSuperPremium(double SuperPremium) {
        this.SuperPremium = 500.000;
    }
}
