package org.example;

public class HDMI extends Colokan{

    HDMI(int harga, double promiseBandwidth, String merk) {
        super(harga, promiseBandwidth, merk);
    }

    double getRealBandwidth() {
        int harga_pasaran = 50000;
        double ratio = getHarga() / harga_pasaran;

        return ratio < 1 ? ratio * getPromiseBandwidth() : getPromiseBandwidth();
    }

}
