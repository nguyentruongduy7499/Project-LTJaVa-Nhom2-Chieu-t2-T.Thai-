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
public class ListDuAn {

    private ArrayList<DuAn> list;

    public ListDuAn() {
        list = new ArrayList<>();
    }

    public ArrayList<DuAn> getList() {
        return list;
    }

    public void setList(ArrayList<DuAn> list) {
        this.list = list;
    }

    public ListDuAn(ArrayList<DuAn> list) {
        this.list = list;
    }

    public void insertDA(DuAn da) {
        list.add(da);
    }

    //Administratos:::
    public DuAn getDuAnAt(int index) {
        return list.get(index);
    }

    public ArrayList<DuAn> editDuAn(int ma, DuAn da) {
        ArrayList<DuAn> ds = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaDuAn() == ma) {
                ds.add(da);
            } else {
                ds.add(list.get(i));
            }
        }
        return ds;
    }

    public void deleteDuAnByViTri(int vitri) {
        for (int i = 0; i < list.size(); i++) {
            if (i == vitri) {
                list.remove(i);
                return;
            }
        }
    }

    public ArrayList<DuAn> timKiemTheoMa(int ma) {
        ArrayList<DuAn> ds = new ArrayList<>();
        for (DuAn da : this.list) {
            if (da.getMaDuAn() == ma) {
                ds.add(da);
            }
        }
        return ds;
    }

    public ArrayList<DuAn> timKiemTheoTen(String ten) {
        ArrayList<DuAn> ds = new ArrayList<>();
        for (DuAn da : this.list) {
            if (da.getTenDuAn().equals(ten)) {
                ds.add(da);
            }
        }
        return ds;
    }

    public ArrayList<DuAn> sortTheoSoNV() {
        ArrayList<DuAn> ds = this.list;
        Collections.sort(ds, (DuAn da1, DuAn da2) -> {
            if (da1.getSoNV() == da2.getSoNV()) {
                return 0;
            } else if (da1.getSoNV() > da2.getSoNV()) {
                return 1;
            } else {
                return -1;
            }
        });
        return ds;

    }

    public ArrayList<DuAn> sortTheoTen() {
        ArrayList<DuAn> ds = this.list;
        Collections.sort(ds, (DuAn da1, DuAn da2) -> da1.getTenDuAn().compareTo(da2.getTenDuAn()));
        return ds;
    }

    public ArrayList readDuAn(String sPath) {
        ArrayList<DuAn> listda = new ArrayList<>();
        String line, token, tenda;
        BufferedReader sReader;
        StringTokenizer tokens;
        int mada, sonv;
        DuAn da;
        try {
            sReader = new BufferedReader(new FileReader(sPath));
            try {
                line = sReader.readLine();
                while (line != null) {
                    tokens = new StringTokenizer(line, "|");
                    while (tokens.hasMoreTokens()) {
                        mada = Integer.parseInt(tokens.nextToken());
                        tenda = tokens.nextToken();
                        sonv = Integer.parseInt(tokens.nextToken());
                        da = new DuAn(mada, tenda, sonv);
                        listda.add(da);
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
        return listda;
    }

    public boolean writeDuAn(String sPath) {
        try {
            String s = "";
            PrintWriter sWriter = new PrintWriter(new FileWriter(sPath));
            for (DuAn da : list) {
                s = da.getMaDuAn() + "|" + da.getTenDuAn() + "|" + da.getSoNV() + "\n";
                sWriter.println(s);
            }
            sWriter.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ListNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean writeTenDuAn(String sPath) {
        try {
            String s = "";
            PrintWriter sWriter = new PrintWriter(new FileWriter(sPath));
            for (DuAn da : list) {
                s = da.getTenDuAn();
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
