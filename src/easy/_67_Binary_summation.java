package easy;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *  
 * <p>
 * 提示：
 * <p>
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class _67_Binary_summation {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }


    public static String addBinary(String a, String b) {
        /*
        先将短二进制字符串前面用0补齐
         */
        String supplement = a.length() > b.length() ? b : a;
        int supplementDigit = a.length() > b.length() ? a.length() - b.length() : b.length() - a.length();
        StringBuilder supplementSb = new StringBuilder();
        for (int i = 0; i < supplementDigit; i++) {
            supplementSb.append('0');
        }
        supplementSb.append(supplement);
        // 补齐后逐位相加
        return addAfterSupplement(supplementSb.toString(), a.length() > b.length() ? a : b);
    }


    private static String addAfterSupplement(String a, String b) {
        // 用needCarry判断是否需要进位
        boolean needCarry = false;
        StringBuilder result = new StringBuilder();
        // 从后往前遍历字符串
        for (int i = a.length() - 1; i >= 0; i--) {
            int temp = 0;
            temp += (a.charAt(i) - '0');
            temp += (b.charAt(i) - '0');
            if (needCarry) {
                temp += 1;
                needCarry = false;
            }
            if (temp >= 2) {
                needCarry = true;
                // 头插
                result.insert(0, temp % 2);
                System.out.println(result.toString());
            } else {
                result.insert(0, temp);
            }
        }
        if (needCarry) {
            // 头插
            result.insert(0, '1');
        }
        return result.toString();
    }
}
