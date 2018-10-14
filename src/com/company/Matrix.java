package com.company;


import java.util.Scanner;

public class Matrix {
    public int[][] members;
    public int rownum;
    public int colunum;

    public Matrix(int i, int j) {
        this.rownum = i;
        this.colunum = j;
        this.members = new int[i][j];
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                members[x][y] = 0;//新建的矩阵全部赋初值0
            }
        }
    }

    public Matrix(Matrix a){//深拷贝构造方法
        this.rownum=a.rownum;
        this.colunum=a.colunum;
        this.members = new int[a.rownum][a.colunum];
        for (int i = 0; i < this.rownum; i++) {
            for (int j = 0; j < this.colunum; j++) {
                this.members[i][j]+=a.members[i][j];
            }
        }
    }
    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入" + rownum + "行" + colunum + "列的矩阵,每次输入一行数据");
        for (int i = 0; i < rownum; i++) {
            for (int j = 0; j < colunum; j++) {
                members[i][j] = sc.nextInt();
            }
        }
    }

    public static void print(Matrix X) {
        for (int i = 0; i < X.rownum; i++) {
            for (int j = 0; j < X.colunum; j++) {
                System.out.print(X.members[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static Matrix transpose(Matrix X) {
        Matrix X1 = new Matrix(X.colunum, X.rownum);
        for (int i = 0, i1 = 0; i < X.rownum; i++, i1++) {//i1是新矩阵的列。
            for (int j = 0, j1 = 0; j < X.colunum; j++, j1++) {//j1表示新矩阵的行。
                X1.members[j1][i1] = X.members[i][j];
            }
        }
        return X1;
    }

    public static boolean isTriangular(Matrix X) {
        for (int i = 0, j = 0; i < X.rownum; i++, j++) {
            for (int k = 0; k < j; k++) {
                if (X.members[i][k] != 0)
                    return false;
            }
        }
        return true;
    }

    public void add(Matrix b) {
        if (this.rownum != b.rownum || this.colunum != b.colunum) {
            System.out.println("行列数不相同无法相加。");
            return;
        }
        for (int i = 0; i < this.rownum; i++) {
            for (int j = 0; j < this.colunum; j++) {
                this.members[i][j]+=b.members[i][j];
            }
        }
    }
    public Matrix puls(Matrix b){
        if (this.rownum != b.rownum || this.colunum != b.colunum) {
            System.out.println("行列数不相同无法相加。");
            return null;
        }
        Matrix c= new Matrix(this);
        for (int i = 0; i < c.rownum; i++) {
            for (int j = 0; j < c.colunum; j++) {
                c.members[i][j]+=b.members[i][j];
            }
        }
        return c;
    }
}
