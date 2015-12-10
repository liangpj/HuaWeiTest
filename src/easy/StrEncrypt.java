package easy;


import java.util.Scanner;

/**

 题目描述
1、对输入的字符串进行加解密，并输出。

2加密方法为：
当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
其他字符不做变化。

3、解密方法为加密的逆过程。

接口描述：
    实现接口，每个接口实现1个基本操作：
void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
说明：
1、字符串以\0结尾。
2、字符串最长100个字符。

int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出
说明：
1、字符串以\0结尾。
    2、字符串最长100个字符。


知识点	字符串
运行时间限制	10M
内存限制	128
输入
输入说明
输入一串要加密的密码
输入一串加过密的密码
输出
输出说明
输出加密后的字符
输出解密后的字符
样例输入	abcdefg BCDEFGH
样例输出	BCDEFGH abcdefg
 */


public class StrEncrypt {

    public void encrypt(char aucPassword[], char aucResult[]) {
        int i = 0;
        for(; i < aucPassword.length && aucPassword[i] != '\0'; ++i) {
            char ch = aucPassword[i];
            if (Character.isLetter(ch)) {
                if ((ch == 'z') || (ch == 'Z')) {
                    aucResult[i] = (ch == 'z' ? 'A' : 'a');
                }
                else {
                    ch = (char)(ch + 1);
                    aucResult[i] = Character.isLowerCase(ch) ? Character.toUpperCase(ch)
                            : Character.toLowerCase(ch);
                }
            } else if (Character.isDigit(ch)) {
                if (ch == '9')
                    ch = '0';
                else
                    ch = (char)(ch + 1);
                aucResult[i] = ch;
            } else
                aucResult[i] = ch;
        }
        aucResult[i] = '\0';
    }

    public int unEncrypt (char result[], char password[]) {
        int i = 0;
        for(; i < result.length && result[i] != '\0'; ++i) {
            char ch = result[i];
            if (Character.isLetter(ch)) {
                if((ch == 'a') || (ch == 'A')) {
                    password[i] = (ch == 'a' ? 'Z' : 'z');
                }else {
                    ch = (char)(ch - 1);
                    password[i] = Character.isLowerCase(ch) ? Character.toUpperCase(ch) :
                            Character.toLowerCase(ch);
                }
            } else if (Character.isDigit(ch)) {
                if (ch == '0')
                    ch = '9';
                else
                    ch = (char)(ch - 1);
                password[i] = ch;
            } else
                password[i] = ch;
        }
        password[i++] = '\0';
        return i;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String [] str = new String[2];
        str[0] = in.next();
        str[1] = in.next();


        char [] aucResult = new char[100];
        char [] password = new char[100];
        StrEncrypt strEncrypt = new StrEncrypt();
        strEncrypt.encrypt(str[0].toCharArray(), aucResult);
        strEncrypt.unEncrypt(str[1].toCharArray(), password);

        for(int i = 0; aucResult[i] != '\0'; ++i)
            System.out.print(aucResult[i]);
        System.out.println();

        for(int i = 0; password[i] != '\0'; ++i)
            System.out.print(password[i]);
        System.out.println();

    }
}
