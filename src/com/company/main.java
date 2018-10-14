package com.company;

public class main {
    public static void main(String[] args){
        System.out.println("初始化矩阵：");
        Matrix x1 = new Matrix(3,3);//创建一个3*3的矩阵。
        Matrix.print(x1);//打印一下初始化的矩阵
        System.out.println("矩阵x1：");
        x1.set();//给x1输入值
        Matrix.print(x1);//打印一下录入完后的x1.
        Matrix x2 = Matrix.transpose(x1);//转置x1
        System.out.println("转置矩阵x2：");
        Matrix.print(x2);//打印确认一遍。
//        System.out.println("x1 isTriangular:"+Matrix.isTriangular(x1));//测试不是对角阵。
//        System.out.println("重新设置x1测试上三角：");
//        x1.set();//重新设置x1，测试isTriangle()
//        System.out.println("x1 isTriangular:"+Matrix.isTriangular(x1));;//测试是对角阵的情况。
//        x1.add(x2);
//        System.out.println("测试add方法： 注:打印的是x1矩阵");
        Matrix x3;
        x3=x1.puls(x2);
        System.out.println("测试plus方法x1+x2： 注:先打印的是x1矩阵，确认没修改x1");
        Matrix.print(x1);
        System.out.println("测试plus方法x1+x2： 注:再打印的是x3矩阵");
        Matrix.print(x3);
    }

}
