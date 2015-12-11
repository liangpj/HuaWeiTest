package easy;

import java.util.Arrays;
import java.util.Scanner;

/**输入n个整数，输出其中最小的k个
 * 输入n个整数，输出其中最小的k个。
 详细描述：
 接口说明
 原型：
 bool GetMinK(unsignedint uiInputNum, int * pInputArray, unsignedint uiK, int * pOutputArray);
 输入参数：
 unsignedint uiInputNum //输入整数个数
 int * pInputArray  //输入整数数组
 unsignedint uiK   //需输出uiK个整数
 输出参数（指针指向的内存区域保证有效）：
 int * pOutputArray //最小的uiK个整数
 返回值：
 false 异常失败
 true  输出成功


 知识点	循环,数组
 运行时间限制	10M
 内存限制	128
 输入
 输入说明
 1 输入两个整数
 2 输入一个整数数组
 输出
 输出一个整数数组
 样例输入	5 2 1 3 5 7 2
 样例输出	1 2
 */

public class OutputMinKthNumber {

    private static void swap(int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void quickSort(int [] arr, int low, int hig) {
        //选择最后一个元素作为主元
        if (low >= hig) return;
        int pivot = hig; // 选择最后一个元素作为主元
        int left = low-1, right = hig+1;

        while (true) {
            while (arr[++left] < arr[pivot]) ;
            while (arr[--right] > arr[pivot]) ;

            if (left < right)
                swap(arr, left, right);
            else
                break;
        }

        swap(arr, left, hig);

        quickSort(arr, low, left-1);
        quickSort(arr, left+1, hig);
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n && in.hasNext(); ++i)
            arr[i] = in.nextInt();


//        // 使用库函数排序算法
//        Arrays.sort(arr);

        quickSort(arr, 0, arr.length-1);

        int i = 0;
        while(i < k-1)
            System.out.print(arr[i++] + " ");
        System.out.println(arr[i]);
    }
}
