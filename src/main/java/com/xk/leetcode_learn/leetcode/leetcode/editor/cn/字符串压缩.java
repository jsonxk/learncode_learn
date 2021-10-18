package com.xk.leetcode_learn.leetcode.leetcode.editor.cn;//Implement a method to perform basic string compression using the counts of rep

/**
 * 字符串压缩
 */
public class 字符串压缩 {
    public String compressString(String S) {
        char[] ss = S.toCharArray();
        if (ss.length == 0) return S;
        StringBuilder result = new StringBuilder();
        int thisStep = 0, lastStep = 0;
        while (thisStep <= ss.length) {
            if (thisStep == ss.length) {
                result.append(ss[lastStep]).append(thisStep - lastStep);
                break;
            } else if (ss[thisStep] != ss[lastStep]) {
                result.append(ss[lastStep]).append(thisStep - lastStep);
                lastStep = thisStep;
            }
            thisStep++;
        }
        return result.length() < ss.length ? result.toString() : S;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
