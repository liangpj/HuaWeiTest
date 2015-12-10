package easy;


import java.util.Scanner;

public class NumBigChara {

    public int calcCapital(String str) {
        int num = 0;
        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                ++num;
        }
        return num;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        NumBigChara tst = new NumBigChara();
        System.out.println(tst.calcCapital(str));
    }
}
