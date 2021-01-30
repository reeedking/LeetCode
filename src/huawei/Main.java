package huawei;

import java.util.*;

// 删除字符串中出现次数最少的字符
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main main = new Main();
        while (in.hasNextLine()){
            String str = in.nextLine();
            if (str.isEmpty())
                break;
            main.deleteMinChar(str);
        }
        in.close();
    }

    private void deleteMinChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
        }
        StringBuilder sb = new StringBuilder();
        int min = map.values().stream().findFirst().get();
        for (int nu : map.values()) {
            min = Math.min(min, nu);
        }
        int minNum = min;
        List<Character> deleteList = new ArrayList<>();
        map.forEach((k, v) -> {
                    if (v == minNum)
                        deleteList.add(k);
                }
        );
        for (char ch : str.toCharArray()) {
            if (!deleteList.contains(ch))
                sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
