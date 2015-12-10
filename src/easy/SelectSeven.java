package easy;

import java.util.Scanner;

/**
*（练习用）挑7
 **描述
 输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）的个数

 输入
 一个正整数N。(N不大于30000)
 输出
 不大于N的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.
 样例输入	20
 样例输出	3
 */

public class SelectSeven {

    private static boolean isSeven(int num) {
        if (num % 7 == 0)
            return true;

        while(num != 0) {
            int digit = num % 10;
            if (digit != 0 && digit % 7 == 0)
                return true;
            num /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        for (int i = 7; i <= N; ++i)
            if (isSeven(i))
                ++count;
        System.out.println(count);
    }

}

