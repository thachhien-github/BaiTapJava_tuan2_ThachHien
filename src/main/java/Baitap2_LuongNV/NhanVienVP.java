/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap2_LuongNV;

/**
 *
 * @author ThachHien
 */
public class NhanVienVP extends NhanVien {
    private int soNgayLamViec;

    public NhanVienVP(String hoTen, double luongCoBan, int soNgayLamViec) {
        super(hoTen, luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soNgayLamViec * 100000;
    }
       
}
