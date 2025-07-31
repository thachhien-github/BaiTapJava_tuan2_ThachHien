/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap4_ThuVien;

/**
 *
 * @author ThachHien
 */
public class Sach {
    private String maSach, tenSach, tacGia;
    private int namXuatBan;

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    @Override
    public String toString() {
        return "Ma: " + maSach + ", Ten: " + tenSach + ", Tac gia: " + tacGia + ", Nam: " + namXuatBan;
    }
    
    
    
}
