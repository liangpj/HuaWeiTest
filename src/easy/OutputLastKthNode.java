package easy;

import java.util.Scanner;

/**
 * ������������е�����k�����
 *
 * ����һ��������������������е�����k����㣬����ĵ�����0�����Ϊ�����βָ�롣
 �����㶨�����£�
 struct ListNode
 {
 int       m_nKey;
 ListNode* m_pNext;
 };
 ��ϸ������
 �ӿ�˵��
 ԭ�ͣ�
 ListNode* FindKthToTail(ListNode* pListHead, unsignedint k);
 ���������
 ListNode* pListHead  ��������
 unsigned int k  ������k�����
 ���������ָ��ָ����ڴ�����֤��Ч����
 ��
 ����ֵ��
 �������ص�����k�����ָ�룬�쳣���ؿ�ָ��


 ֪ʶ��	����,����,ָ��
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ����˵��
 1 �������������
 2 ���������ֵ
 3 ����k��ֵ
 ���
 ���һ������
 ��������	8 1 2 3 4 5 6 7 8 4
 �������	4
 */


public class OutputLastKthNode {

    private class Node {
        int item;
        Node next;
    }

    private Node head, tail;
    private int size = 0;

    public void addItem(int data) {
        Node node = new Node();
        node.item = data;
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        ++size;
    }

    public Integer findKthToTail(int k) {
        int num = this.size - k;
        if (num < 0) return null;
        Node tmp = head;
        for (int i = 1; i < num && tmp != null; ++i) {
            tmp = tmp.next;
        }

        return tmp == null ? null : tmp.item;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        OutputLastKthNode tst = new OutputLastKthNode();
        for (int i = 0; i < N && in.hasNext(); ++i)
            tst.addItem(in.nextInt());
        int K = in.nextInt();
        System.out.println(tst.findKthToTail(K));

    }
}
