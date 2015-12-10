package easy;


import java.util.Scanner;


/**
 *��һ�ּ��ɿ��Զ����ݽ��м��ܣ���ʹ��һ��������Ϊ�����ܳס����������Ĺ���ԭ��
 * ���ȣ�ѡ��һ��������Ϊ�ܳף���TRAILBLAZERS����������а������ظ�����ĸ��
 * ֻ������1�������༸�����������ڣ��޸Ĺ����Ǹ�����������ĸ������棬������ʾ��
 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 ������������ĸ����ʣ�����ĸ����������ڶ���Ϣ���м���ʱ����Ϣ�е�ÿ����ĸ���̶��ڶ������У�
 �����������еĶ�Ӧ��ĸһһȡ��ԭ�ĵ���ĸ(��ĸ�ַ��Ĵ�Сд״̬Ӧ�ñ���)��
 ��ˣ�ʹ������ܳף�Attack AT DAWN(����ʱ����)�ͻᱻ����ΪTpptad TP ITVH��
 ��ʵ�������ӿڣ�ͨ��ָ�����ܳ׺����ĵõ����ġ�
 ��ϸ������
 �ӿ�˵��
 ԭ�ͣ�
 voidencrypt(char * key,char * data,char * encrypt);
 ���������
 char * key���ܳ�
 char * data������
 ���������
 char * encrypt������
 ����ֵ��
 void


 ֪ʶ��	�ַ���
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ������key��Ҫ���ܵ��ַ���
 ���
 ���ؼ��ܺ���ַ���
 ��������	nihao ni
 �������	le
 */


public class StrEncrpt2 {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String strKey = in.nextLine();
        String data = in.nextLine();

        boolean [] used = new boolean[26];
        int [] key = new int[26];
        StringBuilder stringBuilder = new StringBuilder();

        int index = 0;
        for(int i = 0; i < strKey.length(); ++i) {
            if (!Character.isLetter(strKey.charAt(i)))
                continue;
            int ch = strKey.charAt(i) - 'a';
            if (used[ch]) {
                continue;
            }
            used[ch] = true;
            key[index++] = ch;
        }

        for (int i = 0; i < used.length; ++i) {
            if (!used[i])
                key[index++] = i;
        }

        for(int i = 0; i < data.length(); ++i) {
            char ch = data.charAt(i);
            int encryIndex = Character.toLowerCase(ch) - 'a';
            char encry = (char) ((Character.isLowerCase(ch) ? 'a' : 'A') + key[encryIndex]);
            stringBuilder.append(encry);
        }

        System.out.println(stringBuilder.toString());
    }
}
