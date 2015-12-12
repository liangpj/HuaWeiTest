package easy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * �������һ��ż����ӽ�����������
 *
 * ����һ��ż��������2����������2��������ɣ����ż����2�������кܶ������������ĿҪ��������ָ��ż��������������ֵ��С��������
 ��ʵ�����½ӿ�
 public static class PrimePair
 {
 public int primeMin;
 public int primeMax;
 }
 public static PrimePair findPrimeNumber(int number)
 {
 ///��ʵ��
        return null;
 }
 Ʃ�磺����20 ����� 7 13

 Լ��
 numberΪ�����ż����5 < inum <= 10000

֪ʶ��	ѭ��
����ʱ������	10M
�ڴ�����	128
����
����һ��ż��
���
�����������
��������	20
�������	7 13
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
