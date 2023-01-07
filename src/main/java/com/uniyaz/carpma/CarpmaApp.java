package com.uniyaz.carpma;

import com.uniyaz.util.MatrisUtil;

public class CarpmaApp {
    public static void main(String[] args) {
        MatrisUtil mUtil=new MatrisUtil();
        int firstMatris[][] = {{1,2,1},{3,4,2},{5,6,3}};
        int secondMatris[][] = {{3,5,2},{1,5,4},{3,1,1}};
        mUtil.writeMatris(mUtil.carpımMatris(firstMatris,secondMatris));
    }
}
