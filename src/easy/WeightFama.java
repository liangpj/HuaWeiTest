package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** 称砝码
 * 现有一组砝码，重量互不相等，分别为m1、m2……mn；他们可取的最大数量分别为x1、x2……xn。现在要用这些砝码去称物体的重量，问能称出多少中不同的重量。

 注：
 称重重量包括0
 要对输入数据进行校验

 方法原型：public static int fama(int n, int[] weight, int[] nums)

 知识点	字符串,循环,函数,指针,枚举,位运算,结构体,联合体,文件操作,递归
 运行时间限制	10M
 内存限制	128
 输入
 int n：n表示有多少组重量不同的砝码，1<=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<><=n<=10<>
 int[] weight：表示n组砝码的重量，1<=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<><=mi<=10<>
 int[] num：表示n组砝码的最大数量，1<=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<><=xi<=10<>

 输出
 利用给定的砝码可以称出的不同的重量数
 样例输入	2 1 2 2 1
 样例输出	5
 */


public class WeightFama {

    public static int fama(int n, int[] weight, int[] nums){
        int [] dp = new int[100000];
        int index = 1, beg, end = 0;

        for (int i = 0; i < n; ++i) {
            int w = weight[i];
            for (int j = 0; j < nums[i]; ++j) {
                beg = (j == 0 ? 0 : end);
                end = index;
                for (int k = beg; k < end; ++k) {
                    dp[index++] = dp[k] + w;
                }
            }
        }

        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < index; ++i)
            res.add(dp[i]);

        return res.size() == 0 ? 1 : res.size();
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] weight = new int[n];
        int [] num = new int[n];

        for (int i = 0; i < n && in.hasNext(); ++i)
            weight[i] = in.nextInt();
        for (int i = 0; i < n && in.hasNext(); ++i) {
            num[i] = in.nextInt();
        }


        System.out.println(fama(n, weight, num));
    }
}
