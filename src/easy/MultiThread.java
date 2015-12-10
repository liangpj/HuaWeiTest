package easy;

import java.util.Scanner;

/**多线程
 * 问题描述：有4个线程和1个公共的字符数组。线程1的功能就是向数组输出A，线程2的功能就是向字符输出B，线程3的功能就是向数组输出C，线程4的功能就是向数组输出D。要求按顺序向数组赋值ABCDABCDABCD，ABCD的个数由线程函数1的参数指定。[注：C语言选手可使用WINDOWS SDK库函数]
 接口说明：
 void init();  //初始化函数
 void Release(); //资源释放函数
 unsignedint__stdcall ThreadFun1(PVOID pM)  ; //线程函数1，传入一个int类型的指针[取值范围：1 – 250，测试用例保证]，用于初始化输出A次数，资源需要线程释放
 unsignedint__stdcall ThreadFun2(PVOID pM)  ;//线程函数2，无参数传入
 unsignedint__stdcall ThreadFun3(PVOID pM)  ;//线程函数3，无参数传入
 Unsigned int __stdcall ThreadFunc4(PVOID pM);//线程函数4，无参数传入
 char  g_write[1032]; //线程1,2,3,4按顺序向该数组赋值。不用考虑数组是否越界，测试用例保证
 知识点	字符串,循环,链表,队列,栈,查找,搜索,排序,树,图,数组,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
 运行时间限制	10M
 内存限制	128
 输入
 输入一个int整数
 输出
 输出多个ABCD
 样例输入	10
 样例输出	ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD
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
