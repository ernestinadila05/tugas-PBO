/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uaspbo.controller;
import uaspbo.view.FormTaxi;
import uaspbo.model.Taxi;
import uaspbo.dao.TaxiDb;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uaspbo.dao.TaxiDb;
import uaspbo.model.Taxi;
import uaspbo.view.FormTaxi;
/**
 *
 * @author Hp
 */
public class TaxiControllerDb {
    
    Taxi taxi;
    TaxiDb taxiDb;
    FormTaxi formTaxi;

    public TaxiControllerDb(FormTaxi formTaxi) 
    {
        this.formTaxi = formTaxi;
        taxiDb = new TaxiDb();
    }
    
    public void cancel(){
        formTaxi.getTxtKodeTransaksi().setText("");
        formTaxi.getTxtKodePenumpang().setText("");
        formTaxi.getTxtNama().setText("");
        formTaxi.getTxtPlatNomor().setText("");
        formTaxi.getTxtSupir().setText("");
        formTaxi.getTxtBiayaAwal().setText("");
        formTaxi.getTxtBiayaPerKilo().setText("");
        formTaxi.getTxtJarak().setText("");
        formTaxi.getTxtTotalBayar().setText("");
        isiJenisPenumpang();
    } 
    
    public void isiJenisPenumpang()
    {
        formTaxi.getCboJenisPenumpang().removeAllItems();
        formTaxi.getCboJenisPenumpang().addItem("Langganan");
        formTaxi.getCboJenisPenumpang().addItem("Non-Langganan");
    }
    
    public void insert(){
        try {
            taxi = new Taxi();
            taxi.setKodeTransaksi(formTaxi.getTxtKodeTransaksi().getText());
            taxi.setKodePenumpang(formTaxi.getTxtKodePenumpang().getText());
            taxi.setNama(formTaxi.getTxtNama().getText());
            taxi.setJenisPenumpang(formTaxi.getCboJenisPenumpang().getSelectedItem().toString());
            taxi.setPlatNomor(formTaxi.getTxtPlatNomor().getText());
            taxi.setSupir(formTaxi.getTxtSupir().getText());
            taxi.setBiayaAwal(formTaxi.getTxtBiayaAwal().getText());
            taxi.setBiayaPerKilo(formTaxi.getTxtBiayaPerKilo().getText());
            taxi.setJarak(formTaxi.getTxtJarak().getText());
            taxi.setTotalBayar(formTaxi.getTxtTotalBayar().getText());
            taxiDb.insert(taxi);
            JOptionPane.showMessageDialog(formTaxi, "Entri Data Ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(formTaxi, "Error  "+ex.getMessage());
        }
    }
    
    public void viewData(){
        try {
            DefaultTableModel model = (DefaultTableModel)formTaxi.getTabelTaxi().getModel();
            model.setNumRows(0);
            List<Taxi> list = taxiDb.getAllTaxi();
            for(Taxi taxi : list){
                Object[] data = {
                    taxi.getKodeTransaksi(),
                    taxi.getKodePenumpang(),
                    taxi.getNama(),
                    taxi.getJenisPenumpang(),
                    taxi.getPlatNomor(),
                    taxi.getSupir(),
                    taxi.getBiayaAwal(),
                    taxi.getBiayaPerKilo(),
                    taxi.getJarak(),
                    taxi.getTotalBayar()
                };
                model.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(TaxiControllerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  void actionClickTabel(){
        try {
            String kodeTransaksi = formTaxi.getTabelTaxi()
                    .getValueAt(formTaxi.getTabelTaxi().getSelectedRow(), 0).toString();
            taxi = taxiDb.getTaxi(kodeTransaksi);
            formTaxi.getTxtKodeTransaksi().setText(taxi.getKodeTransaksi());
            formTaxi.getTxtKodePenumpang().setText(taxi.getKodePenumpang());
            formTaxi.getTxtNama().setText(taxi.getNama());
            formTaxi.getCboJenisPenumpang().setSelectedItem(taxi.getJenisPenumpang());
            formTaxi.getTxtPlatNomor().setText(taxi.getPlatNomor());
            formTaxi.getTxtSupir().setText(taxi.getSupir());
            formTaxi.getTxtBiayaAwal().setText(taxi.getBiayaAwal());
            formTaxi.getTxtBiayaPerKilo().setText(taxi.getBiayaPerKilo());
            formTaxi.getTxtJarak().setText(taxi.getJarak());
            formTaxi.getTxtTotalBayar().setText(taxi.getTotalBayar());
            formTaxi.getTxtJarak().setText(taxi.getJarak());
        } catch (Exception ex) {
            Logger.getLogger(TaxiControllerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        
        try {
            taxi.setKodeTransaksi(formTaxi.getTxtKodeTransaksi().getText());
            taxi.setKodePenumpang(formTaxi.getTxtKodePenumpang().getText());
            taxi.setNama(formTaxi.getTxtNama().getText());
            taxi.setJenisPenumpang(formTaxi.getCboJenisPenumpang().getSelectedItem().toString());
            taxi.setPlatNomor(formTaxi.getTxtPlatNomor().getText());
            taxi.setSupir(formTaxi.getTxtSupir().getText());
            taxi.setBiayaAwal(formTaxi.getTxtBiayaAwal().getText());
            taxi.setBiayaPerKilo(formTaxi.getTxtBiayaPerKilo().getText());
            taxi.setJarak(formTaxi.getTxtJarak().getText());
            taxi.setTotalBayar(formTaxi.getTxtTotalBayar().getText());
            taxiDb.update(taxi);
            JOptionPane.showMessageDialog(formTaxi, "Update Data Ok");
        } catch (Exception ex) {
            Logger.getLogger(TaxiControllerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            String kodeTransaksi = formTaxi.getTabelTaxi()
                    .getValueAt(formTaxi.getTabelTaxi().getSelectedRow(), 0).toString();
            taxiDb.delete(kodeTransaksi);
            JOptionPane.showMessageDialog(formTaxi, "Delete Data Ok");
        } catch (Exception ex) {
            Logger.getLogger(TaxiControllerDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
