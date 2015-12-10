package easy;

import java.util.Scanner;

/**
*����ϰ�ã���7
 **����
 ���7�й����ֵĸ���������7�ı��������а���7�����֣���17��27��37...70��71��72��73...���ĸ���

 ����
 һ��������N��(N������30000)
 ���
 ������N����7�йص����ָ�������������20����7�йص����ְ���7,14,17.
 ��������	20
 �������	3
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

