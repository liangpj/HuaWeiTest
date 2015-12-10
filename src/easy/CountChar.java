package easy;

import java.util.Scanner;

/**输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。

 //
 * 统计出英文字母字符的个数。
 *
 * str 需要输入的字符串
 * @ return 英文字母的个数
//
public static int getEnglishCharCount(String str)
        {
        return 0;
        }

//
 * 统计出空格字符的个数。
 *
 * @ param str 需要输入的字符串
 * @ return 空格的个数
//
public static int getBlankCharCount(String str)
        {
        return 0;
        }

//
 * 统计出数字字符的个数。
 *
 * @ param str 需要输入的字符串
 * @ return 英文字母的个数
//
public static int getNumberCharCount(String str)
        {
        return 0;
        }

//
 * 统计出其它字符的个数。
 *
 * @ param str 需要输入的字符串
 * @ return 英文字母的个数
//
public static int getOtherCharCount(String str)
        {
        return 0;
        }


        知识点	字符串
        运行时间限制	10M
        内存限制	128
        输入
        输入一行字符串，可以有空格
        输出
        统计其中英文字符，空格字符，数字字符，其他字符的个数
        样例输入	1qazxsw23 edcvfr45tgbn hy67uj m,ki89ol.\\/;p0-=\\][
        样例输出	26 3 10 12
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
