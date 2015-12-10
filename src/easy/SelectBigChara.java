package easy;


import java.util.Scanner;

public class SelectBigChara {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        char[] str = in.nextLine().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        char prev = 'a';
        for (char ch : str) {
            if ((ch == ' ') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == ' ' && prev == ' ')
                    continue;
                stringBuilder.append(ch);
                prev = ch;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}

