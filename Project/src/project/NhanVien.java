/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author dell
 */
public class NhanVien implements Serializable{

    public NhanVien(String tenNV, String gioiTinh, int tuoi, int maNV, String diaChi, String phongBan, String chucVu, String duAn) {
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.maNV = maNV;
        this.diaChi = diaChi;
        this.phongBan = phongBan;
        this.chucVu = chucVu;
        this.duAn = duAn;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getDuAn() {
        return duAn;
    }

    public void setDuAn(String duAn) {
        this.duAn = duAn;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "tenNV=" + tenNV + ", gioiTinh=" + gioiTinh + ", tuoi=" + tuoi + ", maNV=" + maNV + ", diaChi=" + diaChi + ", phongBan=" + phongBan + ", chucVu=" + chucVu + ", duAn=" + duAn + '}';
    }

  

  
    private String tenNV,gioiTinh;
    private int tuoi,maNV;
    private String diaChi,phongBan,chucVu,duAn; 
    public NhanVien() {
    }

    

    

   

    
}
