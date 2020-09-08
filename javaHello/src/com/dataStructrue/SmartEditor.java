package com.dataStructrue;
//牛客网题目测试文件

import java.util.Scanner;

public class SmartEditor {

    public void smartEditor() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < number; ++i) {
            String str = scanner.nextLine();
            System.out.println(mend(str));
        }
    }

    private static String mend(String target) {
        char[] chars = target.toCharArray();
        StringBuilder builder = new StringBuilder();
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[k] = chars[i];
            builder.append(chars[k]);
            k++;
            // 先满足规则1
            if (k >= 3 && chars[k - 3] == chars[k - 2] && chars[k - 2] == chars[k - 1]) {
                builder.deleteCharAt(k - 1);
                k--;
            }
            // 再满足规则2
            if (k >= 4 && chars[k - 4] == chars[k - 3] && chars[k - 2] == chars[k - 1]) {
                builder.deleteCharAt(k - 1);
                k--;
            }
        }
        return builder.toString();
    }

//    public static void testSentence(String str) {
//        int[] res = new int[str.length()];
//        char temp = '\0';
//        int count = 0;
//        for (int i = 0; i < str.length(); ++i) {
//            if (str.charAt(i) != temp) {
//                count = 0;
//            }
//            temp = str.charAt(i);
//            ++count;
//            res[i] = count;
//        }
//        StringBuilder strb = new StringBuilder(str);
//        for (int i = 0; i < str.length(); ++i) {
//            if (res[i] >= 3) {
//                strb.setCharAt(i, '\0');
//            }
//
//        }
//        str = strb.toString().replaceAll("\0", "");
//        int[] res2 = new int[str.length()];
//        char temp2 = '\0';
//        int count2 = 0;
//        for (int i = 0; i < str.length(); ++i) {
//            if (str.charAt(i) != temp2) {
//                count2 = 0;
//            }
//            temp2 = str.charAt(i);
//            ++count2;
//            res2[i] = count2;
//        }
//        StringBuilder strb2 = new StringBuilder(str);
//        for (int i = 0; i < str.length(); ++i) {
//            if (i > 1 && res2[i - 2] == res2[i] && res2[i] == 2) {
//                if (i > 3 && res2[i - 4] != res2[i])
//                    strb2.setCharAt(i, '\0');
//            }
//        }
//        System.out.println(strb2.toString().replaceAll("\0", ""));

//}

}