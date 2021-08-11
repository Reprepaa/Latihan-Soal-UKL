/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Revalina Santosa
 */
public class LatihanUKL14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel
        int a [][] = {{1},{3},{6}};
        int b [][] ={{2,4,6}};
         int h [][] = new int[a.length][b[0].length];
         System.out.println("Hasil Matriks A x Matriks B =");
         for(int i=0; i< a.length; i++){
             //untuk membuat baris matriks A
             for(int j=0; j<b[0].length; j++){
                 //untuk membuat kolom matriks B
                for(int k=0; k<b.length; k++){
                    //kolom matriks A atau baris matriks B
         h[i][j]+= a[i][k] * b [k][j];}   
             //untuk menghitung matriks
                    System.out.print(h [i] [j] + "\t");//Mencetak matriks hasil kali
            }
                    System.out.println(" ");
        }
    }   
}