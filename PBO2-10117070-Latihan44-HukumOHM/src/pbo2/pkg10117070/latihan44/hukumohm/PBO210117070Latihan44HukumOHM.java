/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan44.hukumohm;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung 
 * besaran tegangan listrik
 */
public class PBO210117070Latihan44HukumOHM {

    
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        
        Baterai baterai = new Baterai();
        System.out.print("Masukkan Kuat Arus : ");
        float ka = scn.nextFloat();
        System.out.print("Masukkan Hambatan : ");
        float hb = scn.nextFloat();
        
        System.out.println("\n");
        
        Baterai baterai1 = new Baterai(ka, hb);
        float total = baterai1.hitungTegangan();
        System.out.println("Hasil Tegangan = " + total + " Volt");
    }
    
}
