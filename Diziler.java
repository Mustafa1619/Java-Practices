/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diziler;

import java.util.Scanner;


/**
 *
 * @author Gaming-3
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int giris, kacAdet, Toplam=0;
        Scanner sayiAl = new Scanner(System.in);
        
        System.out.println("Kaç Adet Sayı gireceksiniz?");
        kacAdet = sayiAl.nextInt();
        
        int[] girilenSayi = new int[kacAdet];

        for (int x = 0; x < girilenSayi.length; x++) {
            
            System.out.println("Tam Sayi Giriniz:");
            giris = sayiAl.nextInt();
            girilenSayi[x] = giris;
            Toplam = Toplam+ girilenSayi[x]; 
        }

        for (int x = 0; x < girilenSayi.length; x++) {
        
            System.out.println("girilenSayi[" + x + "]=" + girilenSayi[x]); 
        }

        System.out.println("Toplamı:" + Toplam);     
      


       
    }
}

