public class testArray {
    public static void main(String[] args) {
        String s  = "sadeweweaaa34324sdsd3432sdf";
        System.out.println(s.charAt(0));
		int count = 0;
		int countNum = 0;

		for(int i=0;i<s.length();i++){

			if(s.charAt(i) == 'a'){
				count++;
			}
			if(s.charAt(i)>='0' && s.charAt(i)<='9'){
				countNum++;
			}

		}
		System.out.println("字符串s中字母a出现的次数有"+count+"次");
//
		System.out.println("字符串s中数字出现的次数有"+countNum+"次");
    }
}
