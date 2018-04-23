/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fpt;

/**
 *
 * @author Diep.Tran
 */
public class Maychieu {
    float chieudai;
    float chieurong;
    int giatien;

    public Maychieu() {
    }

    public Maychieu(float chieudai, float chieurong, int giatien) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        this.giatien = giatien;
    }

    public float getChieudai() {
        return chieudai;
    }

    public void setChieudai(float chieudai) {
        this.chieudai = chieudai;
    }

    public float getChieurong() {
        return chieurong;
    }

    public void setChieurong(float chieurong) {
        this.chieurong = chieurong;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }
}
