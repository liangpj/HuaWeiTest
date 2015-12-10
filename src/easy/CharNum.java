package easy;


import java.util.Scanner;

public class CharNum {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        char [] str = in.nextLine().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        int i = 0;
        for(; i < str.length-1; ++i) {
            if (str[i+1] != str[i]) {
                stringBuilder.append(str[i]).append(count);
                count = 1;
            }else
                ++count;
        }
        stringBuilder.append(str[i]).append(count);
        System.out.println(stringBuilder.toString());
    }
}


