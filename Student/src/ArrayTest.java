public class ArrayTest {
    public static void main(String[] args) {
        String s = "sadeweweaaa34324sdsd3432sdf";
        int count = 0;
        int countNum = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                count++;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                countNum++;
            }

        }

        System.out.println("字符串s中字母a出现的次数有" + count + "次");

        System.out.println("字符串s中数字出现的次数有" + countNum + "次");
        System.out.println("=======================");
        String s2 = "e22fffs33tttdd";
        int flag;
        char[] result = new char[20];
        for (int i = 0, k = 0; i < s2.length(); i++) {
            flag = 0;
            for (int j = i + 1; j < s2.length(); j++) {
                if (s2.charAt(j) == s2.charAt(i)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                result[k] = s2.charAt(i);
                k++;
            }
        }
        System.out.println("去掉重复字符的结果为:" + new String(result));
    }
}
