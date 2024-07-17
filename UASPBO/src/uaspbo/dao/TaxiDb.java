/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.dao;
import uaspbo.model.Taxi;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Hp
 */
public class TaxiDb {
    
    public void insert(Taxi taxi) throws Exception {
        DBHelper db = new DBHelper();
        String query = "insert into taxi values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, taxi.getKodeTransaksi());
        ps.setString(2, taxi.getKodePenumpang());
        ps.setString(3, taxi.getNama());
        ps.setString(4, taxi.getJenisPenumpang());
        ps.setString(5, taxi.getPlatNomor());
        ps.setString(6, taxi.getSupir());
        ps.setString(7, taxi.getBiayaAwal());
        ps.setString(8, taxi.getBiayaPerKilo());
        ps.setString(9, taxi.getJarak());
        ps.setString(10, taxi.getTotalBayar());
        ps.executeUpdate();
    }
    
    public void update(Taxi taxi) throws Exception {
        DBHelper db = new DBHelper();
        String query = "update taxi set kode_penumpang=?, nama=?, jenis_penumpang=?, "
                + "plat_nomor=?, supir=?, biaya_awal=?,"
                + "biaya_perkilo=?, jarak=?, total_bayar=? where kode_transaksi=?";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, taxi.getKodePenumpang());
        ps.setString(2, taxi.getNama());
        ps.setString(3, taxi.getJenisPenumpang());
        ps.setString(4, taxi.getPlatNomor());
        ps.setString(5, taxi.getSupir());
        ps.setString(6, taxi.getBiayaAwal());
        ps.setString(7, taxi.getBiayaPerKilo());
        ps.setString(8, taxi.getJarak());
        ps.setString(9, taxi.getTotalBayar());
        ps.setString(10, taxi.getKodeTransaksi());
        ps.executeUpdate();
    }
    
    public void delete(String kodeTransaksi) throws Exception{
        DBHelper db = new DBHelper();
        String query = "delete from taxi where kode_transaksi=?";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, kodeTransaksi);
        ps.executeUpdate();
    }
    
    public Taxi getTaxi(String kodeTransaksi) throws Exception{
        DBHelper db = new DBHelper();
        String query = "select * from taxi where kodet_ransaksi=?";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, kodeTransaksi);
        Taxi taxi = null;
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            taxi = new Taxi();
            taxi.setKodeTransaksi(rs.getString(1));
            taxi.setKodePenumpang(rs.getString(2));
            taxi.setNama(rs.getString(3));
            taxi.setJenisPenumpang(rs.getString(4));
            taxi.setPlatNomor(rs.getString(5));
            taxi.setSupir(rs.getString(6));
            taxi.setBiayaAwal(rs.getString(7));
            taxi.setBiayaPerKilo(rs.getString(8));
            taxi.setJarak(rs.getString(9));
            taxi.setTotalBayar(rs.getString(10));
        }
        return taxi;
    }
    
    public List<Taxi> getAllTaxi()  throws Exception{
        DBHelper db = new DBHelper();
        String query = "select * from taxi";
        PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        List<Taxi> list = new ArrayList();
        Taxi taxi = null;
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            taxi = new Taxi();
            taxi.setKodeTransaksi(rs.getString(1));
            taxi.setKodePenumpang(rs.getString(2));
            taxi.setNama(rs.getString(3));
            taxi.setJenisPenumpang(rs.getString(4));
            taxi.setPlatNomor(rs.getString(5));
            taxi.setSupir(rs.getString(6));
            taxi.setBiayaAwal(rs.getString(7));
            taxi.setBiayaPerKilo(rs.getString(8));
            taxi.setJarak(rs.getString(9));
            taxi.setTotalBayar(rs.getString(10));
            list.add(taxi);
        }
        return list;
    }
    
}
