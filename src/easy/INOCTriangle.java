package easy;

import java.util.Scanner;

/**NOC��Ʒ��-������ǵı���
 1
 1  1  1
 1  2  3  2  1
 1  3  6  7  6  3  1
 1  4  10 16 19  16 10  4  1
 ���������ε����󣬵�һ��ֻ��һ����1������ÿ�е�ÿ��������ǡ������������������Ͻ��������Ͻǵ�����3����֮�ͣ����������ĳ��������Ϊ��������0����
 ���n�е�һ��ż�����ֵ�λ�á����û��ż���������-1����������3,�����2������4�����3��

 ����n(n <= 1000000000)<>

 public static  int run(int x)
 {
 return -1;
 }

 ֪ʶ��	�ַ���
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ����һ��int����
 ���
 ������ص�intֵ
 ��������	4
 �������	3
 */


public class INOCTriangle {

    private static int run(int n) {
        if (n <= 2)
            return -1;
        int [][] dp = new int[n][2*(n+1) - 1];
        dp[0][0] = 1;
        for (int i = 1; i < n; ++i) {
            for(int j = 0; j < 2*(i+1)-1; ++j) {
                if (j == 0) {
                    dp[i][j] = 1;
                }else {
                    int a, b , c = dp[i-1][j];
                    a  = j-2 < 0 ? 0 : dp[i-1][j-2];
                    b = j-1 < 0 ? 0 : dp[i-1][j-1];
                    dp[i][j] = a + b + c;
                }
            }
        }

//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < 2*(i+1)-1; ++j)
//                System.out.print(dp[i][j] + " ");
//            System.out.println();
//        }

        for (int i = 1; i < 2*(n+1)-1; ++i) {
            if (dp[n-1][i] % 2 == 0)
                return i+1;
        }
        return -1;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(run(n));
    }
}
