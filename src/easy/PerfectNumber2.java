package easy;

import java.util.Scanner;

/** iNOC��Ʒ��--��ȫ������
 * ��ȫ����Perfect number�����ֳ����������걸������һЩ�������Ȼ����
 �����е������ӣ����������������Լ�����ĺͣ������Ӻ�������ǡ�õ���������
 ���磺28������Լ��1��2��4��7��14��28����ȥ������28�⣬����5������ӣ�1+2+4+7+14=28��
 ��������count(int n),���ڼ���n����(��n)��ȫ���ĸ��������㷶Χ, 0 < n <= 500000
 ����n������ȫ���ĸ������쳣�������-1


 *
 * ��ȫ����Perfect number�����ֳ����������걸������һЩ�������Ȼ����
 * �����е������ӣ����������������Լ�����ĺͣ������Ӻ�������ǡ�õ���������
 * ���磺28������Լ��1��2��4��7��14��28����ȥ������28�⣬����5������ӣ�1+2+4+7+14=28��
 *
 * ��������count(int n),���ڼ���n����(��n)��ȫ���ĸ���
 * @ param n ���㷶Χ, 0 < n <= 500000
 * @ return n������ȫ���ĸ���, �쳣�������-1
 *

public static int count(int n)


        ֪ʶ��	�ַ���
        ����ʱ������	10M
        �ڴ�����	128
        ����
        ����һ������
        ���
        �����ȫ���ĸ���
        ��������	1000
        �������	3
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
