package org.example;

public abstract class Colokan {
    
    private String merk;
    private double promiseBandwidth;
    private int harga;

    public Colokan(int harga, double promiseBandwidth, String merk) {
        this.merk = merk;
        this.harga = harga;
        this.promiseBandwidth = promiseBandwidth;
    }

    abstract double getRealBandwidth(); // wooooooo

    void setMerk(String x) {
        this.merk = x;
    }

    void setPromiseBandwidth(double x) {
        this.promiseBandwidth = x;
    }

    void setHarga(int x) {
        this.harga = x; 
    }

    String getMerk() {return merk;} 
    double getPromiseBandwidth() {return promiseBandwidth;}
    double getHarga() {return harga;}
}
