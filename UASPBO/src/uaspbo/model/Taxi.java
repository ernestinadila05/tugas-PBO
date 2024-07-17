/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.model;

/**
 *
 * @author Hp
 */
public class Taxi {
    
    private String kodeTransaksi;
    private String kodePenumpang;
    private String nama;
    private String jenisPenumpang;
    private String platNomor;
    private String supir;
    private String biayaAwal;
    private String biayaPerKilo;
    private String totalBayar;
    private String jarak;
    
    public Taxi()
    {
    }

    public Taxi(String kodeTransaksi, String kodePenumpang, String nama, String jenisPenumpang, String platNomor, String supir, String biayaAwal, String biayaPerKilo, String totalBayar, String jarak) {
        this.kodeTransaksi = kodeTransaksi;
        this.kodePenumpang = kodePenumpang;
        this.nama = nama;
        this.jenisPenumpang = jenisPenumpang;
        this.platNomor = platNomor;
        this.supir = supir;
        this.biayaAwal = biayaAwal;
        this.biayaPerKilo = biayaPerKilo;
        this.totalBayar = totalBayar;
        this.jarak = jarak;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public String getKodePenumpang() {
        return kodePenumpang;
    }

    public void setKodePenumpang(String kodePenumpang) {
        this.kodePenumpang = kodePenumpang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisPenumpang() {
        return jenisPenumpang;
    }

    public void setJenisPenumpang(String jenisPenumpang) {
        this.jenisPenumpang = jenisPenumpang;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getSupir() {
        return supir;
    }

    public void setSupir(String supir) {
        this.supir = supir;
    }

    public String getBiayaAwal() {
        return biayaAwal;
    }

    public void setBiayaAwal(String biayaAwal) {
        this.biayaAwal = biayaAwal;
    }

    public String getBiayaPerKilo() {
        return biayaPerKilo;
    }

    public void setBiayaPerKilo(String biayaPerKilo) {
        this.biayaPerKilo = biayaPerKilo;
    }

    public String getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }
    
}

