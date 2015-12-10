package easy;

import java.util.Scanner;

/**
 题目说明
 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。

 样例输入
 5
 样例输出
 1 3 6 10 15
 2 5 9 14
 4 8 13
 7 12
 11
 接口说明
 原型
 void GetResult(int Num, char * pResult);
 输入参数：
 int Num：输入的正整数N
 输出参数：
 int * pResult：指向存放蛇形矩阵的字符串指针
 指针指向的内存区域保证有效
 返回值：
 void


 知识点	数组
 运行时间限制	10M
 内存限制	128
 输入
 输入正整数N（N不大于100）

 输出
 输出一个N行的蛇形矩阵。

 样例输入	4
 样例输出	1 3 6 10 2 5 9 4 8 7
 */

public class SMatrix {

    private static void getResult(int Num, int [][] arr) {
//        int [][] arr = new int[Num][Num];
        arr[0][0] = 1;

        int i = 1;
        for(int row = 1; row <= Num; ++row) {
            int j = row-1;
            for(int k = 0; k < row; ++k)
                arr[j--][k] = i++;
        }

    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int Num = in.nextInt();
        int [][] result = new int[Num][Num];
        getResult(Num, result);

        for(int i = 0; i < Num; ++i) {
            for(int j = 0; j < Num-i; ++j) {
                System.out.print(result[i][j]);
                if (j != Num-i-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
