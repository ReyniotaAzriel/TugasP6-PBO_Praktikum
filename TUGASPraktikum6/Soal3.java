/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum6;

import java.util.Scanner;

/**
 *
 * @author rizky
 */

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //a
        System.out.print("Masukkan jumlah elemen array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        //b
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + " : ");
            arr[i] = input.nextInt();
        }

        //c
        int max = arr[0];
        int posisiMax = 0;
        int min = arr[0];
        int posisiMin = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                posisiMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                posisiMin = i;
            }
            //d
            total += arr[i];
        }

        double rataRata = (double) total / n;

        System.out.println("");
        System.out.println("Hasil Analisis : ");
        System.out.println("Nilai Terbesar : " + max + " (pada indeks ke-" + posisiMax + ")");
        System.out.println("Nilai Terkecil : " + min + " (pada indeks ke-" + posisiMin + ")");
        System.out.println("Jumlah Total : " + total);
        System.out.println("Rata-rata : " + rataRata);

        //e
        int jumlahIndeksGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahIndeksGanjil += arr[i];
        }

        System.out.println("Jumlah elemen berindeks ganjil (NPM genap) : " + jumlahIndeksGanjil);

        //g
        System.out.print("Status jumlah indeks ganjil : ");
        if (jumlahIndeksGanjil % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        
        
        //h
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Array setelah diurutkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}