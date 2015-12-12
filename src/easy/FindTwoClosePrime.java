package easy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 查找组成一个偶数最接近的两个素数
 *
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对
 请实现如下接口
 public static class PrimePair
 {
 public int primeMin;
 public int primeMax;
 }
 public static PrimePair findPrimeNumber(int number)
 {
 ///请实现
        return null;
 }
 譬如：输入20 ，输出 7 13

 约束
 number为输入的偶数，5 < inum <= 10000

知识点	循环
运行时间限制	10M
内存限制	128
输入
输入一个偶数
输出
输出两个素数
样例输入	20
样例输出	7 13
 */

public class FindTwoClosePrime {

    public class PrimePair implements Comparable{

        private int primeMin;
        private int primeMax;
        private int diff;

        PrimePair(int min, int max) {
            primeMin = min;
            primeMax = max;
            diff = max - min;
        }

        @Override
        public int compareTo(Object o) {
            return this.diff - ((PrimePair) o).diff;
        }
    }
    ArrayList<PrimePair> arr = new ArrayList<>();

    public int [] findPrimeNumber(int number) {
        int [] res = new int[2];

        for (int i = 3; i <= number/2; ++i) {
            if (isPrime(i) && isPrime(number - i))
                arr.add(new PrimePair(i, number-i));
        }

        Collections.sort(arr);
        PrimePair resPair = arr.get(0);
        res[0] = resPair.primeMin;
        res[1] = resPair.primeMax;
        return res;
    }

    private  boolean isPrime(int n) {
        for (int i = 2; i <= (int)Math.sqrt(n); ++i)
            if (n % i == 0)
                return false;
        return true;
    }


    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        FindTwoClosePrime tst = new FindTwoClosePrime();
        int [] res = tst.findPrimeNumber(number);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
