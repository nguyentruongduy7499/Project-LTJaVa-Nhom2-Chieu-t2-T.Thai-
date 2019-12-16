/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom2.testda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *BaiTest
 * Nhom 2
 */
public class ListGiay {
    //Khoi tao Mang
    ArrayList<Giay> list;
    //Constructor khong tham so
    public ListGiay() {
        list = new ArrayList<>();
    }
    //Thuoc tinh getList
    public ArrayList<Giay> getList() {
        return list;
    }
    //Thuoc tinh setList
    public void setList(ArrayList<Giay> list) {
        this.list = list;
    }
    //Constructor co tham so
    public ListGiay(ArrayList<Giay> list) {
        this.list = list;
    }
    //Ham them 
    public void addGiay(Giay g) {
        list.add(g);
    }
    //Ham Sua
    public void update(Giay g) {
        for (Giay giay : list) {
            if (giay.getTenGiay().equals(g.getTenGiay())) {
                giay.setTenGiay(g.getHangGiay());
                giay.setHangGiay(g.getHangGiay());
                giay.setGia(g.getGia());
                giay.setSoGiay(g.getSoGiay());
            }
        }
    }
    //Ham Xoa
    public void delete(Giay g) {
        for (Giay giay : list) {
            if (giay.getTenGiay().equals(g.getTenGiay())) {
                list.remove(giay);
                return;
            }
        }

    }
    //ham Tim Kiem theo ten
    public Giay find(String Ten) {
        for (Giay giay : list) {
            if (giay.getTenGiay().equals(Ten)) {
                return giay;
            }
        }
        return null;
    }
    //Ham sap xep theo Ten
    public void sortName() {
        Collections.sort(list, new Comparator<Giay>() {
            @Override
            public int compare(Giay o1, Giay o2) {
                return o1.getTenGiay().compareTo(o2.getTenGiay());
            }
        });
    }
    //Ham sap xep theo so Giay
    public void sortSizeGiay() {
        Collections.sort(list, new Comparator<Giay>() {
            @Override
            public int compare(Giay o1, Giay o2) {
                int size1 = o1.getSoGiay();
                int size2 = o2.getSoGiay();
                if (size1 == size2) {
                    return 0;
                } else if (size1 >= size2) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });
    }

}
