/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoringdata;

/**
 *
 * @author ASUS
 */
public class peralatan extends kategori{
    int kdBrg, noReg, thPembelian, hrgPerolehan;
    String nmBrg, ukuran, mManfaat, kdBag, tglInput; 
       
  
    public peralatan(int kdBrg, String nmBrg, int noReg,String ukuran, String mManfaat,
            int thPembelian, String kdBag, int hrgPerolehan, String tglInput, int kdMerk, String merk ){
        super(kdMerk, merk);
        this.kdBrg = kdBrg;
        this.nmBrg = nmBrg;
        this.noReg = noReg;
        this.ukuran = ukuran;
        this.mManfaat = mManfaat;
        this.thPembelian = thPembelian;
        this.kdBag = kdBag;
        this.hrgPerolehan = hrgPerolehan;
        this.tglInput = tglInput;
        this.kdMerk = kdMerk;
        this.merk = merk;
    }
    
    public void setkdBrg(int kdBrg){
        this.kdBrg = kdBrg;
    }
    
    public void setNmBrg(String nmBrg){
        this.nmBrg = nmBrg;
    }
    
    public void setNoReg(int noReg){
        this.noReg = noReg;
    }
    
    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }
    
    public void setmManfaat(String mManfaat){
        this.mManfaat = mManfaat;
    }
    
    public void setThPembelian(int thPembelian){
        this.thPembelian = thPembelian;
    }
    
    public void setKdBag(String kdBag){
        this.kdBag = kdBag;
    }
    
    public void setHrgPerolehan(int hrgPerolehan){
        this.hrgPerolehan = hrgPerolehan;
    }
    
    public void setTglInput(String tglInput){
        this.tglInput = tglInput;        
    }
    
    @Override
    public void setKdMerk(int kdMerk){
        this.kdMerk = kdMerk;
    }
    
    @Override
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public int getKdBrg(){
        return this.kdBrg;
    }
    
    public String getNmBrg(){
        return this.nmBrg;
    }
    
    public int getNoReg(){
        return this.noReg;
    }
    
    public String getUkuran(){
        return this.ukuran;
    }
    
    public String getmManfaat(){
        return this.mManfaat;
    }
    
    public int getThPembelian(){
        return this.thPembelian;
    }
    
    public String getKdBag(){
        return this.kdBag;
    }
    
    public int getHrgPerolehan(){
        return this.hrgPerolehan;
    }
    
    public String getTglInput(){
        return this.tglInput;
    }
   
  
            
}
