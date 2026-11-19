/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum6;

import java.util.ArrayList;

/**
 *
 * @author rizky
 */

public class Soal10 {
    public static void main(String[] args) {
        ArrayList<Object> data = new ArrayList<Object>();
        data.add(19);
        data.add(0.2);
        data.add('C');
        data.add("Java");
        data.add(true);

        for(int i= 0; i < data.size(); i++) {
            Object item = data.get(i);
            System.out.println("Indeks "+i + " : " +item );
        }
    }
}