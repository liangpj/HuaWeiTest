package easy;

import java.util.Scanner;

/**���߳�
 * ������������4���̺߳�1���������ַ����顣�߳�1�Ĺ��ܾ������������A���߳�2�Ĺ��ܾ������ַ����B���߳�3�Ĺ��ܾ������������C���߳�4�Ĺ��ܾ������������D��Ҫ��˳�������鸳ֵABCDABCDABCD��ABCD�ĸ������̺߳���1�Ĳ���ָ����[ע��C����ѡ�ֿ�ʹ��WINDOWS SDK�⺯��]
 �ӿ�˵����
 void init();  //��ʼ������
 void Release(); //��Դ�ͷź���
 unsignedint__stdcall ThreadFun1(PVOID pM)  ; //�̺߳���1������һ��int���͵�ָ��[ȡֵ��Χ��1 �C 250������������֤]�����ڳ�ʼ�����A��������Դ��Ҫ�߳��ͷ�
 unsignedint__stdcall ThreadFun2(PVOID pM)  ;//�̺߳���2���޲�������
 unsignedint__stdcall ThreadFun3(PVOID pM)  ;//�̺߳���3���޲�������
 Unsigned int __stdcall ThreadFunc4(PVOID pM);//�̺߳���4���޲�������
 char  g_write[1032]; //�߳�1,2,3,4��˳��������鸳ֵ�����ÿ��������Ƿ�Խ�磬����������֤
 ֪ʶ��	�ַ���,ѭ��,����,����,ջ,����,����,����,��,ͼ,����,����,ָ��,ö��,λ����,�ṹ��,������,�ļ�����,�ݹ�
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ����һ��int����
 ���
 ������ABCD
 ��������	10
 �������	ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD
 */

public class MultiThread {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; ++i)
            System.out.print("ABCD");
        System.out.println();
    }
}
