/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap2_LuongNV;

/**
 *
 * @author ThachHien
 */
public abstract class NhanVien {
    protected String hoTen;
    protected double luongCoBan;

    public NhanVien(String hoTen, double luongCoBan) {
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    
    public abstract double tinhLuong();

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen + ", Luong: " + tinhLuong());
    }
}
