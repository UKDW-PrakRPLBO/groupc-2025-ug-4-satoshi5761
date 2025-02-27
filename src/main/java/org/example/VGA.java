package org.example;

public class VGA extends Colokan{

    double getRealBandwidth() {
        int harga_pasaran = 30000;
        double ratio = (double) harga / (double) harga_pasaran;

        return ratio < 1 ? ratio * promiseBandwidth : promiseBandwidth;
    }
}
