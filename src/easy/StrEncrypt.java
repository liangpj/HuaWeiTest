package easy;


import java.util.Scanner;

/**

 ��Ŀ����
1����������ַ������мӽ��ܣ��������

2���ܷ���Ϊ��
��������Ӣ����ĸʱ���ø�Ӣ����ĸ�ĺ�һ����ĸ�滻��ͬʱ��ĸ�任��Сд,����ĸaʱ���滻ΪB����ĸZʱ���滻Ϊa��
������������ʱ��Ѹ����ּ�1����0�滻1��1�滻2��9�滻0��
�����ַ������仯��

3�����ܷ���Ϊ���ܵ�����̡�

�ӿ�������
    ʵ�ֽӿڣ�ÿ���ӿ�ʵ��1������������
void Encrypt (char aucPassword[], char aucResult[])���ڸú�����ʵ���ַ������ܲ����
˵����
1���ַ�����\0��β��
2���ַ����100���ַ���

int unEncrypt (char result[], char password[])���ڸú�����ʵ���ַ������ܲ����
˵����
1���ַ�����\0��β��
    2���ַ����100���ַ���


֪ʶ��	�ַ���
����ʱ������	10M
�ڴ�����	128
����
����˵��
����һ��Ҫ���ܵ�����
����һ���ӹ��ܵ�����
���
���˵��
������ܺ���ַ�
������ܺ���ַ�
��������	abcdefg BCDEFGH
�������	BCDEFGH abcdefg
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
