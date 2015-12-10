package easy;

import java.util.*;

/**
 * 名字漂亮度
 *
 **描述
 * 给出一个名字，该名字有26个字符串组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
  每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个字母拥有相同的“漂亮度”。字母忽略大小写。
  给出多个名字，计算每个名字最大可能的“漂亮度”。
 ** Input: 整数N，后续N个名字N个字符串，每个表示一个名字
 ** Ouput: 每个名称可能的最大漂亮程度
 *
 * 样例： input: 2 zhangsan lisi  output: 192 101
 */

public class NameBeauty {
    // 使用库函数会报错。
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
