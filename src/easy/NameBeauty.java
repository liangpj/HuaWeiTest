package easy;

import java.util.*;

/**
 * ����Ư����
 *
 **����
 * ����һ�����֣���������26���ַ�����ɣ���������ַ����ġ�Ư���ȡ�����������ĸ��Ư���ȡ����ܺ͡�
  ÿ����ĸ����һ����Ư���ȡ�����Χ��1��26֮�䡣û���κ�������ĸӵ����ͬ�ġ�Ư���ȡ�����ĸ���Դ�Сд��
  ����������֣�����ÿ�����������ܵġ�Ư���ȡ���
 ** Input: ����N������N������N���ַ�����ÿ����ʾһ������
 ** Ouput: ÿ�����ƿ��ܵ����Ư���̶�
 *
 * ������ input: 2 zhangsan lisi  output: 192 101
 */

public class NameBeauty {
    // ʹ�ÿ⺯���ᱨ��
    private static String tolowCase(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                ch = (char)(ch + 32);
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    private static int beauty(String str) {
        int bty = 0;
        int [] times = new int[26];
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch))
                ++times[ch-'a'];
        }
        Arrays.sort(times);
        int k = 26;
        for (int i = times.length-1; i >= 0; --i) {
            if (times[i] == 0)
                break;
            bty += times[i] * (k--);
        }
        return bty;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String [] str = new String[N];
        for (int i = 0; i < N && in.hasNext(); ++i)
            str[i] = tolowCase(in.next());
        for (int i = 0; i < N; ++i)
            System.out.println(beauty(str[i]));
    }
}
