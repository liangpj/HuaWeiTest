package easy;


import java.util.Scanner;

/**判断两个IP是否属于同一子网
 *
 子网掩码是用来判断任意两台计算机的IP地址是否属于同一子网络的根据。
 子网掩码与IP地址结构相同，是32位二进制数，其中网络号部分全为“1”和主机号部分全为“0”。利用子网掩码可以判断两台主机是否中同一子网中。若两台主机的IP地址分别与它们的子网掩码相“与”后的结果相同，则说明这两台主机在同一子网中。
 示例：
 I P 地址　 192.168.0.1
 子网掩码　 255.255.255.0
 转化为二进制进行运算：
 I P 地址　11010000.10101000.00000000.00000001
 子网掩码　11111111.11111111.11111111.00000000
 AND运算
 　　　　11000000.10101000.00000000.00000000
 转化为十进制后为：
 　　　　192.168.0.0

 I P 地址　 192.168.0.254
 子网掩码　 255.255.255.0

 转化为二进制进行运算：
 I P 地址　11010000.10101000.00000000.11111110
 子网掩码　11111111.11111111.11111111.00000000
 AND运算
 　　　　　11000000.10101000.00000000.00000000
 转化为十进制后为：
 　　　　　192.168.0.0
 通过以上对两台计算机IP地址与子网掩码的AND运算后，我们可以看到它运算结果是一样的。均为192.168.0.0，所以这二台计算机可视为是同一子网络。
 /*
 * 功能: 判断两台计算机IP地址是同一子网络。
 * 输入参数：    String Mask: 子网掩码，格式：“255.255.255.0”；
 *               String ip1: 计算机1的IP地址，格式：“192.168.0.254”；
 *               String ip2: 计算机2的IP地址，格式：“192.168.0.1”；
 *
 * 返回值：      0：IP1与IP2属于同一子网络；     1：IP地址或子网掩码格式非法；    2：IP1与IP2不属于同一子网络
 *
public int checkNetSegment(String mask, String ip1, String ip2)
        {
    //在这里实现功能
        return 0;
        }

        知识点	字符串
        运行时间限制	10M
        内存限制	128
        输入
        输入子网掩码、两个ip地址
        输出
        得到计算结果
        样例输入	255.255.255.0 192.168.224.256 192.168.10.4
        样例输出	1

 **/

public class IsSameSubnet {

    //判断IP地址是否合法
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


