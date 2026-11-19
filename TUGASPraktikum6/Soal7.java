/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum6;

/**
 *
 * @author rizky
 */
class ThreadBaru extends Thread {
    public void run() {
        System.out.println("Thread baru sedang berjalan.");
    }
}

public class Soal7 {
    public static void main(String[] args) {
        ThreadBaru t = new ThreadBaru();
        t.start();
    }
}