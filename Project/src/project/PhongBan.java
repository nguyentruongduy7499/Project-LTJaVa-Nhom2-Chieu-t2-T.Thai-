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
public class PhongBan implements Serializable{

    public PhongBan() {
    }

    public PhongBan(int maphong, String tenphong,int soNV) {
        this.tenPhong = tenphong;
        this.maPhong = maphong;
        this.soNV = soNV;
        
    }

    public int getSoNV(){
        return this.soNV;
    }
    public void setSoNV(int soNV)
    {
        this.soNV = soNV;
    }
    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    @Override
    public String toString() {
        return "PhongBan{" + "tenPhong=" + tenPhong + ", maPhong=" + maPhong + ", soNV=" + soNV + '}';
    }

   
    private String tenPhong;
    private int maPhong;
    private int soNV;
}
