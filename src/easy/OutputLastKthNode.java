package easy;

import java.util.Scanner;

/**
 * 输出单向链表中倒数第k个结点
 *
 * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第0个结点为链表的尾指针。
 链表结点定义如下：
 struct ListNode
 {
 int       m_nKey;
 ListNode* m_pNext;
 };
 详细描述：
 接口说明
 原型：
 ListNode* FindKthToTail(ListNode* pListHead, unsignedint k);
 输入参数：
 ListNode* pListHead  单向链表
 unsigned int k  倒数第k个结点
 输出参数（指针指向的内存区域保证有效）：
 无
 返回值：
 正常返回倒数第k个结点指针，异常返回空指针


 知识点	链表,查找,指针
 运行时间限制	10M
 内存限制	128
 输入
 输入说明
 1 输入链表结点个数
 2 输入链表的值
 3 输入k的值
 输出
 输出一个整数
 样例输入	8 1 2 3 4 5 6 7 8 4
 样例输出	4
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
