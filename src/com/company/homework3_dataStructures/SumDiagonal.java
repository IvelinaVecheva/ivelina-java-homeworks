package com.company.homework3_dataStructures;

public class SumDiagonal {
    public static void main(String args[]){
        int sum = 0;
        int[][] arr=new int[4][4];//4 row and 4 column
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[0][3]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[1][3]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        arr[2][3]=9;
        arr[3][0]=7;
        arr[3][1]=8;
        arr[3][2]=9;
        arr[3][3]=9;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==j)
                    sum+= arr[i][j];

            }
        }
        System.out.println(sum);
    }

}
