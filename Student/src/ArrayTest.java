public class ArrayTest {
    public static void main(String[] args) {
        work1("sadeweweaaa34324sdsd3432sdf");
        System.out.println("");
        System.out.println("==================");
        System.out.println("");
        work2("e22fffs33tttdd");
    }
    public static void work1(String s) {
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
    }
    public static void work2(String s) {
        boolean flag;
        char[] result = new char[20];
        for (int i = 0, k = 0; i < s.length(); i++) {
            flag = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result[k] = s.charAt(i);
                k++;
            }
        }
        System.out.println("去掉重复字符的结果为:" + new String(result));
    }
}
