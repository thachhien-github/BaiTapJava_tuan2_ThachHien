/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Baitap3_HinhHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThachHien
 */
public class MainHinhHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HinhHoc> danhSach = new ArrayList<>();

        System.out.print("Nhap so hinh: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Loai hinh (1. Tron, 2. Chu nhat): ");
            int chon = scanner.nextInt();

            if (chon == 1) {
                System.out.print("Ban kinh: ");
                double r = scanner.nextDouble();
                danhSach.add(new HinhTron(r));
            } else {
                System.out.print("Chieu dai: ");
                double d = scanner.nextDouble();
                System.out.print("Chieu rong: ");
                double r = scanner.nextDouble();
                danhSach.add(new HinhChuNhat(d, r));
            }
        }

        System.out.println("\nKet qua:");
        int dem = 1;
        for (HinhHoc h : danhSach) {
            System.out.println("Hinh " + dem++);
            System.out.println("Dien tich: " + h.tinhDienTich());
            System.out.println("Chu vi: " + h.tinhChuVi());
            System.out.println();
        }
           
    }
    
}
