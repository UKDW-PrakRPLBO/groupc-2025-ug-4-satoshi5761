package org.example;

public class TV {

    private int maxResolution;
    private Colokan colokan;

    TV(int maxResolution) {
        this.maxResolution = maxResolution;
    }

    void connect(Colokan colokan) {
        this.colokan.merk = colokan.merk;
        this.colokan.promiseBandwidth = colokan.promiseBandwidth;
        this.colokan.harga = colokan.harga;

        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

    int getResolution() {
        double rx = colokan.getRealBandwidth();
        int reso;
        switch (rx) {
            case (rx > 100): 
                reso = 1080;
                break;

            case (rx > 35): 
                reso = 720;
                break;
            
            case (rx > 9): 
                reso = 480;
                break;
            
            default:
                reso = 0;
        }

        if (reso == 1080 && maxResolution == 720) {
            reso = 720;
        } return reso;
    }
}
