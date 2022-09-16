/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapsulation;

/**
 *
 * @author Nafiaaeluv
 */
public class Motor {
    private int kecepatan = 100;
    private boolean kontakOn = true;
   
    public void nyalakanMesin(){
        kontakOn = true;
    } 
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(kontakOn == true){
            if(kecepatan <= 95){
                kecepatan += 5;
            }else{
                System.out.println("Tidak dapat menambah kecepatan karena kecepatan Anda dalam batas maksimal!");
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}