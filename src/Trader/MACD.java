/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trader;

import static Trader.FormulaLib.*;
import java.util.ArrayList;

/**
 *
 * @author zhangxr
 */
public class MACD {

    public MACD(ArrayList<Double> list, int s, int l, int m) {
        pList = list;
        this.s = s;
        this.l = l;
        this.m = m;
    }

    public void init() {
        int size = pList.size();
        for (int i = 0; i < size; i++) {
            arithmetic(i);
        }
    }

    protected void arithmetic(int i) {
        if (i == 0) {
            emasList.add(pList.get(0));
            emalList.add(pList.get(0));
            difList.add((double) 0);
            deaList.add((double) 0);
            barList.add((double) 0);
        } else {
            double emas = EMA(emasList.get(i - 1), pList.get(i), s);
            double emal = EMA(emalList.get(i - 1), pList.get(i), l);
            double dif = emas - emal;
            double dea = EMA(deaList.get(i - 1), dif, m);
            double bar = 2 * (dif - dea);
            emasList.add(emas);
            emalList.add(emal);
            difList.add(dif);
            deaList.add(dea);
            barList.add(bar);
        }
    }

    private final int s;
    private final int l;
    private final int m;
    public ArrayList<Double> pList = new ArrayList<>();
    public ArrayList<Double> emasList = new ArrayList<>();
    public ArrayList<Double> emalList = new ArrayList<>();
    public ArrayList<Double> difList = new ArrayList<>();
    public ArrayList<Double> deaList = new ArrayList<>();
    public ArrayList<Double> barList = new ArrayList<>();
}
