/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap1_DanhSachSanPham;

/**
 *
 * @author ThachHien
 */
public class SanPham {
    private String ma;
    private String ten;
    private double gia;

    public SanPham(String ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return "Ma: " + ma + ", Ten: " + ten + ", Gia: " + gia;
    }
    
    
    
    
}
