package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** 找出字符串中第一个只出现一次的字符
 * 找出字符串中第一个只出现一次的字符
 详细描述：
 接口说明
 原型：
 bool FindChar(char* pInputString, char* pChar);
 输入参数：
 char* pInputString：字符串
 输出参数（指针指向的内存区域保证有效）：
 char* pChar：第一个只出现一次的字符
 如果无此字符 请输出'.'



 知识点	字符串,循环
 运行时间限制	10M
 内存限制	128
 输入
 输入一串字符
 输出
 输出一个字符
 样例输入	asdfasdfo
 样例输出	o
 */


public class FindOneTime1stChar {
    public static char findChar(String inputStr) {
        if (inputStr.length() == 0)
            return '.';
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < inputStr.length(); ++i) {
            char ch = inputStr.charAt(i);
            Integer count = map.get(ch);
            map.put(ch, count == null ? 1 : count+1);
        }

        for (int i = 0; i < inputStr.length(); ++i) {
            char ch = inputStr.charAt(i);
            Integer count = map.get(ch);
            if (count == 1)
                return ch;
        }
        return '.';
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(findChar(str));
    }
}
