package huawei;

import java.util.Locale;
import java.util.Scanner;

// 简单密码
public class Main {

    private int getNumByLowerLetter(char c) {
        String ch = String.valueOf(c);
        if ("abc".contains(ch))
            return 2;
        else if ("def".contains(ch))
            return 3;
        else if ("ghi".contains(ch))
            return 4;
        else if ("jkl".contains(ch))
            return 5;
        else if ("mno".contains(ch))
            return 6;
        else if ("pqrs".contains(ch))
            return 7;
        else if ("tuv".contains(ch))
            return 8;
        else if ("wxyz".contains(ch))
            return 9;
        else
            throw new RuntimeException();
    }

    private char getLowerByUpperLetter(char ch){
        if (ch == 'Z')
            return 'a';
        else {
            int i = ch + 1;
            return (char)i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        Main main = new Main();
        char[] chars  = str.toCharArray();
        for (char ch : chars){
            if (Character.isLowerCase(ch))
                sb.append(main.getNumByLowerLetter(ch));
            else if (Character.isUpperCase(ch))
                sb.append(main.getLowerByUpperLetter(ch));
            else
                sb.append(ch);
        }
        System.out.println(sb.toString().toLowerCase(Locale.ROOT));
        sc.close();
    }
}
