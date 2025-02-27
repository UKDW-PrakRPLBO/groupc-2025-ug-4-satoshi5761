import java.util.*;
// package org.example;

public class HDMI extends Colokan{

    double getRealBandwidth() {
        int harga_pasaran = 50000;
        double ratio = (double) harga / (double) harga_pasaran;

        return ratio < 1 ? ratio * promiseBandwidth : promiseBandwidth;
    }

}
