package easy;

import java.util.Scanner;

/**����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����

 //
 * ͳ�Ƴ�Ӣ����ĸ�ַ��ĸ�����
 *
 * str ��Ҫ������ַ���
 * @ return Ӣ����ĸ�ĸ���
//
public static int getEnglishCharCount(String str)
        {
        return 0;
        }

//
 * ͳ�Ƴ��ո��ַ��ĸ�����
 *
 * @ param str ��Ҫ������ַ���
 * @ return �ո�ĸ���
//
public static int getBlankCharCount(String str)
        {
        return 0;
        }

//
 * ͳ�Ƴ������ַ��ĸ�����
 *
 * @ param str ��Ҫ������ַ���
 * @ return Ӣ����ĸ�ĸ���
//
public static int getNumberCharCount(String str)
        {
        return 0;
        }

//
 * ͳ�Ƴ������ַ��ĸ�����
 *
 * @ param str ��Ҫ������ַ���
 * @ return Ӣ����ĸ�ĸ���
//
public static int getOtherCharCount(String str)
        {
        return 0;
        }


        ֪ʶ��	�ַ���
        ����ʱ������	10M
        �ڴ�����	128
        ����
        ����һ���ַ����������пո�
        ���
        ͳ������Ӣ���ַ����ո��ַ��������ַ��������ַ��ĸ���
        ��������	1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][
        �������	26 3 10 12
 */


public class CountChar {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int charNum = 0, spaceNum = 0, digitNum = 0, other = 0;

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch))
                ++charNum;
            else if (ch == ' ')
                ++spaceNum;
            else if (Character.isDigit(ch))
                ++digitNum;
            else
                ++other;
        }

        System.out.println(charNum);
        System.out.println(spaceNum);
        System.out.println(digitNum);
        System.out.println(other);

    }
}
