/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nadila.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MahasiswaDao {
    private List<Mahasiswa> data = new ArrayList<Mahasiswa>();

    public MahasiswaDao() {
        data.add(new Mahasiswa("98312100", "Ali", "Padang", "L", "01-09-1980"));
        data.add(new Mahasiswa("98312101", "Ani", "Jakarta", "P", "10-07-1990"));
        data.add(new Mahasiswa("98312102", "Budi", "Padang Panjang", "L", "20-01-1990"));
    }
    
    public void insert(Mahasiswa m){
        data.add(m);
    }
    
    public void update(int index,Mahasiswa m){
        data.set(index,m);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Mahasiswa getMahasiswa(int index){
        return data.get(index);
    }
    
    public List<Mahasiswa> getAllMahasiswa(){
        return data;
    }
}
