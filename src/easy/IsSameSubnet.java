package easy;


import java.util.Scanner;

/**�ж�����IP�Ƿ�����ͬһ����
 *
 ���������������ж�������̨�������IP��ַ�Ƿ�����ͬһ������ĸ��ݡ�
 ����������IP��ַ�ṹ��ͬ����32λ������������������Ų���ȫΪ��1���������Ų���ȫΪ��0��������������������ж���̨�����Ƿ���ͬһ�����С�����̨������IP��ַ�ֱ������ǵ����������ࡰ�롱��Ľ����ͬ����˵������̨������ͬһ�����С�
 ʾ����
 I P ��ַ�� 192.168.0.1
 �������롡 255.255.255.0
 ת��Ϊ�����ƽ������㣺
 I P ��ַ��11010000.10101000.00000000.00000001
 �������롡11111111.11111111.11111111.00000000
 AND����
 ��������11000000.10101000.00000000.00000000
 ת��Ϊʮ���ƺ�Ϊ��
 ��������192.168.0.0

 I P ��ַ�� 192.168.0.254
 �������롡 255.255.255.0

 ת��Ϊ�����ƽ������㣺
 I P ��ַ��11010000.10101000.00000000.11111110
 �������롡11111111.11111111.11111111.00000000
 AND����
 ����������11000000.10101000.00000000.00000000
 ת��Ϊʮ���ƺ�Ϊ��
 ����������192.168.0.0
 ͨ�����϶���̨�����IP��ַ�����������AND��������ǿ��Կ�������������һ���ġ���Ϊ192.168.0.0���������̨���������Ϊ��ͬһ�����硣
 /*
 * ����: �ж���̨�����IP��ַ��ͬһ�����硣
 * ���������    String Mask: �������룬��ʽ����255.255.255.0����
 *               String ip1: �����1��IP��ַ����ʽ����192.168.0.254����
 *               String ip2: �����2��IP��ַ����ʽ����192.168.0.1����
 *
 * ����ֵ��      0��IP1��IP2����ͬһ�����磻     1��IP��ַ�����������ʽ�Ƿ���    2��IP1��IP2������ͬһ������
 *
public int checkNetSegment(String mask, String ip1, String ip2)
        {
    //������ʵ�ֹ���
        return 0;
        }

        ֪ʶ��	�ַ���
        ����ʱ������	10M
        �ڴ�����	128
        ����
        �����������롢����ip��ַ
        ���
        �õ�������
        ��������	255.255.255.0 192.168.224.256 192.168.10.4
        �������	1

 **/

public class IsSameSubnet {

    //�ж�IP��ַ�Ƿ�Ϸ�
    private static boolean isValid(int [] ip, boolean mask) {
        if (mask) {
            if (ip[0] != 255)
                return false;
            for (int i = 1; i < 4; ++i) {
                if (!(ip[i] >= 0 && ip[i] <= 255))
                    return false;
            }
        } else{
            for (int i = 0; i < 4; ++i) {
                if (!(ip[i] >= 0 && ip[i] < 255))
                    return false;
            }
        }
        return true;
    }
    private static int [] strToIP(String str) {
        int [] num = new int[4];
        int digit = 0, index = 0;
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digit = digit * 10 + ch - '0';
            } else if (ch == '.') {
                num[index++] = digit;
                digit = 0;
            }
        }
        num[index] = digit;
        return num;
    }

    public static int checkNetSegment(String mask, String ip1, String ip2) {

        int [] maskIp = strToIP(mask);
        int [] ip1Addr = strToIP(ip1);
        int [] ip2Addr = strToIP(ip2);
        int [] res1 = new int[4];
        int [] res2 = new int[4];
        if (!(isValid(maskIp, true) && isValid(ip1Addr, false)
                && isValid(ip2Addr, false)))
            return 1;

        for (int i = 0; i < 4; ++i) {
            res1[i] = maskIp[i] & ip1Addr[i];
            res2[i] = maskIp[i] & ip2Addr[i];
            if (res1[i] != res2[i])
                return 2;
        }
        return 0;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String mask = in.next();
        String ip1 = in.next();
        String ip2 = in.next();

        System.out.println(checkNetSegment(mask, ip1, ip2));
    }
}


