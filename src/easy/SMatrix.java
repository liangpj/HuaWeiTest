package easy;

import java.util.Scanner;

/**
 ��Ŀ˵��
 ���ξ�������1��ʼ����Ȼ���������гɵ�һ�������������Ρ�

 ��������
 5
 �������
 1 3 6 10 15
 2 5 9 14
 4 8 13
 7 12
 11
 �ӿ�˵��
 ԭ��
 void GetResult(int Num, char * pResult);
 ���������
 int Num�������������N
 ���������
 int * pResult��ָ�������ξ�����ַ���ָ��
 ָ��ָ����ڴ�����֤��Ч
 ����ֵ��
 void


 ֪ʶ��	����
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ����������N��N������100��

 ���
 ���һ��N�е����ξ���

 ��������	4
 �������	1 3 6 10 2 5 9 4 8 7
 */

public class SMatrix {

    private static void getResult(int Num, int [][] arr) {
//        int [][] arr = new int[Num][Num];
        arr[0][0] = 1;

        int i = 1;
        for(int row = 1; row <= Num; ++row) {
            int j = row-1;
            for(int k = 0; k < row; ++k)
                arr[j--][k] = i++;
        }

    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int Num = in.nextInt();
        int [][] result = new int[Num][Num];
        getResult(Num, result);

        for(int i = 0; i < Num; ++i) {
            for(int j = 0; j < Num-i; ++j) {
                System.out.print(result[i][j]);
                if (j != Num-i-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
