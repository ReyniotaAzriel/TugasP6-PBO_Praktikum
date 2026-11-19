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

class BanyakThread extends Thread {
    private String nama;

    public BanyakThread(String nama) {
        this.nama = nama;
    }

    public void run() {
        System.out.println(nama + " sedang berjalan.");
    }
}

public class Soal8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            BanyakThread t = new BanyakThread("Thread-" + i);
            t.start();
        }
    }
}