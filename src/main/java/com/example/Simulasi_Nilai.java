package com.example;
import java.util.Scanner;

public class Simulasi_Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Anda: ");
        double nilai = scanner.nextDouble();
        
        if (nilai >= 80.00 && nilai <= 100.00) {
            System.out.println("Nilai Anda: A");
        } else if (nilai >= 77.50 && nilai < 80.00) {
            System.out.println("Nilai Anda: A-");
        } else if (nilai >= 75.00 && nilai < 77.50) {
            System.out.println("Nilai Anda: A/B");
        } else if (nilai >= 72.50 && nilai < 75.00) {
            System.out.println("Nilai Anda: B+");
        } else if (nilai >= 70.00 && nilai < 72.50) {
            System.out.println("Nilai Anda: B");
        } else if (nilai >= 67.50 && nilai < 70.00) {
            System.out.println("Nilai Anda: B-");
        } else if (nilai >= 65.00 && nilai < 67.50) {
            System.out.println("Nilai Anda: B/C");
        } else if (nilai >= 62.50 && nilai < 65.00) {
            System.out.println("Nilai Anda: C+");
        } else if (nilai >= 60.00 && nilai < 62.50) {
            System.out.println("Nilai Anda: C");
        } else if (nilai >= 57.50 && nilai < 60.00) {
            System.out.println("Nilai Anda: C-");
        } else if (nilai >= 55.00 && nilai < 57.50) {
            System.out.println("Nilai Anda: C/D");
        } else if (nilai >= 52.50 && nilai < 55.00) {
            System.out.println("Nilai Anda: D+");
        } else if (nilai >= 50.00 && nilai < 52.50) {
            System.out.println("Nilai Anda: D");
        } else if (nilai >= 45.00 && nilai < 50.00) {
            System.out.println("Nilai Anda: E");
        } else if (nilai < 45.00) {
            System.out.println("Nilai Anda: Tidak lulus (E)");
        } else {
            System.out.println("Nilai yang dimasukkan tidak valid.");
        }
        
        scanner.close();
    }
}