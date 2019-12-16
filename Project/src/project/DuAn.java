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
public class DuAn implements Serializable{

    public DuAn() {
    }

    public DuAn(int maDuAn,String tenDuAn, int sonv) {
        this.tenDuAn = tenDuAn;
        this.maDuAn = maDuAn;
        this.sonv = sonv;
    }
    
    public int getSoNV()
    {
        return this.sonv;
    }
    public void setSoNV(int sonv)
    {
        this.sonv = sonv;
    }
    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public int getMaDuAn() {
        return maDuAn;
    }

    public void setMaDuAn(int maDuAn) {
        this.maDuAn = maDuAn;
    }

    @Override
    public String toString() {
        return "DuAn{" + "tenDuAn=" + tenDuAn + ", maDuAn=" + maDuAn + ", soNV=" + sonv + '}';
    }
    private String tenDuAn;
    private int maDuAn;
    private int sonv;
}
