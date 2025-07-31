/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Baitap1_DanhSachSanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThachHien
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SanPham> ds = new ArrayList<>();

        System.out.print("Nhap so san pham: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Ma: ");
            String ma = sc.nextLine();
            System.out.print("Ten: ");
            String ten = sc.nextLine();
            System.out.print("Gia: ");
            double gia = Double.parseDouble(sc.nextLine());
            ds.add(new SanPham(ma, ten, gia));
        }

        System.out.print("Ban muon sap xep (1: Tang dan, 2: Giam dan)? Chon: ");
        int luaChon = Integer.parseInt(sc.nextLine());

        if (luaChon == 1) {
            ds.sort(Comparator.comparing(SanPham::getGia)); // Tang dan
            System.out.println("\nDanh sach san pham tang dan theo gia:");
        } else {
            ds.sort((a, b) -> Double.compare(b.getGia(), a.getGia())); // Giam dan
            System.out.println("\nDanh sach san pham giam dan theo gia:");
        }

        ds.forEach(System.out::println);
        
        // "::" truy xuất trực tiếp giá trị của đối tượng trong ds SanPham
        SanPham max = Collections.max(ds, Comparator.comparing(SanPham::getGia)); 
        System.out.println("\nSan pham co gia cao nhat: " + max);

    }

}
