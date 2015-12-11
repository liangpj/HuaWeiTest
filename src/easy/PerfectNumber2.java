package easy;

import java.util.Scanner;

/** iNOC产品部--完全数计算
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 给定函数count(int n),用于计算n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
 返回n以内完全数的个数。异常情况返回-1


 *
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 *
 * 给定函数count(int n),用于计算n以内(含n)完全数的个数
 * @ param n 计算范围, 0 < n <= 500000
 * @ return n以内完全数的个数, 异常情况返回-1
 *

public static int count(int n)


        知识点	字符串
        运行时间限制	10M
        内存限制	128
        输入
        输入一个数字
        输出
        输出完全数的个数
        样例输入	1000
        样例输出	3
 */



public class PerfectNumber2 {

    private static boolean isPerfect(int n) {
        if (n < 5)
            return false;
        int  [] arr = new int[n/2];
        int index = 0;
        for (int i = 2; i <= n/2; ++i) {
            if (n % i == 0)
                arr[index++] = i;
        }

        int sum = 1;
        for (int i = 0; i < index; ++i)
            sum += arr[i];

        return sum == n;
    }

    public static int count(int n) {
        if (n <= 0 || n > 500000)
            return -1;
        int count = 0;
        for (int i = 5; i <= n; ++i) {
            if (isPerfect(i))
                ++count;
        }
        return count;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(count(n));
    }
}
