package com.uniyaz.toplama;

import com.uniyaz.util.MatrisUtil;

public class ToplamApp {
    public static void main(String[] args) {
        MatrisUtil mUtil=new MatrisUtil();


        mUtil.createRandomMatris(3,3);
        //int secondMatris[][]= mUtil.createRandomMatris(3,3);
        int firstMatris[][] = {{1,2,1},{3,4,2},{5,6,3}};
        int secondMatris[][] = {{3,5,2},{1,5,4},{3,1,1}};
        //mUtil.writeMatris(firstMatris);
        mUtil.writeMatris(mUtil.toplamMatris(firstMatris,secondMatris));






    }
}
