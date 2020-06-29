/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lapak hijau ^^
 */
public class Enkapsulasi {
    private int alas, tinggi;
    private  double LuasSegitiga;
    
    public void setAla(int alas){
        this.alas = alas;
    }
    
    public int gerAlas(){
        return alas;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public void setLuasSegitiga(int alas, int tinggi){
        LuasSegitiga = 0.5 * (double)(alas * tinggi);
    }
    public double getLuasSegitiga(){
        return LuasSegitiga;
    }
    
    
}