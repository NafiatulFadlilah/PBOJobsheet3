/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author Nafiaaeluv
 */
public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;
    
    Anggota(String noKtp, String nama, int limitPeminjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        jumlahPinjaman = 0;
    }
    
    public String getnoKtp(){
        return noKtp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getlimitPeminjaman(){
        return limitPeminjaman;
    }
    
    public int getjumlahPinjaman(){
        return jumlahPinjaman;
    }
    
    public void pinjam(int nominal){
        if((jumlahPinjaman + nominal) > limitPeminjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else{
            jumlahPinjaman += nominal;
        }
    }
    
    public void angsur(int nominal){
        if(nominal > (jumlahPinjaman / 10)){
            jumlahPinjaman -= nominal;
        }else{
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman.");
        }
    }
}