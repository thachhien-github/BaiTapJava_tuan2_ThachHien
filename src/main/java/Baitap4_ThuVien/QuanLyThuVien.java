/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Baitap4_ThuVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author ThachHien
 */
public class QuanLyThuVien {
    private List<Sach> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyThuVien qltv = new QuanLyThuVien();
        while (true) {
            System.out.println("\nCHUC NANG\n1. Nhap sach\n2. Tim sach\n3. Thong ke nam\n0. Thoat");
            System.out.print("Chon: ");
            String c = qltv.sc.nextLine();
            switch (c) {
                case "1": qltv.nhapSach(); break;
                case "2": qltv.timSachTheoTen(); break;
                case "3": qltv.thongKeTheoNam(); break;
                case "0": return;
                default: System.out.println("Sai lua chon!");
            }
        }
    }

    private void nhapSach() {
        System.out.print("Nhap so sach: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Ma: "); String ma = sc.nextLine();
            System.out.print("Ten: "); String ten = sc.nextLine();
            System.out.print("Tac gia: "); String tg = sc.nextLine();
            System.out.print("Nam xuat ban: "); int nam = Integer.parseInt(sc.nextLine());
            ds.add(new Sach(ma, ten, tg, nam));
        }
    }

    private void timSachTheoTen() {
        System.out.print("Nhap tu khoa: ");
        String kw = sc.nextLine().toLowerCase();
        for (Sach s : ds) {
            if (s.getTenSach().toLowerCase().contains(kw)) {
                System.out.println(s);
            }
        }
    }

    private void thongKeTheoNam() {
        Map<Integer, Integer> tk = new TreeMap<>();
        for (Sach s : ds) {
            int nam = s.getNamXuatBan();
            tk.put(nam, tk.getOrDefault(nam, 0) + 1);
        }
        for (int nam : tk.keySet()) {
            System.out.println("Nam " + nam + ": " + tk.get(nam) + " cuon");
        }
    }
    
}
