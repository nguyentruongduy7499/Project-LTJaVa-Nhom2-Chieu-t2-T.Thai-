/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ListNhanVien {

    private ArrayList<NhanVien> list;

    public ListNhanVien() {
        list = new ArrayList<>();
    }

    public void deleteNhanVien(int index) {
        list.remove(index);
    }

    public NhanVien getNhanVienAt(int index) {
        return list.get(index);
    }

    public ArrayList<NhanVien> getList() {
        return list;
    }

    public void setList(ArrayList<NhanVien> list) {
        this.list = list;
    }

    public ListNhanVien(ArrayList<NhanVien> list) {
        this.list = list;
    }

    public void insertNV(NhanVien nv) {
        list.add(nv);
    }

    public NhanVien timKiem(String Name) {

        for (NhanVien nhanVien : list) {
            if (nhanVien.getTenNV().equals(Name)) {
                return nhanVien;
            }
        }
        return null;
    }

    void ghiSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Administrators
    public ArrayList<NhanVien> editNhanVien(int ma, NhanVien nv) {
        ArrayList<NhanVien> ds = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaNV() == ma) {
                ds.add(nv);
            } else {
                ds.add(list.get(i));
            }
        }
        return ds;
    }

    public ArrayList<NhanVien> timKiemTheoMa(int ma) {
        ArrayList<NhanVien> ds = new ArrayList<>();
        for (NhanVien nv : this.list) {
            if (nv.getMaNV() == ma) {
                ds.add(nv);
            }
        }
        return ds;
    }

    public ArrayList<NhanVien> timKiemTheoTen(String ten) {
        ArrayList<NhanVien> ds = new ArrayList<>();
        for (NhanVien nv : this.list) {
            if (nv.getTenNV().equals(ten)) {
                ds.add(nv);
            }
        }
        return ds;
    }

    public ArrayList<NhanVien> sortTheoTuoi() {
        ArrayList<NhanVien> ds = this.list;
        Collections.sort(ds, (NhanVien nv1, NhanVien nv2) -> {
            if (nv1.getTuoi() > nv2.getTuoi()) {
                return 0;
            } else if (nv1.getTuoi() > nv2.getTuoi()) {
                return 1;
            } else {
                return -1;
            }
        });
        return ds;

    }

    public ArrayList<NhanVien> sortTheoTen() {
        ArrayList<NhanVien> ds = this.list;
        Collections.sort(ds, (NhanVien nv1, NhanVien nv2) -> nv1.getTenNV().compareTo(nv2.getTenNV()));
        return ds;
    }

    public ArrayList readNhanVien(String sPath) {
        ArrayList<NhanVien> listnv = new ArrayList<>();

        String line, token;
        BufferedReader sReader;
        StringTokenizer tokens;
        String tennv, gioitinh, diachi, phongban, chucvu, duan;
        int tuoi, manv;
        NhanVien nv;
        try {
            sReader = new BufferedReader(new FileReader(sPath));
            try {
                line = sReader.readLine();
                while (line != null) {
                    tokens = new StringTokenizer(line, "|");
                    while (tokens.hasMoreTokens()) {
                        tennv = tokens.nextToken();
                        gioitinh = tokens.nextToken();
                        tuoi = Integer.parseInt(tokens.nextToken());
                        manv = Integer.parseInt(tokens.nextToken());
                        diachi = tokens.nextToken();
                        phongban = tokens.nextToken();
                        chucvu = tokens.nextToken();
                        duan = tokens.nextToken();
                        nv = new NhanVien(tennv, gioitinh, tuoi, manv, diachi, phongban, chucvu, duan);
                        listnv.add(nv);
                    }
                    line = sReader.readLine();
                }

            } catch (IOException ex) {
                System.out.println("Unable to read from file " + sPath);
                return null;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file " + sPath);
            return null;
        }
        try {
            sReader.close();
        } catch (IOException ex) {
            System.out.println("Unable to close file " + sPath);
        }
        return listnv;
    }

    public boolean writeNhanVien(String sPath) {
        try {
            String s = "";
            PrintWriter sWriter = new PrintWriter(new FileWriter(sPath));
            for (NhanVien nv : list) {
                s = nv.getTenNV() + "|" + nv.getGioiTinh() + "|" + nv.getTuoi() + "|" + nv.getMaNV() + "|" + nv.getDiaChi() + "|" + nv.getPhongBan() + "|" + nv.getChucVu() + "|" + nv.getDuAn() + "\n";
                sWriter.println(s);
            }
            sWriter.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ListNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
