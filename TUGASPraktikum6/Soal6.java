/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum6;

/**
 *
 * @author rizky
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> angkaList = new ArrayList<Double>();

        try {
            System.out.print("Masukkan jumlah bilangan : ");
            int n = input.nextInt();

            if (n <= 0) {
                System.out.println("Jumlah bilangan harus lebih dari 0.");
            }

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angkaList.add(input.nextDouble());
            }

            double total = 0;
            for (double nilai : angkaList) {
                total += nilai;
            }

            double rataRata = total / angkaList.size();
            System.out.println("Data tersimpan : " + angkaList);
            System.out.println("Rata-rata : " + rataRata);

        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa bilangan!");
        } finally {
            System.out.println("program selesai");
        }
    }
}