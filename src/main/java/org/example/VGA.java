package org.example;

public class VGA extends Colokan{

    VGA(int harga, double promiseBandwidth, String merk) {
        super(harga, promiseBandwidth, merk);
    }

    double getRealBandwidth() {
        int harga_pasaran = 30000;
        double ratio = getHarga() / harga_pasaran;

        return ratio < 1 ? ratio * getPromiseBandwidth() : getPromiseBandwidth();
    }
}
