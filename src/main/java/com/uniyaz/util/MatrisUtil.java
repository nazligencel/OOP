package com.uniyaz.util;

import java.util.Random;
import java.util.Scanner;

public  class MatrisUtil {

    Scanner sc=new Scanner(System.in);

    public int[][] createRandomMatris(int line, int column){

        int[][] mat1=new int [line][column];

        for(int i=0; i<line; i++){

            for (int j=0; j<column; j++){
                Random random=new Random();
                mat1[i][j]=random.nextInt(10) ;
                //System.out.println(mat1[i][j] +" ");

            }
        }
        for(int i=0; i<line; i++){

            for (int j=0; j<column; j++){
                System.out.print(mat1[i][j] +" ");
            }
            System.out.println();
        }

        return mat1;
    }

    public int[][] createMatris(int line, int column){

        int[][] mat1=new int [line][column];

        for(int i=0; i<line; i++){

            for (int j=0; j<column; j++){
                Random random=new Random();
                mat1[i][j]=random.nextInt(1) +1;
                System.out.print(mat1[i][j] +" ");
                int randomSayi=random.nextInt(8);
                System.out.print(" ");
            }
            System.out.println();

        }
        return mat1;
    }



    public void writeMatris(int deger[][]){
        for(int i=0; i<deger.length; i++){
            for(int j=0; j<deger[0].length; j++){
                System.out.print(deger[i][j] + " ");

            }
            System.out.println();

        }


    }


    public int[][] toplamMatris(int [][] mat1, int [][] mat2){
        System.out.println("***************************");
        int row = mat1.length; //row
        int col = mat1[0].length; //column
        int [][] toplam=new int[row][col];
        for(int i=0; i<row; i++){

            for (int j=0; j<col; j++){

                toplam[i][j]=mat1[i][j]+mat2[i][j];

            }

        }
        return toplam;
    }


    public int[][] carpımMatris(int [][] mat1, int [][] mat2){
        int row = mat1.length; //row
        int col = mat1[0].length; //column
        int [][] carpim=new int[row][col];
        for(int i=0; i<row; i++){

            for (int j=0; j<col; j++){

                carpim[i][j]=carpim[i][j] + mat1[i][j]*mat2[i][j];

            }

        }
        return carpim;
    }

    public int move(int [][] a, int b){
        int x=0,y=0;
        System.out.print("Kordinat X : ");
        x = sc.nextInt();
        System.out.print("Kordinat Y : ");
        y = sc.nextInt();
        if(b != 0 && x!=0 && y!=0) {

        }
        return 0;
    }



}
