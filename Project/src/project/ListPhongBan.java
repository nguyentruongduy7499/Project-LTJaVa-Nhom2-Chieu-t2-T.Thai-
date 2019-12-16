/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ListPhongBan {

    private ArrayList<PhongBan> list;

    public ListPhongBan() {
        list = new ArrayList<>();
    }

    public ArrayList<PhongBan> getList() {
        return list;
    }

    public void setList(ArrayList<PhongBan> list) {
        this.list = list;
    }

    public ListPhongBan(ArrayList<PhongBan> list) {
        this.list = list;
    }

    public void insertPB(PhongBan pb) {
        list.add(pb);
    }

    //Administrators::::
    public PhongBan getPhongBanAt(int index) {
        return list.get(index);
    }

    public ArrayList<PhongBan> editPhongBan(int ma, PhongBan pb) {
        ArrayList<PhongBan> ds = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaPhong() == ma) {
                ds.add(pb);
            } else {
                ds.add(list.get(i));
            }
        }
        return ds;
    }

  

    public void deletePhongBanByViTri(int vitri) {
        for (int i = 0; i < list.size(); i++) {
            if (i == vitri) {
                list.remove(i);
                return;
            }
        }
    }

    public ArrayList<PhongBan> timKiemTheoMa(int ma) {
        ArrayList<PhongBan> ds = new ArrayList<>();
        for (PhongBan nv : this.list) {
            if (nv.getMaPhong() == ma) {
                ds.add(nv);
            }
        }
        return ds;
    }

    public ArrayList<PhongBan> timKiemTheoTen(String ten) {
        ArrayList<PhongBan> ds = new ArrayList<>();
        for (PhongBan nv : this.list) {
            if (nv.getTenPhong().equals(ten)) {
                ds.add(nv);
            }
        }
        return ds;
    }

    public ArrayList<PhongBan> sortTheoSoNV() {
        ArrayList<PhongBan> ds = this.list;
        Collections.sort(ds, (PhongBan pb1, PhongBan pb2) -> {
            if (pb1.getSoNV() == pb2.getSoNV()) {
                return 0;
            } else if (pb1.getSoNV() > pb2.getSoNV()) {
                return 1;
            } else {
                return -1;
            }
        });
        return ds;

    }

    public ArrayList<PhongBan> sortTheoTen() {
        ArrayList<PhongBan> ds = this.list;
        Collections.sort(ds, (PhongBan pb1, PhongBan pb2) -> pb1.getTenPhong().compareTo(pb2.getTenPhong()));
        return ds;
    }

    public ArrayList readPhongBan(String sPath) {
        ArrayList<PhongBan> listnv = new ArrayList<>();
        String line, token, tenphong;
        BufferedReader sReader;
        StringTokenizer tokens;
        int maphong, sonv;
        PhongBan pb;
        try {
            sReader = new BufferedReader(new FileReader(sPath));
            try {
                line = sReader.readLine();
                while (line != null) {
                    tokens = new StringTokenizer(line, "|");
                    while (tokens.hasMoreTokens()) {
                        maphong = Integer.parseInt(tokens.nextToken());
                        tenphong = tokens.nextToken();
                        sonv = Integer.parseInt(tokens.nextToken());
                        pb = new PhongBan(maphong, tenphong, sonv);
                        listnv.add(pb);
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

    public boolean writePhongBan(String sPath) {
        try {
            String s = "";
            PrintWriter sWriter = new PrintWriter(new FileWriter(sPath));
            for (PhongBan pb : list) {
                s = pb.getMaPhong() + "|" + pb.getTenPhong() + "|" + pb.getSoNV() + "\n";
                sWriter.println(s);
            }
            sWriter.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ListNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean writeTenPhong(String sPath) {
        try {
            String s = "";
            PrintWriter sWriter = new PrintWriter(new FileWriter(sPath));
            for (PhongBan pb : list) {
                s = pb.getTenPhong();
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
