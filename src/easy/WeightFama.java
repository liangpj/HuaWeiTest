package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** ������
 * ����һ�����룬����������ȣ��ֱ�Ϊm1��m2����mn�����ǿ�ȡ����������ֱ�Ϊx1��x2����xn������Ҫ����Щ����ȥ����������������ܳƳ������в�ͬ��������

 ע��
 ������������0
 Ҫ���������ݽ���У��

 ����ԭ�ͣ�public static int fama(int n, int[] weight, int[] nums)

 ֪ʶ��	�ַ���,ѭ��,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
 ����ʱ������	10M
 �ڴ�����	128
 ����
 int n��n��ʾ�ж�����������ͬ�����룬1<=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<>
 int[] weight����ʾn�������������1<=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<>
 int[] num����ʾn����������������1<=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<>

 ���
 ���ø�����������ԳƳ��Ĳ�ͬ��������
 ��������	2 1 2 2 1
 �������	5
 */


public class WeightFama {

    public static int fama(int n, int[] weight, int[] nums){
        int [] dp = new int[100000];
        int index = 1, beg, end = 0;

        for (int i = 0; i < n; ++i) {
            int w = weight[i];
            for (int j = 0; j < nums[i]; ++j) {
                beg = (j == 0 ? 0 : end);
                end = index;
                for (int k = beg; k < end; ++k) {
                    dp[index++] = dp[k] + w;
                }
            }
        }

        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < index; ++i)
            res.add(dp[i]);

        return res.size() == 0 ? 1 : res.size();
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] weight = new int[n];
        int [] num = new int[n];

        for (int i = 0; i < n && in.hasNext(); ++i)
            weight[i] = in.nextInt();
        for (int i = 0; i < n && in.hasNext(); ++i) {
            num[i] = in.nextInt();
        }


        System.out.println(fama(n, weight, num));
    }
}
