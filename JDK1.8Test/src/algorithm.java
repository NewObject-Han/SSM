import com.sun.jmx.remote.internal.ArrayQueue;

import javax.xml.soap.Node;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author liang
 * @create 2020-11-30-18:49
 */
public class algorithm {

    public static void main(String[] args) {

//        int nums []= {2, 7, 11, 15,8,7};
//        int[] sum = new algorithm().sum(nums, 13);
//        System.out.println(Arrays.toString(sum));
//        int pwwkew = new algorithm().lengthMax("pwwkew");
//        System.out.println(pwwkew);

        String babad = new algorithm().longs("babad");
        System.out.println(babad);
    }
//    1.
//	题目描述
//	给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//	你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//	示例:
//
//	给定 nums = [2, 7, 11, 15], target = 9
//
//	因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
//
//	思路分析
//	1.暴力。遍历每个元素 x，找是否有 target-x。
//	2.哈希表。遍历数组将元素存进哈希表，再遍历数组找是否有 target-x。
//	3.一遍哈希表。哈希表存 (nums[i],i)，遍历数组时，判断 map 中有无值等于 target-nums[i]，若有则放进返回数组，没有就将当前的值放进哈希表。
//	4.排序后双指针。将数组升序排序，左右指针往中间走，每次和与 target 比较，大就 right--，小就 left++。
    public int[] sum(int nums[], int target) {
        int index[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            for (int n = 0; n < nums.length; n++) {
                if (nums[n] == y) {
                    index[0] = n;
                    index[1] = i;
                }
            }
        }
        return index;
    }

//3.
// 题目描述
    // 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    // 示例 1:
    // 输入: "abcabcbb" 输出: 3
    // 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    // 示例 2:
    // 输入: "bbbbb" 输出: 1
    // 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
    // 示例 3:
    // 输入: "pwwkew" 输出: 3
    // 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。请注意，你的答案必须是子串长度，"pwke"是一个子序列，不是子串。

    // 思路分析
    // 滑动窗口。
    // 用两个哈希表，一个 needs 记录 pattern 子串中字符出现次数，一个 windows 记录当前窗口子串中字符出现次数。
    // 本题因为是找最长子串，所以只用一个 window 就能解决。先向右移动right，每次更新maxLen。当 window 中出现重复字符时，开始向右移动
    // left 缩小窗口。通过存储字符值和索引，加快检索操作。
        public int lengthMax(String s) {
            //最大长度
            int max = 0;
            //生成各个子串
            for (int i = 0; i < s.length(); i++) {
                //子串容器
                Set set = new HashSet();
                set.add(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    set.add(s.charAt(j));
                    if (j - i + 1 > set.size()) {
                        break;
                    }
                    max = max > set.size() ? max : set.size();
                }
            }
            return max;
        }


//   4 最长回文子串
    public  String longs(String s) {
        // 单个字符直接返回
        if (s.length() < 2) {
            return s;
        }
        // 初始化一个二维数组值默认是false
        boolean[][] dp = new boolean[s.length()][s.length()];
        String result = s.substring(0,1);
        for (int j = 0; j < s.length(); j++){
            for (int i = 0; i <= j; i++){
                // j - 1 <= 1 用于是否为临界点时的判断
                //dp[i + 1][j - 1]用于对此字符里面的字符串是否为回文进行判断
                dp[i][j] = s.charAt(i) == s.charAt(j) &&(j - i <= 1 || dp[i+1][j-1]);
                if (dp[i][j]){
                    if (j - i + 1 > result.length()){
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }


}
