package easy;

import java.util.Scanner;

/**NOC产品部-杨辉三角的变形
 1
 1  1  1
 1  2  3  2  1
 1  3  6  7  6  3  1
 1  4  10 16 19  16 10  4  1
 以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。

 输入n(n <= 1000000000)<>

 public static  int run(int x)
 {
 return -1;
 }

 知识点	字符串
 运行时间限制	10M
 内存限制	128
 输入
 输入一个int整数
 输出
 输出返回的int值
 样例输入	4
 样例输出	3
 */


public class INOCTriangle {

    private static int run(int n) {
        if (n <= 2)
            return -1;
        int [][] dp = new int[n][2*(n+1) - 1];
        dp[0][0] = 1;
        for (int i = 1; i < n; ++i) {
            for(int j = 0; j < 2*(i+1)-1; ++j) {
                if (j == 0) {
                    dp[i][j] = 1;
                }else {
                    int a, b , c = dp[i-1][j];
                    a  = j-2 < 0 ? 0 : dp[i-1][j-2];
                    b = j-1 < 0 ? 0 : dp[i-1][j-1];
                    dp[i][j] = a + b + c;
                }
            }
        }

//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < 2*(i+1)-1; ++j)
//                System.out.print(dp[i][j] + " ");
//            System.out.println();
//        }

        for (int i = 1; i < 2*(n+1)-1; ++i) {
            if (dp[n-1][i] % 2 == 0)
                return i+1;
        }
        return -1;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(run(n));
    }
}
