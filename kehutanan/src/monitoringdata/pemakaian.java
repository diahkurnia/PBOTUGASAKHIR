/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitoringdata;

/**
 *
 * @author ASUS
 */
public class pemakaian {
   int kdPemakaian, kdBrg, nip;
   String kdBag, keperluan, sttPem, tglPakai;
   
   public pemakaian(int kdPemakaian, int kdBrg, int nip, String kdBag, String tglPakai, String keperluan, String sttPem){
       this.kdPemakaian = kdPemakaian;
       this.kdBrg = kdBrg;
       this.nip = nip;
       this.kdBag = kdBag;
       this.tglPakai = tglPakai;
       this.keperluan = keperluan;
       this.sttPem = sttPem;
   }
   
   public void setKdPemakaian(int kdPemakaian){
       this.kdPemakaian = kdPemakaian;
   }
   
   public void setKdBrg(int kdBrg){
       this.kdBrg = kdBrg;
   }
   
   public void setNip(int nip){
       this.nip = nip;
   }
   
   public void setKdBag(String kdBag){
       this.kdBag = kdBag;
   }
   
   public void setTglPakai(String tglPakai){
       this.tglPakai = tglPakai;
   }
   
   public void setKeperluan(String keperluan){
       this.keperluan = keperluan;
   }
   
   public void setSttPem(String sttPem){
       this.sttPem = sttPem;
   }
   
   public int getKdPemakaian(){
       return this.kdPemakaian;
   }
   
   public int getKdBrg(){
       return this.kdBrg;
   }
   
   public int getNip(){
       return this.nip;
   }
   
   public String getKdBag(){
       return this.kdBag;
   }
   
   public String getTglPakai(){
       return this.tglPakai;
   }
   
   public String getKeperluan(){
       return this.keperluan;
   }
   
   public String getSttPem(){
       return this.sttPem;
   }
}
