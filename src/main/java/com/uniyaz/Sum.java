package com.uniyaz;



import java.util.Random;
import java.util.Scanner;

public class Sum {
    Scanner sc = new Scanner(System.in);
    Random random=new Random();

    public void matris() {


        System.out.println("Enter the number of matrix rows:");
        int line = sc.nextInt();
        System.out.println(" Enter the number of matrix rows:");
        int column=sc.nextInt();

        int[][] mat1=new int [line][column];
        int[][] mat2=new int [line][column];
        int[][] sum=new int [line][column];

        for(int i=0; i<line; i++){

            for (int j=0; j<column; j++){

                mat1[i][j]=random.nextInt(10);
                 System.out.println("Matris 1: ["+i+"]["+j+"]="+mat1[i][j]);
                mat2[i][j]=random.nextInt(10);
                System.out.println("Matris 2:["+i+"]["+j+"]="+mat2[i][j]);

                sum[i][j]=mat2[i][j] + mat1[i][j];

            }


        }
        System.out.println("Matrix Sums");
        System.out.println("*********************** ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }

    public void createMatris(){


    }




}
