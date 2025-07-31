/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Baitap2_LuongNV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThachHien
 */
public class MainNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<NhanVien> danhSach = new ArrayList<>();

        System.out.print("Nhap so luong nhan vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Loai nhan vien (1. Van phong, 2. San xuat): ");
            int loai = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Luong co ban: ");
            double luongCB = scanner.nextDouble();

            if (loai == 1) {
                System.out.print("So ngay lam viec: ");
                int soNgay = scanner.nextInt();
                danhSach.add(new NhanVienVP(hoTen, luongCB, soNgay));
            } else {
                System.out.print("So san pham: ");
                int soSP = scanner.nextInt();
                danhSach.add(new NhanVienSX(hoTen, luongCB, soSP));
            }
            scanner.nextLine();
        }

        System.out.println("\nThong tin nhan vien:");
        for (NhanVien nv : danhSach) {
            nv.hienThiThongTin();
        }
    }
    
}
