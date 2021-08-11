/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Revalina Santosa
 */
public class LatihanUKL13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi variabel
    int a [] [] = {{1, 6}, {5, 3}, {9,6}};
    int b [] [] = {{2}, {3}};
    int h [] [] = new int [a.length] [b[0].length];

        System.out.println("Matriks A x Matriks B : ");
        
        for (int i = 0; i < a.length; i++ ){        
            //untuk membuat baris Matriks A
            for (int j = 0; j < b[0].length; j++){  
            //untuk membuat kolom Matriks B
                for (int k =0; k < b.length; k++){   
            //kolom matriks A atau baris  matriks B 
                    h [i] [j] += a [i] [k] * b [k] [j];
             //operasi menghitung hasil jumlah kedua matriks
                }
                    System.out.print(h [i] [j] + "");
                //Mencetak matriks hasil kali
            }
                    System.out.println(" ");
        }
    }
    
}