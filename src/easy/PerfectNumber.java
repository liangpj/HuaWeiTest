package easy;

import java.util.Scanner;

/**
 * ��������

 ����
 �������ֵĶ����ǣ����һ�����ֿ��Ա�2,3,5ͬʱ��������������־���һ���������֣�����30,60��
 ����һ��������[a,b]������������ڵ��������ֵĸ���
 ֪ʶ��	ѭ��
 ����ʱ������	������
 �ڴ�����	������
 ����
 �������������Կո��������֤����ĵ�һ������С�ڵ��ڵڶ������֣��Ҷ�С��10000
 ���
 һ��������Ϊ��������ڵ��������ָ���
 ��������
 30 60
 �������
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


