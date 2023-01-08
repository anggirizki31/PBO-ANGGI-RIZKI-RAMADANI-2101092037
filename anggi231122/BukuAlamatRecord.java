/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggi231122;

/**
 *
 * @author Asus
 */
public class BukuAlamatRecord {
    private String nama;
    private String alamat;
    private String telepon;
    private String email;
    
    public BukuAlamatRecord(){
        
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String nama){
        this.alamat=alamat;
    }
    public String getTelepon(){
        return telepon;
    }
    public void setTelepon(String nama){
        this.telepon=telepon;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String nama){
        this.email=email;
    }
}
