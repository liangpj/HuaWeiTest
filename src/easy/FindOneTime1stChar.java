package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** �ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
 * �ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
 ��ϸ������
 �ӿ�˵��
 ԭ�ͣ�
 bool FindChar(char* pInputString, char* pChar);
 ���������
 char* pInputString���ַ���
 ���������ָ��ָ����ڴ�����֤��Ч����
 char* pChar����һ��ֻ����һ�ε��ַ�
 ����޴��ַ� �����'.'



 ֪ʶ��	�ַ���,ѭ��
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ����һ���ַ�
 ���
 ���һ���ַ�
 ��������	asdfasdfo
 �������	o
 */


public class FindOneTime1stChar {
    public static char findChar(String inputStr) {
        if (inputStr.length() == 0)
            return '.';
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputStr.length(); ++i) {
            char ch = inputStr.charAt(i);
            Integer count = map.get(ch);
            map.put(ch, count == null ? 1 : count+1);
        }

        for (int i = 0; i < inputStr.length(); ++i) {
            char ch = inputStr.charAt(i);
            Integer count = map.get(ch);
            if (count == 1)
                return ch;
        }
        return '.';
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(findChar(str));
    }
}
