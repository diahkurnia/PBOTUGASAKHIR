/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoringdata;

/**
 *
 * @author ASUS
 */
public class kategori {
    int kdMerk;
    String merk;
    
    //constructor
    public kategori(int kdMerk, String merk){
        this.kdMerk = kdMerk;
        this.merk = merk;
    }
    
    //setter
    public void setKdMerk(int kdMerk){
        this.kdMerk = kdMerk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    //getter
    public int getKdMerk(){
        return this.kdMerk;
    }
    
    public String getMerk(){
        return this.merk;
    }
            
}
