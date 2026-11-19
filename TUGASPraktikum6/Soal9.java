/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum6;

/**
 *
 * @author rizky
 */
public class Soal9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan for");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }


        System.out.println("");
        System.out.println("Menggunakan foreach");
        for (int nilai : age) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }
}
