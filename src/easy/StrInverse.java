package easy;

import java.util.Scanner;

/**
 * ��һ���ַ���str�����ݵߵ��������������str�ĳ��Ȳ�����100���ַ��� �磺���롰I am a student���������tneduts a ma I����

 ���������
 inputString��������ַ���


 ����ֵ��
 ���ת���õ������ַ���


 ֪ʶ��	�ַ���
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ����һ���ַ����������пո�
 ���
 ���������ַ���
 ��������	I am a student
 �������	tneduts a ma I
 */

public class StrInverse {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i = str.length()-1; i >=0; --i) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
