/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119920.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class PerbandinganDuaBuahNilai {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int nilaia, nilaib;
        String ulang = "ya"; 
        for(String x = "x"; x.equals("x");)
        {
            if(ulang.equals("ya"))
            {   
                System.out.println("========Program Perbandingan Nilai========");        
                System.out.print("Masukkan nilai pertama : ");
                nilaia = input.nextInt();
                System.out.print("Masukkan nilai kedua : ");
                nilaib = input.nextInt();

                if(nilaia < nilaib)
                {
                System.out.println("Hasil : " + nilaia + " Lebih kecil dari " + nilaib );
                }
                else if(nilaia > nilaib)
                {
                System.out.println("Hasil : " + nilaia + " Lebih besar dari " + nilaib );
                }
                else if(nilaia == nilaib)
                {
                System.out.println("Hasil : " + nilaia + " Sama dengan " + nilaib );
                }
                else
                {
                System.out.println();
                }
                System.out.println();
                System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
                ulang = input.next();
                ulang = ulang.toLowerCase();
                System.out.println();
            }
            else if(ulang.equals("tidak"))
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Pilihan salah ");
                System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
                ulang = input.next();
                ulang = ulang.toLowerCase();
                System.out.println();
            }
        }
    }
}