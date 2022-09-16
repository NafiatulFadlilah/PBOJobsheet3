/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;
import java.util.Scanner;
/**
 *
 * @author Nafiaaeluv
 */
public class TestKoperasi {
    public static void main(String[] args){
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getlimitPeminjaman());
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah pinjaman: ");
        int pinjaman = input.nextInt();
        
        System.out.println("\nMeminjam uang sebesar: " + pinjaman);
        donny.pinjam(pinjaman);
        
        if(donny.getjumlahPinjaman() > 10){
            System.out.println("Masukkan jumlah angsuran: ");
            int angsuran = input.nextInt();
            donny.angsur(angsuran);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getjumlahPinjaman());
        }
        
        /*System.out.println("\nMeminjam uang 10.000.000 ....");
        donny.pinjam(10000000);
        
        System.out.println("\nMeminjam uang 4.000.000 ...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getjumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getjumlahPinjaman());
            
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getjumlahPinjaman());  
        
        System.out.println("\nMembayar Angsuran 250.000 ...");
        donny.angsur(250000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getjumlahPinjaman());*/
    }
}