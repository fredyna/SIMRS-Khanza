package model;


import org.joda.time.DateTime;


public class BeriObatOperasi {
private String no_rawat;
private DateTime tanggal;
private String kd_obat;
private double hargasatuan;
private double jumlah;

    public String getNo_rawat() {
        return no_rawat;
    }

    public void setNo_rawat(String no_rawat) {
        this.no_rawat = no_rawat;
    }

    public DateTime getTanggal() {
        return tanggal;
    }

    public void setTanggal(DateTime tanggal) {
        this.tanggal = tanggal;
    }

    public String getKd_obat() {
        return kd_obat;
    }

    public void setKd_obat(String kd_obat) {
        this.kd_obat = kd_obat;
    }

    public double getHargasatuan() {
        return hargasatuan;
    }

    public void setHargasatuan(double hargasatuan) {
        this.hargasatuan = hargasatuan;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

}