import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liang
 * @create 2020-12-07-17:47
 */
public class alforithm2 {
//    5.
// 题目描述
// 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,
// ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
// 说明：你不能倾斜容器，且 n 的值至少为 2。
//
// 示例：
//
// 输入：[1,8,6,2,5,4,8,3,7]
//
// 输出：49
//
// 思路分析
// 暴力。对每个线都往右遍历，面积 = min(height[i],height[j]) * (j-i)。
// 双指针。左右指针往中间走。面积公式不变，更新时将较小的线往较大的线方向走。

//            6.
//	题目描述
//	给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//
//	注意：答案中不可以包含重复的三元组。
//
//	示例：
//
//	给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//
//	满足要求的三元组集合为：
//
//	[
//
//	[-1, 0, 1],
//
//	[-1, -1, 2]
//
//	]
//
//	思路分析
//	1.首先对数组进行排序，排序后从左往右遍历；
//	2.将 a+b+c=0，看成 a+b=-c，转换为两数之和；
//	3.固定三元组中最小的数，使用左右指针指向后续的数组。
//	4.若a+b+c<0，说明a+b太小，left++；
//	5.若a+b+c>0，说明a+b太大，right--
//	6.若a+b+c=0，将此三元组加入list，因为结果数组不能重复，所以要去重。
//	7.数组中可能存在重复元素，所以将符合条件的三元组加入结果后，将左右指针移动到不和刚刚得到结果相同的元素的位置。
//	8.nums[i]==nums[i-1]，说明这个元素上一步已经找过，直接跳过。 [-4,-1,-1,0,1,2]

    public static void group(int[] nums) {
        //数组排序
        Arrays.sort(nums);
        for (int right = 0; right < nums.length; right++) {
            for (int left = right + 1; left < nums.length; left++) {
                for (int i = left + 1; i < nums.length; i++) {
//                  元素上一步已经找过，直接跳过
                    if (right > 1) {
                        if (nums[right] == nums[right - 1]) {
                            continue;
                        }
                    }
                    if ((nums[right] + nums[left] + nums[i]) == 0) {
                        System.out.println(nums[right] + "" + nums[left] + "" + nums[i]);
                    }
                    ;
                }
            }
        }
    }
    // 7.
// 题目描述
// 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
//
// 示例:
//
// 输入："23"
//
// 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
//    2,abc 3,def 4,ghi 5,jkl 6 mno 7 pqrs 8 tuv 9 wxyz

    public static void phone(int s) {
        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        String str = String.valueOf(s);
        String right=map.get(String.valueOf(str.charAt(0)));
        String left=map.get(String.valueOf(str.charAt(1)));

        for (int i = 0; i <right.length();i++ ){
            for (int j = 0; j < left.length(); j++) {
                System.out.println(String.valueOf(right.charAt(i))+String.valueOf(left.charAt(j)));
            }
        }
    }
//
// 思路分析
// 本质上还是回溯的排列组合问题，区别是加了层循环和数组的提前处理。
//
// 拿23举例，相当于先找到2的对应三个字符abc，在每个字符又能向下走3的对应def三个字符。当索引位和字符串长度相同时，加入list。

    //            8.
// 题目描述
// 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
//
// 示例：
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
// 当删除了倒数第二个节点后，链表变为 1->2->3->5.
//
// 说明：给定的 n 保证是有效的。
//
// 进阶：你能尝试使用一趟扫描实现吗？
//
// 思路分析
// 快慢指针，快走n步，快慢一起走。
    public static void main(String[] args) {
//        int nums[] = {-1, 0, 1, 2, -1, -4};
//        group(nums);
        phone(23);
    }
}
