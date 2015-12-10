package easy;


import java.util.Scanner;


/**
 *有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：
 * 首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，
 * 只保留第1个，其余几个丢弃。现在，修改过的那个单词死于字母表的下面，如下所示：
 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，
 并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。
 因此，使用这个密匙，Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。
 请实现下述接口，通过指定的密匙和明文得到密文。
 详细描述：
 接口说明
 原型：
 voidencrypt(char * key,char * data,char * encrypt);
 输入参数：
 char * key：密匙
 char * data：明文
 输出参数：
 char * encrypt：密文
 返回值：
 void


 知识点	字符串
 运行时间限制	10M
 内存限制	128
 输入
 先输入key和要加密的字符串
 输出
 返回加密后的字符串
 样例输入	nihao ni
 样例输出	le
 */


public class StrEncrpt2 {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String strKey = in.nextLine();
        String data = in.nextLine();

        boolean [] used = new boolean[26];
        int [] key = new int[26];
        StringBuilder stringBuilder = new StringBuilder();

        int index = 0;
        for(int i = 0; i < strKey.length(); ++i) {
            if (!Character.isLetter(strKey.charAt(i)))
                continue;
            int ch = strKey.charAt(i) - 'a';
            if (used[ch]) {
                continue;
            }
            used[ch] = true;
            key[index++] = ch;
        }

        for (int i = 0; i < used.length; ++i) {
            if (!used[i])
                key[index++] = i;
        }

        for(int i = 0; i < data.length(); ++i) {
            char ch = data.charAt(i);
            int encryIndex = Character.toLowerCase(ch) - 'a';
            char encry = (char) ((Character.isLowerCase(ch) ? 'a' : 'A') + key[encryIndex]);
            stringBuilder.append(encry);
        }

        System.out.println(stringBuilder.toString());
    }
}
