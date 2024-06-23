/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class koneksi {
    private String databaseName = "2210010049";
    private String username = "root";
    private String password = "";
    public static Connection koneksiDB;

    public koneksi(){
        try {
            String location = "jdbc:mysql://localhost/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    //DATA PERALATAN
    public void simpanPeralatan(int kd_brg, String nm_brg, int no_reg, String kd_merk, String ukuran, String m_manfaat, int th_pembelian, String kd_bag, int hrg_perolehan, String tgl_input){
        try {
            String sql = "insert into tb_peralatan (kd_brg, nm_brg, no_reg, kd_merk, ukuran, m_manfaat, th_pembelian, kd_bag, hrg_perolehan, tgl_input) value (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_brg);
            perintah.setString(2, nm_brg);
            perintah.setInt(3, no_reg);
            perintah.setString(4, kd_merk);
            perintah.setString(5, ukuran);
            perintah.setString(6, m_manfaat);
            perintah.setInt(7, th_pembelian);
            perintah.setString(8, kd_bag);
            perintah.setInt(9, hrg_perolehan);
            perintah.setString(10, tgl_input);
            
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }           
    }
    
    public void ubahPeralatan(int kd_brg, String nm_brg, int no_reg, String kd_merk, String ukuran, String m_manfaat, int th_pembelian, String kd_bag, int hrg_perolehan, String tgl_input){
            try {
                String sql = "update tb_peralatan set nm_brg = ?, no_reg = ?, kd_merk = ?, ukuran = ?, m_manfaat = ?, th_pembelian = ?, kd_bag = ?, hrg_perolehan = ?, tgl_input = ? where kd_brg = ?";
                PreparedStatement perintah = koneksiDB.prepareStatement(sql);
                perintah.setString(1, nm_brg);
                perintah.setInt(2, no_reg);
                perintah.setString(3, kd_merk);
                perintah.setString(4, ukuran);
                perintah.setString(5, m_manfaat);
                perintah.setInt(6, th_pembelian);
                perintah.setString(7, kd_bag);
                perintah.setInt(8, hrg_perolehan);
                perintah.setString(9, tgl_input);
                perintah.setInt(10, kd_brg);
                
                perintah.executeUpdate();
                System.out.println("data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
    
    public void hapusPeralatan(int kd_brg){
        try {
            String sql = "delete from tb_peralatan where kd_brg = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_brg);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPeralatan(int kd_brg){
        try {
            String sql = "select * from tb_peralatan where kd_brg = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_brg);
            
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("KODE BARANG : "+data.getInt("kd_brg"));
                System.out.println("NAMA BARANG : "+data.getString("nm_brg"));
                System.out.println("NO REG : "+data.getInt("no_reg"));
                System.out.println("KODE MERK : "+data.getString("kd_merk"));
                System.out.println("UKURAN : "+data.getString("ukuran"));
                System.out.println("M MANFAAT : "+data.getString("m_manfaat"));
                System.out.println("TAHUN PEMBELIAN : "+data.getInt("th_pembelian"));
                System.out.println("KODE BAGIAN : "+data.getString("kd_bag"));
                System.out.println("HARGA PEROLEHAN : "+data.getInt("hrg_perolehan"));
                System.out.println("TANGGAL INPUT : "+data.getString("tgl_input"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataPeralatan(int kd_brg){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from tb_peralatan order by kd_brg asc");
            while(baris.next()){
                System.out.println(baris.getInt("kd_brg")+" | "+
                        baris.getString("nm_brg")+" | "+
                        baris.getInt("no_reg")+" | "+
                        baris.getString("kd_merk")+" | "+
                        baris.getString("ukuran")+" | "+
                        baris.getString("m_manfaat")+" | "+
                        baris.getInt("th_pembelian")+" | "+
                        baris.getString("kd_bag")+" | "+
                        baris.getInt("hrg_perolehan")+" | "+
                        baris.getString("tgl_input"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    // DATA PEMAKAIAN
    public void simpanPemakaian(int kd_pemakaian, int kd_brg, int nip, String kd_bag, String tgl_pakai, String keperluan, String stt_p){
        try {
            String sql = "insert into tb_pemakaian (kd_pemakaian, kd_brg, nip, kd_bag, tgl_pakai, keperluan, stt_p) value (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_pemakaian);
            perintah.setInt(2, kd_brg);
            perintah.setInt(3, nip);
            perintah.setString(4, kd_bag);
            perintah.setString(5, tgl_pakai);
            perintah.setString(6, keperluan);
            perintah.setString(7, stt_p);
            
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPemakaian (int kd_pemakaian, int kd_brg, int nip, String kd_bag, String tgl_pakai, String keperluan, String stt_p){
        try {
            String sql = "update tb_pemakaian set kd_brg = ?, nip = ?, kd_bag = ?, tgl_pakai = ?, keperluan = ?, stt_p = ? where kd_pemakaian = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_pemakaian);
            perintah.setInt(2, kd_brg);
            perintah.setInt(3, nip);
            perintah.setString(4, kd_bag);
            perintah.setString(5, tgl_pakai);
            perintah.setString(6, keperluan);
            perintah.setString(7, stt_p);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPemakaian(int kd_pemakaian){
        try {
            String sql = "delete from tb_pemakaian where kd_pemakaian = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_pemakaian);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPemakaian(int kd_pemakaian){
        try {
            String sql = "select * from tb_pemakaian where kd_pemakaian = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_pemakaian);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("KODE PEMAKAIAN : "+data.getInt("kd_pemakaian"));
                System.out.println("KODE BARANG : "+data.getInt("kd_brg"));
                System.out.println("NIP : "+data.getInt("nip"));
                System.out.println("KODE BAGIAN : "+data.getString("kd_bagian"));
                System.out.println("TANGGAL PAKAI : "+data.getString("tgl_pakai"));
                System.out.println("KEPERLUAN : "+data.getString("keperluan"));
                System.out.println("STATUS PEMAKAIAN : "+data.getString("stt_p"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataPemakaian(int kd_pemakaian){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from tb_pemakaian order by kd_pemakaian asc");
            while(baris.next()){
                System.out.println(baris.getInt("kd_pemakaian")+" | "+
                        baris.getInt("kd_brg")+" | "+
                        baris.getInt("nip")+" | "+
                        baris.getString("kd_bag")+" | "+
                        baris.getString("tgl_pakai")+" | "+
                        baris.getString("keperluan")+" | "+
                        baris.getString("stt_p"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    //DATA PEGAWAI
    public void simpanPegawai(int nip, String nm_peg, String tgl_lahir, String alamat, int telp, String stt_p){
        try {
            String sql = "insert into tb_pegawai (nip, nm_peg, tgl_lahir, alamat, telp, stt_p) value (?, ?, ?, ?, ?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, nip);
            perintah.setString(2, nm_peg);
            perintah.setString(3, tgl_lahir);
            perintah.setString(4, alamat);
            perintah.setInt(5, telp);
            perintah.setString(6, stt_p);
            
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPegawai(int nip, String nm_peg, String tgl_lahir, String alamat, int telp, String stt_p){
        try {
            String sql = "update tb_pegawai set nm_peg = ?, tgl_lahir = ?, alamat = ?, telp = ?, stt_p = ? where nip = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nm_peg);
            perintah.setString(2, tgl_lahir);
            perintah.setString(3, alamat);
            perintah.setInt(4, telp);
            perintah.setString(5, stt_p);
            perintah.setInt(6, nip);
                    
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPegawai(int nip){
        try {
            String sql = "delete from tb_pegawai where nip = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, nip);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariPegawai(int nip){
        try {
            String sql = "select * from tb_pegawai where nip = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, nip);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("NIP : "+data.getInt("nip"));
                System.out.println("NAMA PEGAWAI : "+data.getString("nm_peg"));
                System.out.println("TANGGAL LAHIR : "+data.getString("tgl_lahir"));
                System.out.println("ALAMAT : "+data.getString("alamat"));
                System.out.println("NO TELPON : "+data.getInt("telp"));
                System.out.println("STATUS PEGAWAI : "+data.getString("stt_p"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataPegawai(int nip){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from tb_pegawai order by nip asc");
            while(baris.next()){
                System.out.println(baris.getInt("nip")+" | "+
                        baris.getString("nm_peg")+" | "+
                        baris.getString("tgl_lahir")+" | "+
                        baris.getString("alamat")+" | "+
                        baris.getInt("telp")+" | "+
                        baris.getString("stt_p"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    //DATA KATEGORI
    public void simpanKategori(int kd_kategori, String nm_kategori){
        try {
            String sql = "insert into tb_kategori (kd_kategori, nm_kategori) value (?, ?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_kategori);
            perintah.setString(2, nm_kategori);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKategori(int kd_kategori, String nm_kategori){
        try {
            String sql = "update tb_kategori set nm_kategori = ? where kd_kategori = ? ";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setString(1, nm_kategori);
            perintah.setInt(2, kd_kategori);
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusKategori(int kd_kategori){
        try {
            String sql = "delete from tb_kategori where kd_kategori = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_kategori);
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void cariKategori(int kd_kategori){
        try {
            String sql = "select * from tb_kategori where kd_kategori = ?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            perintah.setInt(1, kd_kategori);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("KODE KATEGORI : "+data.getInt("kd_kategori"));
                System.out.println("NAMA KATEGORI : "+data.getString("nm_kategori"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void dataKategori(int kd_kategori){
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from tb_kategori order kd_kategori asc");
            while(baris.next()){
                System.out.println(baris.getInt("kd_kategori")+" | "+
                        baris.getString("nm_kategori"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
