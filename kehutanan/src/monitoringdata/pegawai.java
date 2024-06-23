/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoringdata;

/**
 *
 * @author ASUS
 */
public class pegawai {
    int nip, telp;
    String nmPeg, alamat, tglLahir, sttPeg;
    
    //constructor
    public pegawai(int nip, String nmPeg, String tglLahir, String alamat, int telp, String sttPeg){
        this.nip = nip;
        this.nmPeg = nmPeg;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.telp = telp;
        this.sttPeg = sttPeg;
    }
    
    //setter
    public void setNip(int nip){
        this.nip = nip;
    }
    
    public void setNmPeg(String nmPeg){
        this.nmPeg = nmPeg;
    }
    
    public void setTglLahir(String tglLahir){
        this.tglLahir = tglLahir;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setTelp(int telp){
        this.telp = telp;
    }
    
    public void setSttPeg(String sttPeg){
        this.sttPeg = sttPeg;
    }
    
    //getter
    public int getNip(){
        return this.nip;
    }
    
    public String getNmPeg(){
        return this.nmPeg;
    }
    
    public String getTglLahir(){
        return this.tglLahir;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public int getTelp(){
        return this.telp;
    }
    
    public String getSttPeg(){
        return this.sttPeg;
    }
}
