/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom2.testda;

import java.io.Serializable;

/**
 *
 * @author AccountName
 */
public class Giay implements Serializable {

    private String tenGiay;
    private String hangGiay;
    private double gia;
    private int soGiay;

    public Giay() {
    }

    public Giay(String tenGiay, String hangGiay, double gia, int soGiay) {
        this.tenGiay = tenGiay;
        this.hangGiay = hangGiay;
        this.gia = gia;
        this.soGiay = soGiay;
    }

    public String getTenGiay() {
        return tenGiay;
    }

    public void setTenGiay(String tenGiay) {
        this.tenGiay = tenGiay;
    }

    public String getHangGiay() {
        return hangGiay;
    }

    public void setHangGiay(String hangGiay) {
        this.hangGiay = hangGiay;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoGiay() {
        return soGiay;
    }

    public void setSoGiay(int soGiay) {
        this.soGiay = soGiay;
    }

    @Override
    public String toString() {
        return "Giay{" + "tenGiay=" + tenGiay + ", hangGiay=" + hangGiay + ", gia=" + gia + ", soGiay=" + soGiay + '}';
    }

}
