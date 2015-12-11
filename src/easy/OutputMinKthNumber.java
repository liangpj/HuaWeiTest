package easy;

import java.util.Arrays;
import java.util.Scanner;

/**����n�����������������С��k��
 * ����n�����������������С��k����
 ��ϸ������
 �ӿ�˵��
 ԭ�ͣ�
 bool GetMinK(unsignedint uiInputNum, int * pInputArray, unsignedint uiK, int * pOutputArray);
 ���������
 unsignedint uiInputNum //������������
 int * pInputArray  //������������
 unsignedint uiK   //�����uiK������
 ���������ָ��ָ����ڴ�����֤��Ч����
 int * pOutputArray //��С��uiK������
 ����ֵ��
 false �쳣ʧ��
 true  ����ɹ�


 ֪ʶ��	ѭ��,����
 ����ʱ������	10M
 �ڴ�����	128
 ����
 ����˵��
 1 ������������
 2 ����һ����������
 ���
 ���һ����������
 ��������	5 2 1 3 5 7 2
 �������	1 2
 */

public class OutputMinKthNumber {

    private static void swap(int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void quickSort(int [] arr, int low, int hig) {
        //ѡ�����һ��Ԫ����Ϊ��Ԫ
        if (low >= hig) return;
        int pivot = hig; // ѡ�����һ��Ԫ����Ϊ��Ԫ
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


//        // ʹ�ÿ⺯�������㷨
//        Arrays.sort(arr);

        quickSort(arr, 0, arr.length-1);

        int i = 0;
        while(i < k-1)
            System.out.print(arr[i++] + " ");
        System.out.println(arr[i]);
    }
}
