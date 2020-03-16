public class main {
    public static void main(String[] args) {
        Student s1 = new Student(); // 不传参 执行重载函数的第一个
        s1.id = 01;
        s1.name = "jack";
        s1.age = 20;
        s1.address = "福州";
        s1.stuInfo();
        s1.study();
        s1.sleep();
        s1.study();
        s1.sleep();
        s1.study();
        s1.sleep();
        s1.study();
        s1.study();

        System.out.println("");
        System.out.println("---------");
        System.out.println("");


        Student s2 = new Student(02, "rose", 21, "厦门"); //传了参数 执行重载方法的第二个
        s2.stuInfo();
        s2.study();
        s2.study();

    }
}