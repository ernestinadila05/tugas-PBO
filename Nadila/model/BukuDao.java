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
public class BukuDao {
    private List<Buku> data = new ArrayList<Buku>();

    public BukuDao() {
        data.add(new Buku("B001", "Pascal", "Andi", "1990"));
        data.add(new Buku("B002", "Matematika", "Andi", "1995"));
    }
    
    public void insert(Buku m){
        data.add(m);
    }
    
    public void update(int index,Buku m){
        data.set(index,m);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAllBuku(){
        return data;
    }
}
