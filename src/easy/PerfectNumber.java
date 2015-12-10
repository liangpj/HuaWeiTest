package easy;

import java.util.Scanner;

/**
 * 完美数字

 描述
 完美数字的定义是：如果一个数字可以被2,3,5同时整除，那这个数字就是一个完美数字，比如30,60。
 给定一个闭区间[a,b]，求这个区间内的完美数字的个数
 知识点	循环
 运行时间限制	无限制
 内存限制	无限制
 输入
 两个正整数，以空格隔开，保证输入的第一个数字小于等于第二个数字，且都小于10000
 输出
 一个整数，为这个区间内的完美数字个数
 样例输入
 30 60
 样例输出
 2
 */


public class PerfectNumber {

    private static boolean isPerfect(int num) {
        return num % 2 == 0 && num % 3 == 0 && num % 5 == 0;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int beg = in.nextInt();
        int end = in.nextInt();
        int count = 0;
        for(int i = beg; i <= end; ++i)
            if (isPerfect(i))
                ++count;
        System.out.println(count);
    }
}


