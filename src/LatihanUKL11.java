/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Revalina Santosa
 */
public class LatihanUKL11 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        System.out.println("Hasil : ");
        
        // deklarasi variabel
        int beda = 5;
        int Awal = 5;
        int sukuSaatini;
        
        for(int i=0; i<5;i++){// membuat pola angka ke bawah
            for(int j=i; j<5; j++){// membuat pola angka ke samping
                sukuSaatini = Awal;
                Awal += beda;
                System.out.print(sukuSaatini+" ");// menampilkan nilai berikutnya dan membuat space antara angka        
            }
            System.out.println("");// untuk mengakhiri baris dan membuat baris baru 
                    
         }
        }
        }
