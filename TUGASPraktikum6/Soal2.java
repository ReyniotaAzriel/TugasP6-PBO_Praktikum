/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum6;

/**
 *
 * @author rizky
 */
public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        System.out.println("Index sebelum di ubah");
        for(int a =0; a <mobil.length; a++){
            System.out.println("Indeks " + a +" : " +mobil[a]);
        }

         System.out.println("Index yang sudah di ganti");
           mobil[1]= "Toyota";
           for(int i = 0; i < mobil.length; i++){
           System.out.println("Indeks " +i +" : " +mobil[i]);
           
         }
    }
}