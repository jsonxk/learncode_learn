package com.xk.leetcode_learn.leetcode.leetcode.editor.cn;

/**
 * 【速算机器人】
 *
 * @author xk
 * @date 2021/10/18
 */
public class 速算机器人 {

    public int calculate(String s) {
        int x = 1, y = 0;
        /*String[] ss = s.split("");
        for (String s1 : ss) {
            if (s1.equals("A")) {
                x = x * 2 + y;
            } else if (s1.equals("B")) {
                y = 2 * y + x;
            }
        }*/
        char[] abs = s.toCharArray();
        for (char ab : abs) {
            if (ab == 'A') {
                x = x * 2 + y;
            } else {
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}