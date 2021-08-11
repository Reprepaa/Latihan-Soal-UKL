/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;

/**
 *
 * @author Revalina Santosa
 */
public class LatihanUKL10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hasil : ");
        //deklarasi variabel
        int awal = 5;
        int beda = 5;
        int sukuSaatIni;
        for(int i=1;i<=4;i++){
            //untuk membuat pola angka kebawah
            for(int j=0;j<i;j++){
                //untuk membuat pola angka kesamping
                sukuSaatIni = awal;
                awal += beda;
                System.out.print(sukuSaatIni+" ");
                //untuk menampikan nilai berikutnya dan membuat space pada setiap angka
            }
            System.out.println("");
            //untuk mengakhiri baris dan membuat baris baru
            }
       }
      
    }