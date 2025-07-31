/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap2_LuongNV;

/**
 *
 * @author ThachHien
 */
public class NhanVienSX extends NhanVien {
    private int soSanPham;

    public NhanVienSX(String hoTen, double luongCoBan, int soSanPham) {
        super(hoTen, luongCoBan);
        this.soSanPham = soSanPham;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soSanPham * 20000;
    }
    
    
}
